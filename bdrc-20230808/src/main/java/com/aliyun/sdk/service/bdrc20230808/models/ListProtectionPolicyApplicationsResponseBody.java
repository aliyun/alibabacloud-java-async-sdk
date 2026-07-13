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
 * {@link ListProtectionPolicyApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProtectionPolicyApplicationsResponseBody</p>
 */
public class ListProtectionPolicyApplicationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListProtectionPolicyApplicationsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProtectionPolicyApplicationsResponseBody create() {
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

        private Builder(ListProtectionPolicyApplicationsResponseBody model) {
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

        public ListProtectionPolicyApplicationsResponseBody build() {
            return new ListProtectionPolicyApplicationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProtectionPolicyApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProtectionPolicyApplicationsResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyDetail")
        private String applyDetail;

        @com.aliyun.core.annotation.NameInMap("ApplyStatus")
        private String applyStatus;

        @com.aliyun.core.annotation.NameInMap("ApplyTime")
        private Long applyTime;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("ProtectionPolicyId")
        private String protectionPolicyId;

        @com.aliyun.core.annotation.NameInMap("ResourceArn")
        private String resourceArn;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
        private Long resourceOwnerId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SubProtectionPolicyType")
        private String subProtectionPolicyType;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Content(Builder builder) {
            this.applyDetail = builder.applyDetail;
            this.applyStatus = builder.applyStatus;
            this.applyTime = builder.applyTime;
            this.productType = builder.productType;
            this.protectionPolicyId = builder.protectionPolicyId;
            this.resourceArn = builder.resourceArn;
            this.resourceId = builder.resourceId;
            this.resourceOwnerId = builder.resourceOwnerId;
            this.resourceType = builder.resourceType;
            this.subProtectionPolicyType = builder.subProtectionPolicyType;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return applyDetail
         */
        public String getApplyDetail() {
            return this.applyDetail;
        }

        /**
         * @return applyStatus
         */
        public String getApplyStatus() {
            return this.applyStatus;
        }

        /**
         * @return applyTime
         */
        public Long getApplyTime() {
            return this.applyTime;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return protectionPolicyId
         */
        public String getProtectionPolicyId() {
            return this.protectionPolicyId;
        }

        /**
         * @return resourceArn
         */
        public String getResourceArn() {
            return this.resourceArn;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceOwnerId
         */
        public Long getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return subProtectionPolicyType
         */
        public String getSubProtectionPolicyType() {
            return this.subProtectionPolicyType;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String applyDetail; 
            private String applyStatus; 
            private Long applyTime; 
            private String productType; 
            private String protectionPolicyId; 
            private String resourceArn; 
            private String resourceId; 
            private Long resourceOwnerId; 
            private String resourceType; 
            private String subProtectionPolicyType; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.applyDetail = model.applyDetail;
                this.applyStatus = model.applyStatus;
                this.applyTime = model.applyTime;
                this.productType = model.productType;
                this.protectionPolicyId = model.protectionPolicyId;
                this.resourceArn = model.resourceArn;
                this.resourceId = model.resourceId;
                this.resourceOwnerId = model.resourceOwnerId;
                this.resourceType = model.resourceType;
                this.subProtectionPolicyType = model.subProtectionPolicyType;
                this.taskId = model.taskId;
            } 

            /**
             * ApplyDetail.
             */
            public Builder applyDetail(String applyDetail) {
                this.applyDetail = applyDetail;
                return this;
            }

            /**
             * ApplyStatus.
             */
            public Builder applyStatus(String applyStatus) {
                this.applyStatus = applyStatus;
                return this;
            }

            /**
             * ApplyTime.
             */
            public Builder applyTime(Long applyTime) {
                this.applyTime = applyTime;
                return this;
            }

            /**
             * ProductType.
             */
            public Builder productType(String productType) {
                this.productType = productType;
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
             * ResourceArn.
             */
            public Builder resourceArn(String resourceArn) {
                this.resourceArn = resourceArn;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceOwnerId.
             */
            public Builder resourceOwnerId(Long resourceOwnerId) {
                this.resourceOwnerId = resourceOwnerId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * SubProtectionPolicyType.
             */
            public Builder subProtectionPolicyType(String subProtectionPolicyType) {
                this.subProtectionPolicyType = subProtectionPolicyType;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProtectionPolicyApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProtectionPolicyApplicationsResponseBody</p>
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
