// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSharedResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSharedResourcesResponseBody</p>
 */
public class ListSharedResourcesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SharedResources")
    private java.util.List < SharedResources> sharedResources;

    private ListSharedResourcesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.sharedResources = builder.sharedResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSharedResourcesResponseBody create() {
        return builder().build();
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
     * @return sharedResources
     */
    public java.util.List < SharedResources> getSharedResources() {
        return this.sharedResources;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < SharedResources> sharedResources; 

        /**
         * The token that is used to initiate the next request. If the response of the current request is truncated, you can use the token to initiate another request and obtain the remaining records.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The information of the shared resources.
         */
        public Builder sharedResources(java.util.List < SharedResources> sharedResources) {
            this.sharedResources = sharedResources;
            return this;
        }

        public ListSharedResourcesResponseBody build() {
            return new ListSharedResourcesResponseBody(this);
        } 

    } 

    public static class SharedResources extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceShareId")
        private String resourceShareId;

        @NameInMap("ResourceStatus")
        private String resourceStatus;

        @NameInMap("ResourceStatusMessage")
        private String resourceStatusMessage;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("UpdateTime")
        private String updateTime;

        private SharedResources(Builder builder) {
            this.createTime = builder.createTime;
            this.resourceId = builder.resourceId;
            this.resourceShareId = builder.resourceShareId;
            this.resourceStatus = builder.resourceStatus;
            this.resourceStatusMessage = builder.resourceStatusMessage;
            this.resourceType = builder.resourceType;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SharedResources create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceShareId
         */
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        /**
         * @return resourceStatus
         */
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        /**
         * @return resourceStatusMessage
         */
        public String getResourceStatusMessage() {
            return this.resourceStatusMessage;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String resourceId; 
            private String resourceShareId; 
            private String resourceStatus; 
            private String resourceStatusMessage; 
            private String resourceType; 
            private String updateTime; 

            /**
             * The time when the shared resource was associated with the resource share.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the shared resource.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The ID of the resource share.
             */
            public Builder resourceShareId(String resourceShareId) {
                this.resourceShareId = resourceShareId;
                return this;
            }

            /**
             * The status of the shared resource. This parameter is returned only when you query the resources that other accounts share with you.
             * <p>
             * 
             * Valid values:
             * 
             * *   Available: The resource is available.
             * *   ZonalResourceInaccessible: The resource is unavailable in the current zone.
             * *   LimitExceeded: The resource is unavailable because the maximum number of resources that other accounts can share with you exceeds the upper limit.
             * *   Unavailable: The resource is unavailable.
             */
            public Builder resourceStatus(String resourceStatus) {
                this.resourceStatus = resourceStatus;
                return this;
            }

            /**
             * The cause of the association failure.
             */
            public Builder resourceStatusMessage(String resourceStatusMessage) {
                this.resourceStatusMessage = resourceStatusMessage;
                return this;
            }

            /**
             * The type of the shared resource.
             * <p>
             * 
             * For more information about the types of resources that can be shared, see [Services that work with Resource Sharing](~~450526~~).
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The time when the association of the shared resource was updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public SharedResources build() {
                return new SharedResources(this);
            } 

        } 

    }
}
