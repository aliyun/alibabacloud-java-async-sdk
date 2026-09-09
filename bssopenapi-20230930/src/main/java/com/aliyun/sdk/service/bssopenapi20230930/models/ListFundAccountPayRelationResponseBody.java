// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link ListFundAccountPayRelationResponseBody} extends {@link TeaModel}
 *
 * <p>ListFundAccountPayRelationResponseBody</p>
 */
public class ListFundAccountPayRelationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListFundAccountPayRelationResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.metadata = builder.metadata;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFundAccountPayRelationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List<Data> data; 
        private Object metadata; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListFundAccountPayRelationResponseBody model) {
            this.currentPage = model.currentPage;
            this.data = model.data;
            this.metadata = model.metadata;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The data list.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListFundAccountPayRelationResponseBody build() {
            return new ListFundAccountPayRelationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFundAccountPayRelationResponseBody} extends {@link TeaModel}
     *
     * <p>ListFundAccountPayRelationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("Ecid")
        private String ecid;

        @com.aliyun.core.annotation.NameInMap("EffectiveTime")
        private String effectiveTime;

        @com.aliyun.core.annotation.NameInMap("FundAccountId")
        private String fundAccountId;

        @com.aliyun.core.annotation.NameInMap("FundAccountOwnerAccountId")
        private String fundAccountOwnerAccountId;

        @com.aliyun.core.annotation.NameInMap("IneffectiveTime")
        private String ineffectiveTime;

        @com.aliyun.core.annotation.NameInMap("Nbid")
        private String nbid;

        @com.aliyun.core.annotation.NameInMap("OperatorName")
        private String operatorName;

        @com.aliyun.core.annotation.NameInMap("OperatorNo")
        private String operatorNo;

        @com.aliyun.core.annotation.NameInMap("OperatorType")
        private String operatorType;

        @com.aliyun.core.annotation.NameInMap("RelationType")
        private String relationType;

        @com.aliyun.core.annotation.NameInMap("Site")
        private String site;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.ecid = builder.ecid;
            this.effectiveTime = builder.effectiveTime;
            this.fundAccountId = builder.fundAccountId;
            this.fundAccountOwnerAccountId = builder.fundAccountOwnerAccountId;
            this.ineffectiveTime = builder.ineffectiveTime;
            this.nbid = builder.nbid;
            this.operatorName = builder.operatorName;
            this.operatorNo = builder.operatorNo;
            this.operatorType = builder.operatorType;
            this.relationType = builder.relationType;
            this.site = builder.site;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return ecid
         */
        public String getEcid() {
            return this.ecid;
        }

        /**
         * @return effectiveTime
         */
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        /**
         * @return fundAccountId
         */
        public String getFundAccountId() {
            return this.fundAccountId;
        }

        /**
         * @return fundAccountOwnerAccountId
         */
        public String getFundAccountOwnerAccountId() {
            return this.fundAccountOwnerAccountId;
        }

        /**
         * @return ineffectiveTime
         */
        public String getIneffectiveTime() {
            return this.ineffectiveTime;
        }

        /**
         * @return nbid
         */
        public String getNbid() {
            return this.nbid;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        /**
         * @return operatorNo
         */
        public String getOperatorNo() {
            return this.operatorNo;
        }

        /**
         * @return operatorType
         */
        public String getOperatorType() {
            return this.operatorType;
        }

        /**
         * @return relationType
         */
        public String getRelationType() {
            return this.relationType;
        }

        /**
         * @return site
         */
        public String getSite() {
            return this.site;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String accountId; 
            private String accountName; 
            private String ecid; 
            private String effectiveTime; 
            private String fundAccountId; 
            private String fundAccountOwnerAccountId; 
            private String ineffectiveTime; 
            private String nbid; 
            private String operatorName; 
            private String operatorNo; 
            private String operatorType; 
            private String relationType; 
            private String site; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountId = model.accountId;
                this.accountName = model.accountName;
                this.ecid = model.ecid;
                this.effectiveTime = model.effectiveTime;
                this.fundAccountId = model.fundAccountId;
                this.fundAccountOwnerAccountId = model.fundAccountOwnerAccountId;
                this.ineffectiveTime = model.ineffectiveTime;
                this.nbid = model.nbid;
                this.operatorName = model.operatorName;
                this.operatorNo = model.operatorNo;
                this.operatorType = model.operatorType;
                this.relationType = model.relationType;
                this.site = model.site;
                this.status = model.status;
            } 

            /**
             * <p>The account ID of the user associated with the payment relationship, that is, the account that uses this account for payment.</p>
             * 
             * <strong>example:</strong>
             * <p>32812132121</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The user name.</p>
             * 
             * <strong>example:</strong>
             * <p>云某的名称</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The enterprise entity ID of the user associated with the payment relationship.</p>
             * 
             * <strong>example:</strong>
             * <p>213231232</p>
             */
            public Builder ecid(String ecid) {
                this.ecid = ecid;
                return this;
            }

            /**
             * <p>The time when the payment relationship takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-01 12:00:10</p>
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * <p>The account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123231213</p>
             */
            public Builder fundAccountId(String fundAccountId) {
                this.fundAccountId = fundAccountId;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID of the account owner.</p>
             * 
             * <strong>example:</strong>
             * <p>312328912</p>
             */
            public Builder fundAccountOwnerAccountId(String fundAccountOwnerAccountId) {
                this.fundAccountOwnerAccountId = fundAccountOwnerAccountId;
                return this;
            }

            /**
             * <p>The time when the payment relationship expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-01 12:12:12</p>
             */
            public Builder ineffectiveTime(String ineffectiveTime) {
                this.ineffectiveTime = ineffectiveTime;
                return this;
            }

            /**
             * <p>The primary marketplace.</p>
             * 
             * <strong>example:</strong>
             * <p>2684210001</p>
             */
            public Builder nbid(String nbid) {
                this.nbid = nbid;
                return this;
            }

            /**
             * <p>The operator name.
             * When the operator type is aliyun_pk, the operator name is the Alibaba Cloud nickname.
             * When the operator type is system, the operator name is &quot;Alibaba Cloud assistant&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>云某的名称</p>
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * <p>The authorized operator.
             * When the operator type is aliyun_pk, operatorNo is the Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1232343423</p>
             */
            public Builder operatorNo(String operatorNo) {
                this.operatorNo = operatorNo;
                return this;
            }

            /**
             * <p>The type of the authorized operator.
             * aliyun_pk: user.
             * system: Alibaba Cloud system.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun_pk</p>
             */
            public Builder operatorType(String operatorType) {
                this.operatorType = operatorType;
                return this;
            }

            /**
             * <p>The relationship type, which can be collection relationship or payment relationship.</p>
             * 
             * <strong>example:</strong>
             * <p>PAYMENT</p>
             */
            public Builder relationType(String relationType) {
                this.relationType = relationType;
                return this;
            }

            /**
             * <p>The site.</p>
             * 
             * <strong>example:</strong>
             * <p>26842</p>
             */
            public Builder site(String site) {
                this.site = site;
                return this;
            }

            /**
             * <p>The relationship status.
             * valid: valid.
             * expired: invalid.</p>
             * 
             * <strong>example:</strong>
             * <p>valid</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
