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
 * {@link StopAppRequest} extends {@link RequestModel}
 *
 * <p>StopAppRequest</p>
 */
public class StopAppRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AliUid")
    private Long aliUid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiType")
    private String apiType;

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
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientChannel")
    private String clientChannel;

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
    @com.aliyun.core.annotation.NameInMap("ForceStop")
    private Boolean forceStop;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdpId")
    private String idpId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoginRegionId")
    private String loginRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoginToken")
    private String loginToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WyId")
    private String wyId;

    private StopAppRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.apiType = builder.apiType;
        this.appId = builder.appId;
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceId = builder.appInstanceId;
        this.bizRegionId = builder.bizRegionId;
        this.clientChannel = builder.clientChannel;
        this.clientId = builder.clientId;
        this.clientIp = builder.clientIp;
        this.clientOS = builder.clientOS;
        this.clientVersion = builder.clientVersion;
        this.endUserId = builder.endUserId;
        this.forceStop = builder.forceStop;
        this.idpId = builder.idpId;
        this.loginRegionId = builder.loginRegionId;
        this.loginToken = builder.loginToken;
        this.productType = builder.productType;
        this.regionId = builder.regionId;
        this.sessionId = builder.sessionId;
        this.uuid = builder.uuid;
        this.wyId = builder.wyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopAppRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return apiType
     */
    public String getApiType() {
        return this.apiType;
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
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return clientChannel
     */
    public String getClientChannel() {
        return this.clientChannel;
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
     * @return forceStop
     */
    public Boolean getForceStop() {
        return this.forceStop;
    }

    /**
     * @return idpId
     */
    public String getIdpId() {
        return this.idpId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * @return wyId
     */
    public String getWyId() {
        return this.wyId;
    }

    public static final class Builder extends Request.Builder<StopAppRequest, Builder> {
        private Long aliUid; 
        private String apiType; 
        private String appId; 
        private String appInstanceGroupId; 
        private String appInstanceId; 
        private String bizRegionId; 
        private String clientChannel; 
        private String clientId; 
        private String clientIp; 
        private String clientOS; 
        private String clientVersion; 
        private String endUserId; 
        private Boolean forceStop; 
        private String idpId; 
        private String loginRegionId; 
        private String loginToken; 
        private String productType; 
        private String regionId; 
        private String sessionId; 
        private String uuid; 
        private String wyId; 

        private Builder() {
            super();
        } 

        private Builder(StopAppRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.apiType = request.apiType;
            this.appId = request.appId;
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.appInstanceId = request.appInstanceId;
            this.bizRegionId = request.bizRegionId;
            this.clientChannel = request.clientChannel;
            this.clientId = request.clientId;
            this.clientIp = request.clientIp;
            this.clientOS = request.clientOS;
            this.clientVersion = request.clientVersion;
            this.endUserId = request.endUserId;
            this.forceStop = request.forceStop;
            this.idpId = request.idpId;
            this.loginRegionId = request.loginRegionId;
            this.loginToken = request.loginToken;
            this.productType = request.productType;
            this.regionId = request.regionId;
            this.sessionId = request.sessionId;
            this.uuid = request.uuid;
            this.wyId = request.wyId;
        } 

        /**
         * <p>The tenant ID.
         * You can obtain this parameter by calling the GetLoginToken logon operation. Response parameter: TenantId.</p>
         * 
         * <strong>example:</strong>
         * <p>1924794279035094</p>
         */
        public Builder aliUid(Long aliUid) {
            this.putBodyParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * <p>The API type. The value can only be AnonymousUserAPI, which indicates that the client calls the API.</p>
         * 
         * <strong>example:</strong>
         * <p>AnonymousUserAPI</p>
         */
        public Builder apiType(String apiType) {
            this.putBodyParameter("ApiType", apiType);
            this.apiType = apiType;
            return this;
        }

        /**
         * <p>The ID of the application.
         * You can obtain this parameter by calling the ListRunningApps operation. Parameter: AppId.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-fxwp4koywsglzvvex</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the delivery group.
         * You can obtain this parameter by calling the ListRunningApps operation. Parameter: AppInstanceGroupId.
         * This parameter is required. Although it is marked as required:false in the OpenAPI metadata, it must be provided in actual calls. If it is not provided or the corresponding delivery group does not exist, the service returns a 400 error with the error code <code>InvalidAppInstanceGroup.NotFound</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-89ibriac2wudyph38</p>
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putBodyParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * <p>The instance ID.
         * You can obtain this parameter by invoking the ListRunningApps operation. Parameter: AppInstanceId.</p>
         * 
         * <strong>example:</strong>
         * <p>ai-d297eyf83g5niwnjl</p>
         */
        public Builder appInstanceId(String appInstanceId) {
            this.putBodyParameter("AppInstanceId", appInstanceId);
            this.appInstanceId = appInstanceId;
            return this;
        }

        /**
         * <p>The ID of the region to which the delivery group belongs.
         * You can obtain this parameter by calling the ListRunningApps operation. Parameter: RegionId.</p>
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
         * <p>The app client identifier, which is used to distinguish different applications.</p>
         * 
         * <strong>example:</strong>
         * <p>pc</p>
         */
        public Builder clientChannel(String clientChannel) {
            this.putBodyParameter("ClientChannel", clientChannel);
            this.clientChannel = clientChannel;
            return this;
        }

        /**
         * <p>The unique ID generated by the client.</p>
         * 
         * <strong>example:</strong>
         * <p>91b79184-51d0-42ad-8475-78cae95b0aa6</p>
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
         * <p>22.21.2.79</p>
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
         * <p>windows_&quot;Windows 10 Enterprise&quot; 10.0 (Build 19042)</p>
         */
        public Builder clientOS(String clientOS) {
            this.putBodyParameter("ClientOS", clientOS);
            this.clientOS = clientOS;
            return this;
        }

        /**
         * <p>The client version.</p>
         * 
         * <strong>example:</strong>
         * <p>3.1.1-R-20211022.144255</p>
         */
        public Builder clientVersion(String clientVersion) {
            this.putBodyParameter("ClientVersion", clientVersion);
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
            this.putBodyParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>Specifies whether to force stop the application.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceStop(Boolean forceStop) {
            this.putBodyParameter("ForceStop", forceStop);
            this.forceStop = forceStop;
            return this;
        }

        /**
         * <p>The ID of the logon authentication service.
         * You can obtain this parameter by calling the FindIdpListByLoginName operation.</p>
         * 
         * <strong>example:</strong>
         * <p>idp-9ie5smicnct2xodn2</p>
         */
        public Builder idpId(String idpId) {
            this.putBodyParameter("IdpId", idpId);
            this.idpId = idpId;
            return this;
        }

        /**
         * <p>The region ID for logon.
         * The region ID of the workspace selected by the user during logon.</p>
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
         * <p>The logon credential.
         * You can obtain this parameter by calling the GetLoginToken operation for logon, or by calling the RefreshLoginToken update operation after logon. Response parameter: LoginToken.
         * This parameter is required. Although it is marked as required:false in the OpenAPI metadata, it must be provided in actual calls. If it is not provided, the service returns a 400 error with the error code <code>InvalidParameter.loginToken</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>v185fdd7f6d39fa7861981639366085772e150a390a5bb7b43c4e62440d94fc392b945770e1596cebe90085ce0af4d330e</p>
         */
        public Builder loginToken(String loginToken) {
            this.putBodyParameter("LoginToken", loginToken);
            this.loginToken = loginToken;
            return this;
        }

        /**
         * <p>The product type. Valid values:</p>
         * <ul>
         * <li><code>CloudApp</code>: Cloud Application (WUYING Cloud Application).</li>
         * <li><code>CloudBrowser</code>: Cloud Browser.</li>
         * <li><code>AndroidCloud</code>: Cloud Phone.
         * This parameter is required. Although it is marked as required:false in the OpenAPI metadata, it must be provided in actual calls. If it is not provided or the value is invalid, the service returns a 400 error with the error code <code>ProductTypeInvalid</code>.</li>
         * </ul>
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
         * <p>The ID of the region to which the delivery group belongs.
         * You can obtain this parameter by calling the ListRunningApps operation. Parameter: RegionId.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The session ID.
         * You can obtain this parameter by calling the GetLoginToken logon operation. Response parameter: SessionId.
         * This parameter is required. Although it is marked as required:false in the OpenAPI metadata, it must be provided in actual calls. If it is not provided, the service returns a 400 error with the error code <code>InvalidParameter.sessionId</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>597e869d-ea14-4b83-9490-714f68bfe935</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The UUID of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>2943802884B27030B6759F9132B26903</p>
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        /**
         * <p>The WUYING user ID.
         * You can obtain this parameter by calling the GetLoginToken logon operation. Response parameter: WyId.</p>
         * 
         * <strong>example:</strong>
         * <p>ac3cb49059261898</p>
         */
        public Builder wyId(String wyId) {
            this.putBodyParameter("WyId", wyId);
            this.wyId = wyId;
            return this;
        }

        @Override
        public StopAppRequest build() {
            return new StopAppRequest(this);
        } 

    } 

}
