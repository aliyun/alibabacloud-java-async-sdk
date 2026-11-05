// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeDataProcessJobAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataProcessJobAttributeResponseBody</p>
 */
public class DescribeDataProcessJobAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("DestinationConfig")
    private String destinationConfig;

    @com.aliyun.core.annotation.NameInMap("DestinationId")
    private String destinationId;

    @com.aliyun.core.annotation.NameInMap("DestinationPath")
    private String destinationPath;

    @com.aliyun.core.annotation.NameInMap("DestinationType")
    private String destinationType;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("ModelName")
    private String modelName;

    @com.aliyun.core.annotation.NameInMap("ProcessingMode")
    private String processingMode;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceId")
    private String sourceId;

    @com.aliyun.core.annotation.NameInMap("SourcePath")
    private String sourcePath;

    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private String templateType;

    private DescribeDataProcessJobAttributeResponseBody(Builder builder) {
        this.creationTime = builder.creationTime;
        this.destinationConfig = builder.destinationConfig;
        this.destinationId = builder.destinationId;
        this.destinationPath = builder.destinationPath;
        this.destinationType = builder.destinationType;
        this.jobId = builder.jobId;
        this.modelName = builder.modelName;
        this.processingMode = builder.processingMode;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.sourceId = builder.sourceId;
        this.sourcePath = builder.sourcePath;
        this.sourceType = builder.sourceType;
        this.status = builder.status;
        this.templateId = builder.templateId;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataProcessJobAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return destinationConfig
     */
    public String getDestinationConfig() {
        return this.destinationConfig;
    }

    /**
     * @return destinationId
     */
    public String getDestinationId() {
        return this.destinationId;
    }

    /**
     * @return destinationPath
     */
    public String getDestinationPath() {
        return this.destinationPath;
    }

    /**
     * @return destinationType
     */
    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return processingMode
     */
    public String getProcessingMode() {
        return this.processingMode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourcePath
     */
    public String getSourcePath() {
        return this.sourcePath;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder {
        private String creationTime; 
        private String destinationConfig; 
        private String destinationId; 
        private String destinationPath; 
        private String destinationType; 
        private String jobId; 
        private String modelName; 
        private String processingMode; 
        private String regionId; 
        private String requestId; 
        private String sourceId; 
        private String sourcePath; 
        private String sourceType; 
        private String status; 
        private String templateId; 
        private String templateType; 

        private Builder() {
        } 

        private Builder(DescribeDataProcessJobAttributeResponseBody model) {
            this.creationTime = model.creationTime;
            this.destinationConfig = model.destinationConfig;
            this.destinationId = model.destinationId;
            this.destinationPath = model.destinationPath;
            this.destinationType = model.destinationType;
            this.jobId = model.jobId;
            this.modelName = model.modelName;
            this.processingMode = model.processingMode;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.sourceId = model.sourceId;
            this.sourcePath = model.sourcePath;
            this.sourceType = model.sourceType;
            this.status = model.status;
            this.templateId = model.templateId;
            this.templateType = model.templateType;
        } 

        /**
         * <p>The time when the job was created, in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01T00:00:00Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The JSON string of the destination database connection configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Account&quot;:&quot;example_user&quot;,&quot;Password&quot;:&quot;example_password&quot;}</p>
         */
        public Builder destinationConfig(String destinationConfig) {
            this.destinationConfig = destinationConfig;
            return this;
        }

        /**
         * <p>The ID of the destination PolarDB cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-test123456</p>
         */
        public Builder destinationId(String destinationId) {
            this.destinationId = destinationId;
            return this;
        }

        /**
         * <p>The name of the destination database.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        public Builder destinationPath(String destinationPath) {
            this.destinationPath = destinationPath;
            return this;
        }

        /**
         * <p>The destination type. Currently, only PolarDB is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>PolarDB</p>
         */
        public Builder destinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }

        /**
         * <p>The ID of the data processing job.</p>
         * 
         * <strong>example:</strong>
         * <p>job-123456</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The name of the model used for feature extraction.</p>
         * 
         * <strong>example:</strong>
         * <p>model-v1</p>
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>The data processing mode. Valid values: Full, Incremental, and Both.</p>
         * 
         * <strong>example:</strong>
         * <p>Full</p>
         */
        public Builder processingMode(String processingMode) {
            this.processingMode = processingMode;
            return this;
        }

        /**
         * <p>The ID of the region where the data processing job is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the source PolarFS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-123456</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The source data path in PolarFS.</p>
         * 
         * <strong>example:</strong>
         * <p>/data/input</p>
         */
        public Builder sourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }

        /**
         * <p>The data source type. Currently, only PolarFS is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>PolarFS</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The status of the data processing job.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the template used by the job.</p>
         * 
         * <strong>example:</strong>
         * <p>tpl-123456</p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The node templatetype. Currently, only image is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        public Builder templateType(String templateType) {
            this.templateType = templateType;
            return this;
        }

        public DescribeDataProcessJobAttributeResponseBody build() {
            return new DescribeDataProcessJobAttributeResponseBody(this);
        } 

    } 

}
