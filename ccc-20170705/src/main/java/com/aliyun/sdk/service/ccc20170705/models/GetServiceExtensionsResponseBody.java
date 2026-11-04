// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link GetServiceExtensionsResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceExtensionsResponseBody</p>
 */
public class GetServiceExtensionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceExtensions")
    private ServiceExtensions serviceExtensions;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetServiceExtensionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.serviceExtensions = builder.serviceExtensions;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceExtensionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceExtensions
     */
    public ServiceExtensions getServiceExtensions() {
        return this.serviceExtensions;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private ServiceExtensions serviceExtensions; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetServiceExtensionsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.serviceExtensions = model.serviceExtensions;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceExtensions.
         */
        public Builder serviceExtensions(ServiceExtensions serviceExtensions) {
            this.serviceExtensions = serviceExtensions;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetServiceExtensionsResponseBody build() {
            return new GetServiceExtensionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceExtensionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceExtensionsResponseBody</p>
     */
    public static class ServiceExtension extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        private ServiceExtension(Builder builder) {
            this.name = builder.name;
            this.number = builder.number;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceExtension create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        public static final class Builder {
            private String name; 
            private String number; 

            private Builder() {
            } 

            private Builder(ServiceExtension model) {
                this.name = model.name;
                this.number = model.number;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Number.
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            public ServiceExtension build() {
                return new ServiceExtension(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceExtensionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceExtensionsResponseBody</p>
     */
    public static class ServiceExtensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServiceExtension")
        private java.util.List<ServiceExtension> serviceExtension;

        private ServiceExtensions(Builder builder) {
            this.serviceExtension = builder.serviceExtension;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceExtensions create() {
            return builder().build();
        }

        /**
         * @return serviceExtension
         */
        public java.util.List<ServiceExtension> getServiceExtension() {
            return this.serviceExtension;
        }

        public static final class Builder {
            private java.util.List<ServiceExtension> serviceExtension; 

            private Builder() {
            } 

            private Builder(ServiceExtensions model) {
                this.serviceExtension = model.serviceExtension;
            } 

            /**
             * ServiceExtension.
             */
            public Builder serviceExtension(java.util.List<ServiceExtension> serviceExtension) {
                this.serviceExtension = serviceExtension;
                return this;
            }

            public ServiceExtensions build() {
                return new ServiceExtensions(this);
            } 

        } 

    }
}
