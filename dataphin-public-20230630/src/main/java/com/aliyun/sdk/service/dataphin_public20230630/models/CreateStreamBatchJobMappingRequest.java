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
 * {@link CreateStreamBatchJobMappingRequest} extends {@link RequestModel}
 *
 * <p>CreateStreamBatchJobMappingRequest</p>
 */
public class CreateStreamBatchJobMappingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StreamBatchJobMappingCreateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private StreamBatchJobMappingCreateCommand streamBatchJobMappingCreateCommand;

    private CreateStreamBatchJobMappingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.streamBatchJobMappingCreateCommand = builder.streamBatchJobMappingCreateCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStreamBatchJobMappingRequest create() {
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
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return streamBatchJobMappingCreateCommand
     */
    public StreamBatchJobMappingCreateCommand getStreamBatchJobMappingCreateCommand() {
        return this.streamBatchJobMappingCreateCommand;
    }

    public static final class Builder extends Request.Builder<CreateStreamBatchJobMappingRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private StreamBatchJobMappingCreateCommand streamBatchJobMappingCreateCommand; 

        private Builder() {
            super();
        } 

        private Builder(CreateStreamBatchJobMappingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.streamBatchJobMappingCreateCommand = request.streamBatchJobMappingCreateCommand;
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
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder streamBatchJobMappingCreateCommand(StreamBatchJobMappingCreateCommand streamBatchJobMappingCreateCommand) {
            String streamBatchJobMappingCreateCommandShrink = shrink(streamBatchJobMappingCreateCommand, "StreamBatchJobMappingCreateCommand", "json");
            this.putBodyParameter("StreamBatchJobMappingCreateCommand", streamBatchJobMappingCreateCommandShrink);
            this.streamBatchJobMappingCreateCommand = streamBatchJobMappingCreateCommand;
            return this;
        }

        @Override
        public CreateStreamBatchJobMappingRequest build() {
            return new CreateStreamBatchJobMappingRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateStreamBatchJobMappingRequest} extends {@link TeaModel}
     *
     * <p>CreateStreamBatchJobMappingRequest</p>
     */
    public static class StreamBatchJobMappingCreateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Directory")
        @com.aliyun.core.annotation.Validation(required = true)
        private String directory;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        @com.aliyun.core.annotation.Validation(required = true)
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("Env")
        @com.aliyun.core.annotation.Validation(required = true)
        private String env;

        @com.aliyun.core.annotation.NameInMap("FileName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("VvpClusterType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vvpClusterType;

        private StreamBatchJobMappingCreateCommand(Builder builder) {
            this.clusterId = builder.clusterId;
            this.description = builder.description;
            this.directory = builder.directory;
            this.engineVersion = builder.engineVersion;
            this.env = builder.env;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.projectId = builder.projectId;
            this.queueName = builder.queueName;
            this.vvpClusterType = builder.vvpClusterType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamBatchJobMappingCreateCommand create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
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
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return vvpClusterType
         */
        public String getVvpClusterType() {
            return this.vvpClusterType;
        }

        public static final class Builder {
            private String clusterId; 
            private String description; 
            private String directory; 
            private String engineVersion; 
            private String env; 
            private String fileName; 
            private String fileType; 
            private Long projectId; 
            private String queueName; 
            private String vvpClusterType; 

            private Builder() {
            } 

            private Builder(StreamBatchJobMappingCreateCommand model) {
                this.clusterId = model.clusterId;
                this.description = model.description;
                this.directory = model.directory;
                this.engineVersion = model.engineVersion;
                this.env = model.env;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.projectId = model.projectId;
                this.queueName = model.queueName;
                this.vvpClusterType = model.vvpClusterType;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>61187014-a3ba-4cdd-8609-1f0aa3df4a3d</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>/karel</p>
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>vvr-8.0.9-flink-1.17</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DEV</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>karel_hover_3</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>FLINK_SQL</p>
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>7081229106458752</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>default-queue</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PREJOB</p>
             */
            public Builder vvpClusterType(String vvpClusterType) {
                this.vvpClusterType = vvpClusterType;
                return this;
            }

            public StreamBatchJobMappingCreateCommand build() {
                return new StreamBatchJobMappingCreateCommand(this);
            } 

        } 

    }
}
