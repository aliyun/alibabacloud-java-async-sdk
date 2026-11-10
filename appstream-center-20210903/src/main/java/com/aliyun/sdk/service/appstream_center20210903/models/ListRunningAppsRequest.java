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
 * {@link ListRunningAppsRequest} extends {@link RequestModel}
 *
 * <p>ListRunningAppsRequest</p>
 */
public class ListRunningAppsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIp")
    private String clientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientOS")
    private String clientOS;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientVersion")
    private String clientVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginRegionId")
    private String loginRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginToken")
    private String loginToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private ListRunningAppsRequest(Builder builder) {
        super(builder);
        this.bizRegionId = builder.bizRegionId;
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
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRunningAppsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
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
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ListRunningAppsRequest, Builder> {
        private String bizRegionId; 
        private String clientId; 
        private String clientIp; 
        private String clientOS; 
        private String clientVersion; 
        private String endUserId; 
        private String loginRegionId; 
        private String loginToken; 
        private String productType; 
        private String sessionId; 
        private String tenantId; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ListRunningAppsRequest request) {
            super(request);
            this.bizRegionId = request.bizRegionId;
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
            this.uuid = request.uuid;
        } 

        /**
         * <p>The region ID of the app instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The unique ID generated by the client.</p>
         * 
         * <strong>example:</strong>
         * <p>370b56f8-2812-4b6c-bfa6-2560791cad88</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>22.21.2.32</p>
         */
        public Builder clientIp(String clientIp) {
            this.putQueryParameter("ClientIp", clientIp);
            this.clientIp = clientIp;
            return this;
        }

        /**
         * <p>The operating system of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>windows_&quot;Windows 10 Enterprise&quot; 10.0 (Build 18363)</p>
         */
        public Builder clientOS(String clientOS) {
            this.putQueryParameter("ClientOS", clientOS);
            this.clientOS = clientOS;
            return this;
        }

        /**
         * <p>The client version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1.0-R-20220512.175656</p>
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * <p>The username of the convenience account.</p>
         * 
         * <strong>example:</strong>
         * <p>test.test</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The region ID for logon.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder loginRegionId(String loginRegionId) {
            this.putQueryParameter("LoginRegionId", loginRegionId);
            this.loginRegionId = loginRegionId;
            return this;
        }

        /**
         * <p>The logon credential.
         * You can obtain this parameter by calling the GetLoginToken operation to log on, or by calling the RefreshLoginToken operation to update the credential after logon. Response parameter: LoginToken.
         * This parameter is actually required. You must specify this parameter when you call this operation. If this parameter is not specified, the server returns an HTTP 400 error with the error code <code>InvalidParameter.loginToken</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>v1124500957832f30b3e716406562071655aa43b2a723ed2be0837815483d54e025db13ba5469f06f2410d0efc4d302e36</p>
         */
        public Builder loginToken(String loginToken) {
            this.putQueryParameter("LoginToken", loginToken);
            this.loginToken = loginToken;
            return this;
        }

        /**
         * <p>The product type. Set the value to <code>CloudApp</code>, which indicates WUYING Cloud App.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The session ID.
         * You can obtain this parameter by calling the GetLoginToken logon operation. Response parameter: SessionId.
         * This parameter is actually required. You must specify this parameter when you call this operation. If this parameter is not specified, the server returns an HTTP 400 error with the error code <code>InvalidParameter.sessionId</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>a863f4c3-2f1d-4971-8cf7-e2b92ae97764</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The tenant ID.
         * You can obtain this parameter by calling the GetLoginToken logon operation. Response parameter: TenantId.</p>
         * 
         * <strong>example:</strong>
         * <p>1735953493960828</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The UUID of the device used for logon.</p>
         * 
         * <strong>example:</strong>
         * <p>470E8C12AB78CE9C3F6627DD0409E51D</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ListRunningAppsRequest build() {
            return new ListRunningAppsRequest(this);
        } 

    } 

}
