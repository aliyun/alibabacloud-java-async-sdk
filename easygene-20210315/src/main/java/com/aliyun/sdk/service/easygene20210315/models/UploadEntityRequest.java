// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadEntityRequest} extends {@link RequestModel}
 *
 * <p>UploadEntityRequest</p>
 */
public class UploadEntityRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("EntityCSVFile")
    @Validation(required = true)
    private String entityCSVFile;

    @Query
    @NameInMap("Workspace")
    @Validation(required = true)
    private String workspace;

    private UploadEntityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.entityCSVFile = builder.entityCSVFile;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadEntityRequest create() {
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
     * @return entityCSVFile
     */
    public String getEntityCSVFile() {
        return this.entityCSVFile;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<UploadEntityRequest, Builder> {
        private String regionId; 
        private String entityCSVFile; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(UploadEntityRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.entityCSVFile = request.entityCSVFile;
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
         * EntityCSVFile.
         */
        public Builder entityCSVFile(String entityCSVFile) {
            this.putQueryParameter("EntityCSVFile", entityCSVFile);
            this.entityCSVFile = entityCSVFile;
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
        public UploadEntityRequest build() {
            return new UploadEntityRequest(this);
        } 

    } 

}
