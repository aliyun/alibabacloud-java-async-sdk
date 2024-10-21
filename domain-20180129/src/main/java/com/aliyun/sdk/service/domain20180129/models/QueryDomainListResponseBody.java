// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder currentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }

        /**
         * <p>The domain names.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Indicates whether the current page is followed by a page.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder nextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Indicates whether the current page is preceded by a page.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder prePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B7AB5469-5E38-4AA9-A920-C65B7A9C8E6E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of domain names returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public QueryDomainListResponseBody build() {
            return new QueryDomainListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDomainListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDomainListResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The key of the tag added to the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag added to the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>testValue</p>
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
    /**
     * 
     * {@link QueryDomainListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDomainListResponseBody</p>
     */
    public static class DomainTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
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
    /**
     * 
     * {@link QueryDomainListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDomainListResponseBody</p>
     */
    public static class Domain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ccompany")
        private String ccompany;

        @com.aliyun.core.annotation.NameInMap("ChgholderStatus")
        private String chgholderStatus;

        @com.aliyun.core.annotation.NameInMap("DomainAuditStatus")
        private String domainAuditStatus;

        @com.aliyun.core.annotation.NameInMap("DomainGroupId")
        private String domainGroupId;

        @com.aliyun.core.annotation.NameInMap("DomainGroupName")
        private String domainGroupName;

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

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private DomainTag tag;

        private Domain(Builder builder) {
            this.ccompany = builder.ccompany;
            this.chgholderStatus = builder.chgholderStatus;
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
         * @return chgholderStatus
         */
        public String getChgholderStatus() {
            return this.chgholderStatus;
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
            private String chgholderStatus; 
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
             * <p>The name of the domain name registrant.</p>
             * 
             * <strong>example:</strong>
             * <p>Guangzhou Forest Advertising Decoration Co., LTD</p>
             */
            public Builder ccompany(String ccompany) {
                this.ccompany = ccompany;
                return this;
            }

            /**
             * ChgholderStatus.
             */
            public Builder chgholderStatus(String chgholderStatus) {
                this.chgholderStatus = chgholderStatus;
                return this;
            }

            /**
             * <p>The state of real-name verification for the domain name. Valid values:</p>
             * <ul>
             * <li><strong>FAILED</strong>: Real-name verification for the domain name fails.</li>
             * <li><strong>SUCCEED</strong>: Real-name verification for the domain name is successful.</li>
             * <li><strong>NONAUDIT</strong>: Real-name verification for the domain name is not performed.</li>
             * <li><strong>AUDITING</strong>: Real-name verification for the domain name is in progress.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FAILED</p>
             */
            public Builder domainAuditStatus(String domainAuditStatus) {
                this.domainAuditStatus = domainAuditStatus;
                return this;
            }

            /**
             * <p>The ID of the domain name group.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder domainGroupId(String domainGroupId) {
                this.domainGroupId = domainGroupId;
                return this;
            }

            /**
             * <p>The name of the domain name group.</p>
             * 
             * <strong>example:</strong>
             * <p>测试分组</p>
             */
            public Builder domainGroupName(String domainGroupName) {
                this.domainGroupName = domainGroupName;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>test.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The state of the domain name. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The domain name needs to be renewed.</li>
             * <li><strong>2</strong>: The domain name needs to be redeemed.</li>
             * <li><strong>3</strong>: The domain name is normal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder domainStatus(String domainStatus) {
                this.domainStatus = domainStatus;
                return this;
            }

            /**
             * <p>The type of the domain name. Valid values:</p>
             * <ul>
             * <li><strong>New gTLD</strong></li>
             * <li><strong>gTLD</strong></li>
             * <li><strong>ccTLD</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>gTLD</p>
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
                return this;
            }

            /**
             * <p>The number of days from the expiration date of the domain name to the current date.</p>
             * 
             * <strong>example:</strong>
             * <p>-30</p>
             */
            public Builder expirationCurrDateDiff(Integer expirationCurrDateDiff) {
                this.expirationCurrDateDiff = expirationCurrDateDiff;
                return this;
            }

            /**
             * <p>The time when the domain name expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-11-02 04:00:45</p>
             */
            public Builder expirationDate(String expirationDate) {
                this.expirationDate = expirationDate;
                return this;
            }

            /**
             * <p>The validity period of the domain name. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1522080000000</p>
             */
            public Builder expirationDateLong(Long expirationDateLong) {
                this.expirationDateLong = expirationDateLong;
                return this;
            }

            /**
             * <p>Indicates whether the domain name expires. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The domain name does not expire.</li>
             * <li><strong>2</strong>: The domain name expires.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder expirationDateStatus(String expirationDateStatus) {
                this.expirationDateStatus = expirationDateStatus;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ST20151102120031118</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the domain name is a premium domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder premium(Boolean premium) {
                this.premium = premium;
                return this;
            }

            /**
             * <p>The service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2a</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The registration type of the domain name. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: individual</li>
             * <li><strong>2</strong>: enterprise</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder registrantType(String registrantType) {
                this.registrantType = registrantType;
                return this;
            }

            /**
             * <p>The time when the domain name was registered.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-11-02 04:00:45</p>
             */
            public Builder registrationDate(String registrationDate) {
                this.registrationDate = registrationDate;
                return this;
            }

            /**
             * <p>Indicates how long the domain name has been registered. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1522080000000</p>
             */
            public Builder registrationDateLong(Long registrationDateLong) {
                this.registrationDateLong = registrationDateLong;
                return this;
            }

            /**
             * <p>The remarks of the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>备注</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the domain name belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2yyciz557g3q</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The tags added to the resource.</p>
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
    /**
     * 
     * {@link QueryDomainListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDomainListResponseBody</p>
     */
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
