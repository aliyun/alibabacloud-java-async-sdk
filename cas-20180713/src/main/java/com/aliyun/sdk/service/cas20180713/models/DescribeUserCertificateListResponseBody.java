// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserCertificateListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserCertificateListResponseBody</p>
 */
public class DescribeUserCertificateListResponseBody extends TeaModel {
    @NameInMap("CertificateList")
    private java.util.List < CertificateList> certificateList;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ShowSize")
    private Integer showSize;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeUserCertificateListResponseBody(Builder builder) {
        this.certificateList = builder.certificateList;
        this.currentPage = builder.currentPage;
        this.requestId = builder.requestId;
        this.showSize = builder.showSize;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserCertificateListResponseBody create() {
        return builder().build();
    }

    /**
     * @return certificateList
     */
    public java.util.List < CertificateList> getCertificateList() {
        return this.certificateList;
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
        private java.util.List < CertificateList> certificateList; 
        private Integer currentPage; 
        private String requestId; 
        private Integer showSize; 
        private Integer totalCount; 

        /**
         * CertificateList.
         */
        public Builder certificateList(java.util.List < CertificateList> certificateList) {
            this.certificateList = certificateList;
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

        public DescribeUserCertificateListResponseBody build() {
            return new DescribeUserCertificateListResponseBody(this);
        } 

    } 

    public static class CertificateList extends TeaModel {
        @NameInMap("buyInAliyun")
        private Boolean buyInAliyun;

        @NameInMap("city")
        private String city;

        @NameInMap("common")
        private String common;

        @NameInMap("country")
        private String country;

        @NameInMap("endDate")
        private String endDate;

        @NameInMap("expired")
        private Boolean expired;

        @NameInMap("fingerprint")
        private String fingerprint;

        @NameInMap("id")
        private Long id;

        @NameInMap("issuer")
        private String issuer;

        @NameInMap("name")
        private String name;

        @NameInMap("orgName")
        private String orgName;

        @NameInMap("province")
        private String province;

        @NameInMap("sans")
        private String sans;

        @NameInMap("startDate")
        private String startDate;

        private CertificateList(Builder builder) {
            this.buyInAliyun = builder.buyInAliyun;
            this.city = builder.city;
            this.common = builder.common;
            this.country = builder.country;
            this.endDate = builder.endDate;
            this.expired = builder.expired;
            this.fingerprint = builder.fingerprint;
            this.id = builder.id;
            this.issuer = builder.issuer;
            this.name = builder.name;
            this.orgName = builder.orgName;
            this.province = builder.province;
            this.sans = builder.sans;
            this.startDate = builder.startDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertificateList create() {
            return builder().build();
        }

        /**
         * @return buyInAliyun
         */
        public Boolean getBuyInAliyun() {
            return this.buyInAliyun;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return common
         */
        public String getCommon() {
            return this.common;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return expired
         */
        public Boolean getExpired() {
            return this.expired;
        }

        /**
         * @return fingerprint
         */
        public String getFingerprint() {
            return this.fingerprint;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return orgName
         */
        public String getOrgName() {
            return this.orgName;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return sans
         */
        public String getSans() {
            return this.sans;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        public static final class Builder {
            private Boolean buyInAliyun; 
            private String city; 
            private String common; 
            private String country; 
            private String endDate; 
            private Boolean expired; 
            private String fingerprint; 
            private Long id; 
            private String issuer; 
            private String name; 
            private String orgName; 
            private String province; 
            private String sans; 
            private String startDate; 

            /**
             * buyInAliyun.
             */
            public Builder buyInAliyun(Boolean buyInAliyun) {
                this.buyInAliyun = buyInAliyun;
                return this;
            }

            /**
             * city.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * common.
             */
            public Builder common(String common) {
                this.common = common;
                return this;
            }

            /**
             * country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * endDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * expired.
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * fingerprint.
             */
            public Builder fingerprint(String fingerprint) {
                this.fingerprint = fingerprint;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * issuer.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * orgName.
             */
            public Builder orgName(String orgName) {
                this.orgName = orgName;
                return this;
            }

            /**
             * province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * sans.
             */
            public Builder sans(String sans) {
                this.sans = sans;
                return this;
            }

            /**
             * startDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            public CertificateList build() {
                return new CertificateList(this);
            } 

        } 

    }
}
