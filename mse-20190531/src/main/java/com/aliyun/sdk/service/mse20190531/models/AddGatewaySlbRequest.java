// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddGatewaySlbRequest} extends {@link RequestModel}
 *
 * <p>AddGatewaySlbRequest</p>
 */
public class AddGatewaySlbRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpPort")
    private Integer httpPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpsPort")
    private Integer httpsPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpsVServerGroupId")
    private String httpsVServerGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceWeight")
    private Integer serviceWeight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlbId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String slbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VServerGroupId")
    private String vServerGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VServiceList")
    private java.util.List < VServiceList> vServiceList;

    private AddGatewaySlbRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.httpPort = builder.httpPort;
        this.httpsPort = builder.httpsPort;
        this.httpsVServerGroupId = builder.httpsVServerGroupId;
        this.serviceWeight = builder.serviceWeight;
        this.slbId = builder.slbId;
        this.type = builder.type;
        this.vServerGroupId = builder.vServerGroupId;
        this.vServiceList = builder.vServiceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddGatewaySlbRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return httpPort
     */
    public Integer getHttpPort() {
        return this.httpPort;
    }

    /**
     * @return httpsPort
     */
    public Integer getHttpsPort() {
        return this.httpsPort;
    }

    /**
     * @return httpsVServerGroupId
     */
    public String getHttpsVServerGroupId() {
        return this.httpsVServerGroupId;
    }

    /**
     * @return serviceWeight
     */
    public Integer getServiceWeight() {
        return this.serviceWeight;
    }

    /**
     * @return slbId
     */
    public String getSlbId() {
        return this.slbId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vServerGroupId
     */
    public String getVServerGroupId() {
        return this.vServerGroupId;
    }

    /**
     * @return vServiceList
     */
    public java.util.List < VServiceList> getVServiceList() {
        return this.vServiceList;
    }

    public static final class Builder extends Request.Builder<AddGatewaySlbRequest, Builder> {
        private String acceptLanguage; 
        private String gatewayUniqueId; 
        private Integer httpPort; 
        private Integer httpsPort; 
        private String httpsVServerGroupId; 
        private Integer serviceWeight; 
        private String slbId; 
        private String type; 
        private String vServerGroupId; 
        private java.util.List < VServiceList> vServiceList; 

        private Builder() {
            super();
        } 

        private Builder(AddGatewaySlbRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.httpPort = request.httpPort;
            this.httpsPort = request.httpsPort;
            this.httpsVServerGroupId = request.httpsVServerGroupId;
            this.serviceWeight = request.serviceWeight;
            this.slbId = request.slbId;
            this.type = request.type;
            this.vServerGroupId = request.vServerGroupId;
            this.vServiceList = request.vServiceList;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-9cdcf8e4f58144059e73ff4c5ef9****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The HTTP port number (virtual service group).</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder httpPort(Integer httpPort) {
            this.putQueryParameter("HttpPort", httpPort);
            this.httpPort = httpPort;
            return this;
        }

        /**
         * <p>The HTTPS port number (virtual service group).</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        public Builder httpsPort(Integer httpsPort) {
            this.putQueryParameter("HttpsPort", httpsPort);
            this.httpsPort = httpsPort;
            return this;
        }

        /**
         * <p>The ID of the HTTPS virtual service group.</p>
         * 
         * <strong>example:</strong>
         * <p>353</p>
         */
        public Builder httpsVServerGroupId(String httpsVServerGroupId) {
            this.putQueryParameter("HttpsVServerGroupId", httpsVServerGroupId);
            this.httpsVServerGroupId = httpsVServerGroupId;
            return this;
        }

        /**
         * <p>The service weight.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder serviceWeight(Integer serviceWeight) {
            this.putQueryParameter("ServiceWeight", serviceWeight);
            this.serviceWeight = serviceWeight;
            return this;
        }

        /**
         * <p>The ID of the SLB instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp18t6jjskwxh6wy1****</p>
         */
        public Builder slbId(String slbId) {
            this.putQueryParameter("SlbId", slbId);
            this.slbId = slbId;
            return this;
        }

        /**
         * <p>The type of the service source. Valid values:</p>
         * <ul>
         * <li>PUB_NET: Internet</li>
         * <li>PRIVATE_NET: VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUB_NET</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The ID of the HTTP virtual service group.</p>
         * 
         * <strong>example:</strong>
         * <p>353</p>
         */
        public Builder vServerGroupId(String vServerGroupId) {
            this.putQueryParameter("VServerGroupId", vServerGroupId);
            this.vServerGroupId = vServerGroupId;
            return this;
        }

        /**
         * <p>The SLB monitoring information.</p>
         */
        public Builder vServiceList(java.util.List < VServiceList> vServiceList) {
            String vServiceListShrink = shrink(vServiceList, "VServiceList", "json");
            this.putQueryParameter("VServiceList", vServiceListShrink);
            this.vServiceList = vServiceList;
            return this;
        }

        @Override
        public AddGatewaySlbRequest build() {
            return new AddGatewaySlbRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddGatewaySlbRequest} extends {@link TeaModel}
     *
     * <p>AddGatewaySlbRequest</p>
     */
    public static class VServiceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("VServerGroupId")
        private String vServerGroupId;

        @com.aliyun.core.annotation.NameInMap("VServerGroupName")
        private String vServerGroupName;

        private VServiceList(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.vServerGroupId = builder.vServerGroupId;
            this.vServerGroupName = builder.vServerGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VServiceList create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return vServerGroupId
         */
        public String getVServerGroupId() {
            return this.vServerGroupId;
        }

        /**
         * @return vServerGroupName
         */
        public String getVServerGroupName() {
            return this.vServerGroupName;
        }

        public static final class Builder {
            private Integer port; 
            private String protocol; 
            private String vServerGroupId; 
            private String vServerGroupName; 

            /**
             * <p>The port number.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol type. Valid values:</p>
             * <ul>
             * <li>HTTP</li>
             * <li>HTTPS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTPS</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The ID of the virtual server group.</p>
             * 
             * <strong>example:</strong>
             * <p>rsp-bp1j<strong>t0fyl</strong></p>
             */
            public Builder vServerGroupId(String vServerGroupId) {
                this.vServerGroupId = vServerGroupId;
                return this;
            }

            /**
             * <p>The name of the virtual server group.</p>
             */
            public Builder vServerGroupName(String vServerGroupName) {
                this.vServerGroupName = vServerGroupName;
                return this;
            }

            public VServiceList build() {
                return new VServiceList(this);
            } 

        } 

    }
}
