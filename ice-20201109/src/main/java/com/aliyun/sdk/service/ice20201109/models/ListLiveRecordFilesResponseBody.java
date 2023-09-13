// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveRecordFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListLiveRecordFilesResponseBody</p>
 */
public class ListLiveRecordFilesResponseBody extends TeaModel {
    @NameInMap("Files")
    private java.util.List < Files> files;

    @NameInMap("PageNo")
    private Long pageNo;

    @NameInMap("PageSize")
    private String pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SortBy")
    private String sortBy;

    @NameInMap("TotalCount")
    private String totalCount;

    private ListLiveRecordFilesResponseBody(Builder builder) {
        this.files = builder.files;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.sortBy = builder.sortBy;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveRecordFilesResponseBody create() {
        return builder().build();
    }

    /**
     * @return files
     */
    public java.util.List < Files> getFiles() {
        return this.files;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Files> files; 
        private Long pageNo; 
        private String pageSize; 
        private String requestId; 
        private String sortBy; 
        private String totalCount; 

        /**
         * Files.
         */
        public Builder files(java.util.List < Files> files) {
            this.files = files;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListLiveRecordFilesResponseBody build() {
            return new ListLiveRecordFilesResponseBody(this);
        } 

    } 

    public static class Files extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Duration")
        private Float duration;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Format")
        private String format;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("JobName")
        private String jobName;

        @NameInMap("RecordId")
        private String recordId;

        @NameInMap("RecordOutput")
        private String recordOutput;

        @NameInMap("RecordUrl")
        private String recordUrl;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("StreamUrl")
        private String streamUrl;

        @NameInMap("Width")
        private Integer width;

        private Files(Builder builder) {
            this.createTime = builder.createTime;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.format = builder.format;
            this.height = builder.height;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.recordId = builder.recordId;
            this.recordOutput = builder.recordOutput;
            this.recordUrl = builder.recordUrl;
            this.startTime = builder.startTime;
            this.streamUrl = builder.streamUrl;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return duration
         */
        public Float getDuration() {
            return this.duration;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return recordId
         */
        public String getRecordId() {
            return this.recordId;
        }

        /**
         * @return recordOutput
         */
        public String getRecordOutput() {
            return this.recordOutput;
        }

        /**
         * @return recordUrl
         */
        public String getRecordUrl() {
            return this.recordUrl;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return streamUrl
         */
        public String getStreamUrl() {
            return this.streamUrl;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String createTime; 
            private Float duration; 
            private String endTime; 
            private String format; 
            private Integer height; 
            private String jobId; 
            private String jobName; 
            private String recordId; 
            private String recordOutput; 
            private String recordUrl; 
            private String startTime; 
            private String streamUrl; 
            private Integer width; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * JobName.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * RecordId.
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * RecordOutput.
             */
            public Builder recordOutput(String recordOutput) {
                this.recordOutput = recordOutput;
                return this;
            }

            /**
             * RecordUrl.
             */
            public Builder recordUrl(String recordUrl) {
                this.recordUrl = recordUrl;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StreamUrl.
             */
            public Builder streamUrl(String streamUrl) {
                this.streamUrl = streamUrl;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
}
