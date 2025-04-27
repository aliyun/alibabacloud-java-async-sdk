// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link CreateVpcEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpcEndpointResponseBody</p>
 */
public class CreateVpcEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateVpcEndpointResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The endpoint domain name, which is used to configure the connection.</p>
         * 
         * <strong>example:</strong>
         * <p>F99407AB-2FA9-489E-A259-40CF6DCC47D9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the endpoint on the service VPC side.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CreateVpcEndpointResponseBody build() {
            return new CreateVpcEndpointResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateVpcEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>CreateVpcEndpointResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endpointDomain")
        private String endpointDomain;

        @com.aliyun.core.annotation.NameInMap("endpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("endpointName")
        private String endpointName;

        @com.aliyun.core.annotation.NameInMap("serviceId")
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.endpointDomain = model.endpointDomain;
                this.endpointId = model.endpointId;
                this.endpointName = model.endpointName;
                this.serviceId = model.serviceId;
            } 

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
             * <p>The name of the service VPC-side endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>epsrv-bp1w0p3jdirbfmt6****</p>
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
