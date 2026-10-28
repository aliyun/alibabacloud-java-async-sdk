// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateGadInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateGadInstanceRequest</p>
 */
public class CreateGadInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterDbEngineType")
    private String masterDbEngineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterDbInstanceId")
    private String masterDbInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterDbInstanceRegion")
    private String masterDbInstanceRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterDbZoneId")
    private String masterDbZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private CreateGadInstanceRequest(Builder builder) {
        super(builder);
        this.instanceName = builder.instanceName;
        this.instanceType = builder.instanceType;
        this.masterDbEngineType = builder.masterDbEngineType;
        this.masterDbInstanceId = builder.masterDbInstanceId;
        this.masterDbInstanceRegion = builder.masterDbInstanceRegion;
        this.masterDbZoneId = builder.masterDbZoneId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGadInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return masterDbEngineType
     */
    public String getMasterDbEngineType() {
        return this.masterDbEngineType;
    }

    /**
     * @return masterDbInstanceId
     */
    public String getMasterDbInstanceId() {
        return this.masterDbInstanceId;
    }

    /**
     * @return masterDbInstanceRegion
     */
    public String getMasterDbInstanceRegion() {
        return this.masterDbInstanceRegion;
    }

    /**
     * @return masterDbZoneId
     */
    public String getMasterDbZoneId() {
        return this.masterDbZoneId;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<CreateGadInstanceRequest, Builder> {
        private String instanceName; 
        private String instanceType; 
        private String masterDbEngineType; 
        private String masterDbInstanceId; 
        private String masterDbInstanceRegion; 
        private String masterDbZoneId; 
        private String ownerId; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateGadInstanceRequest request) {
            super(request);
            this.instanceName = request.instanceName;
            this.instanceType = request.instanceType;
            this.masterDbEngineType = request.masterDbEngineType;
            this.masterDbInstanceId = request.masterDbInstanceId;
            this.masterDbInstanceRegion = request.masterDbInstanceRegion;
            this.masterDbZoneId = request.masterDbZoneId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The name of the group. The name must be globally unique.</p>
         * 
         * <strong>example:</strong>
         * <p>gad-sqlserver-hk-set4</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The instance type. Valid values: DR (disaster recovery) and GAD (active geo-redundancy).</p>
         * 
         * <strong>example:</strong>
         * <p>DR</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The database engine. Valid values: MySQL, SQL Server, and PostgreSQL.</p>
         * 
         * <strong>example:</strong>
         * <p>SQLServer</p>
         */
        public Builder masterDbEngineType(String masterDbEngineType) {
            this.putQueryParameter("MasterDbEngineType", masterDbEngineType);
            this.masterDbEngineType = masterDbEngineType;
            return this;
        }

        /**
         * <p>The ID of the primary ApsaraDB RDS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-j6c685vh0j0y1k***</p>
         */
        public Builder masterDbInstanceId(String masterDbInstanceId) {
            this.putQueryParameter("MasterDbInstanceId", masterDbInstanceId);
            this.masterDbInstanceId = masterDbInstanceId;
            return this;
        }

        /**
         * <p>The region of the primary instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hongkong</p>
         */
        public Builder masterDbInstanceRegion(String masterDbInstanceRegion) {
            this.putQueryParameter("MasterDbInstanceRegion", masterDbInstanceRegion);
            this.masterDbInstanceRegion = masterDbInstanceRegion;
            return this;
        }

        /**
         * <p>The zone of the primary instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hongkong-b</p>
         */
        public Builder masterDbZoneId(String masterDbZoneId) {
            this.putQueryParameter("MasterDbZoneId", masterDbZoneId);
            this.masterDbZoneId = masterDbZoneId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The region of the primary instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hongkong</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek3d****4mxya</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public CreateGadInstanceRequest build() {
            return new CreateGadInstanceRequest(this);
        } 

    } 

}
