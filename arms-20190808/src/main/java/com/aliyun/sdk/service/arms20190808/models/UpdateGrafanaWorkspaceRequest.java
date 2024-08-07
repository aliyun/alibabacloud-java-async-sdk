// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGrafanaWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>UpdateGrafanaWorkspaceRequest</p>
 */
public class UpdateGrafanaWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrafanaWorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String grafanaWorkspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrafanaWorkspaceName")
    private String grafanaWorkspaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UpdateGrafanaWorkspaceRequest(Builder builder) {
        super(builder);
        this.aliyunLang = builder.aliyunLang;
        this.description = builder.description;
        this.grafanaWorkspaceId = builder.grafanaWorkspaceId;
        this.grafanaWorkspaceName = builder.grafanaWorkspaceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGrafanaWorkspaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunLang
     */
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return grafanaWorkspaceId
     */
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    /**
     * @return grafanaWorkspaceName
     */
    public String getGrafanaWorkspaceName() {
        return this.grafanaWorkspaceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateGrafanaWorkspaceRequest, Builder> {
        private String aliyunLang; 
        private String description; 
        private String grafanaWorkspaceId; 
        private String grafanaWorkspaceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGrafanaWorkspaceRequest request) {
            super(request);
            this.aliyunLang = request.aliyunLang;
            this.description = request.description;
            this.grafanaWorkspaceId = request.grafanaWorkspaceId;
            this.grafanaWorkspaceName = request.grafanaWorkspaceName;
            this.regionId = request.regionId;
        } 

        /**
         * The language. Valid values: zh and en. Default value: zh.
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("AliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * The description of the workspace.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the workspace.
         */
        public Builder grafanaWorkspaceId(String grafanaWorkspaceId) {
            this.putQueryParameter("GrafanaWorkspaceId", grafanaWorkspaceId);
            this.grafanaWorkspaceId = grafanaWorkspaceId;
            return this;
        }

        /**
         * The workspace name.
         */
        public Builder grafanaWorkspaceName(String grafanaWorkspaceName) {
            this.putQueryParameter("GrafanaWorkspaceName", grafanaWorkspaceName);
            this.grafanaWorkspaceName = grafanaWorkspaceName;
            return this;
        }

        /**
         * The region ID. Default value: `cn-hangzhou`.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateGrafanaWorkspaceRequest build() {
            return new UpdateGrafanaWorkspaceRequest(this);
        } 

    } 

}
