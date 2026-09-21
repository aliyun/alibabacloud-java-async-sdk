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
 * {@link TagCloudResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>TagCloudResourcesResponseBody</p>
 */
public class TagCloudResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedResources")
    private java.util.List<FailedResources> failedResources;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private TagCloudResourcesResponseBody(Builder builder) {
        this.failedResources = builder.failedResources;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagCloudResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(TagCloudResourcesResponseBody model) {
            this.failedResources = model.failedResources;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of failed resources and tag information.</p>
         */
        public Builder failedResources(java.util.List<FailedResources> failedResources) {
            this.failedResources = failedResources;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TagCloudResourcesResponseBody build() {
            return new TagCloudResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TagCloudResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>TagCloudResourcesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.scope = builder.scope;
            this.value = builder.value;
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

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String scope; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.scope = model.scope;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>System/Scheduler/STOP_NEW_USER_CONNECTION</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag type.</p>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link TagCloudResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>TagCloudResourcesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(FailedResources model) {
                this.code = model.code;
                this.message = model.message;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.tags = model.tags;
            } 

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>TAG_KEY_DUPLICATED</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The error description.</p>
             * 
             * <strong>example:</strong>
             * <p>Duplicate tag keys exist.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-001</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The cloud resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>AppInstanceGroupId</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The list of failed tag information.</p>
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
