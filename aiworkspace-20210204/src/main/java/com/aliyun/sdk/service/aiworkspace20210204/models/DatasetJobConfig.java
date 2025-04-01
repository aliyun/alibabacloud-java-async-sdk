// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link DatasetJobConfig} extends {@link TeaModel}
 *
 * <p>DatasetJobConfig</p>
 */
public class DatasetJobConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("ConfigType")
    private String configType;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DatasetJobConfigId")
    private String datasetJobConfigId;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private String modifyTime;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private DatasetJobConfig(Builder builder) {
        this.config = builder.config;
        this.configType = builder.configType;
        this.createTime = builder.createTime;
        this.datasetJobConfigId = builder.datasetJobConfigId;
        this.modifyTime = builder.modifyTime;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatasetJobConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return datasetJobConfigId
     */
    public String getDatasetJobConfigId() {
        return this.datasetJobConfigId;
    }

    /**
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String config; 
        private String configType; 
        private String createTime; 
        private String datasetJobConfigId; 
        private String modifyTime; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(DatasetJobConfig model) {
            this.config = model.config;
            this.configType = model.configType;
            this.createTime = model.createTime;
            this.datasetJobConfigId = model.datasetJobConfigId;
            this.modifyTime = model.modifyTime;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * Config.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * ConfigType.
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DatasetJobConfigId.
         */
        public Builder datasetJobConfigId(String datasetJobConfigId) {
            this.datasetJobConfigId = datasetJobConfigId;
            return this;
        }

        /**
         * ModifyTime.
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public DatasetJobConfig build() {
            return new DatasetJobConfig(this);
        } 

    } 

}
