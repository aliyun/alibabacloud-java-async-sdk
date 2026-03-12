// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20160511.models;

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

        private Builder() {
        } 

        private Builder(QueryDomainListResponseBody model) {
            this.currentPageNum = model.currentPageNum;
            this.data = model.data;
            this.nextPage = model.nextPage;
            this.pageSize = model.pageSize;
            this.prePage = model.prePage;
            this.requestId = model.requestId;
            this.totalItemNum = model.totalItemNum;
            this.totalPageNum = model.totalPageNum;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }

        /**
         * <p>The returned results.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Indicates whether the current page is followed by a page.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder nextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Indicates whether the current page follows another page.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder prePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9DFCF6F8-243C-****-8035-4B12FEFD7D48</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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
    public static class Domain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeadDate")
        private String deadDate;

        @com.aliyun.core.annotation.NameInMap("DeadDateLong")
        private Long deadDateLong;

        @com.aliyun.core.annotation.NameInMap("DeadDateStatus")
        private String deadDateStatus;

        @com.aliyun.core.annotation.NameInMap("DomainAuditStatus")
        private String domainAuditStatus;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainRegType")
        private String domainRegType;

        @com.aliyun.core.annotation.NameInMap("DomainStatus")
        private String domainStatus;

        @com.aliyun.core.annotation.NameInMap("DomainType")
        private String domainType;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Premium")
        private Boolean premium;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("RegDate")
        private String regDate;

        @com.aliyun.core.annotation.NameInMap("RegDateLong")
        private Long regDateLong;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("SaleId")
        private String saleId;

        private Domain(Builder builder) {
            this.deadDate = builder.deadDate;
            this.deadDateLong = builder.deadDateLong;
            this.deadDateStatus = builder.deadDateStatus;
            this.domainAuditStatus = builder.domainAuditStatus;
            this.domainName = builder.domainName;
            this.domainRegType = builder.domainRegType;
            this.domainStatus = builder.domainStatus;
            this.domainType = builder.domainType;
            this.groupId = builder.groupId;
            this.premium = builder.premium;
            this.productId = builder.productId;
            this.regDate = builder.regDate;
            this.regDateLong = builder.regDateLong;
            this.remark = builder.remark;
            this.saleId = builder.saleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domain create() {
            return builder().build();
        }

        /**
         * @return deadDate
         */
        public String getDeadDate() {
            return this.deadDate;
        }

        /**
         * @return deadDateLong
         */
        public Long getDeadDateLong() {
            return this.deadDateLong;
        }

        /**
         * @return deadDateStatus
         */
        public String getDeadDateStatus() {
            return this.deadDateStatus;
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
         * @return domainRegType
         */
        public String getDomainRegType() {
            return this.domainRegType;
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
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
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
         * @return regDate
         */
        public String getRegDate() {
            return this.regDate;
        }

        /**
         * @return regDateLong
         */
        public Long getRegDateLong() {
            return this.regDateLong;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return saleId
         */
        public String getSaleId() {
            return this.saleId;
        }

        public static final class Builder {
            private String deadDate; 
            private Long deadDateLong; 
            private String deadDateStatus; 
            private String domainAuditStatus; 
            private String domainName; 
            private String domainRegType; 
            private String domainStatus; 
            private String domainType; 
            private String groupId; 
            private Boolean premium; 
            private String productId; 
            private String regDate; 
            private Long regDateLong; 
            private String remark; 
            private String saleId; 

            private Builder() {
            } 

            private Builder(Domain model) {
                this.deadDate = model.deadDate;
                this.deadDateLong = model.deadDateLong;
                this.deadDateStatus = model.deadDateStatus;
                this.domainAuditStatus = model.domainAuditStatus;
                this.domainName = model.domainName;
                this.domainRegType = model.domainRegType;
                this.domainStatus = model.domainStatus;
                this.domainType = model.domainType;
                this.groupId = model.groupId;
                this.premium = model.premium;
                this.productId = model.productId;
                this.regDate = model.regDate;
                this.regDateLong = model.regDateLong;
                this.remark = model.remark;
                this.saleId = model.saleId;
            } 

            /**
             * <p>The time when the domain name expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-16 02:20:34</p>
             */
            public Builder deadDate(String deadDate) {
                this.deadDate = deadDate;
                return this;
            }

            /**
             * <p>The time when the domain name expires.</p>
             * 
             * <strong>example:</strong>
             * <p>1696435200000</p>
             */
            public Builder deadDateLong(Long deadDateLong) {
                this.deadDateLong = deadDateLong;
                return this;
            }

            /**
             * <p>The expiration status of the domain name. Valid values:</p>
             * <p>1: unexpired. 2: expired.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder deadDateStatus(String deadDateStatus) {
                this.deadDateStatus = deadDateStatus;
                return this;
            }

            /**
             * <p>The review status of the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCEED</p>
             */
            public Builder domainAuditStatus(String domainAuditStatus) {
                this.domainAuditStatus = domainAuditStatus;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>test003.cn</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The registration type of the domain name. Valid values:</p>
             * <p>PERSONAL: individual. COMPANY: enterprise.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPANY</p>
             */
            public Builder domainRegType(String domainRegType) {
                this.domainRegType = domainRegType;
                return this;
            }

            /**
             * <p>The status of the domain name. Valid values:</p>
             * <p>1: The domain name needs to be renewed. 2: The domain name needs to be redeemed. 3: The domain name is normal. 4: The domain name is being transferred from HiChina. 5: The information about the domain name registrant is being modified. 6: Real-name verification is not performed on the domain name. 7: Real-name verification for the domain name fails. Real-name reverification is required. 8: The domain name is being reviewed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder domainStatus(String domainStatus) {
                this.domainStatus = domainStatus;
                return this;
            }

            /**
             * <p>The type of the domain name. Valid values:</p>
             * <p>New gTLD gTLD ccTLD other</p>
             * 
             * <strong>example:</strong>
             * <p>gTLD</p>
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
                return this;
            }

            /**
             * <p>The group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>Indicates whether the domain name is a premium domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>falese</p>
             */
            public Builder premium(Boolean premium) {
                this.premium = premium;
                return this;
            }

            /**
             * <p>The product ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The time when the domain name was registered.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-16 02:20:35</p>
             */
            public Builder regDate(String regDate) {
                this.regDate = regDate;
                return this;
            }

            /**
             * <p>The time when the domain name was registered.</p>
             * 
             * <strong>example:</strong>
             * <p>1696435200000</p>
             */
            public Builder regDateLong(Long regDateLong) {
                this.regDateLong = regDateLong;
                return this;
            }

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>S20172315BJ37809</p>
             */
            public Builder saleId(String saleId) {
                this.saleId = saleId;
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
        private java.util.List<Domain> domain;

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
        public java.util.List<Domain> getDomain() {
            return this.domain;
        }

        public static final class Builder {
            private java.util.List<Domain> domain; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.domain = model.domain;
            } 

            /**
             * Domain.
             */
            public Builder domain(java.util.List<Domain> domain) {
                this.domain = domain;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
