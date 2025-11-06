// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link QueryRegistrantProfilesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRegistrantProfilesResponseBody</p>
 */
public class QueryRegistrantProfilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPageNum")
    private Integer currentPageNum;

    @com.aliyun.core.annotation.NameInMap("NextPage")
    private Boolean nextPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PrePage")
    private Boolean prePage;

    @com.aliyun.core.annotation.NameInMap("RegistrantProfiles")
    private RegistrantProfiles registrantProfiles;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @com.aliyun.core.annotation.NameInMap("TotalPageNum")
    private Integer totalPageNum;

    private QueryRegistrantProfilesResponseBody(Builder builder) {
        this.currentPageNum = builder.currentPageNum;
        this.nextPage = builder.nextPage;
        this.pageSize = builder.pageSize;
        this.prePage = builder.prePage;
        this.registrantProfiles = builder.registrantProfiles;
        this.requestId = builder.requestId;
        this.totalItemNum = builder.totalItemNum;
        this.totalPageNum = builder.totalPageNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRegistrantProfilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPageNum
     */
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    /**
     * @return nextPage
     */
    public Boolean getNextPage() {
        return this.nextPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return prePage
     */
    public Boolean getPrePage() {
        return this.prePage;
    }

    /**
     * @return registrantProfiles
     */
    public RegistrantProfiles getRegistrantProfiles() {
        return this.registrantProfiles;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalItemNum
     */
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    /**
     * @return totalPageNum
     */
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static final class Builder {
        private Integer currentPageNum; 
        private Boolean nextPage; 
        private Integer pageSize; 
        private Boolean prePage; 
        private RegistrantProfiles registrantProfiles; 
        private String requestId; 
        private Integer totalItemNum; 
        private Integer totalPageNum; 

        private Builder() {
        } 

        private Builder(QueryRegistrantProfilesResponseBody model) {
            this.currentPageNum = model.currentPageNum;
            this.nextPage = model.nextPage;
            this.pageSize = model.pageSize;
            this.prePage = model.prePage;
            this.registrantProfiles = model.registrantProfiles;
            this.requestId = model.requestId;
            this.totalItemNum = model.totalItemNum;
            this.totalPageNum = model.totalPageNum;
        } 

        /**
         * <p>The page number returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }

        /**
         * <p>Indicates whether the current page is followed by a page. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder nextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }

        /**
         * <p>The number of entries returned on each page. Default value: <strong>0</strong>. Maximum value: <strong>5000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Indicates whether the current page is preceded by a page. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder prePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }

        /**
         * <p>The list of registrant profiles.</p>
         */
        public Builder registrantProfiles(RegistrantProfiles registrantProfiles) {
            this.registrantProfiles = registrantProfiles;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>94053D79-7455-4F71-BF06-20EB2DEDE6BD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * <blockquote>
         * <p> This parameter indicates the total number of queried registrant profiles. If multiple registrant profiles are queried, the information about these profiles is returned in sequence by profile.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        /**
         * <p>The total number of returned pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public QueryRegistrantProfilesResponseBody build() {
            return new QueryRegistrantProfilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryRegistrantProfilesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRegistrantProfilesResponseBody</p>
     */
    public static class RegistrantProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CredentialNo")
        private String credentialNo;

        @com.aliyun.core.annotation.NameInMap("CredentialType")
        private String credentialType;

        @com.aliyun.core.annotation.NameInMap("DefaultRegistrantProfile")
        private Boolean defaultRegistrantProfile;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("EmailVerificationStatus")
        private Integer emailVerificationStatus;

        @com.aliyun.core.annotation.NameInMap("Params")
        private String params;

        @com.aliyun.core.annotation.NameInMap("PostalCode")
        private String postalCode;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("RealNameStatus")
        private String realNameStatus;

        @com.aliyun.core.annotation.NameInMap("RegistrantName")
        private String registrantName;

        @com.aliyun.core.annotation.NameInMap("RegistrantOrganization")
        private String registrantOrganization;

        @com.aliyun.core.annotation.NameInMap("RegistrantProfileId")
        private Long registrantProfileId;

        @com.aliyun.core.annotation.NameInMap("RegistrantProfileType")
        private String registrantProfileType;

        @com.aliyun.core.annotation.NameInMap("RegistrantType")
        private String registrantType;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("TelArea")
        private String telArea;

        @com.aliyun.core.annotation.NameInMap("TelExt")
        private String telExt;

        @com.aliyun.core.annotation.NameInMap("Telephone")
        private String telephone;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("ZhAddress")
        private String zhAddress;

        @com.aliyun.core.annotation.NameInMap("ZhCity")
        private String zhCity;

        @com.aliyun.core.annotation.NameInMap("ZhProvince")
        private String zhProvince;

        @com.aliyun.core.annotation.NameInMap("ZhRegistrantName")
        private String zhRegistrantName;

        @com.aliyun.core.annotation.NameInMap("ZhRegistrantOrganization")
        private String zhRegistrantOrganization;

        private RegistrantProfile(Builder builder) {
            this.address = builder.address;
            this.city = builder.city;
            this.country = builder.country;
            this.createTime = builder.createTime;
            this.credentialNo = builder.credentialNo;
            this.credentialType = builder.credentialType;
            this.defaultRegistrantProfile = builder.defaultRegistrantProfile;
            this.email = builder.email;
            this.emailVerificationStatus = builder.emailVerificationStatus;
            this.params = builder.params;
            this.postalCode = builder.postalCode;
            this.province = builder.province;
            this.realNameStatus = builder.realNameStatus;
            this.registrantName = builder.registrantName;
            this.registrantOrganization = builder.registrantOrganization;
            this.registrantProfileId = builder.registrantProfileId;
            this.registrantProfileType = builder.registrantProfileType;
            this.registrantType = builder.registrantType;
            this.remark = builder.remark;
            this.telArea = builder.telArea;
            this.telExt = builder.telExt;
            this.telephone = builder.telephone;
            this.updateTime = builder.updateTime;
            this.zhAddress = builder.zhAddress;
            this.zhCity = builder.zhCity;
            this.zhProvince = builder.zhProvince;
            this.zhRegistrantName = builder.zhRegistrantName;
            this.zhRegistrantOrganization = builder.zhRegistrantOrganization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegistrantProfile create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return credentialNo
         */
        public String getCredentialNo() {
            return this.credentialNo;
        }

        /**
         * @return credentialType
         */
        public String getCredentialType() {
            return this.credentialType;
        }

        /**
         * @return defaultRegistrantProfile
         */
        public Boolean getDefaultRegistrantProfile() {
            return this.defaultRegistrantProfile;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return emailVerificationStatus
         */
        public Integer getEmailVerificationStatus() {
            return this.emailVerificationStatus;
        }

        /**
         * @return params
         */
        public String getParams() {
            return this.params;
        }

        /**
         * @return postalCode
         */
        public String getPostalCode() {
            return this.postalCode;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return realNameStatus
         */
        public String getRealNameStatus() {
            return this.realNameStatus;
        }

        /**
         * @return registrantName
         */
        public String getRegistrantName() {
            return this.registrantName;
        }

        /**
         * @return registrantOrganization
         */
        public String getRegistrantOrganization() {
            return this.registrantOrganization;
        }

        /**
         * @return registrantProfileId
         */
        public Long getRegistrantProfileId() {
            return this.registrantProfileId;
        }

        /**
         * @return registrantProfileType
         */
        public String getRegistrantProfileType() {
            return this.registrantProfileType;
        }

        /**
         * @return registrantType
         */
        public String getRegistrantType() {
            return this.registrantType;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return telArea
         */
        public String getTelArea() {
            return this.telArea;
        }

        /**
         * @return telExt
         */
        public String getTelExt() {
            return this.telExt;
        }

        /**
         * @return telephone
         */
        public String getTelephone() {
            return this.telephone;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return zhAddress
         */
        public String getZhAddress() {
            return this.zhAddress;
        }

        /**
         * @return zhCity
         */
        public String getZhCity() {
            return this.zhCity;
        }

        /**
         * @return zhProvince
         */
        public String getZhProvince() {
            return this.zhProvince;
        }

        /**
         * @return zhRegistrantName
         */
        public String getZhRegistrantName() {
            return this.zhRegistrantName;
        }

        /**
         * @return zhRegistrantOrganization
         */
        public String getZhRegistrantOrganization() {
            return this.zhRegistrantOrganization;
        }

        public static final class Builder {
            private String address; 
            private String city; 
            private String country; 
            private String createTime; 
            private String credentialNo; 
            private String credentialType; 
            private Boolean defaultRegistrantProfile; 
            private String email; 
            private Integer emailVerificationStatus; 
            private String params; 
            private String postalCode; 
            private String province; 
            private String realNameStatus; 
            private String registrantName; 
            private String registrantOrganization; 
            private Long registrantProfileId; 
            private String registrantProfileType; 
            private String registrantType; 
            private String remark; 
            private String telArea; 
            private String telExt; 
            private String telephone; 
            private String updateTime; 
            private String zhAddress; 
            private String zhCity; 
            private String zhProvince; 
            private String zhRegistrantName; 
            private String zhRegistrantOrganization; 

            private Builder() {
            } 

            private Builder(RegistrantProfile model) {
                this.address = model.address;
                this.city = model.city;
                this.country = model.country;
                this.createTime = model.createTime;
                this.credentialNo = model.credentialNo;
                this.credentialType = model.credentialType;
                this.defaultRegistrantProfile = model.defaultRegistrantProfile;
                this.email = model.email;
                this.emailVerificationStatus = model.emailVerificationStatus;
                this.params = model.params;
                this.postalCode = model.postalCode;
                this.province = model.province;
                this.realNameStatus = model.realNameStatus;
                this.registrantName = model.registrantName;
                this.registrantOrganization = model.registrantOrganization;
                this.registrantProfileId = model.registrantProfileId;
                this.registrantProfileType = model.registrantProfileType;
                this.registrantType = model.registrantType;
                this.remark = model.remark;
                this.telArea = model.telArea;
                this.telExt = model.telExt;
                this.telephone = model.telephone;
                this.updateTime = model.updateTime;
                this.zhAddress = model.zhAddress;
                this.zhCity = model.zhCity;
                this.zhProvince = model.zhProvince;
                this.zhRegistrantName = model.zhRegistrantName;
                this.zhRegistrantOrganization = model.zhRegistrantOrganization;
            } 

            /**
             * <p>The address of the domain name registrant.</p>
             * 
             * <strong>example:</strong>
             * <p>zhe jiang sheng hang zhou shi shi li qu shi li zhen shi li da sha 1001 hao</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The city where the domain name registrant is located, in English.</p>
             * 
             * <strong>example:</strong>
             * <p>hang zhou shi</p>
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * <p>The code of the country or region where the domain name registrant is located, such as <strong>CN</strong> or <strong>US</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * <p>The time when the registrant profile was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-18 10:46:47</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The certificate number.</p>
             * 
             * <strong>example:</strong>
             * <p>4****************1</p>
             */
            public Builder credentialNo(String credentialNo) {
                this.credentialNo = credentialNo;
                return this;
            }

            /**
             * <p>The certificate type.</p>
             * 
             * <strong>example:</strong>
             * <p>YYZZ</p>
             */
            public Builder credentialType(String credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * <p>Indicates whether the template is the default template. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <p>Default value: <strong>false</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder defaultRegistrantProfile(Boolean defaultRegistrantProfile) {
                this.defaultRegistrantProfile = defaultRegistrantProfile;
                return this;
            }

            /**
             * <p>The email address of the domain name registrant.</p>
             * 
             * <strong>example:</strong>
             * <p>82106****@qq.com</p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The status of the verification for the email address. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: not verified</li>
             * <li><strong>1</strong>: verified</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder emailVerificationStatus(Integer emailVerificationStatus) {
                this.emailVerificationStatus = emailVerificationStatus;
                return this;
            }

            /**
             * Params.
             */
            public Builder params(String params) {
                this.params = params;
                return this;
            }

            /**
             * <p>The postal code of the region where the domain name registrant is located.</p>
             * 
             * <strong>example:</strong>
             * <p>310024</p>
             */
            public Builder postalCode(String postalCode) {
                this.postalCode = postalCode;
                return this;
            }

            /**
             * <p>The province where the domain name registrant is located.</p>
             * 
             * <strong>example:</strong>
             * <p>zhe jiang</p>
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * <p>The state of real-name verification for the domain name registrant. Valid values:</p>
             * <ul>
             * <li><strong>FAILED</strong>: Real-name verification for the domain name fails.</li>
             * <li><strong>SUCCEED</strong>: Real-name verification for the domain name is successful.</li>
             * <li><strong>NONAUDIT</strong>: Real-name verification for the domain name is not performed.</li>
             * <li><strong>AUDITING</strong>: Real-name verification for the domain name is in progress.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCEED</p>
             */
            public Builder realNameStatus(String realNameStatus) {
                this.realNameStatus = realNameStatus;
                return this;
            }

            /**
             * <p>The name of the domain name contact.</p>
             * 
             * <strong>example:</strong>
             * <p>li si</p>
             */
            public Builder registrantName(String registrantName) {
                this.registrantName = registrantName;
                return this;
            }

            /**
             * <p>The name of the domain name registrant.</p>
             * 
             * <strong>example:</strong>
             * <p>li si</p>
             */
            public Builder registrantOrganization(String registrantOrganization) {
                this.registrantOrganization = registrantOrganization;
                return this;
            }

            /**
             * <p>The ID of the registrant profile.</p>
             * 
             * <strong>example:</strong>
             * <p>1000001</p>
             */
            public Builder registrantProfileId(Long registrantProfileId) {
                this.registrantProfileId = registrantProfileId;
                return this;
            }

            /**
             * <p>The type of the registrant profile. Valid values:</p>
             * <ul>
             * <li><strong>common</strong>: common profile.</li>
             * <li><strong>cnnic</strong>: CNNIC profile.</li>
             * </ul>
             * <blockquote>
             * <p> Only the Alibaba Cloud international site (alibabacloud.com) supports CNNIC profiles. To register domain names provided by CNNIC such as the .cn and . domain names on the Alibaba Cloud international site, you must use a CNNIC profile. To register other domain names, use a common profile.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>common</p>
             */
            public Builder registrantProfileType(String registrantProfileType) {
                this.registrantProfileType = registrantProfileType;
                return this;
            }

            /**
             * <p>The type of the domain name registrant. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: individual.</li>
             * <li><strong>2</strong>: enterprise.</li>
             * </ul>
             * <p>Default value: <strong>1</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder registrantType(String registrantType) {
                this.registrantType = registrantType;
                return this;
            }

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>Test domain name</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The international dialing code of the country or region where the domain name contact is located. For example, the international dialing code of China is <strong>86</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>86</p>
             */
            public Builder telArea(String telArea) {
                this.telArea = telArea;
                return this;
            }

            /**
             * <p>The extension of the phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder telExt(String telExt) {
                this.telExt = telExt;
                return this;
            }

            /**
             * <p>The phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>1829756****</p>
             */
            public Builder telephone(String telephone) {
                this.telephone = telephone;
                return this;
            }

            /**
             * <p>The time when the registrant profile was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-03-15 15:32:45</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The address of the domain name registrant, in Chinese.</p>
             */
            public Builder zhAddress(String zhAddress) {
                this.zhAddress = zhAddress;
                return this;
            }

            /**
             * <p>The city where the domain name registrant is located, in Chinese.</p>
             */
            public Builder zhCity(String zhCity) {
                this.zhCity = zhCity;
                return this;
            }

            /**
             * <p>The province where the domain name registrant is located, in Chinese.</p>
             */
            public Builder zhProvince(String zhProvince) {
                this.zhProvince = zhProvince;
                return this;
            }

            /**
             * <p>The Chinese name of the domain name contact.</p>
             */
            public Builder zhRegistrantName(String zhRegistrantName) {
                this.zhRegistrantName = zhRegistrantName;
                return this;
            }

            /**
             * <p>The Chinese name of the domain name registrant.</p>
             */
            public Builder zhRegistrantOrganization(String zhRegistrantOrganization) {
                this.zhRegistrantOrganization = zhRegistrantOrganization;
                return this;
            }

            public RegistrantProfile build() {
                return new RegistrantProfile(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryRegistrantProfilesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRegistrantProfilesResponseBody</p>
     */
    public static class RegistrantProfiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegistrantProfile")
        private java.util.List<RegistrantProfile> registrantProfile;

        private RegistrantProfiles(Builder builder) {
            this.registrantProfile = builder.registrantProfile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegistrantProfiles create() {
            return builder().build();
        }

        /**
         * @return registrantProfile
         */
        public java.util.List<RegistrantProfile> getRegistrantProfile() {
            return this.registrantProfile;
        }

        public static final class Builder {
            private java.util.List<RegistrantProfile> registrantProfile; 

            private Builder() {
            } 

            private Builder(RegistrantProfiles model) {
                this.registrantProfile = model.registrantProfile;
            } 

            /**
             * RegistrantProfile.
             */
            public Builder registrantProfile(java.util.List<RegistrantProfile> registrantProfile) {
                this.registrantProfile = registrantProfile;
                return this;
            }

            public RegistrantProfiles build() {
                return new RegistrantProfiles(this);
            } 

        } 

    }
}
