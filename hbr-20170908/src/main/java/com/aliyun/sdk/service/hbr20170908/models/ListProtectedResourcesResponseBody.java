// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link ListProtectedResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListProtectedResourcesResponseBody</p>
 */
public class ListProtectedResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("ProtectedResources")
    private java.util.List<ProtectedResources> protectedResources;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListProtectedResourcesResponseBody(Builder builder) {
        this.code = builder.code;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.protectedResources = builder.protectedResources;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProtectedResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return protectedResources
     */
    public java.util.List<ProtectedResources> getProtectedResources() {
        return this.protectedResources;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private java.util.List<ProtectedResources> protectedResources; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListProtectedResourcesResponseBody model) {
            this.code = model.code;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.protectedResources = model.protectedResources;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * ProtectedResources.
         */
        public Builder protectedResources(java.util.List<ProtectedResources> protectedResources) {
            this.protectedResources = protectedResources;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListProtectedResourcesResponseBody build() {
            return new ListProtectedResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProtectedResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProtectedResourcesResponseBody</p>
     */
    public static class ProtectedResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedByProduct")
        private String createdByProduct;

        @com.aliyun.core.annotation.NameInMap("ProtectedDataSize")
        private Long protectedDataSize;

        @com.aliyun.core.annotation.NameInMap("ProtectedResourceId")
        private String protectedResourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
        private Long resourceOwnerId;

        @com.aliyun.core.annotation.NameInMap("SnapshotCount")
        private Long snapshotCount;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        private ProtectedResources(Builder builder) {
            this.createdByProduct = builder.createdByProduct;
            this.protectedDataSize = builder.protectedDataSize;
            this.protectedResourceId = builder.protectedResourceId;
            this.resourceId = builder.resourceId;
            this.resourceOwnerId = builder.resourceOwnerId;
            this.snapshotCount = builder.snapshotCount;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProtectedResources create() {
            return builder().build();
        }

        /**
         * @return createdByProduct
         */
        public String getCreatedByProduct() {
            return this.createdByProduct;
        }

        /**
         * @return protectedDataSize
         */
        public Long getProtectedDataSize() {
            return this.protectedDataSize;
        }

        /**
         * @return protectedResourceId
         */
        public String getProtectedResourceId() {
            return this.protectedResourceId;
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
         * @return snapshotCount
         */
        public Long getSnapshotCount() {
            return this.snapshotCount;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private String createdByProduct; 
            private Long protectedDataSize; 
            private String protectedResourceId; 
            private String resourceId; 
            private Long resourceOwnerId; 
            private Long snapshotCount; 
            private String sourceType; 

            private Builder() {
            } 

            private Builder(ProtectedResources model) {
                this.createdByProduct = model.createdByProduct;
                this.protectedDataSize = model.protectedDataSize;
                this.protectedResourceId = model.protectedResourceId;
                this.resourceId = model.resourceId;
                this.resourceOwnerId = model.resourceOwnerId;
                this.snapshotCount = model.snapshotCount;
                this.sourceType = model.sourceType;
            } 

            /**
             * CreatedByProduct.
             */
            public Builder createdByProduct(String createdByProduct) {
                this.createdByProduct = createdByProduct;
                return this;
            }

            /**
             * ProtectedDataSize.
             */
            public Builder protectedDataSize(Long protectedDataSize) {
                this.protectedDataSize = protectedDataSize;
                return this;
            }

            /**
             * ProtectedResourceId.
             */
            public Builder protectedResourceId(String protectedResourceId) {
                this.protectedResourceId = protectedResourceId;
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
             * SnapshotCount.
             */
            public Builder snapshotCount(Long snapshotCount) {
                this.snapshotCount = snapshotCount;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public ProtectedResources build() {
                return new ProtectedResources(this);
            } 

        } 

    }
}
