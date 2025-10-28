// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link EnableServicesResponseBody} extends {@link TeaModel}
 *
 * <p>EnableServicesResponseBody</p>
 */
public class EnableServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedServices")
    private java.util.List<FailedServices> failedServices;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EnableServicesResponseBody(Builder builder) {
        this.failedServices = builder.failedServices;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableServicesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failedServices
     */
    public java.util.List<FailedServices> getFailedServices() {
        return this.failedServices;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<FailedServices> failedServices; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(EnableServicesResponseBody model) {
            this.failedServices = model.failedServices;
            this.requestId = model.requestId;
        } 

        /**
         * FailedServices.
         */
        public Builder failedServices(java.util.List<FailedServices> failedServices) {
            this.failedServices = failedServices;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnableServicesResponseBody build() {
            return new EnableServicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EnableServicesResponseBody} extends {@link TeaModel}
     *
     * <p>EnableServicesResponseBody</p>
     */
    public static class FailedServices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        private FailedServices(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedServices create() {
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
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private String serviceName; 

            private Builder() {
            } 

            private Builder(FailedServices model) {
                this.code = model.code;
                this.message = model.message;
                this.serviceName = model.serviceName;
            } 

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

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public FailedServices build() {
                return new FailedServices(this);
            } 

        } 

    }
}
