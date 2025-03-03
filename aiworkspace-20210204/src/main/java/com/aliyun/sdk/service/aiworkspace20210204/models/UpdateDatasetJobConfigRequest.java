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
 * {@link UpdateDatasetJobConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateDatasetJobConfigRequest</p>
 */
public class UpdateDatasetJobConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetJobConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetJobConfigId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigType")
    private String configType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private UpdateDatasetJobConfigRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.datasetJobConfigId = builder.datasetJobConfigId;
        this.config = builder.config;
        this.configType = builder.configType;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDatasetJobConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return datasetJobConfigId
     */
    public String getDatasetJobConfigId() {
        return this.datasetJobConfigId;
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateDatasetJobConfigRequest, Builder> {
        private String datasetId; 
        private String datasetJobConfigId; 
        private String config; 
        private String configType; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDatasetJobConfigRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.datasetJobConfigId = request.datasetJobConfigId;
            this.config = request.config;
            this.configType = request.configType;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-rbvg5*****jhc9ks92</p>
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dscfg-xxxxxxxxxxxx</p>
         */
        public Builder datasetJobConfigId(String datasetJobConfigId) {
            this.putPathParameter("DatasetJobConfigId", datasetJobConfigId);
            this.datasetJobConfigId = datasetJobConfigId;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * ConfigType.
         */
        public Builder configType(String configType) {
            this.putBodyParameter("ConfigType", configType);
            this.configType = configType;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateDatasetJobConfigRequest build() {
            return new UpdateDatasetJobConfigRequest(this);
        } 

    } 

}
