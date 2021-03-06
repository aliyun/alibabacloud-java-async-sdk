// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceSourceResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceSourceResponseBody</p>
 */
public class ListServiceSourceResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListServiceSourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceSourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListServiceSourceResponseBody build() {
            return new ListServiceSourceResponseBody(this);
        } 

    } 

    public static class IngressOptions extends TeaModel {
        @NameInMap("EnableIngress")
        private Boolean enableIngress;

        @NameInMap("IngressClass")
        private String ingressClass;

        @NameInMap("WatchNamespace")
        private String watchNamespace;

        private IngressOptions(Builder builder) {
            this.enableIngress = builder.enableIngress;
            this.ingressClass = builder.ingressClass;
            this.watchNamespace = builder.watchNamespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IngressOptions create() {
            return builder().build();
        }

        /**
         * @return enableIngress
         */
        public Boolean getEnableIngress() {
            return this.enableIngress;
        }

        /**
         * @return ingressClass
         */
        public String getIngressClass() {
            return this.ingressClass;
        }

        /**
         * @return watchNamespace
         */
        public String getWatchNamespace() {
            return this.watchNamespace;
        }

        public static final class Builder {
            private Boolean enableIngress; 
            private String ingressClass; 
            private String watchNamespace; 

            /**
             * EnableIngress.
             */
            public Builder enableIngress(Boolean enableIngress) {
                this.enableIngress = enableIngress;
                return this;
            }

            /**
             * IngressClass.
             */
            public Builder ingressClass(String ingressClass) {
                this.ingressClass = ingressClass;
                return this;
            }

            /**
             * WatchNamespace.
             */
            public Builder watchNamespace(String watchNamespace) {
                this.watchNamespace = watchNamespace;
                return this;
            }

            public IngressOptions build() {
                return new IngressOptions(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("BindingWithGateway")
        private Integer bindingWithGateway;

        @NameInMap("GatewayId")
        private Long gatewayId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IngressOptions")
        private IngressOptions ingressOptions;

        @NameInMap("Name")
        private String name;

        @NameInMap("Source")
        private String source;

        @NameInMap("SourceUniqueId")
        private String sourceUniqueId;

        @NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.address = builder.address;
            this.bindingWithGateway = builder.bindingWithGateway;
            this.gatewayId = builder.gatewayId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.ingressOptions = builder.ingressOptions;
            this.name = builder.name;
            this.source = builder.source;
            this.sourceUniqueId = builder.sourceUniqueId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return bindingWithGateway
         */
        public Integer getBindingWithGateway() {
            return this.bindingWithGateway;
        }

        /**
         * @return gatewayId
         */
        public Long getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ingressOptions
         */
        public IngressOptions getIngressOptions() {
            return this.ingressOptions;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceUniqueId
         */
        public String getSourceUniqueId() {
            return this.sourceUniqueId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String address; 
            private Integer bindingWithGateway; 
            private Long gatewayId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private IngressOptions ingressOptions; 
            private String name; 
            private String source; 
            private String sourceUniqueId; 
            private String type; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * BindingWithGateway.
             */
            public Builder bindingWithGateway(Integer bindingWithGateway) {
                this.bindingWithGateway = bindingWithGateway;
                return this;
            }

            /**
             * GatewayId.
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IngressOptions.
             */
            public Builder ingressOptions(IngressOptions ingressOptions) {
                this.ingressOptions = ingressOptions;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * SourceUniqueId.
             */
            public Builder sourceUniqueId(String sourceUniqueId) {
                this.sourceUniqueId = sourceUniqueId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
