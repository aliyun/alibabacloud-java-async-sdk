// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRunRequest} extends {@link RequestModel}
 *
 * <p>DeleteRunRequest</p>
 */
public class DeleteRunRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RunId")
    @Validation(required = true)
    private String runId;

    @Query
    @NameInMap("Workspace")
    @Validation(required = true)
    private String workspace;

    private DeleteRunRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.runId = builder.runId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRunRequest create() {
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
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<DeleteRunRequest, Builder> {
        private String regionId; 
        private String runId; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRunRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.runId = request.runId;
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
         * RunId.
         */
        public Builder runId(String runId) {
            this.putQueryParameter("RunId", runId);
            this.runId = runId;
            return this;
        }

        /**
         * Workspace.
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("Workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public DeleteRunRequest build() {
            return new DeleteRunRequest(this);
        } 

    } 

}
