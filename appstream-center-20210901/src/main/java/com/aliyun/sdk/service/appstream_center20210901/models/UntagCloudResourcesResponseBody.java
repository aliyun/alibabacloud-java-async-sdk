// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link UntagCloudResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>UntagCloudResourcesResponseBody</p>
 */
public class UntagCloudResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedResources")
    private java.util.List<FailedResources> failedResources;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UntagCloudResourcesResponseBody(Builder builder) {
        this.failedResources = builder.failedResources;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UntagCloudResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return failedResources
     */
    public java.util.List<FailedResources> getFailedResources() {
        return this.failedResources;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<FailedResources> failedResources; 
        private String requestId; 

        /**
         * <p>The cloud resources whose tags failed to be removed and the corresponding tags.</p>
         */
        public Builder failedResources(java.util.List<FailedResources> failedResources) {
            this.failedResources = failedResources;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E25FC620-6B6F-12D2-A992-AD8727DC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UntagCloudResourcesResponseBody build() {
            return new UntagCloudResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UntagCloudResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>UntagCloudResourcesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.scope = builder.scope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        public static final class Builder {
            private String key; 
            private String scope; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>Resolution</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Custom: custom tag.</li>
             * <li>System: system tag.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link UntagCloudResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>UntagCloudResourcesResponseBody</p>
     */
    public static class FailedResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private FailedResources(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedResources create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private String resourceId; 
            private String resourceType; 
            private java.util.List<Tags> tags; 

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>UNTAG_RESOURCE_FAILED</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Failed to untag resource.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The resource IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-00000001</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of the cloud resource.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>AppId: app ID.</li>
             * <li>WyId: Alibaba Cloud Workspace user ID.</li>
             * <li>AppInstanceGroupId: delivery group ID.</li>
             * <li>AliUid: tenant ID.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AppInstanceGroupId</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The tags that failed to be removed from the cloud resources.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public FailedResources build() {
                return new FailedResources(this);
            } 

        } 

    }
}
