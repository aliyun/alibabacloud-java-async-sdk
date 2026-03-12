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
 * {@link ModifyInstanceConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceConfigRequest</p>
 */
public class ModifyInstanceConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddConfigList")
    private String addConfigList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigList")
    private String configList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteConfigList")
    private String deleteConfigList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configsToAdd")
    private java.util.List<InstanceConfigDto> configsToAdd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configsToDelete")
    private java.util.List<InstanceConfigDto> configsToDelete;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configsToUpdate")
    private java.util.List<InstanceConfigDto> configsToUpdate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fastMode")
    private Boolean fastMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("restart")
    private Boolean restart;

    private ModifyInstanceConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.addConfigList = builder.addConfigList;
        this.configList = builder.configList;
        this.deleteConfigList = builder.deleteConfigList;
        this.instanceId = builder.instanceId;
        this.reason = builder.reason;
        this.configsToAdd = builder.configsToAdd;
        this.configsToDelete = builder.configsToDelete;
        this.configsToUpdate = builder.configsToUpdate;
        this.fastMode = builder.fastMode;
        this.restart = builder.restart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceConfigRequest create() {
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
     * @return addConfigList
     */
    public String getAddConfigList() {
        return this.addConfigList;
    }

    /**
     * @return configList
     */
    public String getConfigList() {
        return this.configList;
    }

    /**
     * @return deleteConfigList
     */
    public String getDeleteConfigList() {
        return this.deleteConfigList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
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

    /**
     * @return fastMode
     */
    public Boolean getFastMode() {
        return this.fastMode;
    }

    /**
     * @return restart
     */
    public Boolean getRestart() {
        return this.restart;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceConfigRequest, Builder> {
        private String regionId; 
        private String addConfigList; 
        private String configList; 
        private String deleteConfigList; 
        private String instanceId; 
        private String reason; 
        private java.util.List<InstanceConfigDto> configsToAdd; 
        private java.util.List<InstanceConfigDto> configsToDelete; 
        private java.util.List<InstanceConfigDto> configsToUpdate; 
        private Boolean fastMode; 
        private Boolean restart; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.addConfigList = request.addConfigList;
            this.configList = request.configList;
            this.deleteConfigList = request.deleteConfigList;
            this.instanceId = request.instanceId;
            this.reason = request.reason;
            this.configsToAdd = request.configsToAdd;
            this.configsToDelete = request.configsToDelete;
            this.configsToUpdate = request.configsToUpdate;
            this.fastMode = request.fastMode;
            this.restart = request.restart;
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
         * AddConfigList.
         */
        public Builder addConfigList(String addConfigList) {
            this.putQueryParameter("AddConfigList", addConfigList);
            this.addConfigList = addConfigList;
            return this;
        }

        /**
         * ConfigList.
         */
        public Builder configList(String configList) {
            this.putQueryParameter("ConfigList", configList);
            this.configList = configList;
            return this;
        }

        /**
         * DeleteConfigList.
         */
        public Builder deleteConfigList(String deleteConfigList) {
            this.putQueryParameter("DeleteConfigList", deleteConfigList);
            this.deleteConfigList = deleteConfigList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-991ca6180620****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
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

        /**
         * fastMode.
         */
        public Builder fastMode(Boolean fastMode) {
            this.putBodyParameter("fastMode", fastMode);
            this.fastMode = fastMode;
            return this;
        }

        /**
         * restart.
         */
        public Builder restart(Boolean restart) {
            this.putBodyParameter("restart", restart);
            this.restart = restart;
            return this;
        }

        @Override
        public ModifyInstanceConfigRequest build() {
            return new ModifyInstanceConfigRequest(this);
        } 

    } 

}
