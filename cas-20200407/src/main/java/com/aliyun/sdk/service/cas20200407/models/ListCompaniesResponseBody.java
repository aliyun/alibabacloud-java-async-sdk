// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link ListCompaniesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCompaniesResponseBody</p>
 */
public class ListCompaniesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CompanyList")
    private java.util.List<CompanyList> companyList;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListCompaniesResponseBody(Builder builder) {
        this.companyList = builder.companyList;
        this.currentPage = builder.currentPage;
        this.requestId = builder.requestId;
        this.showSize = builder.showSize;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCompaniesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return companyList
     */
    public java.util.List<CompanyList> getCompanyList() {
        return this.companyList;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<CompanyList> companyList; 
        private Integer currentPage; 
        private String requestId; 
        private Integer showSize; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListCompaniesResponseBody model) {
            this.companyList = model.companyList;
            this.currentPage = model.currentPage;
            this.requestId = model.requestId;
            this.showSize = model.showSize;
            this.totalCount = model.totalCount;
        } 

        /**
         * CompanyList.
         */
        public Builder companyList(java.util.List<CompanyList> companyList) {
            this.companyList = companyList;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
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
         * ShowSize.
         */
        public Builder showSize(Integer showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCompaniesResponseBody build() {
            return new ListCompaniesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCompaniesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCompaniesResponseBody</p>
     */
    public static class CompanyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("CompanyAddress")
        private String companyAddress;

        @com.aliyun.core.annotation.NameInMap("CompanyCode")
        private String companyCode;

        @com.aliyun.core.annotation.NameInMap("CompanyEmail")
        private String companyEmail;

        @com.aliyun.core.annotation.NameInMap("CompanyId")
        private Long companyId;

        @com.aliyun.core.annotation.NameInMap("CompanyName")
        private String companyName;

        @com.aliyun.core.annotation.NameInMap("CompanyPhone")
        private String companyPhone;

        @com.aliyun.core.annotation.NameInMap("CompanyType")
        private Integer companyType;

        @com.aliyun.core.annotation.NameInMap("CountryCode")
        private String countryCode;

        @com.aliyun.core.annotation.NameInMap("Department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("Lang")
        private String lang;

        @com.aliyun.core.annotation.NameInMap("PostCode")
        private String postCode;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        private CompanyList(Builder builder) {
            this.city = builder.city;
            this.companyAddress = builder.companyAddress;
            this.companyCode = builder.companyCode;
            this.companyEmail = builder.companyEmail;
            this.companyId = builder.companyId;
            this.companyName = builder.companyName;
            this.companyPhone = builder.companyPhone;
            this.companyType = builder.companyType;
            this.countryCode = builder.countryCode;
            this.department = builder.department;
            this.lang = builder.lang;
            this.postCode = builder.postCode;
            this.province = builder.province;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompanyList create() {
            return builder().build();
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return companyAddress
         */
        public String getCompanyAddress() {
            return this.companyAddress;
        }

        /**
         * @return companyCode
         */
        public String getCompanyCode() {
            return this.companyCode;
        }

        /**
         * @return companyEmail
         */
        public String getCompanyEmail() {
            return this.companyEmail;
        }

        /**
         * @return companyId
         */
        public Long getCompanyId() {
            return this.companyId;
        }

        /**
         * @return companyName
         */
        public String getCompanyName() {
            return this.companyName;
        }

        /**
         * @return companyPhone
         */
        public String getCompanyPhone() {
            return this.companyPhone;
        }

        /**
         * @return companyType
         */
        public Integer getCompanyType() {
            return this.companyType;
        }

        /**
         * @return countryCode
         */
        public String getCountryCode() {
            return this.countryCode;
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return lang
         */
        public String getLang() {
            return this.lang;
        }

        /**
         * @return postCode
         */
        public String getPostCode() {
            return this.postCode;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        public static final class Builder {
            private String city; 
            private String companyAddress; 
            private String companyCode; 
            private String companyEmail; 
            private Long companyId; 
            private String companyName; 
            private String companyPhone; 
            private Integer companyType; 
            private String countryCode; 
            private String department; 
            private String lang; 
            private String postCode; 
            private String province; 

            private Builder() {
            } 

            private Builder(CompanyList model) {
                this.city = model.city;
                this.companyAddress = model.companyAddress;
                this.companyCode = model.companyCode;
                this.companyEmail = model.companyEmail;
                this.companyId = model.companyId;
                this.companyName = model.companyName;
                this.companyPhone = model.companyPhone;
                this.companyType = model.companyType;
                this.countryCode = model.countryCode;
                this.department = model.department;
                this.lang = model.lang;
                this.postCode = model.postCode;
                this.province = model.province;
            } 

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * CompanyAddress.
             */
            public Builder companyAddress(String companyAddress) {
                this.companyAddress = companyAddress;
                return this;
            }

            /**
             * CompanyCode.
             */
            public Builder companyCode(String companyCode) {
                this.companyCode = companyCode;
                return this;
            }

            /**
             * CompanyEmail.
             */
            public Builder companyEmail(String companyEmail) {
                this.companyEmail = companyEmail;
                return this;
            }

            /**
             * CompanyId.
             */
            public Builder companyId(Long companyId) {
                this.companyId = companyId;
                return this;
            }

            /**
             * CompanyName.
             */
            public Builder companyName(String companyName) {
                this.companyName = companyName;
                return this;
            }

            /**
             * CompanyPhone.
             */
            public Builder companyPhone(String companyPhone) {
                this.companyPhone = companyPhone;
                return this;
            }

            /**
             * CompanyType.
             */
            public Builder companyType(Integer companyType) {
                this.companyType = companyType;
                return this;
            }

            /**
             * CountryCode.
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
                return this;
            }

            /**
             * Department.
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * Lang.
             */
            public Builder lang(String lang) {
                this.lang = lang;
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
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            public CompanyList build() {
                return new CompanyList(this);
            } 

        } 

    }
}
