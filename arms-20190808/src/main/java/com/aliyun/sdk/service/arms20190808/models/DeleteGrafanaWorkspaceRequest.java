// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGrafanaWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>DeleteGrafanaWorkspaceRequest</p>
 */
public class DeleteGrafanaWorkspaceRequest extends Request {
    @Query
    @NameInMap("GrafanaWorkspaceId")
    @Validation(required = true)
    private String grafanaWorkspaceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteGrafanaWorkspaceRequest(Builder builder) {
        super(builder);
        this.grafanaWorkspaceId = builder.grafanaWorkspaceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGrafanaWorkspaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DeleteGrafanaWorkspaceRequest, Builder> {
        private String grafanaWorkspaceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGrafanaWorkspaceRequest request) {
            super(request);
            this.grafanaWorkspaceId = request.grafanaWorkspaceId;
            this.regionId = request.regionId;
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
        public DeleteGrafanaWorkspaceRequest build() {
            return new DeleteGrafanaWorkspaceRequest(this);
        } 

    } 

}
