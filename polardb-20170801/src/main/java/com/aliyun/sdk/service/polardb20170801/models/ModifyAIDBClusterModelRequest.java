// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyAIDBClusterModelRequest} extends {@link RequestModel}
 *
 * <p>ModifyAIDBClusterModelRequest</p>
 */
public class ModifyAIDBClusterModelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayModelName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String displayModelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyAIDBClusterModelRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.displayModelName = builder.displayModelName;
        this.dryRun = builder.dryRun;
        this.modelName = builder.modelName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAIDBClusterModelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return displayModelName
     */
    public String getDisplayModelName() {
        return this.displayModelName;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyAIDBClusterModelRequest, Builder> {
        private String DBClusterId; 
        private String displayModelName; 
        private Boolean dryRun; 
        private String modelName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAIDBClusterModelRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.displayModelName = request.displayModelName;
            this.dryRun = request.dryRun;
            this.modelName = request.modelName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the PolarDB AI 3.0 logical instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pm-2ze4x2mwo81knj08a</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The new customer-facing invocation name. If this parameter is not specified, the existing invocation name is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>my-flagship-chat</p>
         */
        public Builder displayModelName(String displayModelName) {
            this.putQueryParameter("DisplayModelName", displayModelName);
            this.displayModelName = displayModelName;
            return this;
        }

        /**
         * <p>Specifies whether to only preview the change.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The name of the target model. Select a value from the ModelName values returned by the DescribeAvailableModels operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen3-32B</p>
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyAIDBClusterModelRequest build() {
            return new ModifyAIDBClusterModelRequest(this);
        } 

    } 

}
