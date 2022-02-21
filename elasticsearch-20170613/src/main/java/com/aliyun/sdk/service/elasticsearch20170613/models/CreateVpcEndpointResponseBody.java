// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpcEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpcEndpointResponseBody</p>
 */
public class CreateVpcEndpointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private CreateVpcEndpointResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcEndpointResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CreateVpcEndpointResponseBody build() {
            return new CreateVpcEndpointResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("endpointDomain")
        private String endpointDomain;

        @NameInMap("endpointId")
        private String endpointId;

        @NameInMap("endpointName")
        private String endpointName;

        @NameInMap("serviceId")
        private String serviceId;

        private Result(Builder builder) {
            this.endpointDomain = builder.endpointDomain;
            this.endpointId = builder.endpointId;
            this.endpointName = builder.endpointName;
            this.serviceId = builder.serviceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return endpointDomain
         */
        public String getEndpointDomain() {
            return this.endpointDomain;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return endpointName
         */
        public String getEndpointName() {
            return this.endpointName;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        public static final class Builder {
            private String endpointDomain; 
            private String endpointId; 
            private String endpointName; 
            private String serviceId; 

            /**
             * endpointDomain.
             */
            public Builder endpointDomain(String endpointDomain) {
                this.endpointDomain = endpointDomain;
                return this;
            }

            /**
             * endpointId.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * endpointName.
             */
            public Builder endpointName(String endpointName) {
                this.endpointName = endpointName;
                return this;
            }

            /**
             * serviceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
