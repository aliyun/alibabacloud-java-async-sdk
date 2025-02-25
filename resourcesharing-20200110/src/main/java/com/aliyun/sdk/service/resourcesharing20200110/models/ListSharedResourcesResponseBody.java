// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSharedResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSharedResourcesResponseBody</p>
 */
public class ListSharedResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SharedResources")
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
         * <p>The token that is used to initiate the next request. If the response of the current request is truncated, you can use the token to initiate another request and obtain the remaining records.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cm****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04677DCA-7C33-464B-8811-1B1DA3C3D197</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information of the shared resources.</p>
         */
        public Builder sharedResources(java.util.List < SharedResources> sharedResources) {
            this.sharedResources = sharedResources;
            return this;
        }

        public ListSharedResourcesResponseBody build() {
            return new ListSharedResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSharedResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSharedResourcesResponseBody</p>
     */
    public static class SharedResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceShareId")
        private String resourceShareId;

        @com.aliyun.core.annotation.NameInMap("ResourceStatus")
        private String resourceStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceStatusMessage")
        private String resourceStatusMessage;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
             * <p>The time when the shared resource was associated with the resource share.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-07T07:39:02.921Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the shared resource.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1upw03qyz8n7us9****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The ID of the resource share.</p>
             * 
             * <strong>example:</strong>
             * <p>rs-6GRmdD3X****</p>
             */
            public Builder resourceShareId(String resourceShareId) {
                this.resourceShareId = resourceShareId;
                return this;
            }

            /**
             * <p>The status of the shared resource. This parameter is returned only when you query the resources that other accounts share with you.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Available: The resource is available.</li>
             * <li>ZonalResourceInaccessible: The resource is unavailable in the current zone.</li>
             * <li>LimitExceeded: The resource is unavailable because the maximum number of resources that other accounts can share with you exceeds the upper limit.</li>
             * <li>Unavailable: The resource is unavailable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder resourceStatus(String resourceStatus) {
                this.resourceStatus = resourceStatus;
                return this;
            }

            /**
             * <p>The cause of the association failure.</p>
             * 
             * <strong>example:</strong>
             * <p>The reason for the association failure.</p>
             */
            public Builder resourceStatusMessage(String resourceStatusMessage) {
                this.resourceStatusMessage = resourceStatusMessage;
                return this;
            }

            /**
             * <p>The type of the shared resource.</p>
             * <p>For more information about the types of resources that can be shared, see <a href="https://help.aliyun.com/document_detail/450526.html">Services that work with Resource Sharing</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>VSwitch</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The time when the association of the shared resource was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-07T07:39:02.921Z</p>
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
