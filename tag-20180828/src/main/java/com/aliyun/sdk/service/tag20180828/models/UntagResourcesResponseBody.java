// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UntagResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>UntagResourcesResponseBody</p>
 */
public class UntagResourcesResponseBody extends TeaModel {
    @NameInMap("FailedResources")
    private FailedResources failedResources;

    @NameInMap("RequestId")
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
         * FailedResources.
         */
        public Builder failedResources(FailedResources failedResources) {
            this.failedResources = failedResources;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UntagResourcesResponseBody build() {
            return new UntagResourcesResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Message")
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
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Message.
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
    public static class FailedResource extends TeaModel {
        @NameInMap("ResourceARN")
        private String resourceARN;

        @NameInMap("Result")
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
             * ResourceARN.
             */
            public Builder resourceARN(String resourceARN) {
                this.resourceARN = resourceARN;
                return this;
            }

            /**
             * Result.
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
    public static class FailedResources extends TeaModel {
        @NameInMap("FailedResource")
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
