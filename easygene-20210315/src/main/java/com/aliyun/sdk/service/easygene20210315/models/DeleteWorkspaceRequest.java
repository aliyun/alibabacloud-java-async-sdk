// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>DeleteWorkspaceRequest</p>
 */
public class DeleteWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private DeleteWorkspaceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWorkspaceRequest create() {
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
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<DeleteWorkspaceRequest, Builder> {
        private String regionId; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWorkspaceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspace = request.workspace;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyTestWorkspace</p>
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("Workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public DeleteWorkspaceRequest build() {
            return new DeleteWorkspaceRequest(this);
        } 

    } 

}
