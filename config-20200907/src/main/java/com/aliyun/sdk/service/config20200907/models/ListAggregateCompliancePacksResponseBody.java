// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link ListAggregateCompliancePacksResponseBody} extends {@link TeaModel}
 *
 * <p>ListAggregateCompliancePacksResponseBody</p>
 */
public class ListAggregateCompliancePacksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CompliancePacksResult")
    private CompliancePacksResult compliancePacksResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAggregateCompliancePacksResponseBody(Builder builder) {
        this.compliancePacksResult = builder.compliancePacksResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAggregateCompliancePacksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return compliancePacksResult
     */
    public CompliancePacksResult getCompliancePacksResult() {
        return this.compliancePacksResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CompliancePacksResult compliancePacksResult; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAggregateCompliancePacksResponseBody model) {
            this.compliancePacksResult = model.compliancePacksResult;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The compliance packages returned.</p>
         */
        public Builder compliancePacksResult(CompliancePacksResult compliancePacksResult) {
            this.compliancePacksResult = compliancePacksResult;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B5806142-3090-4F86-A84E-12B3FE52C1C4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAggregateCompliancePacksResponseBody build() {
            return new ListAggregateCompliancePacksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAggregateCompliancePacksResponseBody} extends {@link TeaModel}
     *
     * <p>ListAggregateCompliancePacksResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key-1</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value-1</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAggregateCompliancePacksResponseBody} extends {@link TeaModel}
     *
     * <p>ListAggregateCompliancePacksResponseBody</p>
     */
    public static class CompliancePacks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("AggregatorId")
        private String aggregatorId;

        @com.aliyun.core.annotation.NameInMap("CompliancePackId")
        private String compliancePackId;

        @com.aliyun.core.annotation.NameInMap("CompliancePackName")
        private String compliancePackName;

        @com.aliyun.core.annotation.NameInMap("CompliancePackTemplateId")
        private String compliancePackTemplateId;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private Integer riskLevel;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private CompliancePacks(Builder builder) {
            this.accountId = builder.accountId;
            this.aggregatorId = builder.aggregatorId;
            this.compliancePackId = builder.compliancePackId;
            this.compliancePackName = builder.compliancePackName;
            this.compliancePackTemplateId = builder.compliancePackTemplateId;
            this.createTimestamp = builder.createTimestamp;
            this.description = builder.description;
            this.riskLevel = builder.riskLevel;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompliancePacks create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return aggregatorId
         */
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        /**
         * @return compliancePackId
         */
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        /**
         * @return compliancePackName
         */
        public String getCompliancePackName() {
            return this.compliancePackName;
        }

        /**
         * @return compliancePackTemplateId
         */
        public String getCompliancePackTemplateId() {
            return this.compliancePackTemplateId;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return riskLevel
         */
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Long accountId; 
            private String aggregatorId; 
            private String compliancePackId; 
            private String compliancePackName; 
            private String compliancePackTemplateId; 
            private Long createTimestamp; 
            private String description; 
            private Integer riskLevel; 
            private String status; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(CompliancePacks model) {
                this.accountId = model.accountId;
                this.aggregatorId = model.aggregatorId;
                this.compliancePackId = model.compliancePackId;
                this.compliancePackName = model.compliancePackName;
                this.compliancePackTemplateId = model.compliancePackTemplateId;
                this.createTimestamp = model.createTimestamp;
                this.description = model.description;
                this.riskLevel = model.riskLevel;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * <p>The ID of the management account to which the compliance package belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>100931896542****</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The ID of the account group.</p>
             * 
             * <strong>example:</strong>
             * <p>ca-f632626622af0079****</p>
             */
            public Builder aggregatorId(String aggregatorId) {
                this.aggregatorId = aggregatorId;
                return this;
            }

            /**
             * <p>The ID of the compliance package.</p>
             * 
             * <strong>example:</strong>
             * <p>cp-fdc8626622af00f9****</p>
             */
            public Builder compliancePackId(String compliancePackId) {
                this.compliancePackId = compliancePackId;
                return this;
            }

            /**
             * <p>The name of the compliance package.</p>
             * 
             * <strong>example:</strong>
             * <p>example-name</p>
             */
            public Builder compliancePackName(String compliancePackName) {
                this.compliancePackName = compliancePackName;
                return this;
            }

            /**
             * <p>The ID of the compliance package template.</p>
             * 
             * <strong>example:</strong>
             * <p>ct-5f26ff4e06a300c4****</p>
             */
            public Builder compliancePackTemplateId(String compliancePackTemplateId) {
                this.compliancePackTemplateId = compliancePackTemplateId;
                return this;
            }

            /**
             * <p>The timestamp when the compliance package was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1624243657000</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The description of the compliance package.</p>
             * 
             * <strong>example:</strong>
             * <p>example-description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The risk level of the resources that are not compliant with the managed rules in the compliance package. Valid values:</p>
             * <ul>
             * <li>1: high risk level.</li>
             * <li>2: medium risk level.</li>
             * <li>3: low risk level.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The status of the compliance package. Valid values:</p>
             * <ul>
             * <li>ACTIVE: The compliance package is available for use.</li>
             * <li>CREATING: The compliance package is being created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public CompliancePacks build() {
                return new CompliancePacks(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAggregateCompliancePacksResponseBody} extends {@link TeaModel}
     *
     * <p>ListAggregateCompliancePacksResponseBody</p>
     */
    public static class CompliancePacksResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompliancePacks")
        private java.util.List<CompliancePacks> compliancePacks;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private CompliancePacksResult(Builder builder) {
            this.compliancePacks = builder.compliancePacks;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompliancePacksResult create() {
            return builder().build();
        }

        /**
         * @return compliancePacks
         */
        public java.util.List<CompliancePacks> getCompliancePacks() {
            return this.compliancePacks;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<CompliancePacks> compliancePacks; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(CompliancePacksResult model) {
                this.compliancePacks = model.compliancePacks;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The compliance packages.</p>
             */
            public Builder compliancePacks(java.util.List<CompliancePacks> compliancePacks) {
                this.compliancePacks = compliancePacks;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of compliance packages returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public CompliancePacksResult build() {
                return new CompliancePacksResult(this);
            } 

        } 

    }
}
