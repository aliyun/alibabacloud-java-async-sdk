// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployFunctionFileRequest} extends {@link RequestModel}
 *
 * <p>DeployFunctionFileRequest</p>
 */
public class DeployFunctionFileRequest extends Request {
    @Query
    @NameInMap("DeployEnv")
    @Validation(required = true)
    private Integer deployEnv;

    @Query
    @NameInMap("FileId")
    @Validation(required = true)
    private String fileId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeployFunctionFileRequest(Builder builder) {
        super(builder);
        this.deployEnv = builder.deployEnv;
        this.fileId = builder.fileId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployFunctionFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deployEnv
     */
    public Integer getDeployEnv() {
        return this.deployEnv;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeployFunctionFileRequest, Builder> {
        private Integer deployEnv; 
        private String fileId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeployFunctionFileRequest response) {
            super(response);
            this.deployEnv = response.deployEnv;
            this.fileId = response.fileId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * DeployEnv.
         */
        public Builder deployEnv(Integer deployEnv) {
            this.putQueryParameter("DeployEnv", deployEnv);
            this.deployEnv = deployEnv;
            return this;
        }

        /**
         * FileId.
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeployFunctionFileRequest build() {
            return new DeployFunctionFileRequest(this);
        } 

    } 

}
