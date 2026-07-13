// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

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
 * {@link ListProtectionPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListProtectionPoliciesResponseBody</p>
 */
public class ListProtectionPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListProtectionPoliciesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProtectionPoliciesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListProtectionPoliciesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProtectionPoliciesResponseBody build() {
            return new ListProtectionPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProtectionPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProtectionPoliciesResponseBody</p>
     */
    public static class ApplyStatusCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyStatus")
        private String applyStatus;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        private ApplyStatusCount(Builder builder) {
            this.applyStatus = builder.applyStatus;
            this.count = builder.count;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyStatusCount create() {
            return builder().build();
        }

        /**
         * @return applyStatus
         */
        public String getApplyStatus() {
            return this.applyStatus;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        public static final class Builder {
            private String applyStatus; 
            private Long count; 

            private Builder() {
            } 

            private Builder(ApplyStatusCount model) {
                this.applyStatus = model.applyStatus;
                this.count = model.count;
            } 

            /**
             * ApplyStatus.
             */
            public Builder applyStatus(String applyStatus) {
                this.applyStatus = applyStatus;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            public ApplyStatusCount build() {
                return new ApplyStatusCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProtectionPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProtectionPoliciesResponseBody</p>
     */
    public static class ResourceCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private ResourceCount(Builder builder) {
            this.count = builder.count;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceCount create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private Long count; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(ResourceCount model) {
                this.count = model.count;
                this.resourceType = model.resourceType;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ResourceCount build() {
                return new ResourceCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProtectionPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProtectionPoliciesResponseBody</p>
     */
    public static class LatestApplySummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyStatusCount")
        private java.util.List<ApplyStatusCount> applyStatusCount;

        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private Long completeTime;

        @com.aliyun.core.annotation.NameInMap("ResourceCount")
        private java.util.List<ResourceCount> resourceCount;

        private LatestApplySummary(Builder builder) {
            this.applyStatusCount = builder.applyStatusCount;
            this.completeTime = builder.completeTime;
            this.resourceCount = builder.resourceCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LatestApplySummary create() {
            return builder().build();
        }

        /**
         * @return applyStatusCount
         */
        public java.util.List<ApplyStatusCount> getApplyStatusCount() {
            return this.applyStatusCount;
        }

        /**
         * @return completeTime
         */
        public Long getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return resourceCount
         */
        public java.util.List<ResourceCount> getResourceCount() {
            return this.resourceCount;
        }

        public static final class Builder {
            private java.util.List<ApplyStatusCount> applyStatusCount; 
            private Long completeTime; 
            private java.util.List<ResourceCount> resourceCount; 

            private Builder() {
            } 

            private Builder(LatestApplySummary model) {
                this.applyStatusCount = model.applyStatusCount;
                this.completeTime = model.completeTime;
                this.resourceCount = model.resourceCount;
            } 

            /**
             * ApplyStatusCount.
             */
            public Builder applyStatusCount(java.util.List<ApplyStatusCount> applyStatusCount) {
                this.applyStatusCount = applyStatusCount;
                return this;
            }

            /**
             * CompleteTime.
             */
            public Builder completeTime(Long completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * ResourceCount.
             */
            public Builder resourceCount(java.util.List<ResourceCount> resourceCount) {
                this.resourceCount = resourceCount;
                return this;
            }

            public LatestApplySummary build() {
                return new LatestApplySummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProtectionPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProtectionPoliciesResponseBody</p>
     */
    public static class SubProtectionPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("SubProtectionPolicyType")
        private String subProtectionPolicyType;

        private SubProtectionPolicies(Builder builder) {
            this.config = builder.config;
            this.subProtectionPolicyType = builder.subProtectionPolicyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubProtectionPolicies create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return subProtectionPolicyType
         */
        public String getSubProtectionPolicyType() {
            return this.subProtectionPolicyType;
        }

        public static final class Builder {
            private String config; 
            private String subProtectionPolicyType; 

            private Builder() {
            } 

            private Builder(SubProtectionPolicies model) {
                this.config = model.config;
                this.subProtectionPolicyType = model.subProtectionPolicyType;
            } 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * SubProtectionPolicyType.
             */
            public Builder subProtectionPolicyType(String subProtectionPolicyType) {
                this.subProtectionPolicyType = subProtectionPolicyType;
                return this;
            }

            public SubProtectionPolicies build() {
                return new SubProtectionPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProtectionPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProtectionPoliciesResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BoundResourceCategoryIds")
        private java.util.List<String> boundResourceCategoryIds;

        @com.aliyun.core.annotation.NameInMap("LatestApplySummary")
        private LatestApplySummary latestApplySummary;

        @com.aliyun.core.annotation.NameInMap("LatestApplyTime")
        private Long latestApplyTime;

        @com.aliyun.core.annotation.NameInMap("LatestTaskId")
        private String latestTaskId;

        @com.aliyun.core.annotation.NameInMap("ProtectionPolicyId")
        private String protectionPolicyId;

        @com.aliyun.core.annotation.NameInMap("ProtectionPolicyName")
        private String protectionPolicyName;

        @com.aliyun.core.annotation.NameInMap("ProtectionPolicyRegionId")
        private String protectionPolicyRegionId;

        @com.aliyun.core.annotation.NameInMap("SubProtectionPolicies")
        private java.util.List<SubProtectionPolicies> subProtectionPolicies;

        private Content(Builder builder) {
            this.boundResourceCategoryIds = builder.boundResourceCategoryIds;
            this.latestApplySummary = builder.latestApplySummary;
            this.latestApplyTime = builder.latestApplyTime;
            this.latestTaskId = builder.latestTaskId;
            this.protectionPolicyId = builder.protectionPolicyId;
            this.protectionPolicyName = builder.protectionPolicyName;
            this.protectionPolicyRegionId = builder.protectionPolicyRegionId;
            this.subProtectionPolicies = builder.subProtectionPolicies;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return boundResourceCategoryIds
         */
        public java.util.List<String> getBoundResourceCategoryIds() {
            return this.boundResourceCategoryIds;
        }

        /**
         * @return latestApplySummary
         */
        public LatestApplySummary getLatestApplySummary() {
            return this.latestApplySummary;
        }

        /**
         * @return latestApplyTime
         */
        public Long getLatestApplyTime() {
            return this.latestApplyTime;
        }

        /**
         * @return latestTaskId
         */
        public String getLatestTaskId() {
            return this.latestTaskId;
        }

        /**
         * @return protectionPolicyId
         */
        public String getProtectionPolicyId() {
            return this.protectionPolicyId;
        }

        /**
         * @return protectionPolicyName
         */
        public String getProtectionPolicyName() {
            return this.protectionPolicyName;
        }

        /**
         * @return protectionPolicyRegionId
         */
        public String getProtectionPolicyRegionId() {
            return this.protectionPolicyRegionId;
        }

        /**
         * @return subProtectionPolicies
         */
        public java.util.List<SubProtectionPolicies> getSubProtectionPolicies() {
            return this.subProtectionPolicies;
        }

        public static final class Builder {
            private java.util.List<String> boundResourceCategoryIds; 
            private LatestApplySummary latestApplySummary; 
            private Long latestApplyTime; 
            private String latestTaskId; 
            private String protectionPolicyId; 
            private String protectionPolicyName; 
            private String protectionPolicyRegionId; 
            private java.util.List<SubProtectionPolicies> subProtectionPolicies; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.boundResourceCategoryIds = model.boundResourceCategoryIds;
                this.latestApplySummary = model.latestApplySummary;
                this.latestApplyTime = model.latestApplyTime;
                this.latestTaskId = model.latestTaskId;
                this.protectionPolicyId = model.protectionPolicyId;
                this.protectionPolicyName = model.protectionPolicyName;
                this.protectionPolicyRegionId = model.protectionPolicyRegionId;
                this.subProtectionPolicies = model.subProtectionPolicies;
            } 

            /**
             * BoundResourceCategoryIds.
             */
            public Builder boundResourceCategoryIds(java.util.List<String> boundResourceCategoryIds) {
                this.boundResourceCategoryIds = boundResourceCategoryIds;
                return this;
            }

            /**
             * LatestApplySummary.
             */
            public Builder latestApplySummary(LatestApplySummary latestApplySummary) {
                this.latestApplySummary = latestApplySummary;
                return this;
            }

            /**
             * LatestApplyTime.
             */
            public Builder latestApplyTime(Long latestApplyTime) {
                this.latestApplyTime = latestApplyTime;
                return this;
            }

            /**
             * LatestTaskId.
             */
            public Builder latestTaskId(String latestTaskId) {
                this.latestTaskId = latestTaskId;
                return this;
            }

            /**
             * ProtectionPolicyId.
             */
            public Builder protectionPolicyId(String protectionPolicyId) {
                this.protectionPolicyId = protectionPolicyId;
                return this;
            }

            /**
             * ProtectionPolicyName.
             */
            public Builder protectionPolicyName(String protectionPolicyName) {
                this.protectionPolicyName = protectionPolicyName;
                return this;
            }

            /**
             * ProtectionPolicyRegionId.
             */
            public Builder protectionPolicyRegionId(String protectionPolicyRegionId) {
                this.protectionPolicyRegionId = protectionPolicyRegionId;
                return this;
            }

            /**
             * SubProtectionPolicies.
             */
            public Builder subProtectionPolicies(java.util.List<SubProtectionPolicies> subProtectionPolicies) {
                this.subProtectionPolicies = subProtectionPolicies;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProtectionPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProtectionPoliciesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private java.util.List<Content> content;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.content = builder.content;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public java.util.List<Content> getContent() {
            return this.content;
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Content> content; 
            private Integer maxResults; 
            private String nextToken; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.totalCount = model.totalCount;
            } 

            /**
             * Content.
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
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
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
