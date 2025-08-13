// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

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
 * {@link UntagResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>UntagResourcesResponseBody</p>
 */
public class UntagResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedResources")
    private FailedResources failedResources;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UntagResourcesResponseBody(Builder builder) {
        this.failedResources = builder.failedResources;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UntagResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failedResources
     */
    public FailedResources getFailedResources() {
        return this.failedResources;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private FailedResources failedResources; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UntagResourcesResponseBody model) {
            this.failedResources = model.failedResources;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the resources from which tags fail to be removed.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If tags are removed from all resources, the value of FailedResources is empty.</p>
         * </li>
         * <li><p>If tags fail to be removed from some or all resources, the value of FailedResources contains the detailed information about the resources.</p>
         * </li>
         * </ul>
         */
        public Builder failedResources(FailedResources failedResources) {
            this.failedResources = failedResources;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>43D12436-B10F-4469-8136-FD1C5D2B2083</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UntagResourcesResponseBody build() {
            return new UntagResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UntagResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>UntagResourcesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private Result(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
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

        public static final class Builder {
            private String code; 
            private String message; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.code = model.code;
                this.message = model.message;
            } 

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidResourceId.NotFound</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>The specified ResourceIds are not found in our records.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link UntagResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>UntagResourcesResponseBody</p>
     */
    public static class FailedResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceARN")
        private String resourceARN;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Result result;

        private FailedResource(Builder builder) {
            this.resourceARN = builder.resourceARN;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedResource create() {
            return builder().build();
        }

        /**
         * @return resourceARN
         */
        public String getResourceARN() {
            return this.resourceARN;
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
        }

        public static final class Builder {
            private String resourceARN; 
            private Result result; 

            private Builder() {
            } 

            private Builder(FailedResource model) {
                this.resourceARN = model.resourceARN;
                this.result = model.result;
            } 

            /**
             * <p>The ARN of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>arn:acs:ecs:cn-hangzhou:123456789****:instance/i-xxxxxxxxxx1</p>
             */
            public Builder resourceARN(String resourceARN) {
                this.resourceARN = resourceARN;
                return this;
            }

            /**
             * <p>The information about the error.</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            public FailedResource build() {
                return new FailedResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link UntagResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>UntagResourcesResponseBody</p>
     */
    public static class FailedResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedResource")
        private java.util.List<FailedResource> failedResource;

        private FailedResources(Builder builder) {
            this.failedResource = builder.failedResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedResources create() {
            return builder().build();
        }

        /**
         * @return failedResource
         */
        public java.util.List<FailedResource> getFailedResource() {
            return this.failedResource;
        }

        public static final class Builder {
            private java.util.List<FailedResource> failedResource; 

            private Builder() {
            } 

            private Builder(FailedResources model) {
                this.failedResource = model.failedResource;
            } 

            /**
             * FailedResource.
             */
            public Builder failedResource(java.util.List<FailedResource> failedResource) {
                this.failedResource = failedResource;
                return this;
            }

            public FailedResources build() {
                return new FailedResources(this);
            } 

        } 

    }
}
