// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link CheckDataSourceConnectivityOnResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>CheckDataSourceConnectivityOnResourceGroupRequest</p>
 */
public class CheckDataSourceConnectivityOnResourceGroupRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private CheckCommand checkCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private CheckDataSourceConnectivityOnResourceGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.checkCommand = builder.checkCommand;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDataSourceConnectivityOnResourceGroupRequest create() {
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
     * @return checkCommand
     */
    public CheckCommand getCheckCommand() {
        return this.checkCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    public static final class Builder extends Request.Builder<CheckDataSourceConnectivityOnResourceGroupRequest, Builder> {
        private String regionId; 
        private CheckCommand checkCommand; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(CheckDataSourceConnectivityOnResourceGroupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.checkCommand = request.checkCommand;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
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
         */
        public Builder checkCommand(CheckCommand checkCommand) {
            String checkCommandShrink = shrink(checkCommand, "CheckCommand", "json");
            this.putBodyParameter("CheckCommand", checkCommandShrink);
            this.checkCommand = checkCommand;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public CheckDataSourceConnectivityOnResourceGroupRequest build() {
            return new CheckDataSourceConnectivityOnResourceGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CheckDataSourceConnectivityOnResourceGroupRequest} extends {@link TeaModel}
     *
     * <p>CheckDataSourceConnectivityOnResourceGroupRequest</p>
     */
    public static class ConfigItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ConfigItemList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigItemList create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(ConfigItemList model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ConfigItemList build() {
                return new ConfigItemList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CheckDataSourceConnectivityOnResourceGroupRequest} extends {@link TeaModel}
     *
     * <p>CheckDataSourceConnectivityOnResourceGroupRequest</p>
     */
    public static class CheckCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigItemList")
        private java.util.List<ConfigItemList> configItemList;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private CheckCommand(Builder builder) {
            this.configItemList = builder.configItemList;
            this.dataSourceId = builder.dataSourceId;
            this.resourceGroupId = builder.resourceGroupId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckCommand create() {
            return builder().build();
        }

        /**
         * @return configItemList
         */
        public java.util.List<ConfigItemList> getConfigItemList() {
            return this.configItemList;
        }

        /**
         * @return dataSourceId
         */
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<ConfigItemList> configItemList; 
            private String dataSourceId; 
            private String resourceGroupId; 
            private String type; 

            private Builder() {
            } 

            private Builder(CheckCommand model) {
                this.configItemList = model.configItemList;
                this.dataSourceId = model.dataSourceId;
                this.resourceGroupId = model.resourceGroupId;
                this.type = model.type;
            } 

            /**
             * ConfigItemList.
             */
            public Builder configItemList(java.util.List<ConfigItemList> configItemList) {
                this.configItemList = configItemList;
                return this;
            }

            /**
             * DataSourceId.
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CheckCommand build() {
                return new CheckCommand(this);
            } 

        } 

    }
}
