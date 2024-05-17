// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenApiUpdateActiveSceneRequest} extends {@link RequestModel}
 *
 * <p>OpenApiUpdateActiveSceneRequest</p>
 */
public class OpenApiUpdateActiveSceneRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MpaasMqcpOpenApiUpdateActiveSceneReqJsonStr")
    private String mpaasMqcpOpenApiUpdateActiveSceneReqJsonStr;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private OpenApiUpdateActiveSceneRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.mpaasMqcpOpenApiUpdateActiveSceneReqJsonStr = builder.mpaasMqcpOpenApiUpdateActiveSceneReqJsonStr;
        this.tenantId = builder.tenantId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenApiUpdateActiveSceneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return mpaasMqcpOpenApiUpdateActiveSceneReqJsonStr
     */
    public String getMpaasMqcpOpenApiUpdateActiveSceneReqJsonStr() {
        return this.mpaasMqcpOpenApiUpdateActiveSceneReqJsonStr;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<OpenApiUpdateActiveSceneRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String mpaasMqcpOpenApiUpdateActiveSceneReqJsonStr; 
        private String tenantId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(OpenApiUpdateActiveSceneRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.mpaasMqcpOpenApiUpdateActiveSceneReqJsonStr = request.mpaasMqcpOpenApiUpdateActiveSceneReqJsonStr;
            this.tenantId = request.tenantId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
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
         * MpaasMqcpOpenApiUpdateActiveSceneReqJsonStr.
         */
        public Builder mpaasMqcpOpenApiUpdateActiveSceneReqJsonStr(String mpaasMqcpOpenApiUpdateActiveSceneReqJsonStr) {
            this.putBodyParameter("MpaasMqcpOpenApiUpdateActiveSceneReqJsonStr", mpaasMqcpOpenApiUpdateActiveSceneReqJsonStr);
            this.mpaasMqcpOpenApiUpdateActiveSceneReqJsonStr = mpaasMqcpOpenApiUpdateActiveSceneReqJsonStr;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public OpenApiUpdateActiveSceneRequest build() {
            return new OpenApiUpdateActiveSceneRequest(this);
        } 

    } 

}
