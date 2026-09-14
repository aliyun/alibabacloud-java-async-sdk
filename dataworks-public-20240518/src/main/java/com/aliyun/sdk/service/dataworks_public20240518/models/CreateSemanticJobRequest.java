// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateSemanticJobRequest} extends {@link RequestModel}
 *
 * <p>CreateSemanticJobRequest</p>
 */
public class CreateSemanticJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReferenceFileIds")
    private java.util.List<String> referenceFileIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReferenceFileUris")
    private java.util.List<String> referenceFileUris;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Source")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> source;

    private CreateSemanticJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.referenceFileIds = builder.referenceFileIds;
        this.referenceFileUris = builder.referenceFileUris;
        this.resourceGroupId = builder.resourceGroupId;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSemanticJobRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return referenceFileIds
     */
    public java.util.List<String> getReferenceFileIds() {
        return this.referenceFileIds;
    }

    /**
     * @return referenceFileUris
     */
    public java.util.List<String> getReferenceFileUris() {
        return this.referenceFileUris;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return source
     */
    public java.util.Map<String, ?> getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<CreateSemanticJobRequest, Builder> {
        private String regionId; 
        private String name; 
        private Long projectId; 
        private java.util.List<String> referenceFileIds; 
        private java.util.List<String> referenceFileUris; 
        private String resourceGroupId; 
        private java.util.Map<String, ?> source; 

        private Builder() {
            super();
        } 

        private Builder(CreateSemanticJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.name = request.name;
            this.projectId = request.projectId;
            this.referenceFileIds = request.referenceFileIds;
            this.referenceFileUris = request.referenceFileUris;
            this.resourceGroupId = request.resourceGroupId;
            this.source = request.source;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The semantic job name, which also serves as the job identifier for subsequent calls to RunSemanticJob, DeleteSemanticJob, ListSemanticJobRuns, and DownloadSemanticResults. The name must be unique within the current tenant.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>semantic-job-demo</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID. This parameter is required for all Source.type values except singleTableFile. The Data.ProjectId in the creation result can be reused for GetSemanticJobDetail, GetSemanticJobLog, and KillSemanticJob.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The list of uploaded reference file IDs. When Source.type=singleTableFile, use either this parameter or ReferenceFileUris, and the selected array must contain exactly one non-empty element. The ID must come from Data.FileId returned by UploadSemanticFile, and only CSV or XLSX files are supported. For other Source.type values, you can pass multiple IDs. The service validates each ID during creation, and you can also pass ReferenceFileUris at the same time.</p>
         */
        public Builder referenceFileIds(java.util.List<String> referenceFileIds) {
            String referenceFileIdsShrink = shrink(referenceFileIds, "ReferenceFileIds", "json");
            this.putBodyParameter("ReferenceFileIds", referenceFileIdsShrink);
            this.referenceFileIds = referenceFileIds;
            return this;
        }

        /**
         * <p>The list of reference file URIs accessible by the caller. When Source.type=singleTableFile, use either this parameter or ReferenceFileIds, and the selected array must contain exactly one non-empty URI. For other Source.type values, you can pass multiple URIs and also pass ReferenceFileIds at the same time. When using the upload path from UploadSemanticFile, pass Data.FileId after the PUT upload is complete instead of the short-lived UploadUrl.</p>
         */
        public Builder referenceFileUris(java.util.List<String> referenceFileUris) {
            String referenceFileUrisShrink = shrink(referenceFileUris, "ReferenceFileUris", "json");
            this.putBodyParameter("ReferenceFileUris", referenceFileUrisShrink);
            this.referenceFileUris = referenceFileUris;
            return this;
        }

        /**
         * <p>The ID of the resource group used to run the semantic job. RunSemanticJob does not accept this parameter and instead uses the resource group saved during creation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-demo</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The input datasource config for the semantic node. The type field is required. This parameter specifies the data to be analyzed and is not the semantic_model YAML output. The domain field is a character string that serves as the identity of the business domain and focus of the node, such as sales. Supported types: 1) maxcompute: Use pinnedScopeInfo to specify the scope. Array elements contain type and name. When type=project, name is the MaxCompute project name. When type=schema, project is the project name and name is the schema name. For table-level scope, project is the project name, schema is optional, and name is the table name. 2) holo or starrocks: In addition to type, you must specify dataSourceName and dataSourceEnv, and pass ProjectId at the top level of the request. You can use pinnedScopeInfo to limit the scope to schemas or tables. The name element is the schema or table name, and the schema element for table-level scope is the database or schema. 3) singleTableFile: ProjectId is not required. For file reference rules, see ReferenceFileIds and ReferenceFileUris. After the node runs successfully, use DownloadSemanticResults to retrieve the semantic_model YAML and other result files. The example shows a MaxCompute project-level scope.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;maxcompute&quot;,&quot;domain&quot;:&quot;sales&quot;,&quot;pinnedScopeInfo&quot;:[{&quot;type&quot;:&quot;project&quot;,&quot;name&quot;:&quot;mc_project&quot;}]}</p>
         */
        public Builder source(java.util.Map<String, ?> source) {
            String sourceShrink = shrink(source, "Source", "json");
            this.putBodyParameter("Source", sourceShrink);
            this.source = source;
            return this;
        }

        @Override
        public CreateSemanticJobRequest build() {
            return new CreateSemanticJobRequest(this);
        } 

    } 

}
