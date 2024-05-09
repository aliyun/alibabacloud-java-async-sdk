// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGrafanaWorkspaceVersionRequest} extends {@link RequestModel}
 *
 * <p>UpdateGrafanaWorkspaceVersionRequest</p>
 */
public class UpdateGrafanaWorkspaceVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrafanaVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String grafanaVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrafanaWorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String grafanaWorkspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UpdateGrafanaWorkspaceVersionRequest(Builder builder) {
        super(builder);
        this.aliyunLang = builder.aliyunLang;
        this.grafanaVersion = builder.grafanaVersion;
        this.grafanaWorkspaceId = builder.grafanaWorkspaceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGrafanaWorkspaceVersionRequest create() {
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
     * @return grafanaVersion
     */
    public String getGrafanaVersion() {
        return this.grafanaVersion;
    }

    /**
     * @return grafanaWorkspaceId
     */
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateGrafanaWorkspaceVersionRequest, Builder> {
        private String aliyunLang; 
        private String grafanaVersion; 
        private String grafanaWorkspaceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGrafanaWorkspaceVersionRequest request) {
            super(request);
            this.aliyunLang = request.aliyunLang;
            this.grafanaVersion = request.grafanaVersion;
            this.grafanaWorkspaceId = request.grafanaWorkspaceId;
            this.regionId = request.regionId;
        } 

        /**
         * AliyunLang.
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("AliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * GrafanaVersion.
         */
        public Builder grafanaVersion(String grafanaVersion) {
            this.putQueryParameter("GrafanaVersion", grafanaVersion);
            this.grafanaVersion = grafanaVersion;
            return this;
        }

        /**
         * GrafanaWorkspaceId.
         */
        public Builder grafanaWorkspaceId(String grafanaWorkspaceId) {
            this.putQueryParameter("GrafanaWorkspaceId", grafanaWorkspaceId);
            this.grafanaWorkspaceId = grafanaWorkspaceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateGrafanaWorkspaceVersionRequest build() {
            return new UpdateGrafanaWorkspaceVersionRequest(this);
        } 

    } 

}
