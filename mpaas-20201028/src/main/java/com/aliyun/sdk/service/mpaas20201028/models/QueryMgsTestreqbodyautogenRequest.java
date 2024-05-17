// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMgsTestreqbodyautogenRequest} extends {@link RequestModel}
 *
 * <p>QueryMgsTestreqbodyautogenRequest</p>
 */
public class QueryMgsTestreqbodyautogenRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Format")
    private String format;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MpaasMappcenterMgsTestreqbodyautogenQueryJsonStr")
    private String mpaasMappcenterMgsTestreqbodyautogenQueryJsonStr;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private QueryMgsTestreqbodyautogenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.format = builder.format;
        this.mpaasMappcenterMgsTestreqbodyautogenQueryJsonStr = builder.mpaasMappcenterMgsTestreqbodyautogenQueryJsonStr;
        this.tenantId = builder.tenantId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMgsTestreqbodyautogenRequest create() {
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
     * @return format
     */
    public String getFormat() {
        return this.format;
    }

    /**
     * @return mpaasMappcenterMgsTestreqbodyautogenQueryJsonStr
     */
    public String getMpaasMappcenterMgsTestreqbodyautogenQueryJsonStr() {
        return this.mpaasMappcenterMgsTestreqbodyautogenQueryJsonStr;
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

    public static final class Builder extends Request.Builder<QueryMgsTestreqbodyautogenRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String format; 
        private String mpaasMappcenterMgsTestreqbodyautogenQueryJsonStr; 
        private String tenantId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryMgsTestreqbodyautogenRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.format = request.format;
            this.mpaasMappcenterMgsTestreqbodyautogenQueryJsonStr = request.mpaasMappcenterMgsTestreqbodyautogenQueryJsonStr;
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
         * Format.
         */
        public Builder format(String format) {
            this.putBodyParameter("Format", format);
            this.format = format;
            return this;
        }

        /**
         * MpaasMappcenterMgsTestreqbodyautogenQueryJsonStr.
         */
        public Builder mpaasMappcenterMgsTestreqbodyautogenQueryJsonStr(String mpaasMappcenterMgsTestreqbodyautogenQueryJsonStr) {
            this.putBodyParameter("MpaasMappcenterMgsTestreqbodyautogenQueryJsonStr", mpaasMappcenterMgsTestreqbodyautogenQueryJsonStr);
            this.mpaasMappcenterMgsTestreqbodyautogenQueryJsonStr = mpaasMappcenterMgsTestreqbodyautogenQueryJsonStr;
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
        public QueryMgsTestreqbodyautogenRequest build() {
            return new QueryMgsTestreqbodyautogenRequest(this);
        } 

    } 

}
