// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDomainListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDomainListResponseBody</p>
 */
public class QueryDomainListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPageNum")
    private Integer currentPageNum;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("NextPage")
    private Boolean nextPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PrePage")
    private Boolean prePage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @com.aliyun.core.annotation.NameInMap("TotalPageNum")
    private Integer totalPageNum;

    private QueryDomainListResponseBody(Builder builder) {
        this.currentPageNum = builder.currentPageNum;
        this.data = builder.data;
        this.nextPage = builder.nextPage;
        this.pageSize = builder.pageSize;
        this.prePage = builder.prePage;
        this.requestId = builder.requestId;
        this.totalItemNum = builder.totalItemNum;
        this.totalPageNum = builder.totalPageNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDomainListResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPageNum
     */
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private Boolean nextPage; 
        private Integer pageSize; 
        private Boolean prePage; 
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public QueryDomainListResponseBody build() {
            return new QueryDomainListResponseBody(this);
        } 

    } 

    public static class Domain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainAuditStatus")
        private String domainAuditStatus;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainStatus")
        private String domainStatus;

        @com.aliyun.core.annotation.NameInMap("DomainType")
        private String domainType;

        @com.aliyun.core.annotation.NameInMap("ExpirationCurrDateDiff")
        private Integer expirationCurrDateDiff;

        @com.aliyun.core.annotation.NameInMap("ExpirationDate")
        private String expirationDate;

        @com.aliyun.core.annotation.NameInMap("ExpirationDateLong")
        private Long expirationDateLong;

        @com.aliyun.core.annotation.NameInMap("ExpirationDateStatus")
        private String expirationDateStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Premium")
        private Boolean premium;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("RegistrantType")
        private String registrantType;

        @com.aliyun.core.annotation.NameInMap("RegistrationDate")
        private String registrationDate;

        @com.aliyun.core.annotation.NameInMap("RegistrationDateLong")
        private Long registrationDateLong;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        private Domain(Builder builder) {
            this.domainAuditStatus = builder.domainAuditStatus;
            this.domainName = builder.domainName;
            this.domainStatus = builder.domainStatus;
            this.domainType = builder.domainType;
            this.expirationCurrDateDiff = builder.expirationCurrDateDiff;
            this.expirationDate = builder.expirationDate;
            this.expirationDateLong = builder.expirationDateLong;
            this.expirationDateStatus = builder.expirationDateStatus;
            this.instanceId = builder.instanceId;
            this.premium = builder.premium;
            this.productId = builder.productId;
            this.registrantType = builder.registrantType;
            this.registrationDate = builder.registrationDate;
            this.registrationDateLong = builder.registrationDateLong;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domain create() {
            return builder().build();
        }

        /**
         * @return domainAuditStatus
         */
        public String getDomainAuditStatus() {
            return this.domainAuditStatus;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainStatus
         */
        public String getDomainStatus() {
            return this.domainStatus;
        }

        /**
         * @return domainType
         */
        public String getDomainType() {
            return this.domainType;
        }

        /**
         * @return expirationCurrDateDiff
         */
        public Integer getExpirationCurrDateDiff() {
            return this.expirationCurrDateDiff;
        }

        /**
         * @return expirationDate
         */
        public String getExpirationDate() {
            return this.expirationDate;
        }

        /**
         * @return expirationDateLong
         */
        public Long getExpirationDateLong() {
            return this.expirationDateLong;
        }

        /**
         * @return expirationDateStatus
         */
        public String getExpirationDateStatus() {
            return this.expirationDateStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return premium
         */
        public Boolean getPremium() {
            return this.premium;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return registrantType
         */
        public String getRegistrantType() {
            return this.registrantType;
        }

        /**
         * @return registrationDate
         */
        public String getRegistrationDate() {
            return this.registrationDate;
        }

        /**
         * @return registrationDateLong
         */
        public Long getRegistrationDateLong() {
            return this.registrationDateLong;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private String domainAuditStatus; 
            private String domainName; 
            private String domainStatus; 
            private String domainType; 
            private Integer expirationCurrDateDiff; 
            private String expirationDate; 
            private Long expirationDateLong; 
            private String expirationDateStatus; 
            private String instanceId; 
            private Boolean premium; 
            private String productId; 
            private String registrantType; 
            private String registrationDate; 
            private Long registrationDateLong; 
            private String remark; 

            /**
             * DomainAuditStatus.
             */
            public Builder domainAuditStatus(String domainAuditStatus) {
                this.domainAuditStatus = domainAuditStatus;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * DomainStatus.
             */
            public Builder domainStatus(String domainStatus) {
                this.domainStatus = domainStatus;
                return this;
            }

            /**
             * DomainType.
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
                return this;
            }

            /**
             * ExpirationCurrDateDiff.
             */
            public Builder expirationCurrDateDiff(Integer expirationCurrDateDiff) {
                this.expirationCurrDateDiff = expirationCurrDateDiff;
                return this;
            }

            /**
             * ExpirationDate.
             */
            public Builder expirationDate(String expirationDate) {
                this.expirationDate = expirationDate;
                return this;
            }

            /**
             * ExpirationDateLong.
             */
            public Builder expirationDateLong(Long expirationDateLong) {
                this.expirationDateLong = expirationDateLong;
                return this;
            }

            /**
             * ExpirationDateStatus.
             */
            public Builder expirationDateStatus(String expirationDateStatus) {
                this.expirationDateStatus = expirationDateStatus;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Premium.
             */
            public Builder premium(Boolean premium) {
                this.premium = premium;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(String productId) {
                this.productId = productId;
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
             * RegistrationDate.
             */
            public Builder registrationDate(String registrationDate) {
                this.registrationDate = registrationDate;
                return this;
            }

            /**
             * RegistrationDateLong.
             */
            public Builder registrationDateLong(Long registrationDateLong) {
                this.registrationDateLong = registrationDateLong;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public Domain build() {
                return new Domain(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private java.util.List < Domain> domain;

        private Data(Builder builder) {
            this.domain = builder.domain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public java.util.List < Domain> getDomain() {
            return this.domain;
        }

        public static final class Builder {
            private java.util.List < Domain> domain; 

            /**
             * Domain.
             */
            public Builder domain(java.util.List < Domain> domain) {
                this.domain = domain;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
