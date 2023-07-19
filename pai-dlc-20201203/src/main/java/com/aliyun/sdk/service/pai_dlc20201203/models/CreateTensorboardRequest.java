// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTensorboardRequest} extends {@link RequestModel}
 *
 * <p>CreateTensorboardRequest</p>
 */
public class CreateTensorboardRequest extends Request {
    @Body
    @NameInMap("Cpu")
    private Long cpu;

    @Body
    @NameInMap("DataSourceId")
    private String dataSourceId;

    @Body
    @NameInMap("DataSourceType")
    private String dataSourceType;

    @Body
    @NameInMap("DataSources")
    private java.util.List < DataSourceItem > dataSources;

    @Body
    @NameInMap("DisplayName")
    private String displayName;

    @Body
    @NameInMap("JobId")
    private String jobId;

    @Body
    @NameInMap("MaxRunningTimeMinutes")
    private Long maxRunningTimeMinutes;

    @Body
    @NameInMap("Memory")
    private Long memory;

    @Body
    @NameInMap("Options")
    private String options;

    @Body
    @NameInMap("SourceId")
    private String sourceId;

    @Body
    @NameInMap("SourceType")
    private String sourceType;

    @Body
    @NameInMap("SummaryPath")
    private String summaryPath;

    @Body
    @NameInMap("SummaryRelativePath")
    private String summaryRelativePath;

    @Body
    @NameInMap("Uri")
    private String uri;

    @Body
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateTensorboardRequest(Builder builder) {
        super(builder);
        this.cpu = builder.cpu;
        this.dataSourceId = builder.dataSourceId;
        this.dataSourceType = builder.dataSourceType;
        this.dataSources = builder.dataSources;
        this.displayName = builder.displayName;
        this.jobId = builder.jobId;
        this.maxRunningTimeMinutes = builder.maxRunningTimeMinutes;
        this.memory = builder.memory;
        this.options = builder.options;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.summaryPath = builder.summaryPath;
        this.summaryRelativePath = builder.summaryRelativePath;
        this.uri = builder.uri;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTensorboardRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cpu
     */
    public Long getCpu() {
        return this.cpu;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return dataSources
     */
    public java.util.List < DataSourceItem > getDataSources() {
        return this.dataSources;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return maxRunningTimeMinutes
     */
    public Long getMaxRunningTimeMinutes() {
        return this.maxRunningTimeMinutes;
    }

    /**
     * @return memory
     */
    public Long getMemory() {
        return this.memory;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return summaryPath
     */
    public String getSummaryPath() {
        return this.summaryPath;
    }

    /**
     * @return summaryRelativePath
     */
    public String getSummaryRelativePath() {
        return this.summaryRelativePath;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateTensorboardRequest, Builder> {
        private Long cpu; 
        private String dataSourceId; 
        private String dataSourceType; 
        private java.util.List < DataSourceItem > dataSources; 
        private String displayName; 
        private String jobId; 
        private Long maxRunningTimeMinutes; 
        private Long memory; 
        private String options; 
        private String sourceId; 
        private String sourceType; 
        private String summaryPath; 
        private String summaryRelativePath; 
        private String uri; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTensorboardRequest request) {
            super(request);
            this.cpu = request.cpu;
            this.dataSourceId = request.dataSourceId;
            this.dataSourceType = request.dataSourceType;
            this.dataSources = request.dataSources;
            this.displayName = request.displayName;
            this.jobId = request.jobId;
            this.maxRunningTimeMinutes = request.maxRunningTimeMinutes;
            this.memory = request.memory;
            this.options = request.options;
            this.sourceId = request.sourceId;
            this.sourceType = request.sourceType;
            this.summaryPath = request.summaryPath;
            this.summaryRelativePath = request.summaryRelativePath;
            this.uri = request.uri;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * Cpu.
         */
        public Builder cpu(Long cpu) {
            this.putBodyParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * DataSourceId.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putBodyParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * DataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putBodyParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * DataSources.
         */
        public Builder dataSources(java.util.List < DataSourceItem > dataSources) {
            this.putBodyParameter("DataSources", dataSources);
            this.dataSources = dataSources;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * MaxRunningTimeMinutes.
         */
        public Builder maxRunningTimeMinutes(Long maxRunningTimeMinutes) {
            this.putBodyParameter("MaxRunningTimeMinutes", maxRunningTimeMinutes);
            this.maxRunningTimeMinutes = maxRunningTimeMinutes;
            return this;
        }

        /**
         * Memory.
         */
        public Builder memory(Long memory) {
            this.putBodyParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * Options.
         */
        public Builder options(String options) {
            this.putBodyParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * SourceId.
         */
        public Builder sourceId(String sourceId) {
            this.putBodyParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * SummaryPath.
         */
        public Builder summaryPath(String summaryPath) {
            this.putBodyParameter("SummaryPath", summaryPath);
            this.summaryPath = summaryPath;
            return this;
        }

        /**
         * SummaryRelativePath.
         */
        public Builder summaryRelativePath(String summaryRelativePath) {
            this.putBodyParameter("SummaryRelativePath", summaryRelativePath);
            this.summaryRelativePath = summaryRelativePath;
            return this;
        }

        /**
         * Uri.
         */
        public Builder uri(String uri) {
            this.putBodyParameter("Uri", uri);
            this.uri = uri;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateTensorboardRequest build() {
            return new CreateTensorboardRequest(this);
        } 

    } 

}
