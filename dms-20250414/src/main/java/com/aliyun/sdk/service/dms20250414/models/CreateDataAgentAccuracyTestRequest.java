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
 * {@link CreateDataAgentAccuracyTestRequest} extends {@link RequestModel}
 *
 * <p>CreateDataAgentAccuracyTestRequest</p>
 */
public class CreateDataAgentAccuracyTestRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomAgentId")
    private String customAgentId;

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
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

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

    private CreateDataAgentAccuracyTestRequest(Builder builder) {
        super(builder);
        this.customAgentId = builder.customAgentId;
        this.dataset = builder.dataset;
        this.datasource = builder.datasource;
        this.desc = builder.desc;
        this.dmsUnit = builder.dmsUnit;
        this.evaluationPrompt = builder.evaluationPrompt;
        this.fileId = builder.fileId;
        this.language = builder.language;
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

    public static CreateDataAgentAccuracyTestRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customAgentId
     */
    public String getCustomAgentId() {
        return this.customAgentId;
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
     * @return language
     */
    public String getLanguage() {
        return this.language;
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

    public static final class Builder extends Request.Builder<CreateDataAgentAccuracyTestRequest, Builder> {
        private String customAgentId; 
        private String dataset; 
        private String datasource; 
        private String desc; 
        private String dmsUnit; 
        private String evaluationPrompt; 
        private String fileId; 
        private String language; 
        private Integer maxConcurrent; 
        private Integer mode; 
        private String name; 
        private Boolean needDelete; 
        private String regionId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataAgentAccuracyTestRequest request) {
            super(request);
            this.customAgentId = request.customAgentId;
            this.dataset = request.dataset;
            this.datasource = request.datasource;
            this.desc = request.desc;
            this.dmsUnit = request.dmsUnit;
            this.evaluationPrompt = request.evaluationPrompt;
            this.fileId = request.fileId;
            this.language = request.language;
            this.maxConcurrent = request.maxConcurrent;
            this.mode = request.mode;
            this.name = request.name;
            this.needDelete = request.needDelete;
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The ID of the custom agent to be tested for accuracy.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-xxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder customAgentId(String customAgentId) {
            this.putQueryParameter("CustomAgentId", customAgentId);
            this.customAgentId = customAgentId;
            return this;
        }

        /**
         * <p>Deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder dataset(String dataset) {
            this.putQueryParameter("Dataset", dataset);
            this.dataset = dataset;
            return this;
        }

        /**
         * <p>The data source. We recommend that you configure this in the custom agent.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;isInternal&quot;:&quot;N&quot;,&quot;TableIds&quot;:[&quot;51<em><strong>70&quot;,&quot;51</strong></em>71&quot;],&quot;DataSourceType&quot;:&quot;database&quot;,&quot;Database&quot;:&quot;internal_data_employees&quot;,&quot;DmsInstanceId&quot;:&quot;27<em><strong>5&quot;,&quot;DmsDatabaseId&quot;:&quot;71</strong></em>04&quot;,&quot;Tables&quot;:[&quot;employees&quot;,&quot;salaries&quot;],&quot;FileId&quot;:&quot;rm-
         * ***&quot;,&quot;DbName&quot;:&quot;internal_data_employees&quot;,&quot;CatalogName&quot;:&quot;def&quot;,&quot;RegionId&quot;:&quot;cn-hangzhou&quot;,&quot;Engine&quot;:&quot;mysql&quot;}]</p>
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
         * <p>The DMS unit used to create the resource.</p>
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
         * <p>f-xxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The language used for the analysis task.</p>
         * 
         * <strong>example:</strong>
         * <p>ENGLISH</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
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
         * <p>The analysis mode.</p>
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
         * <p>Test01</p>
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
         * <p>null</p>
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
         * <p>xxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateDataAgentAccuracyTestRequest build() {
            return new CreateDataAgentAccuracyTestRequest(this);
        } 

    } 

}
