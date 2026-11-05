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
 * {@link DescribeDataProcessJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataProcessJobsResponseBody</p>
 */
public class DescribeDataProcessJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private String pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private String totalRecordCount;

    private DescribeDataProcessJobsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataProcessJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private String pageNumber; 
        private String pageRecordCount; 
        private String requestId; 
        private String totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeDataProcessJobsResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The list of data processing jobs.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of jobs returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(String pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * <p>The total number of jobs that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(String totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeDataProcessJobsResponseBody build() {
            return new DescribeDataProcessJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataProcessJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataProcessJobsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestinationId")
        private String destinationId;

        @com.aliyun.core.annotation.NameInMap("DestinationPath")
        private String destinationPath;

        @com.aliyun.core.annotation.NameInMap("DestinationType")
        private String destinationType;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("ProcessingMode")
        private String processingMode;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

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

        private Items(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.destinationId = builder.destinationId;
            this.destinationPath = builder.destinationPath;
            this.destinationType = builder.destinationType;
            this.jobId = builder.jobId;
            this.processingMode = builder.processingMode;
            this.regionId = builder.regionId;
            this.sourceId = builder.sourceId;
            this.sourcePath = builder.sourcePath;
            this.sourceType = builder.sourceType;
            this.status = builder.status;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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

        public static final class Builder {
            private String creationTime; 
            private String description; 
            private String destinationId; 
            private String destinationPath; 
            private String destinationType; 
            private String jobId; 
            private String processingMode; 
            private String regionId; 
            private String sourceId; 
            private String sourcePath; 
            private String sourceType; 
            private String status; 
            private String templateId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.destinationId = model.destinationId;
                this.destinationPath = model.destinationPath;
                this.destinationType = model.destinationType;
                this.jobId = model.jobId;
                this.processingMode = model.processingMode;
                this.regionId = model.regionId;
                this.sourceId = model.sourceId;
                this.sourcePath = model.sourcePath;
                this.sourceType = model.sourceType;
                this.status = model.status;
                this.templateId = model.templateId;
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
             * <p>The description of the data processing job.</p>
             * 
             * <strong>example:</strong>
             * <p>Image data processing job</p>
             */
            public Builder description(String description) {
                this.description = description;
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
             * <p>The ID of the region where the data processing job resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * <p>The type of the data source. Currently, only PolarFS is supported.</p>
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

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
