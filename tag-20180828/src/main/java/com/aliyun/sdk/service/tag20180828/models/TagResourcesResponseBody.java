// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TagResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>TagResourcesResponseBody</p>
 */
public class TagResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedResources")
    private FailedResources failedResources;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private TagResourcesResponseBody(Builder builder) {
        this.failedResources = builder.failedResources;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagResourcesResponseBody create() {
        return builder().build();
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

        /**
         * <p>The information about the resources to which tags fail to be added.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If tags are added to all resources, the value of <code>FailedResources</code> is empty.</p>
         * </li>
         * <li><p>If tags fail to be added to some or all resources, the value of <code>FailedResources</code> contains the detailed information about the resources.</p>
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
         * <p>72086426-9F8C-4A60-852B-864048FD1199</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TagResourcesResponseBody build() {
            return new TagResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TagResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>TagResourcesResponseBody</p>
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
     * {@link TagResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>TagResourcesResponseBody</p>
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

            /**
             * <p>The ARN of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>arn:acs:vpc:cn-hangzhou:123456789****:vpc/vpc-bp19dd90tkt6tz7wu****</p>
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
     * {@link TagResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>TagResourcesResponseBody</p>
     */
    public static class FailedResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedResource")
        private java.util.List < FailedResource> failedResource;

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
        public java.util.List < FailedResource> getFailedResource() {
            return this.failedResource;
        }

        public static final class Builder {
            private java.util.List < FailedResource> failedResource; 

            /**
             * FailedResource.
             */
            public Builder failedResource(java.util.List < FailedResource> failedResource) {
                this.failedResource = failedResource;
                return this;
            }

            public FailedResources build() {
                return new FailedResources(this);
            } 

        } 

    }
}
