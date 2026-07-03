// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link UpdateDataAgentAccuracyTestRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataAgentAccuracyTestRequest</p>
 */
public class UpdateDataAgentAccuracyTestRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccuracyTestInsId")
    private String accuracyTestInsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerAgentId")
    private String customerAgentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dataset")
    private String dataset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Desc")
    private String desc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DmsUnit")
    private String dmsUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EvaluationPrompt")
    private String evaluationPrompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileId")
    private String fileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxConcurrent")
    private Integer maxConcurrent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private Integer mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedDelete")
    private Boolean needDelete;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private UpdateDataAgentAccuracyTestRequest(Builder builder) {
        super(builder);
        this.accuracyTestInsId = builder.accuracyTestInsId;
        this.customerAgentId = builder.customerAgentId;
        this.dataset = builder.dataset;
        this.desc = builder.desc;
        this.dmsUnit = builder.dmsUnit;
        this.evaluationPrompt = builder.evaluationPrompt;
        this.fileId = builder.fileId;
        this.maxConcurrent = builder.maxConcurrent;
        this.mode = builder.mode;
        this.name = builder.name;
        this.needDelete = builder.needDelete;
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataAgentAccuracyTestRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accuracyTestInsId
     */
    public String getAccuracyTestInsId() {
        return this.accuracyTestInsId;
    }

    /**
     * @return customerAgentId
     */
    public String getCustomerAgentId() {
        return this.customerAgentId;
    }

    /**
     * @return dataset
     */
    public String getDataset() {
        return this.dataset;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return dmsUnit
     */
    public String getDmsUnit() {
        return this.dmsUnit;
    }

    /**
     * @return evaluationPrompt
     */
    public String getEvaluationPrompt() {
        return this.evaluationPrompt;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return maxConcurrent
     */
    public Integer getMaxConcurrent() {
        return this.maxConcurrent;
    }

    /**
     * @return mode
     */
    public Integer getMode() {
        return this.mode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return needDelete
     */
    public Boolean getNeedDelete() {
        return this.needDelete;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateDataAgentAccuracyTestRequest, Builder> {
        private String accuracyTestInsId; 
        private String customerAgentId; 
        private String dataset; 
        private String desc; 
        private String dmsUnit; 
        private String evaluationPrompt; 
        private String fileId; 
        private Integer maxConcurrent; 
        private Integer mode; 
        private String name; 
        private Boolean needDelete; 
        private String regionId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataAgentAccuracyTestRequest request) {
            super(request);
            this.accuracyTestInsId = request.accuracyTestInsId;
            this.customerAgentId = request.customerAgentId;
            this.dataset = request.dataset;
            this.desc = request.desc;
            this.dmsUnit = request.dmsUnit;
            this.evaluationPrompt = request.evaluationPrompt;
            this.fileId = request.fileId;
            this.maxConcurrent = request.maxConcurrent;
            this.mode = request.mode;
            this.name = request.name;
            this.needDelete = request.needDelete;
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * AccuracyTestInsId.
         */
        public Builder accuracyTestInsId(String accuracyTestInsId) {
            this.putQueryParameter("AccuracyTestInsId", accuracyTestInsId);
            this.accuracyTestInsId = accuracyTestInsId;
            return this;
        }

        /**
         * CustomerAgentId.
         */
        public Builder customerAgentId(String customerAgentId) {
            this.putQueryParameter("CustomerAgentId", customerAgentId);
            this.customerAgentId = customerAgentId;
            return this;
        }

        /**
         * Dataset.
         */
        public Builder dataset(String dataset) {
            this.putQueryParameter("Dataset", dataset);
            this.dataset = dataset;
            return this;
        }

        /**
         * Desc.
         */
        public Builder desc(String desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * DmsUnit.
         */
        public Builder dmsUnit(String dmsUnit) {
            this.putQueryParameter("DmsUnit", dmsUnit);
            this.dmsUnit = dmsUnit;
            return this;
        }

        /**
         * EvaluationPrompt.
         */
        public Builder evaluationPrompt(String evaluationPrompt) {
            this.putQueryParameter("EvaluationPrompt", evaluationPrompt);
            this.evaluationPrompt = evaluationPrompt;
            return this;
        }

        /**
         * FileId.
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * MaxConcurrent.
         */
        public Builder maxConcurrent(Integer maxConcurrent) {
            this.putQueryParameter("MaxConcurrent", maxConcurrent);
            this.maxConcurrent = maxConcurrent;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(Integer mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NeedDelete.
         */
        public Builder needDelete(Boolean needDelete) {
            this.putQueryParameter("NeedDelete", needDelete);
            this.needDelete = needDelete;
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
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateDataAgentAccuracyTestRequest build() {
            return new UpdateDataAgentAccuracyTestRequest(this);
        } 

    } 

}
