// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGrafanaWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>GetGrafanaWorkspaceRequest</p>
 */
public class GetGrafanaWorkspaceRequest extends Request {
    @Query
    @NameInMap("AliyunLang")
    private String aliyunLang;

    @Query
    @NameInMap("GrafanaWorkspaceId")
    @Validation(required = true)
    private String grafanaWorkspaceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetGrafanaWorkspaceRequest(Builder builder) {
        super(builder);
        this.aliyunLang = builder.aliyunLang;
        this.grafanaWorkspaceId = builder.grafanaWorkspaceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGrafanaWorkspaceRequest create() {
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

    public static final class Builder extends Request.Builder<GetGrafanaWorkspaceRequest, Builder> {
        private String aliyunLang; 
        private String grafanaWorkspaceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetGrafanaWorkspaceRequest request) {
            super(request);
            this.aliyunLang = request.aliyunLang;
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
        public GetGrafanaWorkspaceRequest build() {
            return new GetGrafanaWorkspaceRequest(this);
        } 

    } 

}
