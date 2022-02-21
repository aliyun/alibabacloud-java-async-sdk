// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigAIActionRequest} extends {@link RequestModel}
 *
 * <p>ConfigAIActionRequest</p>
 */
public class ConfigAIActionRequest extends Request {
    @Query
    @NameInMap("ActionId")
    @Validation(required = true)
    private String actionId;

    @Query
    @NameInMap("AlgoConfig")
    private String algoConfig;

    @Query
    @NameInMap("DataTypeConfigList")
    private java.util.List < DataTypeConfigList> dataTypeConfigList;

    private ConfigAIActionRequest(Builder builder) {
        super(builder);
        this.actionId = builder.actionId;
        this.algoConfig = builder.algoConfig;
        this.dataTypeConfigList = builder.dataTypeConfigList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigAIActionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionId
     */
    public String getActionId() {
        return this.actionId;
    }

    /**
     * @return algoConfig
     */
    public String getAlgoConfig() {
        return this.algoConfig;
    }

    /**
     * @return dataTypeConfigList
     */
    public java.util.List < DataTypeConfigList> getDataTypeConfigList() {
        return this.dataTypeConfigList;
    }

    public static final class Builder extends Request.Builder<ConfigAIActionRequest, Builder> {
        private String actionId; 
        private String algoConfig; 
        private java.util.List < DataTypeConfigList> dataTypeConfigList; 

        private Builder() {
            super();
        } 

        private Builder(ConfigAIActionRequest response) {
            super(response);
            this.actionId = response.actionId;
            this.algoConfig = response.algoConfig;
            this.dataTypeConfigList = response.dataTypeConfigList;
        } 

        /**
         * ActionId.
         */
        public Builder actionId(String actionId) {
            this.putQueryParameter("ActionId", actionId);
            this.actionId = actionId;
            return this;
        }

        /**
         * AlgoConfig.
         */
        public Builder algoConfig(String algoConfig) {
            this.putQueryParameter("AlgoConfig", algoConfig);
            this.algoConfig = algoConfig;
            return this;
        }

        /**
         * DataTypeConfigList.
         */
        public Builder dataTypeConfigList(java.util.List < DataTypeConfigList> dataTypeConfigList) {
            this.putQueryParameter("DataTypeConfigList", dataTypeConfigList);
            this.dataTypeConfigList = dataTypeConfigList;
            return this;
        }

        @Override
        public ConfigAIActionRequest build() {
            return new ConfigAIActionRequest(this);
        } 

    } 

    public static class DataTypeConfigList extends TeaModel {
        @NameInMap("Configs")
        @Validation(required = true)
        private String configs;

        @NameInMap("DataType")
        @Validation(required = true)
        private String dataType;

        private DataTypeConfigList(Builder builder) {
            this.configs = builder.configs;
            this.dataType = builder.dataType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataTypeConfigList create() {
            return builder().build();
        }

        /**
         * @return configs
         */
        public String getConfigs() {
            return this.configs;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        public static final class Builder {
            private String configs; 
            private String dataType; 

            /**
             * Configs.
             */
            public Builder configs(String configs) {
                this.configs = configs;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            public DataTypeConfigList build() {
                return new DataTypeConfigList(this);
            } 

        } 

    }
}
