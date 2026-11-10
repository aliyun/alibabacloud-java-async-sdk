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
    @com.aliyun.core.annotation.NameInMap("AppInstancePersistentId")
    private String appInstancePersistentId;

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
    private String loginToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionToken")
    private String sessionToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private Long tenantId;

    private UnbindRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceId = builder.appInstanceId;
        this.appInstancePersistentId = builder.appInstancePersistentId;
        this.clientId = builder.clientId;
        this.clientIp = builder.clientIp;
        this.clientOS = builder.clientOS;
        this.clientVersion = builder.clientVersion;
        this.endUserId = builder.endUserId;
        this.loginRegionId = builder.loginRegionId;
        this.loginToken = builder.loginToken;
        this.productType = builder.productType;
        this.sessionId = builder.sessionId;
        this.sessionToken = builder.sessionToken;
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
     * @return appInstancePersistentId
     */
    public String getAppInstancePersistentId() {
        return this.appInstancePersistentId;
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
     * @return sessionToken
     */
    public String getSessionToken() {
        return this.sessionToken;
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
        private String appInstancePersistentId; 
        private String clientId; 
        private String clientIp; 
        private String clientOS; 
        private String clientVersion; 
        private String endUserId; 
        private String loginRegionId; 
        private String loginToken; 
        private String productType; 
        private String sessionId; 
        private String sessionToken; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(UnbindRequest request) {
            super(request);
            this.appId = request.appId;
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.appInstanceId = request.appInstanceId;
            this.appInstancePersistentId = request.appInstancePersistentId;
            this.clientId = request.clientId;
            this.clientIp = request.clientIp;
            this.clientOS = request.clientOS;
            this.clientVersion = request.clientVersion;
            this.endUserId = request.endUserId;
            this.loginRegionId = request.loginRegionId;
            this.loginToken = request.loginToken;
            this.productType = request.productType;
            this.sessionId = request.sessionId;
            this.sessionToken = request.sessionToken;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The ID of the application. You can call the ListPublishedAppInfo operation to obtain the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-fxwp4koxs8hopi94e</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the delivery group.</p>
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
         * <p>The application instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ai-azn3kmwruh1vl****</p>
         */
        public Builder appInstanceId(String appInstanceId) {
            this.putBodyParameter("AppInstanceId", appInstanceId);
            this.appInstanceId = appInstanceId;
            return this;
        }

        /**
         * <p>The persistent session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>p-xxxxx</p>
         */
        public Builder appInstancePersistentId(String appInstancePersistentId) {
            this.putBodyParameter("AppInstancePersistentId", appInstancePersistentId);
            this.appInstancePersistentId = appInstancePersistentId;
            return this;
        }

        /**
         * <p>The unique ID generated by the client.</p>
         * 
         * <strong>example:</strong>
         * <p>eac19bef-1e45-4190-a03a-4ea74b699ca7</p>
         */
        public Builder clientId(String clientId) {
            this.putBodyParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>139.129.223.122</p>
         */
        public Builder clientIp(String clientIp) {
            this.putBodyParameter("ClientIp", clientIp);
            this.clientIp = clientIp;
            return this;
        }

        /**
         * <p>The operating system of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>windows_\&quot;Windows 10 Pro\&quot; 10.0 (Build 19041)</p>
         */
        public Builder clientOS(String clientOS) {
            this.putBodyParameter("ClientOS", clientOS);
            this.clientOS = clientOS;
            return this;
        }

        /**
         * <p>The version number of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.1-D-20220303.171122</p>
         */
        public Builder clientVersion(String clientVersion) {
            this.putBodyParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * <p>The username of the convenience user.</p>
         * 
         * <strong>example:</strong>
         * <p>test.test</p>
         */
        public Builder endUserId(String endUserId) {
            this.putBodyParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The region ID of appstream-center.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder loginRegionId(String loginRegionId) {
            this.putBodyParameter("LoginRegionId", loginRegionId);
            this.loginRegionId = loginRegionId;
            return this;
        }

        /**
         * <p>The logon credential. It is issued after an end user successfully logs on through the WUYING client (including the mobile SDK) or the console logon flow, and is used together with SessionId to complete the logon authentication for this operation. The appstream-center 2021-09-03 public API catalog does not provide an operation to obtain or refresh this credential. This parameter applies only to client integration scenarios, and server-side programmatic calls cannot obtain a valid LoginToken.</p>
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
         * <p>The product type. Valid value: <code>CloudApp</code>, which indicates a cloud application.</p>
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
         * <p>The logon session ID. It is issued after an end user successfully logs on through the WUYING client (including the mobile SDK) or the console logon flow, and is used together with LoginToken to complete the logon authentication for this operation. The appstream-center 2021-09-03 public API catalog does not provide an operation to obtain this session ID. This parameter applies only to client integration scenarios, and server-side programmatic calls are not supported.</p>
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
         * <p>The SessionToken used for authentication. You must choose either the LoginToken and SessionId combination or SessionToken for authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>v2x/dhS9W4Ay4****==</p>
         */
        public Builder sessionToken(String sessionToken) {
            this.putBodyParameter("SessionToken", sessionToken);
            this.sessionToken = sessionToken;
            return this;
        }

        /**
         * <p>The tenant ID, which is the Alibaba Cloud account UID. After an end user successfully logs on through the WUYING client (including the mobile SDK) or the console logon flow, you can obtain the ID from the logon result. The ID must be consistent with the tenant to which the LoginToken belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1569416393841402</p>
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
