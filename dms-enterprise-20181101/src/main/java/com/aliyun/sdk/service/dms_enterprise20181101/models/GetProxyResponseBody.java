// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProxyResponseBody} extends {@link TeaModel}
 *
 * <p>GetProxyResponseBody</p>
 */
public class GetProxyResponseBody extends TeaModel {
    @NameInMap("CreatorId")
    private Long creatorId;

    @NameInMap("CreatorName")
    private String creatorName;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("HttpsPort")
    private Integer httpsPort;

    @NameInMap("InstanceId")
    private Long instanceId;

    @NameInMap("MysqlPort")
    private Integer mysqlPort;

    @NameInMap("PrivateEnable")
    private Boolean privateEnable;

    @NameInMap("PrivateHost")
    private String privateHost;

    @NameInMap("ProxyId")
    private Long proxyId;

    @NameInMap("PublicEnable")
    private Boolean publicEnable;

    @NameInMap("PublicHost")
    private String publicHost;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetProxyResponseBody(Builder builder) {
        this.creatorId = builder.creatorId;
        this.creatorName = builder.creatorName;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpsPort = builder.httpsPort;
        this.instanceId = builder.instanceId;
        this.mysqlPort = builder.mysqlPort;
        this.privateEnable = builder.privateEnable;
        this.privateHost = builder.privateHost;
        this.proxyId = builder.proxyId;
        this.publicEnable = builder.publicEnable;
        this.publicHost = builder.publicHost;
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
     * @return mysqlPort
     */
    public Integer getMysqlPort() {
        return this.mysqlPort;
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
        private Integer mysqlPort; 
        private Boolean privateEnable; 
        private String privateHost; 
        private Long proxyId; 
        private Boolean publicEnable; 
        private String publicHost; 
        private String requestId; 
        private Boolean success; 

        /**
         * CreatorId.
         */
        public Builder creatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * CreatorName.
         */
        public Builder creatorName(String creatorName) {
            this.creatorName = creatorName;
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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * HttpsPort.
         */
        public Builder httpsPort(Integer httpsPort) {
            this.httpsPort = httpsPort;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MysqlPort.
         */
        public Builder mysqlPort(Integer mysqlPort) {
            this.mysqlPort = mysqlPort;
            return this;
        }

        /**
         * PrivateEnable.
         */
        public Builder privateEnable(Boolean privateEnable) {
            this.privateEnable = privateEnable;
            return this;
        }

        /**
         * PrivateHost.
         */
        public Builder privateHost(String privateHost) {
            this.privateHost = privateHost;
            return this;
        }

        /**
         * ProxyId.
         */
        public Builder proxyId(Long proxyId) {
            this.proxyId = proxyId;
            return this;
        }

        /**
         * PublicEnable.
         */
        public Builder publicEnable(Boolean publicEnable) {
            this.publicEnable = publicEnable;
            return this;
        }

        /**
         * PublicHost.
         */
        public Builder publicHost(String publicHost) {
            this.publicHost = publicHost;
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

        public GetProxyResponseBody build() {
            return new GetProxyResponseBody(this);
        } 

    } 

}
