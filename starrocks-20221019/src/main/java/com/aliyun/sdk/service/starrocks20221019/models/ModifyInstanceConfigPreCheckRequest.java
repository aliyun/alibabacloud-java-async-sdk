// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link ModifyInstanceConfigPreCheckRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceConfigPreCheckRequest</p>
 */
public class ModifyInstanceConfigPreCheckRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configsToAdd")
    private java.util.List<InstanceConfigDto> configsToAdd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configsToDelete")
    private java.util.List<InstanceConfigDto> configsToDelete;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configsToUpdate")
    private java.util.List<InstanceConfigDto> configsToUpdate;

    private ModifyInstanceConfigPreCheckRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.configsToAdd = builder.configsToAdd;
        this.configsToDelete = builder.configsToDelete;
        this.configsToUpdate = builder.configsToUpdate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceConfigPreCheckRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return configsToAdd
     */
    public java.util.List<InstanceConfigDto> getConfigsToAdd() {
        return this.configsToAdd;
    }

    /**
     * @return configsToDelete
     */
    public java.util.List<InstanceConfigDto> getConfigsToDelete() {
        return this.configsToDelete;
    }

    /**
     * @return configsToUpdate
     */
    public java.util.List<InstanceConfigDto> getConfigsToUpdate() {
        return this.configsToUpdate;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceConfigPreCheckRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private java.util.List<InstanceConfigDto> configsToAdd; 
        private java.util.List<InstanceConfigDto> configsToDelete; 
        private java.util.List<InstanceConfigDto> configsToUpdate; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceConfigPreCheckRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.configsToAdd = request.configsToAdd;
            this.configsToDelete = request.configsToDelete;
            this.configsToUpdate = request.configsToUpdate;
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
         * <p>c-b25e21e24388****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * configsToAdd.
         */
        public Builder configsToAdd(java.util.List<InstanceConfigDto> configsToAdd) {
            this.putBodyParameter("configsToAdd", configsToAdd);
            this.configsToAdd = configsToAdd;
            return this;
        }

        /**
         * configsToDelete.
         */
        public Builder configsToDelete(java.util.List<InstanceConfigDto> configsToDelete) {
            this.putBodyParameter("configsToDelete", configsToDelete);
            this.configsToDelete = configsToDelete;
            return this;
        }

        /**
         * configsToUpdate.
         */
        public Builder configsToUpdate(java.util.List<InstanceConfigDto> configsToUpdate) {
            this.putBodyParameter("configsToUpdate", configsToUpdate);
            this.configsToUpdate = configsToUpdate;
            return this;
        }

        @Override
        public ModifyInstanceConfigPreCheckRequest build() {
            return new ModifyInstanceConfigPreCheckRequest(this);
        } 

    } 

}
