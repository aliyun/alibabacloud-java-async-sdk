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
 * {@link QueryCostCenterShareRuleResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCostCenterShareRuleResponseBody</p>
 */
public class QueryCostCenterShareRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private QueryCostCenterShareRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.metadata = builder.metadata;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCostCenterShareRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List<Data> data; 
        private Integer maxResults; 
        private Object metadata; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(QueryCostCenterShareRuleResponseBody model) {
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.metadata = model.metadata;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Metadata.
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryCostCenterShareRuleResponseBody build() {
            return new QueryCostCenterShareRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCostCenterShareRuleResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCostCenterShareRuleResponseBody</p>
     */
    public static class FromCostCenterShareRuleDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CostCenterCode")
        private String costCenterCode;

        @com.aliyun.core.annotation.NameInMap("CostCenterId")
        private Long costCenterId;

        @com.aliyun.core.annotation.NameInMap("CostCenterName")
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("OwnerAccountId")
        private Long ownerAccountId;

        @com.aliyun.core.annotation.NameInMap("ParentCostCenterId")
        private Long parentCostCenterId;

        @com.aliyun.core.annotation.NameInMap("PrevCostCenterId")
        private Long prevCostCenterId;

        @com.aliyun.core.annotation.NameInMap("RootCostCenterId")
        private Long rootCostCenterId;

        private FromCostCenterShareRuleDetails(Builder builder) {
            this.costCenterCode = builder.costCenterCode;
            this.costCenterId = builder.costCenterId;
            this.costCenterName = builder.costCenterName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.ownerAccountId = builder.ownerAccountId;
            this.parentCostCenterId = builder.parentCostCenterId;
            this.prevCostCenterId = builder.prevCostCenterId;
            this.rootCostCenterId = builder.rootCostCenterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FromCostCenterShareRuleDetails create() {
            return builder().build();
        }

        /**
         * @return costCenterCode
         */
        public String getCostCenterCode() {
            return this.costCenterCode;
        }

        /**
         * @return costCenterId
         */
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        /**
         * @return costCenterName
         */
        public String getCostCenterName() {
            return this.costCenterName;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return ownerAccountId
         */
        public Long getOwnerAccountId() {
            return this.ownerAccountId;
        }

        /**
         * @return parentCostCenterId
         */
        public Long getParentCostCenterId() {
            return this.parentCostCenterId;
        }

        /**
         * @return prevCostCenterId
         */
        public Long getPrevCostCenterId() {
            return this.prevCostCenterId;
        }

        /**
         * @return rootCostCenterId
         */
        public Long getRootCostCenterId() {
            return this.rootCostCenterId;
        }

        public static final class Builder {
            private String costCenterCode; 
            private Long costCenterId; 
            private String costCenterName; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long ownerAccountId; 
            private Long parentCostCenterId; 
            private Long prevCostCenterId; 
            private Long rootCostCenterId; 

            private Builder() {
            } 

            private Builder(FromCostCenterShareRuleDetails model) {
                this.costCenterCode = model.costCenterCode;
                this.costCenterId = model.costCenterId;
                this.costCenterName = model.costCenterName;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.ownerAccountId = model.ownerAccountId;
                this.parentCostCenterId = model.parentCostCenterId;
                this.prevCostCenterId = model.prevCostCenterId;
                this.rootCostCenterId = model.rootCostCenterId;
            } 

            /**
             * CostCenterCode.
             */
            public Builder costCenterCode(String costCenterCode) {
                this.costCenterCode = costCenterCode;
                return this;
            }

            /**
             * CostCenterId.
             */
            public Builder costCenterId(Long costCenterId) {
                this.costCenterId = costCenterId;
                return this;
            }

            /**
             * CostCenterName.
             */
            public Builder costCenterName(String costCenterName) {
                this.costCenterName = costCenterName;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * OwnerAccountId.
             */
            public Builder ownerAccountId(Long ownerAccountId) {
                this.ownerAccountId = ownerAccountId;
                return this;
            }

            /**
             * ParentCostCenterId.
             */
            public Builder parentCostCenterId(Long parentCostCenterId) {
                this.parentCostCenterId = parentCostCenterId;
                return this;
            }

            /**
             * PrevCostCenterId.
             */
            public Builder prevCostCenterId(Long prevCostCenterId) {
                this.prevCostCenterId = prevCostCenterId;
                return this;
            }

            /**
             * RootCostCenterId.
             */
            public Builder rootCostCenterId(Long rootCostCenterId) {
                this.rootCostCenterId = rootCostCenterId;
                return this;
            }

            public FromCostCenterShareRuleDetails build() {
                return new FromCostCenterShareRuleDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCostCenterShareRuleResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCostCenterShareRuleResponseBody</p>
     */
    public static class ToCostCenterShareRuleDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CostCenterCode")
        private String costCenterCode;

        @com.aliyun.core.annotation.NameInMap("CostCenterId")
        private Long costCenterId;

        @com.aliyun.core.annotation.NameInMap("CostCenterName")
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("OwnerAccountId")
        private Long ownerAccountId;

        @com.aliyun.core.annotation.NameInMap("ParentCostCenterId")
        private Long parentCostCenterId;

        @com.aliyun.core.annotation.NameInMap("PrevCostCenterId")
        private Long prevCostCenterId;

        @com.aliyun.core.annotation.NameInMap("RootCostCenterId")
        private Long rootCostCenterId;

        @com.aliyun.core.annotation.NameInMap("ShareRatio")
        private Double shareRatio;

        private ToCostCenterShareRuleDetails(Builder builder) {
            this.costCenterCode = builder.costCenterCode;
            this.costCenterId = builder.costCenterId;
            this.costCenterName = builder.costCenterName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.ownerAccountId = builder.ownerAccountId;
            this.parentCostCenterId = builder.parentCostCenterId;
            this.prevCostCenterId = builder.prevCostCenterId;
            this.rootCostCenterId = builder.rootCostCenterId;
            this.shareRatio = builder.shareRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToCostCenterShareRuleDetails create() {
            return builder().build();
        }

        /**
         * @return costCenterCode
         */
        public String getCostCenterCode() {
            return this.costCenterCode;
        }

        /**
         * @return costCenterId
         */
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        /**
         * @return costCenterName
         */
        public String getCostCenterName() {
            return this.costCenterName;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return ownerAccountId
         */
        public Long getOwnerAccountId() {
            return this.ownerAccountId;
        }

        /**
         * @return parentCostCenterId
         */
        public Long getParentCostCenterId() {
            return this.parentCostCenterId;
        }

        /**
         * @return prevCostCenterId
         */
        public Long getPrevCostCenterId() {
            return this.prevCostCenterId;
        }

        /**
         * @return rootCostCenterId
         */
        public Long getRootCostCenterId() {
            return this.rootCostCenterId;
        }

        /**
         * @return shareRatio
         */
        public Double getShareRatio() {
            return this.shareRatio;
        }

        public static final class Builder {
            private String costCenterCode; 
            private Long costCenterId; 
            private String costCenterName; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long ownerAccountId; 
            private Long parentCostCenterId; 
            private Long prevCostCenterId; 
            private Long rootCostCenterId; 
            private Double shareRatio; 

            private Builder() {
            } 

            private Builder(ToCostCenterShareRuleDetails model) {
                this.costCenterCode = model.costCenterCode;
                this.costCenterId = model.costCenterId;
                this.costCenterName = model.costCenterName;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.ownerAccountId = model.ownerAccountId;
                this.parentCostCenterId = model.parentCostCenterId;
                this.prevCostCenterId = model.prevCostCenterId;
                this.rootCostCenterId = model.rootCostCenterId;
                this.shareRatio = model.shareRatio;
            } 

            /**
             * CostCenterCode.
             */
            public Builder costCenterCode(String costCenterCode) {
                this.costCenterCode = costCenterCode;
                return this;
            }

            /**
             * CostCenterId.
             */
            public Builder costCenterId(Long costCenterId) {
                this.costCenterId = costCenterId;
                return this;
            }

            /**
             * CostCenterName.
             */
            public Builder costCenterName(String costCenterName) {
                this.costCenterName = costCenterName;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * OwnerAccountId.
             */
            public Builder ownerAccountId(Long ownerAccountId) {
                this.ownerAccountId = ownerAccountId;
                return this;
            }

            /**
             * ParentCostCenterId.
             */
            public Builder parentCostCenterId(Long parentCostCenterId) {
                this.parentCostCenterId = parentCostCenterId;
                return this;
            }

            /**
             * PrevCostCenterId.
             */
            public Builder prevCostCenterId(Long prevCostCenterId) {
                this.prevCostCenterId = prevCostCenterId;
                return this;
            }

            /**
             * RootCostCenterId.
             */
            public Builder rootCostCenterId(Long rootCostCenterId) {
                this.rootCostCenterId = rootCostCenterId;
                return this;
            }

            /**
             * ShareRatio.
             */
            public Builder shareRatio(Double shareRatio) {
                this.shareRatio = shareRatio;
                return this;
            }

            public ToCostCenterShareRuleDetails build() {
                return new ToCostCenterShareRuleDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCostCenterShareRuleResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCostCenterShareRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FromCostCenterShareRuleDetails")
        private java.util.List<FromCostCenterShareRuleDetails> fromCostCenterShareRuleDetails;

        @com.aliyun.core.annotation.NameInMap("OwnerAccountId")
        private Long ownerAccountId;

        @com.aliyun.core.annotation.NameInMap("ShareRuleId")
        private Long shareRuleId;

        @com.aliyun.core.annotation.NameInMap("ShareRuleName")
        private String shareRuleName;

        @com.aliyun.core.annotation.NameInMap("ShareRuleType")
        private String shareRuleType;

        @com.aliyun.core.annotation.NameInMap("ToCostCenterShareRuleDetails")
        private java.util.List<ToCostCenterShareRuleDetails> toCostCenterShareRuleDetails;

        private Data(Builder builder) {
            this.fromCostCenterShareRuleDetails = builder.fromCostCenterShareRuleDetails;
            this.ownerAccountId = builder.ownerAccountId;
            this.shareRuleId = builder.shareRuleId;
            this.shareRuleName = builder.shareRuleName;
            this.shareRuleType = builder.shareRuleType;
            this.toCostCenterShareRuleDetails = builder.toCostCenterShareRuleDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return fromCostCenterShareRuleDetails
         */
        public java.util.List<FromCostCenterShareRuleDetails> getFromCostCenterShareRuleDetails() {
            return this.fromCostCenterShareRuleDetails;
        }

        /**
         * @return ownerAccountId
         */
        public Long getOwnerAccountId() {
            return this.ownerAccountId;
        }

        /**
         * @return shareRuleId
         */
        public Long getShareRuleId() {
            return this.shareRuleId;
        }

        /**
         * @return shareRuleName
         */
        public String getShareRuleName() {
            return this.shareRuleName;
        }

        /**
         * @return shareRuleType
         */
        public String getShareRuleType() {
            return this.shareRuleType;
        }

        /**
         * @return toCostCenterShareRuleDetails
         */
        public java.util.List<ToCostCenterShareRuleDetails> getToCostCenterShareRuleDetails() {
            return this.toCostCenterShareRuleDetails;
        }

        public static final class Builder {
            private java.util.List<FromCostCenterShareRuleDetails> fromCostCenterShareRuleDetails; 
            private Long ownerAccountId; 
            private Long shareRuleId; 
            private String shareRuleName; 
            private String shareRuleType; 
            private java.util.List<ToCostCenterShareRuleDetails> toCostCenterShareRuleDetails; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.fromCostCenterShareRuleDetails = model.fromCostCenterShareRuleDetails;
                this.ownerAccountId = model.ownerAccountId;
                this.shareRuleId = model.shareRuleId;
                this.shareRuleName = model.shareRuleName;
                this.shareRuleType = model.shareRuleType;
                this.toCostCenterShareRuleDetails = model.toCostCenterShareRuleDetails;
            } 

            /**
             * FromCostCenterShareRuleDetails.
             */
            public Builder fromCostCenterShareRuleDetails(java.util.List<FromCostCenterShareRuleDetails> fromCostCenterShareRuleDetails) {
                this.fromCostCenterShareRuleDetails = fromCostCenterShareRuleDetails;
                return this;
            }

            /**
             * OwnerAccountId.
             */
            public Builder ownerAccountId(Long ownerAccountId) {
                this.ownerAccountId = ownerAccountId;
                return this;
            }

            /**
             * ShareRuleId.
             */
            public Builder shareRuleId(Long shareRuleId) {
                this.shareRuleId = shareRuleId;
                return this;
            }

            /**
             * ShareRuleName.
             */
            public Builder shareRuleName(String shareRuleName) {
                this.shareRuleName = shareRuleName;
                return this;
            }

            /**
             * ShareRuleType.
             */
            public Builder shareRuleType(String shareRuleType) {
                this.shareRuleType = shareRuleType;
                return this;
            }

            /**
             * ToCostCenterShareRuleDetails.
             */
            public Builder toCostCenterShareRuleDetails(java.util.List<ToCostCenterShareRuleDetails> toCostCenterShareRuleDetails) {
                this.toCostCenterShareRuleDetails = toCostCenterShareRuleDetails;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
