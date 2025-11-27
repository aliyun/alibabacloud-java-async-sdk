// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link CreateDatasetRequest} extends {@link RequestModel}
 *
 * <p>CreateDatasetRequest</p>
 */
public class CreateDatasetRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetMaxBindCount")
    private Long datasetMaxBindCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetMaxEntityCount")
    private Long datasetMaxEntityCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetMaxFileCount")
    private Long datasetMaxFileCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetMaxRelationCount")
    private Long datasetMaxRelationCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetMaxTotalFileSize")
    private Long datasetMaxTotalFileSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkflowParameters")
    private java.util.List<WorkflowParameter> workflowParameters;

    private CreateDatasetRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.datasetMaxBindCount = builder.datasetMaxBindCount;
        this.datasetMaxEntityCount = builder.datasetMaxEntityCount;
        this.datasetMaxFileCount = builder.datasetMaxFileCount;
        this.datasetMaxRelationCount = builder.datasetMaxRelationCount;
        this.datasetMaxTotalFileSize = builder.datasetMaxTotalFileSize;
        this.datasetName = builder.datasetName;
        this.description = builder.description;
        this.projectName = builder.projectName;
        this.templateId = builder.templateId;
        this.workflowParameters = builder.workflowParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasetRequest create() {
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
     * @return datasetMaxBindCount
     */
    public Long getDatasetMaxBindCount() {
        return this.datasetMaxBindCount;
    }

    /**
     * @return datasetMaxEntityCount
     */
    public Long getDatasetMaxEntityCount() {
        return this.datasetMaxEntityCount;
    }

    /**
     * @return datasetMaxFileCount
     */
    public Long getDatasetMaxFileCount() {
        return this.datasetMaxFileCount;
    }

    /**
     * @return datasetMaxRelationCount
     */
    public Long getDatasetMaxRelationCount() {
        return this.datasetMaxRelationCount;
    }

    /**
     * @return datasetMaxTotalFileSize
     */
    public Long getDatasetMaxTotalFileSize() {
        return this.datasetMaxTotalFileSize;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return workflowParameters
     */
    public java.util.List<WorkflowParameter> getWorkflowParameters() {
        return this.workflowParameters;
    }

    public static final class Builder extends Request.Builder<CreateDatasetRequest, Builder> {
        private String regionId; 
        private Long datasetMaxBindCount; 
        private Long datasetMaxEntityCount; 
        private Long datasetMaxFileCount; 
        private Long datasetMaxRelationCount; 
        private Long datasetMaxTotalFileSize; 
        private String datasetName; 
        private String description; 
        private String projectName; 
        private String templateId; 
        private java.util.List<WorkflowParameter> workflowParameters; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatasetRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.datasetMaxBindCount = request.datasetMaxBindCount;
            this.datasetMaxEntityCount = request.datasetMaxEntityCount;
            this.datasetMaxFileCount = request.datasetMaxFileCount;
            this.datasetMaxRelationCount = request.datasetMaxRelationCount;
            this.datasetMaxTotalFileSize = request.datasetMaxTotalFileSize;
            this.datasetName = request.datasetName;
            this.description = request.description;
            this.projectName = request.projectName;
            this.templateId = request.templateId;
            this.workflowParameters = request.workflowParameters;
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
         * <p>The maximum number of bindings per dataset. The range is 1~10, with a default value of 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder datasetMaxBindCount(Long datasetMaxBindCount) {
            this.putQueryParameter("DatasetMaxBindCount", datasetMaxBindCount);
            this.datasetMaxBindCount = datasetMaxBindCount;
            return this;
        }

        /**
         * <p>The maximum number of metadata entities in each dataset. The default value is 10000000000.</p>
         * 
         * <strong>example:</strong>
         * <p>10000000000</p>
         */
        public Builder datasetMaxEntityCount(Long datasetMaxEntityCount) {
            this.putQueryParameter("DatasetMaxEntityCount", datasetMaxEntityCount);
            this.datasetMaxEntityCount = datasetMaxEntityCount;
            return this;
        }

        /**
         * <p>The maximum number of files in each dataset. The range is 1~100000000, with a default value of 100000000.</p>
         * 
         * <strong>example:</strong>
         * <p>100000000</p>
         */
        public Builder datasetMaxFileCount(Long datasetMaxFileCount) {
            this.putQueryParameter("DatasetMaxFileCount", datasetMaxFileCount);
            this.datasetMaxFileCount = datasetMaxFileCount;
            return this;
        }

        /**
         * <p>The maximum number of metadata relationships in each dataset. The default value is 100000000000.</p>
         * 
         * <strong>example:</strong>
         * <p>100000000000</p>
         */
        public Builder datasetMaxRelationCount(Long datasetMaxRelationCount) {
            this.putQueryParameter("DatasetMaxRelationCount", datasetMaxRelationCount);
            this.datasetMaxRelationCount = datasetMaxRelationCount;
            return this;
        }

        /**
         * <p>The maximum total size of files in each dataset. Once the limit is exceeded, no more indexes can be added. The default value is 90000000000000000, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>90000000000000000</p>
         */
        public Builder datasetMaxTotalFileSize(Long datasetMaxTotalFileSize) {
            this.putQueryParameter("DatasetMaxTotalFileSize", datasetMaxTotalFileSize);
            this.datasetMaxTotalFileSize = datasetMaxTotalFileSize;
            return this;
        }

        /**
         * <p>The name of the dataset, which must be unique under the same Project. Naming rules are as follows:</p>
         * <ul>
         * <li>Length should be 1~128 characters.</li>
         * <li>Can only contain English letters, numbers, hyphens (-), and underscores (_).</li>
         * <li>Must start with an English letter or underscore (_).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset001</p>
         */
        public Builder datasetName(String datasetName) {
            this.putQueryParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * <p>Description of the dataset. The length should be 1~256 English or Chinese characters, with a default value of empty.</p>
         * 
         * <strong>example:</strong>
         * <p>immtest</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the project. For more information on how to obtain it, see <a href="https://help.aliyun.com/document_detail/478153.html">Create Project</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>Workflow template ID. For more information, see <a href="https://help.aliyun.com/document_detail/466304.html">Workflow Templates and Operators</a>. The default value is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>Official:ImageManagement</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>Invalid parameter.</p>
         */
        public Builder workflowParameters(java.util.List<WorkflowParameter> workflowParameters) {
            String workflowParametersShrink = shrink(workflowParameters, "WorkflowParameters", "json");
            this.putQueryParameter("WorkflowParameters", workflowParametersShrink);
            this.workflowParameters = workflowParameters;
            return this;
        }

        @Override
        public CreateDatasetRequest build() {
            return new CreateDatasetRequest(this);
        } 

    } 

}
