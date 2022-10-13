// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDataSourceShareRequest} extends {@link RequestModel}
 *
 * <p>SetDataSourceShareRequest</p>
 */
public class SetDataSourceShareRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("DatasourceName")
    @Validation(required = true)
    private String datasourceName;

    @Query
    @NameInMap("EnvType")
    private String envType;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true, maximum = 10000000000D, minimum = 1)
    private Long projectId;

    @Query
    @NameInMap("ProjectPermissions")
    private String projectPermissions;

    @Query
    @NameInMap("UserPermissions")
    private String userPermissions;

    private SetDataSourceShareRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.datasourceName = builder.datasourceName;
        this.envType = builder.envType;
        this.projectId = builder.projectId;
        this.projectPermissions = builder.projectPermissions;
        this.userPermissions = builder.userPermissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDataSourceShareRequest create() {
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
     * @return datasourceName
     */
    public String getDatasourceName() {
        return this.datasourceName;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectPermissions
     */
    public String getProjectPermissions() {
        return this.projectPermissions;
    }

    /**
     * @return userPermissions
     */
    public String getUserPermissions() {
        return this.userPermissions;
    }

    public static final class Builder extends Request.Builder<SetDataSourceShareRequest, Builder> {
        private String regionId; 
        private String datasourceName; 
        private String envType; 
        private Long projectId; 
        private String projectPermissions; 
        private String userPermissions; 

        private Builder() {
            super();
        } 

        private Builder(SetDataSourceShareRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.datasourceName = request.datasourceName;
            this.envType = request.envType;
            this.projectId = request.projectId;
            this.projectPermissions = request.projectPermissions;
            this.userPermissions = request.userPermissions;
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
         * DatasourceName.
         */
        public Builder datasourceName(String datasourceName) {
            this.putQueryParameter("DatasourceName", datasourceName);
            this.datasourceName = datasourceName;
            return this;
        }

        /**
         * EnvType.
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ProjectPermissions.
         */
        public Builder projectPermissions(String projectPermissions) {
            this.putQueryParameter("ProjectPermissions", projectPermissions);
            this.projectPermissions = projectPermissions;
            return this;
        }

        /**
         * UserPermissions.
         */
        public Builder userPermissions(String userPermissions) {
            this.putQueryParameter("UserPermissions", userPermissions);
            this.userPermissions = userPermissions;
            return this;
        }

        @Override
        public SetDataSourceShareRequest build() {
            return new SetDataSourceShareRequest(this);
        } 

    } 

}
