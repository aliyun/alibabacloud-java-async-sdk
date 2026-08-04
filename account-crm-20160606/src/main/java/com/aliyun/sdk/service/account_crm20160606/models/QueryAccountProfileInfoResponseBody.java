// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryAccountProfileInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAccountProfileInfoResponseBody</p>
 */
public class QueryAccountProfileInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProfileInfo")
    private ProfileInfo profileInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryAccountProfileInfoResponseBody(Builder builder) {
        this.profileInfo = builder.profileInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccountProfileInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return profileInfo
     */
    public ProfileInfo getProfileInfo() {
        return this.profileInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ProfileInfo profileInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryAccountProfileInfoResponseBody model) {
            this.profileInfo = model.profileInfo;
            this.requestId = model.requestId;
        } 

        /**
         * ProfileInfo.
         */
        public Builder profileInfo(ProfileInfo profileInfo) {
            this.profileInfo = profileInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryAccountProfileInfoResponseBody build() {
            return new QueryAccountProfileInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAccountProfileInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountProfileInfoResponseBody</p>
     */
    public static class City extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private City(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static City create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(City model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public City build() {
                return new City(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAccountProfileInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountProfileInfoResponseBody</p>
     */
    public static class District extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private District(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static District create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(District model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public District build() {
                return new District(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAccountProfileInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountProfileInfoResponseBody</p>
     */
    public static class Province extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Province(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Province create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(Province model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Province build() {
                return new Province(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAccountProfileInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountProfileInfoResponseBody</p>
     */
    public static class ProfileInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountAttr")
        private String accountAttr;

        @com.aliyun.core.annotation.NameInMap("AccountCertifyType")
        private String accountCertifyType;

        @com.aliyun.core.annotation.NameInMap("ActiveNotSetMobile")
        private String activeNotSetMobile;

        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Address2")
        private String address2;

        @com.aliyun.core.annotation.NameInMap("Address3")
        private String address3;

        @com.aliyun.core.annotation.NameInMap("Address4")
        private String address4;

        @com.aliyun.core.annotation.NameInMap("Address5")
        private String address5;

        @com.aliyun.core.annotation.NameInMap("Address6")
        private String address6;

        @com.aliyun.core.annotation.NameInMap("AlipayAccount")
        private String alipayAccount;

        @com.aliyun.core.annotation.NameInMap("AlipayUid")
        private String alipayUid;

        @com.aliyun.core.annotation.NameInMap("AliyunID")
        private String aliyunID;

        @com.aliyun.core.annotation.NameInMap("AliyunPK")
        private String aliyunPK;

        @com.aliyun.core.annotation.NameInMap("AuthAlipay")
        private String authAlipay;

        @com.aliyun.core.annotation.NameInMap("AuthDomainUserId")
        private String authDomainUserId;

        @com.aliyun.core.annotation.NameInMap("B2bhid")
        private String b2bhid;

        @com.aliyun.core.annotation.NameInMap("BankId")
        private String bankId;

        @com.aliyun.core.annotation.NameInMap("BankName")
        private String bankName;

        @com.aliyun.core.annotation.NameInMap("BeiAnAuthCId")
        private String beiAnAuthCId;

        @com.aliyun.core.annotation.NameInMap("BeiAnIcpNumber")
        private String beiAnIcpNumber;

        @com.aliyun.core.annotation.NameInMap("BeiAnMobile")
        private String beiAnMobile;

        @com.aliyun.core.annotation.NameInMap("BindAlipayNo")
        private String bindAlipayNo;

        @com.aliyun.core.annotation.NameInMap("CertType")
        private String certType;

        @com.aliyun.core.annotation.NameInMap("CertifiedFrom")
        private String certifiedFrom;

        @com.aliyun.core.annotation.NameInMap("CertifiedTime")
        private String certifiedTime;

        @com.aliyun.core.annotation.NameInMap("City")
        private City city;

        @com.aliyun.core.annotation.NameInMap("ContactMethod")
        private String contactMethod;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("District")
        private District district;

        @com.aliyun.core.annotation.NameInMap("Eid")
        private String eid;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Fax")
        private String fax;

        @com.aliyun.core.annotation.NameInMap("FirstName")
        private String firstName;

        @com.aliyun.core.annotation.NameInMap("Fyl")
        private String fyl;

        @com.aliyun.core.annotation.NameInMap("HavanaId")
        private String havanaId;

        @com.aliyun.core.annotation.NameInMap("Head")
        private String head;

        @com.aliyun.core.annotation.NameInMap("HeadUrl")
        private String headUrl;

        @com.aliyun.core.annotation.NameInMap("IDNumber")
        private String IDNumber;

        @com.aliyun.core.annotation.NameInMap("IsBankIDAuth")
        private String isBankIDAuth;

        @com.aliyun.core.annotation.NameInMap("IsCertified")
        private String isCertified;

        @com.aliyun.core.annotation.NameInMap("LastName")
        private String lastName;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("NationalityCode")
        private String nationalityCode;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("Own")
        private String own;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("PostCode")
        private String postCode;

        @com.aliyun.core.annotation.NameInMap("PreferredLanguage")
        private String preferredLanguage;

        @com.aliyun.core.annotation.NameInMap("ProcessingEnterpriseCertify")
        private Boolean processingEnterpriseCertify;

        @com.aliyun.core.annotation.NameInMap("Province")
        private Province province;

        @com.aliyun.core.annotation.NameInMap("RegisterIP")
        private String registerIP;

        @com.aliyun.core.annotation.NameInMap("SecurityMobile")
        private String securityMobile;

        @com.aliyun.core.annotation.NameInMap("SecurityQuestionExists")
        private Boolean securityQuestionExists;

        @com.aliyun.core.annotation.NameInMap("SelfServicingBusinessRegNum")
        private String selfServicingBusinessRegNum;

        @com.aliyun.core.annotation.NameInMap("SelfServicingIdentificationNum")
        private String selfServicingIdentificationNum;

        @com.aliyun.core.annotation.NameInMap("ShowNickName")
        private String showNickName;

        @com.aliyun.core.annotation.NameInMap("Src")
        private String src;

        @com.aliyun.core.annotation.NameInMap("TaobaoAccount")
        private String taobaoAccount;

        @com.aliyun.core.annotation.NameInMap("TaobaoNickFromHavana")
        private String taobaoNickFromHavana;

        @com.aliyun.core.annotation.NameInMap("Tbhid")
        private String tbhid;

        @com.aliyun.core.annotation.NameInMap("TrueName")
        private String trueName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("YahooEmail")
        private String yahooEmail;

        private ProfileInfo(Builder builder) {
            this.accountAttr = builder.accountAttr;
            this.accountCertifyType = builder.accountCertifyType;
            this.activeNotSetMobile = builder.activeNotSetMobile;
            this.address = builder.address;
            this.address2 = builder.address2;
            this.address3 = builder.address3;
            this.address4 = builder.address4;
            this.address5 = builder.address5;
            this.address6 = builder.address6;
            this.alipayAccount = builder.alipayAccount;
            this.alipayUid = builder.alipayUid;
            this.aliyunID = builder.aliyunID;
            this.aliyunPK = builder.aliyunPK;
            this.authAlipay = builder.authAlipay;
            this.authDomainUserId = builder.authDomainUserId;
            this.b2bhid = builder.b2bhid;
            this.bankId = builder.bankId;
            this.bankName = builder.bankName;
            this.beiAnAuthCId = builder.beiAnAuthCId;
            this.beiAnIcpNumber = builder.beiAnIcpNumber;
            this.beiAnMobile = builder.beiAnMobile;
            this.bindAlipayNo = builder.bindAlipayNo;
            this.certType = builder.certType;
            this.certifiedFrom = builder.certifiedFrom;
            this.certifiedTime = builder.certifiedTime;
            this.city = builder.city;
            this.contactMethod = builder.contactMethod;
            this.createTime = builder.createTime;
            this.district = builder.district;
            this.eid = builder.eid;
            this.email = builder.email;
            this.fax = builder.fax;
            this.firstName = builder.firstName;
            this.fyl = builder.fyl;
            this.havanaId = builder.havanaId;
            this.head = builder.head;
            this.headUrl = builder.headUrl;
            this.IDNumber = builder.IDNumber;
            this.isBankIDAuth = builder.isBankIDAuth;
            this.isCertified = builder.isCertified;
            this.lastName = builder.lastName;
            this.mobile = builder.mobile;
            this.nationalityCode = builder.nationalityCode;
            this.nickName = builder.nickName;
            this.own = builder.own;
            this.phone = builder.phone;
            this.postCode = builder.postCode;
            this.preferredLanguage = builder.preferredLanguage;
            this.processingEnterpriseCertify = builder.processingEnterpriseCertify;
            this.province = builder.province;
            this.registerIP = builder.registerIP;
            this.securityMobile = builder.securityMobile;
            this.securityQuestionExists = builder.securityQuestionExists;
            this.selfServicingBusinessRegNum = builder.selfServicingBusinessRegNum;
            this.selfServicingIdentificationNum = builder.selfServicingIdentificationNum;
            this.showNickName = builder.showNickName;
            this.src = builder.src;
            this.taobaoAccount = builder.taobaoAccount;
            this.taobaoNickFromHavana = builder.taobaoNickFromHavana;
            this.tbhid = builder.tbhid;
            this.trueName = builder.trueName;
            this.updateTime = builder.updateTime;
            this.yahooEmail = builder.yahooEmail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProfileInfo create() {
            return builder().build();
        }

        /**
         * @return accountAttr
         */
        public String getAccountAttr() {
            return this.accountAttr;
        }

        /**
         * @return accountCertifyType
         */
        public String getAccountCertifyType() {
            return this.accountCertifyType;
        }

        /**
         * @return activeNotSetMobile
         */
        public String getActiveNotSetMobile() {
            return this.activeNotSetMobile;
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return address2
         */
        public String getAddress2() {
            return this.address2;
        }

        /**
         * @return address3
         */
        public String getAddress3() {
            return this.address3;
        }

        /**
         * @return address4
         */
        public String getAddress4() {
            return this.address4;
        }

        /**
         * @return address5
         */
        public String getAddress5() {
            return this.address5;
        }

        /**
         * @return address6
         */
        public String getAddress6() {
            return this.address6;
        }

        /**
         * @return alipayAccount
         */
        public String getAlipayAccount() {
            return this.alipayAccount;
        }

        /**
         * @return alipayUid
         */
        public String getAlipayUid() {
            return this.alipayUid;
        }

        /**
         * @return aliyunID
         */
        public String getAliyunID() {
            return this.aliyunID;
        }

        /**
         * @return aliyunPK
         */
        public String getAliyunPK() {
            return this.aliyunPK;
        }

        /**
         * @return authAlipay
         */
        public String getAuthAlipay() {
            return this.authAlipay;
        }

        /**
         * @return authDomainUserId
         */
        public String getAuthDomainUserId() {
            return this.authDomainUserId;
        }

        /**
         * @return b2bhid
         */
        public String getB2bhid() {
            return this.b2bhid;
        }

        /**
         * @return bankId
         */
        public String getBankId() {
            return this.bankId;
        }

        /**
         * @return bankName
         */
        public String getBankName() {
            return this.bankName;
        }

        /**
         * @return beiAnAuthCId
         */
        public String getBeiAnAuthCId() {
            return this.beiAnAuthCId;
        }

        /**
         * @return beiAnIcpNumber
         */
        public String getBeiAnIcpNumber() {
            return this.beiAnIcpNumber;
        }

        /**
         * @return beiAnMobile
         */
        public String getBeiAnMobile() {
            return this.beiAnMobile;
        }

        /**
         * @return bindAlipayNo
         */
        public String getBindAlipayNo() {
            return this.bindAlipayNo;
        }

        /**
         * @return certType
         */
        public String getCertType() {
            return this.certType;
        }

        /**
         * @return certifiedFrom
         */
        public String getCertifiedFrom() {
            return this.certifiedFrom;
        }

        /**
         * @return certifiedTime
         */
        public String getCertifiedTime() {
            return this.certifiedTime;
        }

        /**
         * @return city
         */
        public City getCity() {
            return this.city;
        }

        /**
         * @return contactMethod
         */
        public String getContactMethod() {
            return this.contactMethod;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return district
         */
        public District getDistrict() {
            return this.district;
        }

        /**
         * @return eid
         */
        public String getEid() {
            return this.eid;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return fax
         */
        public String getFax() {
            return this.fax;
        }

        /**
         * @return firstName
         */
        public String getFirstName() {
            return this.firstName;
        }

        /**
         * @return fyl
         */
        public String getFyl() {
            return this.fyl;
        }

        /**
         * @return havanaId
         */
        public String getHavanaId() {
            return this.havanaId;
        }

        /**
         * @return head
         */
        public String getHead() {
            return this.head;
        }

        /**
         * @return headUrl
         */
        public String getHeadUrl() {
            return this.headUrl;
        }

        /**
         * @return IDNumber
         */
        public String getIDNumber() {
            return this.IDNumber;
        }

        /**
         * @return isBankIDAuth
         */
        public String getIsBankIDAuth() {
            return this.isBankIDAuth;
        }

        /**
         * @return isCertified
         */
        public String getIsCertified() {
            return this.isCertified;
        }

        /**
         * @return lastName
         */
        public String getLastName() {
            return this.lastName;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return nationalityCode
         */
        public String getNationalityCode() {
            return this.nationalityCode;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return own
         */
        public String getOwn() {
            return this.own;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return postCode
         */
        public String getPostCode() {
            return this.postCode;
        }

        /**
         * @return preferredLanguage
         */
        public String getPreferredLanguage() {
            return this.preferredLanguage;
        }

        /**
         * @return processingEnterpriseCertify
         */
        public Boolean getProcessingEnterpriseCertify() {
            return this.processingEnterpriseCertify;
        }

        /**
         * @return province
         */
        public Province getProvince() {
            return this.province;
        }

        /**
         * @return registerIP
         */
        public String getRegisterIP() {
            return this.registerIP;
        }

        /**
         * @return securityMobile
         */
        public String getSecurityMobile() {
            return this.securityMobile;
        }

        /**
         * @return securityQuestionExists
         */
        public Boolean getSecurityQuestionExists() {
            return this.securityQuestionExists;
        }

        /**
         * @return selfServicingBusinessRegNum
         */
        public String getSelfServicingBusinessRegNum() {
            return this.selfServicingBusinessRegNum;
        }

        /**
         * @return selfServicingIdentificationNum
         */
        public String getSelfServicingIdentificationNum() {
            return this.selfServicingIdentificationNum;
        }

        /**
         * @return showNickName
         */
        public String getShowNickName() {
            return this.showNickName;
        }

        /**
         * @return src
         */
        public String getSrc() {
            return this.src;
        }

        /**
         * @return taobaoAccount
         */
        public String getTaobaoAccount() {
            return this.taobaoAccount;
        }

        /**
         * @return taobaoNickFromHavana
         */
        public String getTaobaoNickFromHavana() {
            return this.taobaoNickFromHavana;
        }

        /**
         * @return tbhid
         */
        public String getTbhid() {
            return this.tbhid;
        }

        /**
         * @return trueName
         */
        public String getTrueName() {
            return this.trueName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return yahooEmail
         */
        public String getYahooEmail() {
            return this.yahooEmail;
        }

        public static final class Builder {
            private String accountAttr; 
            private String accountCertifyType; 
            private String activeNotSetMobile; 
            private String address; 
            private String address2; 
            private String address3; 
            private String address4; 
            private String address5; 
            private String address6; 
            private String alipayAccount; 
            private String alipayUid; 
            private String aliyunID; 
            private String aliyunPK; 
            private String authAlipay; 
            private String authDomainUserId; 
            private String b2bhid; 
            private String bankId; 
            private String bankName; 
            private String beiAnAuthCId; 
            private String beiAnIcpNumber; 
            private String beiAnMobile; 
            private String bindAlipayNo; 
            private String certType; 
            private String certifiedFrom; 
            private String certifiedTime; 
            private City city; 
            private String contactMethod; 
            private String createTime; 
            private District district; 
            private String eid; 
            private String email; 
            private String fax; 
            private String firstName; 
            private String fyl; 
            private String havanaId; 
            private String head; 
            private String headUrl; 
            private String IDNumber; 
            private String isBankIDAuth; 
            private String isCertified; 
            private String lastName; 
            private String mobile; 
            private String nationalityCode; 
            private String nickName; 
            private String own; 
            private String phone; 
            private String postCode; 
            private String preferredLanguage; 
            private Boolean processingEnterpriseCertify; 
            private Province province; 
            private String registerIP; 
            private String securityMobile; 
            private Boolean securityQuestionExists; 
            private String selfServicingBusinessRegNum; 
            private String selfServicingIdentificationNum; 
            private String showNickName; 
            private String src; 
            private String taobaoAccount; 
            private String taobaoNickFromHavana; 
            private String tbhid; 
            private String trueName; 
            private String updateTime; 
            private String yahooEmail; 

            private Builder() {
            } 

            private Builder(ProfileInfo model) {
                this.accountAttr = model.accountAttr;
                this.accountCertifyType = model.accountCertifyType;
                this.activeNotSetMobile = model.activeNotSetMobile;
                this.address = model.address;
                this.address2 = model.address2;
                this.address3 = model.address3;
                this.address4 = model.address4;
                this.address5 = model.address5;
                this.address6 = model.address6;
                this.alipayAccount = model.alipayAccount;
                this.alipayUid = model.alipayUid;
                this.aliyunID = model.aliyunID;
                this.aliyunPK = model.aliyunPK;
                this.authAlipay = model.authAlipay;
                this.authDomainUserId = model.authDomainUserId;
                this.b2bhid = model.b2bhid;
                this.bankId = model.bankId;
                this.bankName = model.bankName;
                this.beiAnAuthCId = model.beiAnAuthCId;
                this.beiAnIcpNumber = model.beiAnIcpNumber;
                this.beiAnMobile = model.beiAnMobile;
                this.bindAlipayNo = model.bindAlipayNo;
                this.certType = model.certType;
                this.certifiedFrom = model.certifiedFrom;
                this.certifiedTime = model.certifiedTime;
                this.city = model.city;
                this.contactMethod = model.contactMethod;
                this.createTime = model.createTime;
                this.district = model.district;
                this.eid = model.eid;
                this.email = model.email;
                this.fax = model.fax;
                this.firstName = model.firstName;
                this.fyl = model.fyl;
                this.havanaId = model.havanaId;
                this.head = model.head;
                this.headUrl = model.headUrl;
                this.IDNumber = model.IDNumber;
                this.isBankIDAuth = model.isBankIDAuth;
                this.isCertified = model.isCertified;
                this.lastName = model.lastName;
                this.mobile = model.mobile;
                this.nationalityCode = model.nationalityCode;
                this.nickName = model.nickName;
                this.own = model.own;
                this.phone = model.phone;
                this.postCode = model.postCode;
                this.preferredLanguage = model.preferredLanguage;
                this.processingEnterpriseCertify = model.processingEnterpriseCertify;
                this.province = model.province;
                this.registerIP = model.registerIP;
                this.securityMobile = model.securityMobile;
                this.securityQuestionExists = model.securityQuestionExists;
                this.selfServicingBusinessRegNum = model.selfServicingBusinessRegNum;
                this.selfServicingIdentificationNum = model.selfServicingIdentificationNum;
                this.showNickName = model.showNickName;
                this.src = model.src;
                this.taobaoAccount = model.taobaoAccount;
                this.taobaoNickFromHavana = model.taobaoNickFromHavana;
                this.tbhid = model.tbhid;
                this.trueName = model.trueName;
                this.updateTime = model.updateTime;
                this.yahooEmail = model.yahooEmail;
            } 

            /**
             * AccountAttr.
             */
            public Builder accountAttr(String accountAttr) {
                this.accountAttr = accountAttr;
                return this;
            }

            /**
             * AccountCertifyType.
             */
            public Builder accountCertifyType(String accountCertifyType) {
                this.accountCertifyType = accountCertifyType;
                return this;
            }

            /**
             * ActiveNotSetMobile.
             */
            public Builder activeNotSetMobile(String activeNotSetMobile) {
                this.activeNotSetMobile = activeNotSetMobile;
                return this;
            }

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * Address2.
             */
            public Builder address2(String address2) {
                this.address2 = address2;
                return this;
            }

            /**
             * Address3.
             */
            public Builder address3(String address3) {
                this.address3 = address3;
                return this;
            }

            /**
             * Address4.
             */
            public Builder address4(String address4) {
                this.address4 = address4;
                return this;
            }

            /**
             * Address5.
             */
            public Builder address5(String address5) {
                this.address5 = address5;
                return this;
            }

            /**
             * Address6.
             */
            public Builder address6(String address6) {
                this.address6 = address6;
                return this;
            }

            /**
             * AlipayAccount.
             */
            public Builder alipayAccount(String alipayAccount) {
                this.alipayAccount = alipayAccount;
                return this;
            }

            /**
             * AlipayUid.
             */
            public Builder alipayUid(String alipayUid) {
                this.alipayUid = alipayUid;
                return this;
            }

            /**
             * AliyunID.
             */
            public Builder aliyunID(String aliyunID) {
                this.aliyunID = aliyunID;
                return this;
            }

            /**
             * AliyunPK.
             */
            public Builder aliyunPK(String aliyunPK) {
                this.aliyunPK = aliyunPK;
                return this;
            }

            /**
             * AuthAlipay.
             */
            public Builder authAlipay(String authAlipay) {
                this.authAlipay = authAlipay;
                return this;
            }

            /**
             * AuthDomainUserId.
             */
            public Builder authDomainUserId(String authDomainUserId) {
                this.authDomainUserId = authDomainUserId;
                return this;
            }

            /**
             * B2bhid.
             */
            public Builder b2bhid(String b2bhid) {
                this.b2bhid = b2bhid;
                return this;
            }

            /**
             * BankId.
             */
            public Builder bankId(String bankId) {
                this.bankId = bankId;
                return this;
            }

            /**
             * BankName.
             */
            public Builder bankName(String bankName) {
                this.bankName = bankName;
                return this;
            }

            /**
             * BeiAnAuthCId.
             */
            public Builder beiAnAuthCId(String beiAnAuthCId) {
                this.beiAnAuthCId = beiAnAuthCId;
                return this;
            }

            /**
             * BeiAnIcpNumber.
             */
            public Builder beiAnIcpNumber(String beiAnIcpNumber) {
                this.beiAnIcpNumber = beiAnIcpNumber;
                return this;
            }

            /**
             * BeiAnMobile.
             */
            public Builder beiAnMobile(String beiAnMobile) {
                this.beiAnMobile = beiAnMobile;
                return this;
            }

            /**
             * BindAlipayNo.
             */
            public Builder bindAlipayNo(String bindAlipayNo) {
                this.bindAlipayNo = bindAlipayNo;
                return this;
            }

            /**
             * CertType.
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * CertifiedFrom.
             */
            public Builder certifiedFrom(String certifiedFrom) {
                this.certifiedFrom = certifiedFrom;
                return this;
            }

            /**
             * CertifiedTime.
             */
            public Builder certifiedTime(String certifiedTime) {
                this.certifiedTime = certifiedTime;
                return this;
            }

            /**
             * City.
             */
            public Builder city(City city) {
                this.city = city;
                return this;
            }

            /**
             * ContactMethod.
             */
            public Builder contactMethod(String contactMethod) {
                this.contactMethod = contactMethod;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * District.
             */
            public Builder district(District district) {
                this.district = district;
                return this;
            }

            /**
             * Eid.
             */
            public Builder eid(String eid) {
                this.eid = eid;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * Fax.
             */
            public Builder fax(String fax) {
                this.fax = fax;
                return this;
            }

            /**
             * FirstName.
             */
            public Builder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            /**
             * Fyl.
             */
            public Builder fyl(String fyl) {
                this.fyl = fyl;
                return this;
            }

            /**
             * HavanaId.
             */
            public Builder havanaId(String havanaId) {
                this.havanaId = havanaId;
                return this;
            }

            /**
             * Head.
             */
            public Builder head(String head) {
                this.head = head;
                return this;
            }

            /**
             * HeadUrl.
             */
            public Builder headUrl(String headUrl) {
                this.headUrl = headUrl;
                return this;
            }

            /**
             * IDNumber.
             */
            public Builder IDNumber(String IDNumber) {
                this.IDNumber = IDNumber;
                return this;
            }

            /**
             * IsBankIDAuth.
             */
            public Builder isBankIDAuth(String isBankIDAuth) {
                this.isBankIDAuth = isBankIDAuth;
                return this;
            }

            /**
             * IsCertified.
             */
            public Builder isCertified(String isCertified) {
                this.isCertified = isCertified;
                return this;
            }

            /**
             * LastName.
             */
            public Builder lastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * NationalityCode.
             */
            public Builder nationalityCode(String nationalityCode) {
                this.nationalityCode = nationalityCode;
                return this;
            }

            /**
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * Own.
             */
            public Builder own(String own) {
                this.own = own;
                return this;
            }

            /**
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * PostCode.
             */
            public Builder postCode(String postCode) {
                this.postCode = postCode;
                return this;
            }

            /**
             * PreferredLanguage.
             */
            public Builder preferredLanguage(String preferredLanguage) {
                this.preferredLanguage = preferredLanguage;
                return this;
            }

            /**
             * ProcessingEnterpriseCertify.
             */
            public Builder processingEnterpriseCertify(Boolean processingEnterpriseCertify) {
                this.processingEnterpriseCertify = processingEnterpriseCertify;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(Province province) {
                this.province = province;
                return this;
            }

            /**
             * RegisterIP.
             */
            public Builder registerIP(String registerIP) {
                this.registerIP = registerIP;
                return this;
            }

            /**
             * SecurityMobile.
             */
            public Builder securityMobile(String securityMobile) {
                this.securityMobile = securityMobile;
                return this;
            }

            /**
             * SecurityQuestionExists.
             */
            public Builder securityQuestionExists(Boolean securityQuestionExists) {
                this.securityQuestionExists = securityQuestionExists;
                return this;
            }

            /**
             * SelfServicingBusinessRegNum.
             */
            public Builder selfServicingBusinessRegNum(String selfServicingBusinessRegNum) {
                this.selfServicingBusinessRegNum = selfServicingBusinessRegNum;
                return this;
            }

            /**
             * SelfServicingIdentificationNum.
             */
            public Builder selfServicingIdentificationNum(String selfServicingIdentificationNum) {
                this.selfServicingIdentificationNum = selfServicingIdentificationNum;
                return this;
            }

            /**
             * ShowNickName.
             */
            public Builder showNickName(String showNickName) {
                this.showNickName = showNickName;
                return this;
            }

            /**
             * Src.
             */
            public Builder src(String src) {
                this.src = src;
                return this;
            }

            /**
             * TaobaoAccount.
             */
            public Builder taobaoAccount(String taobaoAccount) {
                this.taobaoAccount = taobaoAccount;
                return this;
            }

            /**
             * TaobaoNickFromHavana.
             */
            public Builder taobaoNickFromHavana(String taobaoNickFromHavana) {
                this.taobaoNickFromHavana = taobaoNickFromHavana;
                return this;
            }

            /**
             * Tbhid.
             */
            public Builder tbhid(String tbhid) {
                this.tbhid = tbhid;
                return this;
            }

            /**
             * TrueName.
             */
            public Builder trueName(String trueName) {
                this.trueName = trueName;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * YahooEmail.
             */
            public Builder yahooEmail(String yahooEmail) {
                this.yahooEmail = yahooEmail;
                return this;
            }

            public ProfileInfo build() {
                return new ProfileInfo(this);
            } 

        } 

    }
}
