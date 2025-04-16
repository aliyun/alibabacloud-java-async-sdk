// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link CreatePipelineNodeRequest} extends {@link RequestModel}
 *
 * <p>CreatePipelineNodeRequest</p>
 */
public class CreatePipelineNodeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreatePipelineNodeCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreatePipelineNodeCommand createPipelineNodeCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private CreatePipelineNodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createPipelineNodeCommand = builder.createPipelineNodeCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePipelineNodeRequest create() {
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
     * @return createPipelineNodeCommand
     */
    public CreatePipelineNodeCommand getCreatePipelineNodeCommand() {
        return this.createPipelineNodeCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<CreatePipelineNodeRequest, Builder> {
        private String regionId; 
        private CreatePipelineNodeCommand createPipelineNodeCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePipelineNodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createPipelineNodeCommand = request.createPipelineNodeCommand;
            this.opTenantId = request.opTenantId;
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
         * <p>This parameter is required.</p>
         */
        public Builder createPipelineNodeCommand(CreatePipelineNodeCommand createPipelineNodeCommand) {
            String createPipelineNodeCommandShrink = shrink(createPipelineNodeCommand, "CreatePipelineNodeCommand", "json");
            this.putBodyParameter("CreatePipelineNodeCommand", createPipelineNodeCommandShrink);
            this.createPipelineNodeCommand = createPipelineNodeCommand;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        @Override
        public CreatePipelineNodeRequest build() {
            return new CreatePipelineNodeRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePipelineNodeRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineNodeRequest</p>
     */
    public static class FileInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Directory")
        private String directory;

        @com.aliyun.core.annotation.NameInMap("FileName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileName;

        private FileInfo(Builder builder) {
            this.description = builder.description;
            this.directory = builder.directory;
            this.fileName = builder.fileName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileInfo create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return directory
         */
        public String getDirectory() {
            return this.directory;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        public static final class Builder {
            private String description; 
            private String directory; 
            private String fileName; 

            private Builder() {
            } 

            private Builder(FileInfo model) {
                this.description = model.description;
                this.directory = model.directory;
                this.fileName = model.fileName;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Directory.
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test_pipeline</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            public FileInfo build() {
                return new FileInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePipelineNodeRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelineNodeRequest</p>
     */
    public static class CreatePipelineNodeCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileInfo")
        @com.aliyun.core.annotation.Validation(required = true)
        private FileInfo fileInfo;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("PipelineName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String pipelineName;

        @com.aliyun.core.annotation.NameInMap("PipelineType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String pipelineType;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        private CreatePipelineNodeCommand(Builder builder) {
            this.fileInfo = builder.fileInfo;
            this.nodeType = builder.nodeType;
            this.pipelineName = builder.pipelineName;
            this.pipelineType = builder.pipelineType;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreatePipelineNodeCommand create() {
            return builder().build();
        }

        /**
         * @return fileInfo
         */
        public FileInfo getFileInfo() {
            return this.fileInfo;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return pipelineName
         */
        public String getPipelineName() {
            return this.pipelineName;
        }

        /**
         * @return pipelineType
         */
        public String getPipelineType() {
            return this.pipelineType;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private FileInfo fileInfo; 
            private String nodeType; 
            private String pipelineName; 
            private String pipelineType; 
            private Long projectId; 

            private Builder() {
            } 

            private Builder(CreatePipelineNodeCommand model) {
                this.fileInfo = model.fileInfo;
                this.nodeType = model.nodeType;
                this.pipelineName = model.pipelineName;
                this.pipelineType = model.pipelineType;
                this.projectId = model.projectId;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder fileInfo(FileInfo fileInfo) {
                this.fileInfo = fileInfo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>REAL_TIME</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test_pipeline</p>
             */
            public Builder pipelineName(String pipelineName) {
                this.pipelineName = pipelineName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>REAL_TIME_PIPELINE</p>
             */
            public Builder pipelineType(String pipelineType) {
                this.pipelineType = pipelineType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>7091124176569088</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public CreatePipelineNodeCommand build() {
                return new CreatePipelineNodeCommand(this);
            } 

        } 

    }
}
