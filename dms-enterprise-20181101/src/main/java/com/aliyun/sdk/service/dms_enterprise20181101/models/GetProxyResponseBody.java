// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProxyResponseBody} extends {@link TeaModel}
 *
 * <p>GetProxyResponseBody</p>
 */
public class GetProxyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatorId")
    private Long creatorId;

    @com.aliyun.core.annotation.NameInMap("CreatorName")
    private String creatorName;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpsPort")
    private Integer httpsPort;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private Long instanceId;

    @com.aliyun.core.annotation.NameInMap("PrivateEnable")
    private Boolean privateEnable;

    @com.aliyun.core.annotation.NameInMap("PrivateHost")
    private String privateHost;

    @com.aliyun.core.annotation.NameInMap("ProtocolPort")
    private Integer protocolPort;

    @com.aliyun.core.annotation.NameInMap("ProtocolType")
    private String protocolType;

    @com.aliyun.core.annotation.NameInMap("ProxyId")
    private Long proxyId;

    @com.aliyun.core.annotation.NameInMap("PublicEnable")
    private Boolean publicEnable;

    @com.aliyun.core.annotation.NameInMap("PublicHost")
    private String publicHost;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetProxyResponseBody(Builder builder) {
        this.creatorId = builder.creatorId;
        this.creatorName = builder.creatorName;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpsPort = builder.httpsPort;
        this.instanceId = builder.instanceId;
        this.privateEnable = builder.privateEnable;
        this.privateHost = builder.privateHost;
        this.protocolPort = builder.protocolPort;
        this.protocolType = builder.protocolType;
        this.proxyId = builder.proxyId;
        this.publicEnable = builder.publicEnable;
        this.publicHost = builder.publicHost;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProxyResponseBody create() {
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private Long creatorId; 
        private String creatorName; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpsPort; 
        private Long instanceId; 
        private Boolean privateEnable; 
        private String privateHost; 
        private Integer protocolPort; 
        private String protocolType; 
        private Long proxyId; 
        private Boolean publicEnable; 
        private String publicHost; 
        private String regionId; 
        private String requestId; 
        private Boolean success; 

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
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The port number used by the HTTPS protocol.
         */
        public Builder httpsPort(Integer httpsPort) {
            this.httpsPort = httpsPort;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Indicates whether the internal endpoint was enabled. Default value: **true**.
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
         * The port number used by the protocol.
         */
        public Builder protocolPort(Integer protocolPort) {
            this.protocolPort = protocolPort;
            return this;
        }

        /**
         * The protocol type of the database. Example: MYSQL.
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
         * Indicates whether the public endpoint was enabled. Valid values:
         * <p>
         * 
         * *   **true**: The public endpoint was enabled.
         * *   **false**: The public endpoint was disabled.
         */
        public Builder publicEnable(Boolean publicEnable) {
            this.publicEnable = publicEnable;
            return this;
        }

        /**
         * The public endpoint. A public endpoint is returned no matter whether the public endpoint is enabled or disabled.
         * <p>
         * 
         * > 
         * 
         * *   If the value of the PublicEnable parameter is **true**, a valid public endpoint that can be resolved by using Alibaba Cloud DNS is returned.
         * 
         * *   If the value of the PublicEnable parameter is **false**, an invalid public endpoint that cannot be resolved by using Alibaba Cloud DNS is returned.
         */
        public Builder publicHost(String publicHost) {
            this.publicHost = publicHost;
            return this;
        }

        /**
         * The ID of the region in which the instance resides.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetProxyResponseBody build() {
            return new GetProxyResponseBody(this);
        } 

    } 

}
