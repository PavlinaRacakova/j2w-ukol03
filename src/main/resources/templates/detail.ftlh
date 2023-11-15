[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include "_common/head.ftlh"]
</head>
<body>
<div class="detail">

    <div class="vizitka">
        <div class="jmeno">${businessCard.name}</div>
        <div class="firma">${businessCard.company}</div>
        <div class="udaje">
            <div class="adresa">
                <div>${businessCard.street}</div>
                <div><span>${businessCard.getTownAndZipCodeInReversedFormat()}</span></div>
            </div>
            <div class="kontakty">
                <div><i class="las la-at"></i> <span>${(businessCard.email)!missingDataMessage}</span></div>
                <div><i class="las la-phone-alt"></i> <span>${(businessCard.phoneNumber)!missingDataMessage}</span></div>
                <div><i class="las la-globe"></i> <span>${(businessCard.website)!missingDataMessage}</span></div>
            </div>
        </div>
    </div>

    <div class="mapa">
        <iframe style="border:none" src="https://frame.mapy.cz/?q=${businessCard.getAddress()?url}" width="100%"
                height="100%" frameborder="0"></iframe>
    </div>

</div>
</body>
</html>
