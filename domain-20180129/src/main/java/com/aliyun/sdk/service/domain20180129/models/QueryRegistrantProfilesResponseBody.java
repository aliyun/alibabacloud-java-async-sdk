// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRegistrantProfilesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRegistrantProfilesResponseBody</p>
 */
public class QueryRegistrantProfilesResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    private Integer currentPageNum;

    @NameInMap("NextPage")
    private Boolean nextPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PrePage")
    private Boolean prePage;

    @NameInMap("RegistrantProfiles")
    private RegistrantProfiles registrantProfiles;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @NameInMap("TotalPageNum")
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

        /**
         * CurrentPageNum.
         */
        public Builder currentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }

        /**
         * NextPage.
         */
        public Builder nextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PrePage.
         */
        public Builder prePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }

        /**
         * RegistrantProfiles.
         */
        public Builder registrantProfiles(RegistrantProfiles registrantProfiles) {
            this.registrantProfiles = registrantProfiles;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalItemNum.
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        /**
         * TotalPageNum.
         */
        public Builder totalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public QueryRegistrantProfilesResponseBody build() {
            return new QueryRegistrantProfilesResponseBody(this);
        } 

    } 

    public static class RegistrantProfile extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("City")
        private String city;

        @NameInMap("Country")
        private String country;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DefaultRegistrantProfile")
        private Boolean defaultRegistrantProfile;

        @NameInMap("Email")
        private String email;

        @NameInMap("EmailVerificationStatus")
        private Integer emailVerificationStatus;

        @NameInMap("PostalCode")
        private String postalCode;

        @NameInMap("Province")
        private String province;

        @NameInMap("RealNameStatus")
        private String realNameStatus;

        @NameInMap("RegistrantName")
        private String registrantName;

        @NameInMap("RegistrantOrganization")
        private String registrantOrganization;

        @NameInMap("RegistrantProfileId")
        private Long registrantProfileId;

        @NameInMap("RegistrantProfileType")
        private String registrantProfileType;

        @NameInMap("RegistrantType")
        private String registrantType;

        @NameInMap("TelArea")
        private String telArea;

        @NameInMap("TelExt")
        private String telExt;

        @NameInMap("Telephone")
        private String telephone;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("ZhAddress")
        private String zhAddress;

        @NameInMap("ZhCity")
        private String zhCity;

        @NameInMap("ZhProvince")
        private String zhProvince;

        @NameInMap("ZhRegistrantName")
        private String zhRegistrantName;

        @NameInMap("ZhRegistrantOrganization")
        private String zhRegistrantOrganization;

        private RegistrantProfile(Builder builder) {
            this.address = builder.address;
            this.city = builder.city;
            this.country = builder.country;
            this.createTime = builder.createTime;
            this.defaultRegistrantProfile = builder.defaultRegistrantProfile;
            this.email = builder.email;
            this.emailVerificationStatus = builder.emailVerificationStatus;
            this.postalCode = builder.postalCode;
            this.province = builder.province;
            this.realNameStatus = builder.realNameStatus;
            this.registrantName = builder.registrantName;
            this.registrantOrganization = builder.registrantOrganization;
            this.registrantProfileId = builder.registrantProfileId;
            this.registrantProfileType = builder.registrantProfileType;
            this.registrantType = builder.registrantType;
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
            private Boolean defaultRegistrantProfile; 
            private String email; 
            private Integer emailVerificationStatus; 
            private String postalCode; 
            private String province; 
            private String realNameStatus; 
            private String registrantName; 
            private String registrantOrganization; 
            private Long registrantProfileId; 
            private String registrantProfileType; 
            private String registrantType; 
            private String telArea; 
            private String telExt; 
            private String telephone; 
            private String updateTime; 
            private String zhAddress; 
            private String zhCity; 
            private String zhProvince; 
            private String zhRegistrantName; 
            private String zhRegistrantOrganization; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
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
             * DefaultRegistrantProfile.
             */
            public Builder defaultRegistrantProfile(Boolean defaultRegistrantProfile) {
                this.defaultRegistrantProfile = defaultRegistrantProfile;
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
             * EmailVerificationStatus.
             */
            public Builder emailVerificationStatus(Integer emailVerificationStatus) {
                this.emailVerificationStatus = emailVerificationStatus;
                return this;
            }

            /**
             * PostalCode.
             */
            public Builder postalCode(String postalCode) {
                this.postalCode = postalCode;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * RealNameStatus.
             */
            public Builder realNameStatus(String realNameStatus) {
                this.realNameStatus = realNameStatus;
                return this;
            }

            /**
             * RegistrantName.
             */
            public Builder registrantName(String registrantName) {
                this.registrantName = registrantName;
                return this;
            }

            /**
             * RegistrantOrganization.
             */
            public Builder registrantOrganization(String registrantOrganization) {
                this.registrantOrganization = registrantOrganization;
                return this;
            }

            /**
             * RegistrantProfileId.
             */
            public Builder registrantProfileId(Long registrantProfileId) {
                this.registrantProfileId = registrantProfileId;
                return this;
            }

            /**
             * RegistrantProfileType.
             */
            public Builder registrantProfileType(String registrantProfileType) {
                this.registrantProfileType = registrantProfileType;
                return this;
            }

            /**
             * RegistrantType.
             */
            public Builder registrantType(String registrantType) {
                this.registrantType = registrantType;
                return this;
            }

            /**
             * TelArea.
             */
            public Builder telArea(String telArea) {
                this.telArea = telArea;
                return this;
            }

            /**
             * TelExt.
             */
            public Builder telExt(String telExt) {
                this.telExt = telExt;
                return this;
            }

            /**
             * Telephone.
             */
            public Builder telephone(String telephone) {
                this.telephone = telephone;
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
             * ZhAddress.
             */
            public Builder zhAddress(String zhAddress) {
                this.zhAddress = zhAddress;
                return this;
            }

            /**
             * ZhCity.
             */
            public Builder zhCity(String zhCity) {
                this.zhCity = zhCity;
                return this;
            }

            /**
             * ZhProvince.
             */
            public Builder zhProvince(String zhProvince) {
                this.zhProvince = zhProvince;
                return this;
            }

            /**
             * ZhRegistrantName.
             */
            public Builder zhRegistrantName(String zhRegistrantName) {
                this.zhRegistrantName = zhRegistrantName;
                return this;
            }

            /**
             * ZhRegistrantOrganization.
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
    public static class RegistrantProfiles extends TeaModel {
        @NameInMap("RegistrantProfile")
        private java.util.List < RegistrantProfile> registrantProfile;

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
        public java.util.List < RegistrantProfile> getRegistrantProfile() {
            return this.registrantProfile;
        }

        public static final class Builder {
            private java.util.List < RegistrantProfile> registrantProfile; 

            /**
             * RegistrantProfile.
             */
            public Builder registrantProfile(java.util.List < RegistrantProfile> registrantProfile) {
                this.registrantProfile = registrantProfile;
                return this;
            }

            public RegistrantProfiles build() {
                return new RegistrantProfiles(this);
            } 

        } 

    }
}
