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
 * {@link UpdateProjectRequest} extends {@link RequestModel}
 *
 * <p>UpdateProjectRequest</p>
 */
public class UpdateProjectRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectMaxDatasetCount")
    private Long projectMaxDatasetCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceRole")
    private String serviceRole;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    private UpdateProjectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.datasetMaxBindCount = builder.datasetMaxBindCount;
        this.datasetMaxEntityCount = builder.datasetMaxEntityCount;
        this.datasetMaxFileCount = builder.datasetMaxFileCount;
        this.datasetMaxRelationCount = builder.datasetMaxRelationCount;
        this.datasetMaxTotalFileSize = builder.datasetMaxTotalFileSize;
        this.description = builder.description;
        this.projectMaxDatasetCount = builder.projectMaxDatasetCount;
        this.projectName = builder.projectName;
        this.serviceRole = builder.serviceRole;
        this.tag = builder.tag;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProjectRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return projectMaxDatasetCount
     */
    public Long getProjectMaxDatasetCount() {
        return this.projectMaxDatasetCount;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return serviceRole
     */
    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<UpdateProjectRequest, Builder> {
        private String regionId; 
        private Long datasetMaxBindCount; 
        private Long datasetMaxEntityCount; 
        private Long datasetMaxFileCount; 
        private Long datasetMaxRelationCount; 
        private Long datasetMaxTotalFileSize; 
        private String description; 
        private Long projectMaxDatasetCount; 
        private String projectName; 
        private String serviceRole; 
        private java.util.List<Tag> tag; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProjectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.datasetMaxBindCount = request.datasetMaxBindCount;
            this.datasetMaxEntityCount = request.datasetMaxEntityCount;
            this.datasetMaxFileCount = request.datasetMaxFileCount;
            this.datasetMaxRelationCount = request.datasetMaxRelationCount;
            this.datasetMaxTotalFileSize = request.datasetMaxTotalFileSize;
            this.description = request.description;
            this.projectMaxDatasetCount = request.projectMaxDatasetCount;
            this.projectName = request.projectName;
            this.serviceRole = request.serviceRole;
            this.tag = request.tag;
            this.templateId = request.templateId;
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
         * <p>The maximum number of bindings per dataset. Valid values: 1 to 10.</p>
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
         * <p>The maximum number of metadata entities per dataset.</p>
         * <blockquote>
         * <p>Reserved parameter. No actual limit is imposed during use.</p>
         * </blockquote>
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
         * <p>The maximum number of files per dataset. Valid values: 1 to 100000000.</p>
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
         * <p>The maximum number of metadata relations per dataset.</p>
         * <blockquote>
         * <p>Reserved parameter. No actual limit is imposed during use.</p>
         * </blockquote>
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
         * <p>The maximum total size of files in each dataset. If the limit is exceeded, no more indexes can be added. Unit: bytes.</p>
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
         * <p>The description of the project. The description must be 1 to 256 characters in length.</p>
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
         * <p>The maximum number of datasets in the project. Valid values: 1 to 1000000000.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000000</p>
         */
        public Builder projectMaxDatasetCount(Long projectMaxDatasetCount) {
            this.putQueryParameter("ProjectMaxDatasetCount", projectMaxDatasetCount);
            this.projectMaxDatasetCount = projectMaxDatasetCount;
            return this;
        }

        /**
         * <p>The name of the project. For more information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
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
         * <p>The service role that is authorized for Intelligent Media Management (IMM) to access other cloud resources such as Object Storage Service (OSS).</p>
         * <p>To use a custom service role, you can create a regular service role in the Resource Access Management (RAM) console and grant permissions to the role. For more information, see <a href="https://help.aliyun.com/document_detail/116800.html">Create a regular service role</a> and <a href="https://help.aliyun.com/document_detail/116147.html">Grant permissions to a RAM role</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunIMMDefaultRole</p>
         */
        public Builder serviceRole(String serviceRole) {
            this.putQueryParameter("ServiceRole", serviceRole);
            this.serviceRole = serviceRole;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            String tagShrink = shrink(tag, "Tag", "json");
            this.putQueryParameter("Tag", tagShrink);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the workflow template. For more information, see <a href="https://help.aliyun.com/document_detail/466304.html">Workflow templates and operators</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Official:ImageManagement</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public UpdateProjectRequest build() {
            return new UpdateProjectRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateProjectRequest} extends {@link TeaModel}
     *
     * <p>UpdateProjectRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
