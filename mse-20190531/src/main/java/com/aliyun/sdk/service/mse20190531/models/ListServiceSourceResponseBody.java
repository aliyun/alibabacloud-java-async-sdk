// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link ListServiceSourceResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceSourceResponseBody</p>
 */
public class ListServiceSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListServiceSourceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>You are not authorized to perform this operation.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B8C4B0D8-EBB9-5F20-8295-04224FBE5529</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListServiceSourceResponseBody build() {
            return new ListServiceSourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceSourceResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceSourceResponseBody</p>
     */
    public static class IngressOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableIngress")
        private Boolean enableIngress;

        @com.aliyun.core.annotation.NameInMap("EnableStatus")
        private Boolean enableStatus;

        @com.aliyun.core.annotation.NameInMap("IngressClass")
        private String ingressClass;

        @com.aliyun.core.annotation.NameInMap("WatchNamespace")
        private String watchNamespace;

        private IngressOptions(Builder builder) {
            this.enableIngress = builder.enableIngress;
            this.enableStatus = builder.enableStatus;
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
         * @return enableStatus
         */
        public Boolean getEnableStatus() {
            return this.enableStatus;
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
            private Boolean enableStatus; 
            private String ingressClass; 
            private String watchNamespace; 

            private Builder() {
            } 

            private Builder(IngressOptions model) {
                this.enableIngress = model.enableIngress;
                this.enableStatus = model.enableStatus;
                this.ingressClass = model.ingressClass;
                this.watchNamespace = model.watchNamespace;
            } 

            /**
             * <p>Indicates whether Ingresses are enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableIngress(Boolean enableIngress) {
                this.enableIngress = enableIngress;
                return this;
            }

            /**
             * <p>Indicates whether the Ingress status is updated.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableStatus(Boolean enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            /**
             * <p>The Ingress class.</p>
             * 
             * <strong>example:</strong>
             * <p>com.test.xxx</p>
             */
            public Builder ingressClass(String ingressClass) {
                this.ingressClass = ingressClass;
                return this;
            }

            /**
             * <p>The namespace that you want to monitor.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
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
    /**
     * 
     * {@link ListServiceSourceResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceSourceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("BindingWithGateway")
        private Integer bindingWithGateway;

        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private Long gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GroupList")
        private java.util.List<String> groupList;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IngressOptions")
        private IngressOptions ingressOptions;

        @com.aliyun.core.annotation.NameInMap("Invalid")
        private Boolean invalid;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PathList")
        private java.util.List<String> pathList;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourceUniqueId")
        private String sourceUniqueId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.address = builder.address;
            this.bindingWithGateway = builder.bindingWithGateway;
            this.gatewayId = builder.gatewayId;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.groupList = builder.groupList;
            this.id = builder.id;
            this.ingressOptions = builder.ingressOptions;
            this.invalid = builder.invalid;
            this.name = builder.name;
            this.pathList = builder.pathList;
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
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
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
         * @return groupList
         */
        public java.util.List<String> getGroupList() {
            return this.groupList;
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
         * @return invalid
         */
        public Boolean getInvalid() {
            return this.invalid;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pathList
         */
        public java.util.List<String> getPathList() {
            return this.pathList;
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
            private String gatewayUniqueId; 
            private String gmtCreate; 
            private String gmtModified; 
            private java.util.List<String> groupList; 
            private Long id; 
            private IngressOptions ingressOptions; 
            private Boolean invalid; 
            private String name; 
            private java.util.List<String> pathList; 
            private String source; 
            private String sourceUniqueId; 
            private String type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.address = model.address;
                this.bindingWithGateway = model.bindingWithGateway;
                this.gatewayId = model.gatewayId;
                this.gatewayUniqueId = model.gatewayUniqueId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.groupList = model.groupList;
                this.id = model.id;
                this.ingressOptions = model.ingressOptions;
                this.invalid = model.invalid;
                this.name = model.name;
                this.pathList = model.pathList;
                this.source = model.source;
                this.sourceUniqueId = model.sourceUniqueId;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the Container Service for Kubernetes (ACK) cluster or the endpoint of the Microservices Engine (MSE) instance.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>Indicates whether the service source is associated with the gateway. The value 1 indicates that the service source is associated with the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bindingWithGateway(Integer bindingWithGateway) {
                this.bindingWithGateway = bindingWithGateway;
                return this;
            }

            /**
             * <p>The ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The unique ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-2u9uhd9283hd92hgd39g239dg2*****</p>
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-07 18:07:57</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-07 18:07:57</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The array of service groups.</p>
             */
            public Builder groupList(java.util.List<String> groupList) {
                this.groupList = groupList;
                return this;
            }

            /**
             * <p>The ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The information about the support for Ingresses by applications.</p>
             */
            public Builder ingressOptions(IngressOptions ingressOptions) {
                this.ingressOptions = ingressOptions;
                return this;
            }

            /**
             * Invalid.
             */
            public Builder invalid(Boolean invalid) {
                this.invalid = invalid;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The array of root paths of service lists.</p>
             */
            public Builder pathList(java.util.List<String> pathList) {
                this.pathList = pathList;
                return this;
            }

            /**
             * <p>The type of the service source.</p>
             * 
             * <strong>example:</strong>
             * <p>MSE</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The unique ID of the service source.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-cn-***</p>
             */
            public Builder sourceUniqueId(String sourceUniqueId) {
                this.sourceUniqueId = sourceUniqueId;
                return this;
            }

            /**
             * <p>The type.</p>
             * 
             * <strong>example:</strong>
             * <p>NACOS</p>
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
