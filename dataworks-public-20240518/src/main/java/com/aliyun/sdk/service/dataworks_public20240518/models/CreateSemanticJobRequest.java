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
         * <p>The name of the semantic task, which is also the task identifier for subsequent calls to RunSemanticJob, DeleteSemanticJob, ListSemanticJobRuns, and DownloadSemanticResults. The name must be unique within the current tenant.</p>
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
         * <p>The ID of the DataWorks workspace. This parameter is required unless <code>Source.type</code> is set to <code>singleTableFile</code>. The <code>Data.ProjectId</code> in the creation result can be reused for GetSemanticJobDetail, GetSemanticJobLog, and KillSemanticJob.</p>
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
         * <p>The list of IDs of uploaded reference files. If <code>Source.type</code> is set to <code>singleTableFile</code>, this parameter and <code>ReferenceFileUris</code> are mutually exclusive, and the selected array must contain exactly one non-empty element. The ID must be obtained from <code>Data.FileId</code> returned by UploadSemanticFile, and the file only supports CSV or XLSX formats. For other <code>Source.type</code> values, you can pass multiple IDs. The service validates each ID during creation, and you can pass <code>ReferenceFileUris</code> at the same time.</p>
         */
        public Builder referenceFileIds(java.util.List<String> referenceFileIds) {
            String referenceFileIdsShrink = shrink(referenceFileIds, "ReferenceFileIds", "json");
            this.putBodyParameter("ReferenceFileIds", referenceFileIdsShrink);
            this.referenceFileIds = referenceFileIds;
            return this;
        }

        /**
         * <p>The list of URIs of reference files accessible to the caller. If <code>Source.type</code> is set to <code>singleTableFile</code>, this parameter and <code>ReferenceFileIds</code> are mutually exclusive, and the selected array must contain exactly one non-empty URI. For other <code>Source.type</code> values, you can pass multiple URIs, and you can pass <code>ReferenceFileIds</code> at the same time. When using the upload path of UploadSemanticFile, pass <code>Data.FileId</code> after the PUT upload is completed, instead of the short-lived <code>UploadUrl</code>.</p>
         */
        public Builder referenceFileUris(java.util.List<String> referenceFileUris) {
            String referenceFileUrisShrink = shrink(referenceFileUris, "ReferenceFileUris", "json");
            this.putBodyParameter("ReferenceFileUris", referenceFileUrisShrink);
            this.referenceFileUris = referenceFileUris;
            return this;
        }

        /**
         * <p>The identifier of the resource group used to run the semantic task. You do not need to pass this parameter when calling RunSemanticJob. The resource group saved during creation is used.</p>
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
         * <p>The input data source configuration for the semantic task. The type field is required. The configuration specifies the data to analyze. This configuration is distinct from the semantic_model YAML generated by the task. The domain field is a string that identifies the business domain and focus area for the task, such as sales. Supported data sources include the following. 1) maxcompute: Specify the scope by using pinnedScopeInfo. Array elements include type and name. If type is project, name is the MaxCompute project name. If type is schema, project is the project name and name is the schema name. For a table-level scope, project is the project name, schema is optional, and name is the table name. 2) holo or starrocks: In addition to type, you must specify dataSourceName and dataSourceEnv, and include ProjectId at the top level of the request. You can use pinnedScopeInfo to restrict the scope to a schema or table. The name element represents the schema or table name. For a table-level scope, schema represents the database or schema to which the table belongs. 3) singleTableFile: ProjectId is not required. For file reference rules, refer to ReferenceFileIds and ReferenceFileUris. After the task runs successfully, call DownloadSemanticResults to retrieve result files such as the semantic_model YAML. The example demonstrates a MaxCompute project scope.</p>
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
