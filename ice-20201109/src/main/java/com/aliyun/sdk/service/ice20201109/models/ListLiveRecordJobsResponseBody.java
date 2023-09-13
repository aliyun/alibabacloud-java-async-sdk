// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveRecordJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLiveRecordJobsResponseBody</p>
 */
public class ListLiveRecordJobsResponseBody extends TeaModel {
    @NameInMap("LiveRecordJobs")
    private java.util.List < LiveRecordJobs> liveRecordJobs;

    @NameInMap("PageNo")
    private Long pageNo;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SortBy")
    private String sortBy;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListLiveRecordJobsResponseBody(Builder builder) {
        this.liveRecordJobs = builder.liveRecordJobs;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.sortBy = builder.sortBy;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveRecordJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return liveRecordJobs
     */
    public java.util.List < LiveRecordJobs> getLiveRecordJobs() {
        return this.liveRecordJobs;
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
    public Long getPageSize() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < LiveRecordJobs> liveRecordJobs; 
        private Long pageNo; 
        private Long pageSize; 
        private String requestId; 
        private String sortBy; 
        private Long totalCount; 

        /**
         * LiveRecordJobs.
         */
        public Builder liveRecordJobs(java.util.List < LiveRecordJobs> liveRecordJobs) {
            this.liveRecordJobs = liveRecordJobs;
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
        public Builder pageSize(Long pageSize) {
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListLiveRecordJobsResponseBody build() {
            return new ListLiveRecordJobsResponseBody(this);
        } 

    } 

    public static class RecordOutput extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("Type")
        private String type;

        private RecordOutput(Builder builder) {
            this.bucket = builder.bucket;
            this.endpoint = builder.endpoint;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordOutput create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String bucket; 
            private String endpoint; 
            private String type; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RecordOutput build() {
                return new RecordOutput(this);
            } 

        } 

    }
    public static class StreamInput extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("Url")
        private String url;

        private StreamInput(Builder builder) {
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamInput create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String type; 
            private String url; 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public StreamInput build() {
                return new StreamInput(this);
            } 

        } 

    }
    public static class LiveRecordJobs extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Name")
        private String name;

        @NameInMap("NotifyUrl")
        private String notifyUrl;

        @NameInMap("RecordOutput")
        private RecordOutput recordOutput;

        @NameInMap("Status")
        private String status;

        @NameInMap("StreamInput")
        private StreamInput streamInput;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TemplateName")
        private String templateName;

        private LiveRecordJobs(Builder builder) {
            this.createTime = builder.createTime;
            this.jobId = builder.jobId;
            this.name = builder.name;
            this.notifyUrl = builder.notifyUrl;
            this.recordOutput = builder.recordOutput;
            this.status = builder.status;
            this.streamInput = builder.streamInput;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveRecordJobs create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return notifyUrl
         */
        public String getNotifyUrl() {
            return this.notifyUrl;
        }

        /**
         * @return recordOutput
         */
        public RecordOutput getRecordOutput() {
            return this.recordOutput;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return streamInput
         */
        public StreamInput getStreamInput() {
            return this.streamInput;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private String createTime; 
            private String jobId; 
            private String name; 
            private String notifyUrl; 
            private RecordOutput recordOutput; 
            private String status; 
            private StreamInput streamInput; 
            private String templateId; 
            private String templateName; 

            /**
             * 代表创建时间的资源属性字段
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * 代表资源名称的资源属性字段
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 回调地址
             */
            public Builder notifyUrl(String notifyUrl) {
                this.notifyUrl = notifyUrl;
                return this;
            }

            /**
             * RecordOutput.
             */
            public Builder recordOutput(RecordOutput recordOutput) {
                this.recordOutput = recordOutput;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StreamInput.
             */
            public Builder streamInput(StreamInput streamInput) {
                this.streamInput = streamInput;
                return this;
            }

            /**
             * 录制模板ID
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public LiveRecordJobs build() {
                return new LiveRecordJobs(this);
            } 

        } 

    }
}
