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
    @com.aliyun.core.annotation.NameInMap("Datasource")
    private String datasource;

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
        this.datasource = builder.datasource;
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
     * @return datasource
     */
    public String getDatasource() {
        return this.datasource;
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
        private String datasource; 
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
            this.datasource = request.datasource;
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
         * <p>The accuracy test instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>at-106n4rg17gv9fxxxxxxxxxx</p>
         */
        public Builder accuracyTestInsId(String accuracyTestInsId) {
            this.putQueryParameter("AccuracyTestInsId", accuracyTestInsId);
            this.accuracyTestInsId = accuracyTestInsId;
            return this;
        }

        /**
         * <p>The new custom agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-xxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder customerAgentId(String customerAgentId) {
            this.putQueryParameter("CustomerAgentId", customerAgentId);
            this.customerAgentId = customerAgentId;
            return this;
        }

        /**
         * <p>The data source.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;DataSourceType\&quot;:\&quot;database\&quot;,\&quot;RegionId\&quot;:\&quot;cn-hangzhou\&quot;,\&quot;DmsInstanceId\&quot;:\&quot;27xxxxx\&quot;,\&quot;DmsDatabaseId\&quot;:\&quot;752xxxxx\&quot;,\&quot;Database\&quot;:\&quot;employees\&quot;,\&quot;Tables\&quot;:[\&quot;employees\&quot;,\&quot;salaries\&quot;,\&quot;departments\&quot;]}]</p>
         */
        public Builder dataset(String dataset) {
            this.putQueryParameter("Dataset", dataset);
            this.dataset = dataset;
            return this;
        }

        /**
         * Datasource.
         */
        public Builder datasource(String datasource) {
            this.putQueryParameter("Datasource", datasource);
            this.datasource = datasource;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder desc(String desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * <p>The current Data Management unit.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder dmsUnit(String dmsUnit) {
            this.putQueryParameter("DmsUnit", dmsUnit);
            this.dmsUnit = dmsUnit;
            return this;
        }

        /**
         * <p>The accuracy evaluation criteria. An empty value indicates the default criteria.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder evaluationPrompt(String evaluationPrompt) {
            this.putQueryParameter("EvaluationPrompt", evaluationPrompt);
            this.evaluationPrompt = evaluationPrompt;
            return this;
        }

        /**
         * <p>The file ID in the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>f-8*******01m</p>
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The maximum number of concurrent sessions during the test.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder maxConcurrent(Integer maxConcurrent) {
            this.putQueryParameter("MaxConcurrent", maxConcurrent);
            this.maxConcurrent = maxConcurrent;
            return this;
        }

        /**
         * <p>The analysis mode to be tested.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder mode(Integer mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The name of the test item.</p>
         * 
         * <strong>example:</strong>
         * <p>test123</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Specifies whether sessions are displayed after analysis. This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>no use</p>
         */
        public Builder needDelete(Boolean needDelete) {
            this.putQueryParameter("NeedDelete", needDelete);
            this.needDelete = needDelete;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8wfig6l33n4f4xxxxxxxxxx</p>
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
