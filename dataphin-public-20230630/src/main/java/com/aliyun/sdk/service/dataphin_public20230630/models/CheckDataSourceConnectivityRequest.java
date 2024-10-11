// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckDataSourceConnectivityRequest} extends {@link RequestModel}
 *
 * <p>CheckDataSourceConnectivityRequest</p>
 */
public class CheckDataSourceConnectivityRequest extends Request {
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

    private CheckDataSourceConnectivityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.checkCommand = builder.checkCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDataSourceConnectivityRequest create() {
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

    public static final class Builder extends Request.Builder<CheckDataSourceConnectivityRequest, Builder> {
        private String regionId; 
        private CheckCommand checkCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(CheckDataSourceConnectivityRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.checkCommand = request.checkCommand;
            this.opTenantId = request.opTenantId;
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

        @Override
        public CheckDataSourceConnectivityRequest build() {
            return new CheckDataSourceConnectivityRequest(this);
        } 

    } 

    /**
     * 
     * {@link CheckDataSourceConnectivityRequest} extends {@link TeaModel}
     *
     * <p>CheckDataSourceConnectivityRequest</p>
     */
    public static class ConfigItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
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

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
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
     * {@link CheckDataSourceConnectivityRequest} extends {@link TeaModel}
     *
     * <p>CheckDataSourceConnectivityRequest</p>
     */
    public static class CheckCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigItemList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < ConfigItemList> configItemList;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private CheckCommand(Builder builder) {
            this.configItemList = builder.configItemList;
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
        public java.util.List < ConfigItemList> getConfigItemList() {
            return this.configItemList;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < ConfigItemList> configItemList; 
            private String type; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder configItemList(java.util.List < ConfigItemList> configItemList) {
                this.configItemList = configItemList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>MAX_COMPUTE</p>
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
