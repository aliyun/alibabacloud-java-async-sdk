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

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroup")
    @Validation(required = true)
    private String resourceGroup;

    private TestNetworkConnectionRequest(Builder builder) {
        super(builder);
        this.datasourceName = builder.datasourceName;
        this.envType = builder.envType;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroup
     */
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public static final class Builder extends Request.Builder<TestNetworkConnectionRequest, Builder> {
        private String datasourceName; 
        private String envType; 
        private Long projectId; 
        private String regionId; 
        private String resourceGroup; 

        private Builder() {
            super();
        } 

        private Builder(TestNetworkConnectionRequest request) {
            super(request);
            this.datasourceName = request.datasourceName;
            this.envType = request.envType;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.resourceGroup = request.resourceGroup;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroup.
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
