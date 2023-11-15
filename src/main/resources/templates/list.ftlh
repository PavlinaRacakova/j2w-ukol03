[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include "_common/head.ftlh"]
</head>
<body>
<div class="seznam">

    [#list businessCards as businessCard]
        <a href="/detail/${businessCard?index}">
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
        </a>
    [/#list]

</div>
</body>
</html>
