// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDomainListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDomainListResponseBody</p>
 */
public class QueryDomainListResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    private Integer currentPageNum;

    @NameInMap("Data")
    private Data data;

    @NameInMap("NextPage")
    private Boolean nextPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PrePage")
    private Boolean prePage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @NameInMap("TotalPageNum")
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
         * The page number.
         */
        public Builder currentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }

        /**
         * The domain names.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Indicates whether the current page is followed by a page.
         */
        public Builder nextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Indicates whether the current page is preceded by a page.
         */
        public Builder prePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of domain names returned.
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        /**
         * The total number of pages returned.
         */
        public Builder totalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public QueryDomainListResponseBody build() {
            return new QueryDomainListResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the tag added to the resource.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag added to the resource.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class DomainTag extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private DomainTag(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainTag create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public DomainTag build() {
                return new DomainTag(this);
            } 

        } 

    }
    public static class Domain extends TeaModel {
        @NameInMap("Ccompany")
        private String ccompany;

        @NameInMap("DomainAuditStatus")
        private String domainAuditStatus;

        @NameInMap("DomainGroupId")
        private String domainGroupId;

        @NameInMap("DomainGroupName")
        private String domainGroupName;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("DomainStatus")
        private String domainStatus;

        @NameInMap("DomainType")
        private String domainType;

        @NameInMap("ExpirationCurrDateDiff")
        private Integer expirationCurrDateDiff;

        @NameInMap("ExpirationDate")
        private String expirationDate;

        @NameInMap("ExpirationDateLong")
        private Long expirationDateLong;

        @NameInMap("ExpirationDateStatus")
        private String expirationDateStatus;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Premium")
        private Boolean premium;

        @NameInMap("ProductId")
        private String productId;

        @NameInMap("RegistrantType")
        private String registrantType;

        @NameInMap("RegistrationDate")
        private String registrationDate;

        @NameInMap("RegistrationDateLong")
        private Long registrationDateLong;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Tag")
        private DomainTag tag;

        private Domain(Builder builder) {
            this.ccompany = builder.ccompany;
            this.domainAuditStatus = builder.domainAuditStatus;
            this.domainGroupId = builder.domainGroupId;
            this.domainGroupName = builder.domainGroupName;
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
            this.resourceGroupId = builder.resourceGroupId;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domain create() {
            return builder().build();
        }

        /**
         * @return ccompany
         */
        public String getCcompany() {
            return this.ccompany;
        }

        /**
         * @return domainAuditStatus
         */
        public String getDomainAuditStatus() {
            return this.domainAuditStatus;
        }

        /**
         * @return domainGroupId
         */
        public String getDomainGroupId() {
            return this.domainGroupId;
        }

        /**
         * @return domainGroupName
         */
        public String getDomainGroupName() {
            return this.domainGroupName;
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

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tag
         */
        public DomainTag getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String ccompany; 
            private String domainAuditStatus; 
            private String domainGroupId; 
            private String domainGroupName; 
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
            private String resourceGroupId; 
            private DomainTag tag; 

            /**
             * The name of the domain name registrant.
             */
            public Builder ccompany(String ccompany) {
                this.ccompany = ccompany;
                return this;
            }

            /**
             * The state of real-name verification for the domain name. Valid values:
             * <p>
             * 
             * *   **FAILED**: Real-name verification for the domain name fails.
             * *   **SUCCEED**: Real-name verification for the domain name is successful.
             * *   **NONAUDIT**: Real-name verification for the domain name is not performed.
             * *   **AUDITING**: Real-name verification for the domain name is in progress.
             */
            public Builder domainAuditStatus(String domainAuditStatus) {
                this.domainAuditStatus = domainAuditStatus;
                return this;
            }

            /**
             * The ID of the domain name group.
             */
            public Builder domainGroupId(String domainGroupId) {
                this.domainGroupId = domainGroupId;
                return this;
            }

            /**
             * The name of the domain name group.
             */
            public Builder domainGroupName(String domainGroupName) {
                this.domainGroupName = domainGroupName;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The state of the domain name. Valid values:
             * <p>
             * 
             * *   **1**: The domain name needs to be renewed.
             * *   **2**: The domain name needs to be redeemed.
             * *   **3**: The domain name is normal.
             */
            public Builder domainStatus(String domainStatus) {
                this.domainStatus = domainStatus;
                return this;
            }

            /**
             * The type of the domain name. Valid values:
             * <p>
             * 
             * *   **New gTLD**
             * *   **gTLD**
             * *   **ccTLD**
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
                return this;
            }

            /**
             * The number of days from the expiration date of the domain name to the current date.
             */
            public Builder expirationCurrDateDiff(Integer expirationCurrDateDiff) {
                this.expirationCurrDateDiff = expirationCurrDateDiff;
                return this;
            }

            /**
             * The time when the domain name expires.
             */
            public Builder expirationDate(String expirationDate) {
                this.expirationDate = expirationDate;
                return this;
            }

            /**
             * The validity period of the domain name. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder expirationDateLong(Long expirationDateLong) {
                this.expirationDateLong = expirationDateLong;
                return this;
            }

            /**
             * Indicates whether the domain name expires. Valid values:
             * <p>
             * 
             * *   **1**: The domain name does not expire.
             * *   **2**: The domain name expires.
             */
            public Builder expirationDateStatus(String expirationDateStatus) {
                this.expirationDateStatus = expirationDateStatus;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Indicates whether the domain name is a premium domain name.
             */
            public Builder premium(Boolean premium) {
                this.premium = premium;
                return this;
            }

            /**
             * The service ID.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * The registration type of the domain name. Valid values:
             * <p>
             * 
             * *   **1**: individual
             * *   **2**: enterprise
             */
            public Builder registrantType(String registrantType) {
                this.registrantType = registrantType;
                return this;
            }

            /**
             * The time when the domain name was registered.
             */
            public Builder registrationDate(String registrationDate) {
                this.registrationDate = registrationDate;
                return this;
            }

            /**
             * Indicates how long the domain name has been registered. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder registrationDateLong(Long registrationDateLong) {
                this.registrationDateLong = registrationDateLong;
                return this;
            }

            /**
             * The remarks of the domain name.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The ID of the resource group to which the domain name belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The tags added to the resource.
             */
            public Builder tag(DomainTag tag) {
                this.tag = tag;
                return this;
            }

            public Domain build() {
                return new Domain(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Domain")
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
