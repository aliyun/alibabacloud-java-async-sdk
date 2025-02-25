// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListIngressesResponseBody} extends {@link TeaModel}
 *
 * <p>ListIngressesResponseBody</p>
 */
public class ListIngressesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
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
         * <p>The port specified for the SLB listener.</p>
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
         * <p>The ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
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
         * <p>The name of the routing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>0a98a02315955564772843261e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public ListIngressesResponseBody build() {
            return new ListIngressesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIngressesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIngressesResponseBody</p>
     */
    public static class IngressList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertId")
        private String certId;

        @com.aliyun.core.annotation.NameInMap("CertIds")
        private String certIds;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ListenerPort")
        private String listenerPort;

        @com.aliyun.core.annotation.NameInMap("ListenerProtocol")
        private String listenerProtocol;

        @com.aliyun.core.annotation.NameInMap("LoadBalanceType")
        private String loadBalanceType;

        @com.aliyun.core.annotation.NameInMap("MseGatewayId")
        private String mseGatewayId;

        @com.aliyun.core.annotation.NameInMap("MseGatewayPort")
        private String mseGatewayPort;

        @com.aliyun.core.annotation.NameInMap("MseGatewayProtocol")
        private String mseGatewayProtocol;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("SlbId")
        private String slbId;

        @com.aliyun.core.annotation.NameInMap("SlbType")
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
             * <p>The error code. </p>
             * <ul>
             * <li>The <strong>ErrorCode</strong> parameter is not returned when the request succeeds.</li>
             * <li>The <strong>ErrorCode</strong> parameter is returned when the request fails. For more information, see <strong>Error codes</strong> in this topic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>13624*<strong><strong>73809_16f8e549a20_1175189789_12</strong></strong>3210</p>
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
             * <p>The ID of the routing rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the list of routing rules was obtained. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: indicates that the list was obtained.</li>
             * <li><strong>false</strong>: indicates that the list could not be obtained.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The type of the SLB instance based on the processing capabilities. Valid values:</p>
             * <ul>
             * <li><strong>clb</strong>: the Classic Load Balancer (CLB) instance.</li>
             * <li><strong>alb</strong>: the Application Load Balancer (ALB) instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>80</p>
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
             * <p>The HTTP status code. Valid values:</p>
             * <ul>
             * <li><strong>2xx</strong>: indicates that the request was successful.</li>
             * <li><strong>3xx</strong>: indicates that the request was redirected.</li>
             * <li><strong>4xx</strong>: indicates that the request was invalid.</li>
             * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>lb-uf6jt0nu4z6ior943****-80-f5****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of the routing rule.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>The ID of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-uf62****6d13tq2u5</p>
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * <p>The protocol used to forward requests. Valid values:</p>
             * <ul>
             * <li><strong>HTTP</strong>: used when the application needs to identify the transmitted data.</li>
             * <li><strong>HTTPS</strong>: used when the application requires encrypted data transmission.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>internet</p>
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
    /**
     * 
     * {@link ListIngressesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIngressesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IngressList")
        private java.util.List<IngressList> ingressList;

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
        public java.util.List<IngressList> getIngressList() {
            return this.ingressList;
        }

        public static final class Builder {
            private java.util.List<IngressList> ingressList; 

            /**
             * <p>The type of the SLB instance based on the IP address. Valid values:</p>
             * <ul>
             * <li><strong>internet</strong>: the Internet-facing SLB instance.</li>
             * <li><strong>intranet</strong>: the internal-facing SLB instance.</li>
             * </ul>
             */
            public Builder ingressList(java.util.List<IngressList> ingressList) {
                this.ingressList = ingressList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
