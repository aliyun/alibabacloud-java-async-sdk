// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIngressesResponseBody} extends {@link TeaModel}
 *
 * <p>ListIngressesResponseBody</p>
 */
public class ListIngressesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TraceId")
    private String traceId;

    private ListIngressesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIngressesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The port specified for the SLB listener.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The ID of the namespace.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the SLB instance.
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

        /**
         * The name of the routing rule.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public ListIngressesResponseBody build() {
            return new ListIngressesResponseBody(this);
        } 

    } 

    public static class IngressList extends TeaModel {
        @NameInMap("CertId")
        private String certId;

        @NameInMap("CertIds")
        private String certIds;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ListenerPort")
        private String listenerPort;

        @NameInMap("ListenerProtocol")
        private String listenerProtocol;

        @NameInMap("LoadBalanceType")
        private String loadBalanceType;

        @NameInMap("MseGatewayId")
        private String mseGatewayId;

        @NameInMap("MseGatewayPort")
        private String mseGatewayPort;

        @NameInMap("MseGatewayProtocol")
        private String mseGatewayProtocol;

        @NameInMap("Name")
        private String name;

        @NameInMap("NamespaceId")
        private String namespaceId;

        @NameInMap("SlbId")
        private String slbId;

        @NameInMap("SlbType")
        private String slbType;

        private IngressList(Builder builder) {
            this.certId = builder.certId;
            this.certIds = builder.certIds;
            this.description = builder.description;
            this.id = builder.id;
            this.listenerPort = builder.listenerPort;
            this.listenerProtocol = builder.listenerProtocol;
            this.loadBalanceType = builder.loadBalanceType;
            this.mseGatewayId = builder.mseGatewayId;
            this.mseGatewayPort = builder.mseGatewayPort;
            this.mseGatewayProtocol = builder.mseGatewayProtocol;
            this.name = builder.name;
            this.namespaceId = builder.namespaceId;
            this.slbId = builder.slbId;
            this.slbType = builder.slbType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IngressList create() {
            return builder().build();
        }

        /**
         * @return certId
         */
        public String getCertId() {
            return this.certId;
        }

        /**
         * @return certIds
         */
        public String getCertIds() {
            return this.certIds;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return listenerPort
         */
        public String getListenerPort() {
            return this.listenerPort;
        }

        /**
         * @return listenerProtocol
         */
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        /**
         * @return loadBalanceType
         */
        public String getLoadBalanceType() {
            return this.loadBalanceType;
        }

        /**
         * @return mseGatewayId
         */
        public String getMseGatewayId() {
            return this.mseGatewayId;
        }

        /**
         * @return mseGatewayPort
         */
        public String getMseGatewayPort() {
            return this.mseGatewayPort;
        }

        /**
         * @return mseGatewayProtocol
         */
        public String getMseGatewayProtocol() {
            return this.mseGatewayProtocol;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return slbId
         */
        public String getSlbId() {
            return this.slbId;
        }

        /**
         * @return slbType
         */
        public String getSlbType() {
            return this.slbType;
        }

        public static final class Builder {
            private String certId; 
            private String certIds; 
            private String description; 
            private Long id; 
            private String listenerPort; 
            private String listenerProtocol; 
            private String loadBalanceType; 
            private String mseGatewayId; 
            private String mseGatewayPort; 
            private String mseGatewayProtocol; 
            private String name; 
            private String namespaceId; 
            private String slbId; 
            private String slbType; 

            /**
             * The error code. 
             * <p>
             * 
             * - The **ErrorCode** parameter is not returned when the request succeeds.
             * - The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * CertIds.
             */
            public Builder certIds(String certIds) {
                this.certIds = certIds;
                return this;
            }

            /**
             * The ID of the routing rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Indicates whether the list of routing rules was obtained. Valid values:
             * <p>
             * 
             * *   **true**: indicates that the list was obtained.
             * *   **false**: indicates that the list could not be obtained.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The type of the SLB instance based on the processing capabilities. Valid values:
             * <p>
             * 
             * *   **clb**: the Classic Load Balancer (CLB) instance.
             * *   **alb**: the Application Load Balancer (ALB) instance.
             */
            public Builder listenerPort(String listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * ListenerProtocol.
             */
            public Builder listenerProtocol(String listenerProtocol) {
                this.listenerProtocol = listenerProtocol;
                return this;
            }

            /**
             * LoadBalanceType.
             */
            public Builder loadBalanceType(String loadBalanceType) {
                this.loadBalanceType = loadBalanceType;
                return this;
            }

            /**
             * MseGatewayId.
             */
            public Builder mseGatewayId(String mseGatewayId) {
                this.mseGatewayId = mseGatewayId;
                return this;
            }

            /**
             * MseGatewayPort.
             */
            public Builder mseGatewayPort(String mseGatewayPort) {
                this.mseGatewayPort = mseGatewayPort;
                return this;
            }

            /**
             * MseGatewayProtocol.
             */
            public Builder mseGatewayProtocol(String mseGatewayProtocol) {
                this.mseGatewayProtocol = mseGatewayProtocol;
                return this;
            }

            /**
             * The HTTP status code. Valid values:
             * <p>
             * 
             * *   **2xx**: indicates that the request was successful.
             * *   **3xx**: indicates that the request was redirected.
             * *   **4xx**: indicates that the request was invalid.
             * *   **5xx**: indicates that a server error occurred.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The name of the routing rule.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * The ID of the certificate.
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * The protocol used to forward requests. Valid values:
             * <p>
             * 
             * *   **HTTP**: used when the application needs to identify the transmitted data.
             * *   **HTTPS**: used when the application requires encrypted data transmission.
             */
            public Builder slbType(String slbType) {
                this.slbType = slbType;
                return this;
            }

            public IngressList build() {
                return new IngressList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("IngressList")
        private java.util.List < IngressList> ingressList;

        private Data(Builder builder) {
            this.ingressList = builder.ingressList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ingressList
         */
        public java.util.List < IngressList> getIngressList() {
            return this.ingressList;
        }

        public static final class Builder {
            private java.util.List < IngressList> ingressList; 

            /**
             * The type of the SLB instance based on the IP address. Valid values:
             * <p>
             * 
             * *   **internet**: the Internet-facing SLB instance.
             * *   **intranet**: the internal-facing SLB instance.
             */
            public Builder ingressList(java.util.List < IngressList> ingressList) {
                this.ingressList = ingressList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
