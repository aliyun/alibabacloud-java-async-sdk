// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210903.models;

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
 * {@link UnbindRequest} extends {@link RequestModel}
 *
 * <p>UnbindRequest</p>
 */
public class UnbindRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appInstanceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceId")
    private String appInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientIp")
    private String clientIp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientOS")
    private String clientOS;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientVersion")
    private String clientVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoginRegionId")
    private String loginRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoginToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loginToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private Long tenantId;

    private UnbindRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceId = builder.appInstanceId;
        this.clientId = builder.clientId;
        this.clientIp = builder.clientIp;
        this.clientOS = builder.clientOS;
        this.clientVersion = builder.clientVersion;
        this.endUserId = builder.endUserId;
        this.loginRegionId = builder.loginRegionId;
        this.loginToken = builder.loginToken;
        this.productType = builder.productType;
        this.sessionId = builder.sessionId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return appInstanceId
     */
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return clientIp
     */
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * @return clientOS
     */
    public String getClientOS() {
        return this.clientOS;
    }

    /**
     * @return clientVersion
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return loginRegionId
     */
    public String getLoginRegionId() {
        return this.loginRegionId;
    }

    /**
     * @return loginToken
     */
    public String getLoginToken() {
        return this.loginToken;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<UnbindRequest, Builder> {
        private String appId; 
        private String appInstanceGroupId; 
        private String appInstanceId; 
        private String clientId; 
        private String clientIp; 
        private String clientOS; 
        private String clientVersion; 
        private String endUserId; 
        private String loginRegionId; 
        private String loginToken; 
        private String productType; 
        private String sessionId; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(UnbindRequest request) {
            super(request);
            this.appId = request.appId;
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.appInstanceId = request.appInstanceId;
            this.clientId = request.clientId;
            this.clientIp = request.clientIp;
            this.clientOS = request.clientOS;
            this.clientVersion = request.clientVersion;
            this.endUserId = request.endUserId;
            this.loginRegionId = request.loginRegionId;
            this.loginToken = request.loginToken;
            this.productType = request.productType;
            this.sessionId = request.sessionId;
            this.tenantId = request.tenantId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-e1l4kqqykxt4uzdx9</p>
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putBodyParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * AppInstanceId.
         */
        public Builder appInstanceId(String appInstanceId) {
            this.putBodyParameter("AppInstanceId", appInstanceId);
            this.appInstanceId = appInstanceId;
            return this;
        }

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putBodyParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * ClientIp.
         */
        public Builder clientIp(String clientIp) {
            this.putBodyParameter("ClientIp", clientIp);
            this.clientIp = clientIp;
            return this;
        }

        /**
         * ClientOS.
         */
        public Builder clientOS(String clientOS) {
            this.putBodyParameter("ClientOS", clientOS);
            this.clientOS = clientOS;
            return this;
        }

        /**
         * ClientVersion.
         */
        public Builder clientVersion(String clientVersion) {
            this.putBodyParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putBodyParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * LoginRegionId.
         */
        public Builder loginRegionId(String loginRegionId) {
            this.putBodyParameter("LoginRegionId", loginRegionId);
            this.loginRegionId = loginRegionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1e9c8e83d83ea11270871640059145702bde8c5be8c6b9a854ffb6a43bd2673c19a5551c83800724e024f488dbfb0b247</p>
         */
        public Builder loginToken(String loginToken) {
            this.putBodyParameter("LoginToken", loginToken);
            this.loginToken = loginToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11040139-4fb4-4b35-9b44-6c07c746a43e</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public UnbindRequest build() {
            return new UnbindRequest(this);
        } 

    } 

}
