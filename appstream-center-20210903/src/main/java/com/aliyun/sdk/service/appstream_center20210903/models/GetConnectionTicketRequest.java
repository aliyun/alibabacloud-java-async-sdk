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
 * {@link GetConnectionTicketRequest} extends {@link RequestModel}
 *
 * <p>GetConnectionTicketRequest</p>
 */
public class GetConnectionTicketRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessType")
    @com.aliyun.core.annotation.Validation(maxLength = 10)
    private String accessType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
    private String appInstanceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceId")
    private String appInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppPolicyId")
    private String appPolicyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private String appVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoConnectInQueue")
    private Boolean autoConnectInQueue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

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
    @com.aliyun.core.annotation.NameInMap("ClientType")
    private String clientType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientVersion")
    private String clientVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectionProperties")
    private String connectionProperties;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnvironmentConfig")
    private String environmentConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoginRegionId")
    private String loginRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoginToken")
    private String loginToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Param")
    private String param;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequireUuidValidation")
    private Boolean requireUuidValidation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private GetConnectionTicketRequest(Builder builder) {
        super(builder);
        this.accessType = builder.accessType;
        this.appId = builder.appId;
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceId = builder.appInstanceId;
        this.appPolicyId = builder.appPolicyId;
        this.appVersion = builder.appVersion;
        this.autoConnectInQueue = builder.autoConnectInQueue;
        this.bizRegionId = builder.bizRegionId;
        this.clientId = builder.clientId;
        this.clientIp = builder.clientIp;
        this.clientOS = builder.clientOS;
        this.clientType = builder.clientType;
        this.clientVersion = builder.clientVersion;
        this.connectionProperties = builder.connectionProperties;
        this.endUserId = builder.endUserId;
        this.environmentConfig = builder.environmentConfig;
        this.loginRegionId = builder.loginRegionId;
        this.loginToken = builder.loginToken;
        this.param = builder.param;
        this.productType = builder.productType;
        this.requireUuidValidation = builder.requireUuidValidation;
        this.resourceId = builder.resourceId;
        this.sessionId = builder.sessionId;
        this.taskId = builder.taskId;
        this.tenantId = builder.tenantId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConnectionTicketRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessType
     */
    public String getAccessType() {
        return this.accessType;
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
     * @return appPolicyId
     */
    public String getAppPolicyId() {
        return this.appPolicyId;
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return autoConnectInQueue
     */
    public Boolean getAutoConnectInQueue() {
        return this.autoConnectInQueue;
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
     * @return clientType
     */
    public String getClientType() {
        return this.clientType;
    }

    /**
     * @return clientVersion
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * @return connectionProperties
     */
    public String getConnectionProperties() {
        return this.connectionProperties;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return environmentConfig
     */
    public String getEnvironmentConfig() {
        return this.environmentConfig;
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
     * @return param
     */
    public String getParam() {
        return this.param;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return requireUuidValidation
     */
    public Boolean getRequireUuidValidation() {
        return this.requireUuidValidation;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
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

    public static final class Builder extends Request.Builder<GetConnectionTicketRequest, Builder> {
        private String accessType; 
        private String appId; 
        private String appInstanceGroupId; 
        private String appInstanceId; 
        private String appPolicyId; 
        private String appVersion; 
        private Boolean autoConnectInQueue; 
        private String bizRegionId; 
        private String clientId; 
        private String clientIp; 
        private String clientOS; 
        private String clientType; 
        private String clientVersion; 
        private String connectionProperties; 
        private String endUserId; 
        private String environmentConfig; 
        private String loginRegionId; 
        private String loginToken; 
        private String param; 
        private String productType; 
        private Boolean requireUuidValidation; 
        private String resourceId; 
        private String sessionId; 
        private String taskId; 
        private String tenantId; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(GetConnectionTicketRequest request) {
            super(request);
            this.accessType = request.accessType;
            this.appId = request.appId;
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.appInstanceId = request.appInstanceId;
            this.appPolicyId = request.appPolicyId;
            this.appVersion = request.appVersion;
            this.autoConnectInQueue = request.autoConnectInQueue;
            this.bizRegionId = request.bizRegionId;
            this.clientId = request.clientId;
            this.clientIp = request.clientIp;
            this.clientOS = request.clientOS;
            this.clientType = request.clientType;
            this.clientVersion = request.clientVersion;
            this.connectionProperties = request.connectionProperties;
            this.endUserId = request.endUserId;
            this.environmentConfig = request.environmentConfig;
            this.loginRegionId = request.loginRegionId;
            this.loginToken = request.loginToken;
            this.param = request.param;
            this.productType = request.productType;
            this.requireUuidValidation = request.requireUuidValidation;
            this.resourceId = request.resourceId;
            this.sessionId = request.sessionId;
            this.taskId = request.taskId;
            this.tenantId = request.tenantId;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The access type. If this parameter is not passed, both types are displayed. Valid values: INTERNET (Internet) and VPC (Express Connect circuit).</p>
         * 
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        public Builder accessType(String accessType) {
            this.putBodyParameter("AccessType", accessType);
            this.accessType = accessType;
            return this;
        }

        /**
         * <p>The application ID.</p>
         * <blockquote>
         * <p>Required for the first call, and optional for subsequent calls.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ca-etn4zizga******</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The delivery group ID.</p>
         * <blockquote>
         * <ul>
         * <li>When this parameter is passed, an application instance is assigned only from the specified and authorized delivery groups.</li>
         * <li>When the AppInstanceId parameter is passed, this parameter is required.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aig-bw1o1gcwv******</p>
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putBodyParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * <p>The application instance ID.</p>
         * <blockquote>
         * <ul>
         * <li>When this parameter is passed, the system only attempts to assign the specified application instance.</li>
         * <li>When this parameter is passed, the AppInstanceGroupId parameter must also be passed.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ai-ij4a6kd4bn2******</p>
         */
        public Builder appInstanceId(String appInstanceId) {
            this.putBodyParameter("AppInstanceId", appInstanceId);
            this.appInstanceId = appInstanceId;
            return this;
        }

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-0clfzcy0adpcf****</p>
         */
        public Builder appPolicyId(String appPolicyId) {
            this.putBodyParameter("AppPolicyId", appPolicyId);
            this.appPolicyId = appPolicyId;
            return this;
        }

        /**
         * <p>The application version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.1</p>
         */
        public Builder appVersion(String appVersion) {
            this.putBodyParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * <p>Specifies whether to automatically connect when the turn is reached.</p>
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoConnectInQueue(Boolean autoConnectInQueue) {
            this.putBodyParameter("AutoConnectInQueue", autoConnectInQueue);
            this.autoConnectInQueue = autoConnectInQueue;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p>When this parameter is passed, an application instance is assigned only from the delivery groups in the specified region.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putBodyParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The client ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f2463208-ec89-4309-8e8c-8b1******</p>
         */
        public Builder clientId(String clientId) {
            this.putBodyParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The client IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>22.21.<em>.</em></p>
         */
        public Builder clientIp(String clientIp) {
            this.putBodyParameter("ClientIp", clientIp);
            this.clientIp = clientIp;
            return this;
        }

        /**
         * <p>The client operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>windows_&quot;Windows 10 Enterprise LTSC 2019&quot; 10.0 (Build 17763)</p>
         */
        public Builder clientOS(String clientOS) {
            this.putBodyParameter("ClientOS", clientOS);
            this.clientOS = clientOS;
            return this;
        }

        /**
         * <p>The client type.</p>
         * 
         * <strong>example:</strong>
         * <p>html5</p>
         */
        public Builder clientType(String clientType) {
            this.putBodyParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * <p>The client version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.1-D-20211008.101607</p>
         */
        public Builder clientVersion(String clientVersion) {
            this.putBodyParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * <p>The connection properties in JSON format.
         * The following parameters are supported:</p>
         * <ul>
         * <li>authMode: the authorization mode, which is determined based on the authorization mode of the delivery group. Valid values: App (application authorization), AppInstanceGroup (delivery group authorization), and Session (persistent session authorization).</li>
         * <li>appInstanceGroupScheduleTags: the delivery group scheduling tags. Multiple tag key-value pairs are supported for filtering. Multiple tag pairs have an AND relationship. The key must have a value, and the value can be empty. Format example: [{&quot;key&quot;:&quot;Resolution&quot;,&quot;value&quot;:&quot;720p&quot;},{&quot;key&quot;:&quot;Name&quot;}].</li>
         * <li>appInstanceGroupIds: the list of specified delivery group IDs.</li>
         * <li>appInstancePersistentId: the specified persistent session ID.</li>
         * <li>avatarId: the user avatar ID. Default value: default. This parameter is used to support assigning multiple session instances to a single user.</li>
         * </ul>
         * <blockquote>
         * <p>Used when connecting to a cloud phone. Pass the fixed value <code>{&quot;authMode&quot;:&quot;Session&quot;}</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;authMode&quot;:&quot;Session&quot;}</p>
         */
        public Builder connectionProperties(String connectionProperties) {
            this.putBodyParameter("ConnectionProperties", connectionProperties);
            this.connectionProperties = connectionProperties;
            return this;
        }

        /**
         * <p>The username of the convenience account.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder endUserId(String endUserId) {
            this.putBodyParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The environment configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;screenWidth&quot;:2560,&quot;screenHeight&quot;:1564}</p>
         */
        public Builder environmentConfig(String environmentConfig) {
            this.putBodyParameter("EnvironmentConfig", environmentConfig);
            this.environmentConfig = environmentConfig;
            return this;
        }

        /**
         * <p>The logon region ID. When a user logs on to a workspace, this parameter specifies the ID of the region to which the workspace belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder loginRegionId(String loginRegionId) {
            this.putBodyParameter("LoginRegionId", loginRegionId);
            this.loginRegionId = loginRegionId;
            return this;
        }

        /**
         * <p>The logon token.
         * Obtained by calling the GetLoginToken or GetStsToken API operation.
         * The GetLoginToken and GetStsToken API operations belong to the client logon authentication APIs of the 2021-02-20 version of WUYING Cloud App (product code: appstream-center). These two API operations are not provided in the 2021-09-03 version. OpenAPI Explorer links: <a href="https://api.aliyun.com/api/appstream-center/2021-02-20/GetLoginToken">https://api.aliyun.com/api/appstream-center/2021-02-20/GetLoginToken</a> and <a href="https://api.aliyun.com/api/appstream-center/2021-02-20/GetStsToken">https://api.aliyun.com/api/appstream-center/2021-02-20/GetStsToken</a>.
         * Note: This parameter is required. If it is not provided, the API returns InvalidParameter.loginToken(400).</p>
         * 
         * <strong>example:</strong>
         * <p>v2c4e2ef03d62******</p>
         */
        public Builder loginToken(String loginToken) {
            this.putBodyParameter("LoginToken", loginToken);
            this.loginToken = loginToken;
            return this;
        }

        /**
         * <p>The application startup parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>/q /n</p>
         */
        public Builder param(String param) {
            this.putBodyParameter("Param", param);
            this.param = param;
            return this;
        }

        /**
         * <p>The product type.</p>
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
         * <p>Specifies whether UUID validation is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder requireUuidValidation(Boolean requireUuidValidation) {
            this.putBodyParameter("RequireUuidValidation", requireUuidValidation);
            this.requireUuidValidation = requireUuidValidation;
            return this;
        }

        /**
         * <p>The resource ID.</p>
         * <blockquote>
         * <p>Used when connecting to a cloud phone. Pass the persistent session ID that corresponds to the cloud phone instance.
         * When connecting to a cloud browser, pass the cloud browser ID.
         * When connecting to a cloud application, pass the application ID for the application authorization scenario, the delivery group ID for the delivery group authorization scenario, or the persistent session ID for the persistent session authorization scenario.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>p-0cdr5c9kl******</p>
         */
        public Builder resourceId(String resourceId) {
            this.putBodyParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The logon session ID. Obtained by calling the GetLoginToken or GetStsToken API operation. This parameter is used together with LoginToken.
         * The GetLoginToken and GetStsToken API operations belong to the client logon authentication APIs of the 2021-02-20 version of WUYING Cloud App (product code: appstream-center). These two API operations are not provided in the 2021-09-03 version. OpenAPI Explorer links: <a href="https://api.aliyun.com/api/appstream-center/2021-02-20/GetLoginToken">https://api.aliyun.com/api/appstream-center/2021-02-20/GetLoginToken</a> and <a href="https://api.aliyun.com/api/appstream-center/2021-02-20/GetStsToken">https://api.aliyun.com/api/appstream-center/2021-02-20/GetStsToken</a>.
         * Note: This parameter is required. If it is not provided, the API returns InvalidParameter.sessionId(400). This parameter must be used together with LoginToken.</p>
         * 
         * <strong>example:</strong>
         * <p>09e2b2e6-3181******</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * <blockquote>
         * <p>Required when you invoke the API not for the first time. Use this parameter query to check the node status and connection credentials.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>6f41731b-7091-4******</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The tenant ID, which is the Alibaba Cloud account UID.</p>
         * 
         * <strong>example:</strong>
         * <p>1126819517******</p>
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The unique identifier of the logon device.</p>
         * 
         * <strong>example:</strong>
         * <p>A8B35215993FBF283F28D61******</p>
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public GetConnectionTicketRequest build() {
            return new GetConnectionTicketRequest(this);
        } 

    } 

}
