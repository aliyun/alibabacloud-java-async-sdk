// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProxiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListProxiesResponseBody</p>
 */
public class ListProxiesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("ProxyList")
    private java.util.List < ProxyList> proxyList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListProxiesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.proxyList = builder.proxyList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProxiesResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return proxyList
     */
    public java.util.List < ProxyList> getProxyList() {
        return this.proxyList;
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
        private String errorCode; 
        private String errorMessage; 
        private java.util.List < ProxyList> proxyList; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * An array that consists of secure access proxies.
         */
        public Builder proxyList(java.util.List < ProxyList> proxyList) {
            this.proxyList = proxyList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * - **true**: The request was successful.
         * - **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListProxiesResponseBody build() {
            return new ListProxiesResponseBody(this);
        } 

    } 

    public static class ProxyList extends TeaModel {
        @NameInMap("CreatorId")
        private Long creatorId;

        @NameInMap("CreatorName")
        private String creatorName;

        @NameInMap("HttpsPort")
        private Integer httpsPort;

        @NameInMap("InstanceId")
        private Long instanceId;

        @NameInMap("PrivateEnable")
        private Boolean privateEnable;

        @NameInMap("PrivateHost")
        private String privateHost;

        @NameInMap("ProtocolPort")
        private Integer protocolPort;

        @NameInMap("ProtocolType")
        private String protocolType;

        @NameInMap("ProxyId")
        private Long proxyId;

        @NameInMap("PublicEnable")
        private Boolean publicEnable;

        @NameInMap("PublicHost")
        private String publicHost;

        private ProxyList(Builder builder) {
            this.creatorId = builder.creatorId;
            this.creatorName = builder.creatorName;
            this.httpsPort = builder.httpsPort;
            this.instanceId = builder.instanceId;
            this.privateEnable = builder.privateEnable;
            this.privateHost = builder.privateHost;
            this.protocolPort = builder.protocolPort;
            this.protocolType = builder.protocolType;
            this.proxyId = builder.proxyId;
            this.publicEnable = builder.publicEnable;
            this.publicHost = builder.publicHost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProxyList create() {
            return builder().build();
        }

        /**
         * @return creatorId
         */
        public Long getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return httpsPort
         */
        public Integer getHttpsPort() {
            return this.httpsPort;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return privateEnable
         */
        public Boolean getPrivateEnable() {
            return this.privateEnable;
        }

        /**
         * @return privateHost
         */
        public String getPrivateHost() {
            return this.privateHost;
        }

        /**
         * @return protocolPort
         */
        public Integer getProtocolPort() {
            return this.protocolPort;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return proxyId
         */
        public Long getProxyId() {
            return this.proxyId;
        }

        /**
         * @return publicEnable
         */
        public Boolean getPublicEnable() {
            return this.publicEnable;
        }

        /**
         * @return publicHost
         */
        public String getPublicHost() {
            return this.publicHost;
        }

        public static final class Builder {
            private Long creatorId; 
            private String creatorName; 
            private Integer httpsPort; 
            private Long instanceId; 
            private Boolean privateEnable; 
            private String privateHost; 
            private Integer protocolPort; 
            private String protocolType; 
            private Long proxyId; 
            private Boolean publicEnable; 
            private String publicHost; 

            /**
             * The ID of the user who enabled the secure access proxy feature.
             */
            public Builder creatorId(Long creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * The nickname of the user who enabled the secure access proxy feature.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * The port that was used by HTTPS clients to connect to the database instance.
             */
            public Builder httpsPort(Integer httpsPort) {
                this.httpsPort = httpsPort;
                return this;
            }

            /**
             * The ID of the database instance.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Indicates whether the internal endpoint is enabled. Default value: **true**.
             */
            public Builder privateEnable(Boolean privateEnable) {
                this.privateEnable = privateEnable;
                return this;
            }

            /**
             * The internal endpoint.
             */
            public Builder privateHost(String privateHost) {
                this.privateHost = privateHost;
                return this;
            }

            /**
             * 数据库协议连接端口号
             */
            public Builder protocolPort(Integer protocolPort) {
                this.protocolPort = protocolPort;
                return this;
            }

            /**
             * 数据库协议类型，例如：MYSQL
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * The ID of the secure access proxy.
             */
            public Builder proxyId(Long proxyId) {
                this.proxyId = proxyId;
                return this;
            }

            /**
             * Indicates whether the public endpoint is enabled. Valid values:
             * <p>
             * 
             * - **true**: The public endpoint is enabled.
             * - **false**: The public endpoint is disabled.
             */
            public Builder publicEnable(Boolean publicEnable) {
                this.publicEnable = publicEnable;
                return this;
            }

            /**
             * The public endpoint. A public endpoint is returned no matter whether the public endpoint is enabled or disabled.  
             * <p>
             * 
             * > - If the value of the PublicEnable parameter is **true**, a valid public endpoint that can be resolved by using Alibaba Cloud DNS (DNS) is returned.
             * - If the value of the PublicEnable parameter is **false**, an invalid public endpoint that cannot be resolved by using DNS is returned.
             */
            public Builder publicHost(String publicHost) {
                this.publicHost = publicHost;
                return this;
            }

            public ProxyList build() {
                return new ProxyList(this);
            } 

        } 

    }
}
