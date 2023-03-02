// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TestNetworkConnectionRequest} extends {@link RequestModel}
 *
 * <p>TestNetworkConnectionRequest</p>
 */
public class TestNetworkConnectionRequest extends Request {
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
    @Validation(required = true)
    private String envType;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true, maximum = 10000000000D, minimum = 1)
    private Long projectId;

    @Query
    @NameInMap("ResourceGroup")
    @Validation(required = true)
    private String resourceGroup;

    private TestNetworkConnectionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.datasourceName = builder.datasourceName;
        this.envType = builder.envType;
        this.projectId = builder.projectId;
        this.resourceGroup = builder.resourceGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestNetworkConnectionRequest create() {
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
     * @return resourceGroup
     */
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public static final class Builder extends Request.Builder<TestNetworkConnectionRequest, Builder> {
        private String regionId; 
        private String datasourceName; 
        private String envType; 
        private Long projectId; 
        private String resourceGroup; 

        private Builder() {
            super();
        } 

        private Builder(TestNetworkConnectionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.datasourceName = request.datasourceName;
            this.envType = request.envType;
            this.projectId = request.projectId;
            this.resourceGroup = request.resourceGroup;
        } 

        /**
         * The ID of the region in which the data source resides. For example, the ID of the China (Shanghai) region is cn-shanghai, and that of the China (Zhangjiakou) region is cn-zhangjiakou. The system automatically determines the value of this parameter based on the endpoint used to call the operation.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the data source.
         */
        public Builder datasourceName(String datasourceName) {
            this.putQueryParameter("DatasourceName", datasourceName);
            this.datasourceName = datasourceName;
            return this;
        }

        /**
         * The environment to which the data source belongs. Valid values:
         * <p>
         * 
         * *   0: development environment
         * *   1: production environment
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * The ID of the DataWorks workspace to which the data source belongs. You can call the [ListProjects](~~178393~~) operation to query the ID of the workspace.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The identifier of the resource group. You can call the [ListResourceGroups](~~173913~~) operation to query the identifier of the resource group.
         */
        public Builder resourceGroup(String resourceGroup) {
            this.putQueryParameter("ResourceGroup", resourceGroup);
            this.resourceGroup = resourceGroup;
            return this;
        }

        @Override
        public TestNetworkConnectionRequest build() {
            return new TestNetworkConnectionRequest(this);
        } 

    } 

}
