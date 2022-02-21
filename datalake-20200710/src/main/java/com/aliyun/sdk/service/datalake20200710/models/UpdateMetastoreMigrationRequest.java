// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMetastoreMigrationRequest} extends {@link RequestModel}
 *
 * <p>UpdateMetastoreMigrationRequest</p>
 */
public class UpdateMetastoreMigrationRequest extends Request {
    @Body
    @NameInMap("Desc")
    private String desc;

    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("MetastoreInfo")
    private String metastoreInfo;

    @Body
    @NameInMap("MetastoreType")
    private String metastoreType;

    @Body
    @NameInMap("Name")
    private String name;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RoleName")
    private String roleName;

    @Body
    @NameInMap("RunOptions")
    private String runOptions;

    private UpdateMetastoreMigrationRequest(Builder builder) {
        super(builder);
        this.desc = builder.desc;
        this.instanceId = builder.instanceId;
        this.metastoreInfo = builder.metastoreInfo;
        this.metastoreType = builder.metastoreType;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.roleName = builder.roleName;
        this.runOptions = builder.runOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMetastoreMigrationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return metastoreInfo
     */
    public String getMetastoreInfo() {
        return this.metastoreInfo;
    }

    /**
     * @return metastoreType
     */
    public String getMetastoreType() {
        return this.metastoreType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @return runOptions
     */
    public String getRunOptions() {
        return this.runOptions;
    }

    public static final class Builder extends Request.Builder<UpdateMetastoreMigrationRequest, Builder> {
        private String desc; 
        private String instanceId; 
        private String metastoreInfo; 
        private String metastoreType; 
        private String name; 
        private String regionId; 
        private String roleName; 
        private String runOptions; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMetastoreMigrationRequest response) {
            super(response);
            this.desc = response.desc;
            this.instanceId = response.instanceId;
            this.metastoreInfo = response.metastoreInfo;
            this.metastoreType = response.metastoreType;
            this.name = response.name;
            this.regionId = response.regionId;
            this.roleName = response.roleName;
            this.runOptions = response.runOptions;
        } 

        /**
         * Desc.
         */
        public Builder desc(String desc) {
            this.putBodyParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MetastoreInfo.
         */
        public Builder metastoreInfo(String metastoreInfo) {
            this.putBodyParameter("MetastoreInfo", metastoreInfo);
            this.metastoreInfo = metastoreInfo;
            return this;
        }

        /**
         * MetastoreType.
         */
        public Builder metastoreType(String metastoreType) {
            this.putBodyParameter("MetastoreType", metastoreType);
            this.metastoreType = metastoreType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleName.
         */
        public Builder roleName(String roleName) {
            this.putBodyParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        /**
         * RunOptions.
         */
        public Builder runOptions(String runOptions) {
            this.putBodyParameter("RunOptions", runOptions);
            this.runOptions = runOptions;
            return this;
        }

        @Override
        public UpdateMetastoreMigrationRequest build() {
            return new UpdateMetastoreMigrationRequest(this);
        } 

    } 

}
