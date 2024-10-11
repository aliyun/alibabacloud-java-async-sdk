// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyVirtualWareHouseConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyVirtualWareHouseConfigRequest</p>
 */
public class ModifyVirtualWareHouseConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigChanges")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < ConfigChanges> configChanges;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualWareHouseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String virtualWareHouseId;

    private ModifyVirtualWareHouseConfigRequest(Builder builder) {
        super(builder);
        this.configChanges = builder.configChanges;
        this.DBClusterId = builder.DBClusterId;
        this.regionId = builder.regionId;
        this.virtualWareHouseId = builder.virtualWareHouseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVirtualWareHouseConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configChanges
     */
    public java.util.List < ConfigChanges> getConfigChanges() {
        return this.configChanges;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return virtualWareHouseId
     */
    public String getVirtualWareHouseId() {
        return this.virtualWareHouseId;
    }

    public static final class Builder extends Request.Builder<ModifyVirtualWareHouseConfigRequest, Builder> {
        private java.util.List < ConfigChanges> configChanges; 
        private String DBClusterId; 
        private String regionId; 
        private String virtualWareHouseId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVirtualWareHouseConfigRequest request) {
            super(request);
            this.configChanges = request.configChanges;
            this.DBClusterId = request.DBClusterId;
            this.regionId = request.regionId;
            this.virtualWareHouseId = request.virtualWareHouseId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder configChanges(java.util.List < ConfigChanges> configChanges) {
            String configChangesShrink = shrink(configChanges, "ConfigChanges", "json");
            this.putQueryParameter("ConfigChanges", configChangesShrink);
            this.configChanges = configChanges;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vw-uf62965t8lt50****</p>
         */
        public Builder virtualWareHouseId(String virtualWareHouseId) {
            this.putQueryParameter("VirtualWareHouseId", virtualWareHouseId);
            this.virtualWareHouseId = virtualWareHouseId;
            return this;
        }

        @Override
        public ModifyVirtualWareHouseConfigRequest build() {
            return new ModifyVirtualWareHouseConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyVirtualWareHouseConfigRequest} extends {@link TeaModel}
     *
     * <p>ModifyVirtualWareHouseConfigRequest</p>
     */
    public static class ConfigChanges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigFullPath")
        @com.aliyun.core.annotation.Validation(required = true)
        private String configFullPath;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private ConfigChanges(Builder builder) {
            this.configFullPath = builder.configFullPath;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigChanges create() {
            return builder().build();
        }

        /**
         * @return configFullPath
         */
        public String getConfigFullPath() {
            return this.configFullPath;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String configFullPath; 
            private String value; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>keep_alive_timeout</p>
             */
            public Builder configFullPath(String configFullPath) {
                this.configFullPath = configFullPath;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ConfigChanges build() {
                return new ConfigChanges(this);
            } 

        } 

    }
}
