// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DescribeJobGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeJobGroupResponseBody</p>
 */
public class DescribeJobGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("JobGroup")
    private JobGroup jobGroup;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeJobGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.jobGroup = builder.jobGroup;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return jobGroup
     */
    public JobGroup getJobGroup() {
        return this.jobGroup;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private JobGroup jobGroup; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeJobGroupResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.jobGroup = model.jobGroup;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The API status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The job group information.</p>
         */
        public Builder jobGroup(JobGroup jobGroup) {
            this.jobGroup = jobGroup;
            return this;
        }

        /**
         * <p>The API message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeJobGroupResponseBody build() {
            return new DescribeJobGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeJobGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobGroupResponseBody</p>
     */
    public static class ExportProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileHttpUrl")
        private String fileHttpUrl;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ExportProgress(Builder builder) {
            this.fileHttpUrl = builder.fileHttpUrl;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExportProgress create() {
            return builder().build();
        }

        /**
         * @return fileHttpUrl
         */
        public String getFileHttpUrl() {
            return this.fileHttpUrl;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String fileHttpUrl; 
            private String progress; 
            private String status; 

            private Builder() {
            } 

            private Builder(ExportProgress model) {
                this.fileHttpUrl = model.fileHttpUrl;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p><strong>[Deprecated]</strong> The file URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oss-cn-shanghai.aliyuncs.com/xx.zip">https://oss-cn-shanghai.aliyuncs.com/xx.zip</a></p>
             */
            public Builder fileHttpUrl(String fileHttpUrl) {
                this.fileHttpUrl = fileHttpUrl;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The export progress.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The export status.</p>
             * 
             * <strong>example:</strong>
             * <p>FINISHED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ExportProgress build() {
                return new ExportProgress(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeJobGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobGroupResponseBody</p>
     */
    public static class FlashSmsExtras extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private String configId;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private FlashSmsExtras(Builder builder) {
            this.configId = builder.configId;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlashSmsExtras create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public String getConfigId() {
            return this.configId;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String configId; 
            private String templateId; 

            private Builder() {
            } 

            private Builder(FlashSmsExtras model) {
                this.configId = model.configId;
                this.templateId = model.templateId;
            } 

            /**
             * <p>The ID of the flash SMS configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>bebe23e6e2604f50bbeb12900c07703d</p>
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * <p>The ID of the flash SMS template.</p>
             * 
             * <strong>example:</strong>
             * <p>e080d737-5c0b-4350-b7d4-1162530579e7</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public FlashSmsExtras build() {
                return new FlashSmsExtras(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeJobGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobGroupResponseBody</p>
     */
    public static class Briefs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Briefs(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Briefs create() {
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

            private Builder(Briefs model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The name of the business result.</p>
             * 
             * <strong>example:</strong>
             * <p>score</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the business result.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Briefs build() {
                return new Briefs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeJobGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobGroupResponseBody</p>
     */
    public static class Categories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Categories(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Categories create() {
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

            private Builder(Categories model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The name of the custom statistics information field.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The custom statistics information value (IV).</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Categories build() {
                return new Categories(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeJobGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobGroupResponseBody</p>
     */
    public static class Progress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Briefs")
        private java.util.List<Briefs> briefs;

        @com.aliyun.core.annotation.NameInMap("Cancelled")
        private Integer cancelled;

        @com.aliyun.core.annotation.NameInMap("Categories")
        private java.util.List<Categories> categories;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("Executing")
        private Integer executing;

        @com.aliyun.core.annotation.NameInMap("Failed")
        private Integer failed;

        @com.aliyun.core.annotation.NameInMap("Paused")
        private Integer paused;

        @com.aliyun.core.annotation.NameInMap("Scheduling")
        private Integer scheduling;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalCompleted")
        private Integer totalCompleted;

        @com.aliyun.core.annotation.NameInMap("TotalJobs")
        private Integer totalJobs;

        @com.aliyun.core.annotation.NameInMap("TotalNotAnswered")
        private Integer totalNotAnswered;

        private Progress(Builder builder) {
            this.briefs = builder.briefs;
            this.cancelled = builder.cancelled;
            this.categories = builder.categories;
            this.duration = builder.duration;
            this.executing = builder.executing;
            this.failed = builder.failed;
            this.paused = builder.paused;
            this.scheduling = builder.scheduling;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.totalCompleted = builder.totalCompleted;
            this.totalJobs = builder.totalJobs;
            this.totalNotAnswered = builder.totalNotAnswered;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Progress create() {
            return builder().build();
        }

        /**
         * @return briefs
         */
        public java.util.List<Briefs> getBriefs() {
            return this.briefs;
        }

        /**
         * @return cancelled
         */
        public Integer getCancelled() {
            return this.cancelled;
        }

        /**
         * @return categories
         */
        public java.util.List<Categories> getCategories() {
            return this.categories;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return executing
         */
        public Integer getExecuting() {
            return this.executing;
        }

        /**
         * @return failed
         */
        public Integer getFailed() {
            return this.failed;
        }

        /**
         * @return paused
         */
        public Integer getPaused() {
            return this.paused;
        }

        /**
         * @return scheduling
         */
        public Integer getScheduling() {
            return this.scheduling;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalCompleted
         */
        public Integer getTotalCompleted() {
            return this.totalCompleted;
        }

        /**
         * @return totalJobs
         */
        public Integer getTotalJobs() {
            return this.totalJobs;
        }

        /**
         * @return totalNotAnswered
         */
        public Integer getTotalNotAnswered() {
            return this.totalNotAnswered;
        }

        public static final class Builder {
            private java.util.List<Briefs> briefs; 
            private Integer cancelled; 
            private java.util.List<Categories> categories; 
            private Integer duration; 
            private Integer executing; 
            private Integer failed; 
            private Integer paused; 
            private Integer scheduling; 
            private Long startTime; 
            private String status; 
            private Integer totalCompleted; 
            private Integer totalJobs; 
            private Integer totalNotAnswered; 

            private Builder() {
            } 

            private Builder(Progress model) {
                this.briefs = model.briefs;
                this.cancelled = model.cancelled;
                this.categories = model.categories;
                this.duration = model.duration;
                this.executing = model.executing;
                this.failed = model.failed;
                this.paused = model.paused;
                this.scheduling = model.scheduling;
                this.startTime = model.startTime;
                this.status = model.status;
                this.totalCompleted = model.totalCompleted;
                this.totalJobs = model.totalJobs;
                this.totalNotAnswered = model.totalNotAnswered;
            } 

            /**
             * <p><strong>[Deprecated]</strong> The business result information.</p>
             */
            public Builder briefs(java.util.List<Briefs> briefs) {
                this.briefs = briefs;
                return this;
            }

            /**
             * <p>The number of canceled jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cancelled(Integer cancelled) {
                this.cancelled = cancelled;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The statistics information in key-value format.</p>
             */
            public Builder categories(java.util.List<Categories> categories) {
                this.categories = categories;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The execution duration of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The number of executing jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder executing(Integer executing) {
                this.executing = executing;
                return this;
            }

            /**
             * <p>The number of failed jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failed(Integer failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>The number of paused jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder paused(Integer paused) {
                this.paused = paused;
                return this;
            }

            /**
             * <p>The number of jobs being scheduled.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder scheduling(Integer scheduling) {
                this.scheduling = scheduling;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The start time of the execution. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1578881227404</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The overall execution status of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>Executing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The total number of completed jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalCompleted(Integer totalCompleted) {
                this.totalCompleted = totalCompleted;
                return this;
            }

            /**
             * <p>The total number of jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalJobs(Integer totalJobs) {
                this.totalJobs = totalJobs;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The total number of unanswered jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalNotAnswered(Integer totalNotAnswered) {
                this.totalNotAnswered = totalNotAnswered;
                return this;
            }

            public Progress build() {
                return new Progress(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeJobGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobGroupResponseBody</p>
     */
    public static class RecallStrategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EmptyNumberIgnore")
        private Boolean emptyNumberIgnore;

        @com.aliyun.core.annotation.NameInMap("InArrearsIgnore")
        private Boolean inArrearsIgnore;

        @com.aliyun.core.annotation.NameInMap("OutOfServiceIgnore")
        private Boolean outOfServiceIgnore;

        private RecallStrategy(Builder builder) {
            this.emptyNumberIgnore = builder.emptyNumberIgnore;
            this.inArrearsIgnore = builder.inArrearsIgnore;
            this.outOfServiceIgnore = builder.outOfServiceIgnore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecallStrategy create() {
            return builder().build();
        }

        /**
         * @return emptyNumberIgnore
         */
        public Boolean getEmptyNumberIgnore() {
            return this.emptyNumberIgnore;
        }

        /**
         * @return inArrearsIgnore
         */
        public Boolean getInArrearsIgnore() {
            return this.inArrearsIgnore;
        }

        /**
         * @return outOfServiceIgnore
         */
        public Boolean getOutOfServiceIgnore() {
            return this.outOfServiceIgnore;
        }

        public static final class Builder {
            private Boolean emptyNumberIgnore; 
            private Boolean inArrearsIgnore; 
            private Boolean outOfServiceIgnore; 

            private Builder() {
            } 

            private Builder(RecallStrategy model) {
                this.emptyNumberIgnore = model.emptyNumberIgnore;
                this.inArrearsIgnore = model.inArrearsIgnore;
                this.outOfServiceIgnore = model.outOfServiceIgnore;
            } 

            /**
             * <p>Specifies whether to stop calling nonexistent numbers.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder emptyNumberIgnore(Boolean emptyNumberIgnore) {
                this.emptyNumberIgnore = emptyNumberIgnore;
                return this;
            }

            /**
             * <p>Specifies whether to stop calling numbers with overdue payments.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder inArrearsIgnore(Boolean inArrearsIgnore) {
                this.inArrearsIgnore = inArrearsIgnore;
                return this;
            }

            /**
             * <p>Specifies whether to stop calling out-of-service numbers.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder outOfServiceIgnore(Boolean outOfServiceIgnore) {
                this.outOfServiceIgnore = outOfServiceIgnore;
                return this;
            }

            public RecallStrategy build() {
                return new RecallStrategy(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeJobGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobGroupResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientHangupNum")
        private Integer clientHangupNum;

        @com.aliyun.core.annotation.NameInMap("FinishedNum")
        private Integer finishedNum;

        @com.aliyun.core.annotation.NameInMap("NoInteractNum")
        private Integer noInteractNum;

        @com.aliyun.core.annotation.NameInMap("TimeoutHangupNum")
        private Integer timeoutHangupNum;

        @com.aliyun.core.annotation.NameInMap("UnrecognizedNum")
        private Integer unrecognizedNum;

        private Result(Builder builder) {
            this.clientHangupNum = builder.clientHangupNum;
            this.finishedNum = builder.finishedNum;
            this.noInteractNum = builder.noInteractNum;
            this.timeoutHangupNum = builder.timeoutHangupNum;
            this.unrecognizedNum = builder.unrecognizedNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return clientHangupNum
         */
        public Integer getClientHangupNum() {
            return this.clientHangupNum;
        }

        /**
         * @return finishedNum
         */
        public Integer getFinishedNum() {
            return this.finishedNum;
        }

        /**
         * @return noInteractNum
         */
        public Integer getNoInteractNum() {
            return this.noInteractNum;
        }

        /**
         * @return timeoutHangupNum
         */
        public Integer getTimeoutHangupNum() {
            return this.timeoutHangupNum;
        }

        /**
         * @return unrecognizedNum
         */
        public Integer getUnrecognizedNum() {
            return this.unrecognizedNum;
        }

        public static final class Builder {
            private Integer clientHangupNum; 
            private Integer finishedNum; 
            private Integer noInteractNum; 
            private Integer timeoutHangupNum; 
            private Integer unrecognizedNum; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.clientHangupNum = model.clientHangupNum;
                this.finishedNum = model.finishedNum;
                this.noInteractNum = model.noInteractNum;
                this.timeoutHangupNum = model.timeoutHangupNum;
                this.unrecognizedNum = model.unrecognizedNum;
            } 

            /**
             * <p><strong>[Deprecated]</strong> The number of hang-ups by the customer.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder clientHangupNum(Integer clientHangupNum) {
                this.clientHangupNum = clientHangupNum;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The number of completed jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder finishedNum(Integer finishedNum) {
                this.finishedNum = finishedNum;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The number of jobs without interaction.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder noInteractNum(Integer noInteractNum) {
                this.noInteractNum = noInteractNum;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The number of hang-ups due to timeout.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder timeoutHangupNum(Integer timeoutHangupNum) {
                this.timeoutHangupNum = timeoutHangupNum;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The number of unrecognized utterances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder unrecognizedNum(Integer unrecognizedNum) {
                this.unrecognizedNum = unrecognizedNum;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeJobGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobGroupResponseBody</p>
     */
    public static class WorkingTime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private String beginTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        private WorkingTime(Builder builder) {
            this.beginTime = builder.beginTime;
            this.endTime = builder.endTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkingTime create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        public static final class Builder {
            private String beginTime; 
            private String endTime; 

            private Builder() {
            } 

            private Builder(WorkingTime model) {
                this.beginTime = model.beginTime;
                this.endTime = model.endTime;
            } 

            /**
             * <p>The start time. The format is HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>09:00:00</p>
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>The end time. The format is HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>12:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            public WorkingTime build() {
                return new WorkingTime(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeJobGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobGroupResponseBody</p>
     */
    public static class Strategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Customized")
        private String customized;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("FollowUpStrategy")
        private String followUpStrategy;

        @com.aliyun.core.annotation.NameInMap("IsTemplate")
        private Boolean isTemplate;

        @com.aliyun.core.annotation.NameInMap("MaxAttemptsPerDay")
        private Integer maxAttemptsPerDay;

        @com.aliyun.core.annotation.NameInMap("MinAttemptInterval")
        private Integer minAttemptInterval;

        @com.aliyun.core.annotation.NameInMap("RepeatBy")
        private String repeatBy;

        @com.aliyun.core.annotation.NameInMap("RepeatDays")
        private java.util.List<String> repeatDays;

        @com.aliyun.core.annotation.NameInMap("Repeatable")
        private Boolean repeatable;

        @com.aliyun.core.annotation.NameInMap("RoutingStrategy")
        private String routingStrategy;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("StrategyDescription")
        private String strategyDescription;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private String strategyId;

        @com.aliyun.core.annotation.NameInMap("StrategyName")
        private String strategyName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("WorkingTime")
        private java.util.List<WorkingTime> workingTime;

        private Strategy(Builder builder) {
            this.customized = builder.customized;
            this.endTime = builder.endTime;
            this.followUpStrategy = builder.followUpStrategy;
            this.isTemplate = builder.isTemplate;
            this.maxAttemptsPerDay = builder.maxAttemptsPerDay;
            this.minAttemptInterval = builder.minAttemptInterval;
            this.repeatBy = builder.repeatBy;
            this.repeatDays = builder.repeatDays;
            this.repeatable = builder.repeatable;
            this.routingStrategy = builder.routingStrategy;
            this.startTime = builder.startTime;
            this.strategyDescription = builder.strategyDescription;
            this.strategyId = builder.strategyId;
            this.strategyName = builder.strategyName;
            this.type = builder.type;
            this.workingTime = builder.workingTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategy create() {
            return builder().build();
        }

        /**
         * @return customized
         */
        public String getCustomized() {
            return this.customized;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return followUpStrategy
         */
        public String getFollowUpStrategy() {
            return this.followUpStrategy;
        }

        /**
         * @return isTemplate
         */
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        /**
         * @return maxAttemptsPerDay
         */
        public Integer getMaxAttemptsPerDay() {
            return this.maxAttemptsPerDay;
        }

        /**
         * @return minAttemptInterval
         */
        public Integer getMinAttemptInterval() {
            return this.minAttemptInterval;
        }

        /**
         * @return repeatBy
         */
        public String getRepeatBy() {
            return this.repeatBy;
        }

        /**
         * @return repeatDays
         */
        public java.util.List<String> getRepeatDays() {
            return this.repeatDays;
        }

        /**
         * @return repeatable
         */
        public Boolean getRepeatable() {
            return this.repeatable;
        }

        /**
         * @return routingStrategy
         */
        public String getRoutingStrategy() {
            return this.routingStrategy;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return strategyDescription
         */
        public String getStrategyDescription() {
            return this.strategyDescription;
        }

        /**
         * @return strategyId
         */
        public String getStrategyId() {
            return this.strategyId;
        }

        /**
         * @return strategyName
         */
        public String getStrategyName() {
            return this.strategyName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return workingTime
         */
        public java.util.List<WorkingTime> getWorkingTime() {
            return this.workingTime;
        }

        public static final class Builder {
            private String customized; 
            private Long endTime; 
            private String followUpStrategy; 
            private Boolean isTemplate; 
            private Integer maxAttemptsPerDay; 
            private Integer minAttemptInterval; 
            private String repeatBy; 
            private java.util.List<String> repeatDays; 
            private Boolean repeatable; 
            private String routingStrategy; 
            private Long startTime; 
            private String strategyDescription; 
            private String strategyId; 
            private String strategyName; 
            private String type; 
            private java.util.List<WorkingTime> workingTime; 

            private Builder() {
            } 

            private Builder(Strategy model) {
                this.customized = model.customized;
                this.endTime = model.endTime;
                this.followUpStrategy = model.followUpStrategy;
                this.isTemplate = model.isTemplate;
                this.maxAttemptsPerDay = model.maxAttemptsPerDay;
                this.minAttemptInterval = model.minAttemptInterval;
                this.repeatBy = model.repeatBy;
                this.repeatDays = model.repeatDays;
                this.repeatable = model.repeatable;
                this.routingStrategy = model.routingStrategy;
                this.startTime = model.startTime;
                this.strategyDescription = model.strategyDescription;
                this.strategyId = model.strategyId;
                this.strategyName = model.strategyName;
                this.type = model.type;
                this.workingTime = model.workingTime;
            } 

            /**
             * <p>The custom data of the strategy. This is a legacy parameter and is no longer used.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder customized(String customized) {
                this.customized = customized;
                return this;
            }

            /**
             * <p>The overall end time of the scheduling strategy. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1579881227404</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The processing method after the execution cycle ends. This is a legacy parameter and is no longer used.</p>
             * 
             * <strong>example:</strong>
             * <p>NONE</p>
             */
            public Builder followUpStrategy(String followUpStrategy) {
                this.followUpStrategy = followUpStrategy;
                return this;
            }

            /**
             * <p>Indicates whether the strategy is a template.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isTemplate(Boolean isTemplate) {
                this.isTemplate = isTemplate;
                return this;
            }

            /**
             * <p>The maximum number of calls per day when the call is not answered.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxAttemptsPerDay(Integer maxAttemptsPerDay) {
                this.maxAttemptsPerDay = maxAttemptsPerDay;
                return this;
            }

            /**
             * <p>The interval for redialing.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder minAttemptInterval(Integer minAttemptInterval) {
                this.minAttemptInterval = minAttemptInterval;
                return this;
            }

            /**
             * <p>The repetition method of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>Once</p>
             */
            public Builder repeatBy(String repeatBy) {
                this.repeatBy = repeatBy;
                return this;
            }

            /**
             * <p>The days for repeated execution. This parameter is used in combination with RepeatBy.</p>
             * <ul>
             * <li>If the repetition cycle is weekly, 0 indicates Sunday, and 1 to 6 indicate Monday to Saturday.  </li>
             * <li>If the repetition cycle is monthly, 1 to 31 indicate the 1st to the 31st day of the month. The job is not executed in months that do not have the specified day. For example, if the 30th day is selected, the job is not executed in February.</li>
             * </ul>
             */
            public Builder repeatDays(java.util.List<String> repeatDays) {
                this.repeatDays = repeatDays;
                return this;
            }

            /**
             * <p>Indicates whether the job is a recurring task.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder repeatable(Boolean repeatable) {
                this.repeatable = repeatable;
                return this;
            }

            /**
             * <p>The number routing strategy.</p>
             * 
             * <strong>example:</strong>
             * <p>LocalFirst</p>
             */
            public Builder routingStrategy(String routingStrategy) {
                this.routingStrategy = routingStrategy;
                return this;
            }

            /**
             * <p>The overall start time of the strategy. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1578881227404</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The description of the strategy.</p>
             * 
             * <strong>example:</strong>
             * <p>Collection strategy</p>
             */
            public Builder strategyDescription(String strategyDescription) {
                this.strategyDescription = strategyDescription;
                return this;
            }

            /**
             * <p>The ID of the strategy.</p>
             * 
             * <strong>example:</strong>
             * <p>a2bff22c-2604-4df2-83d6-5952e2438c5a</p>
             */
            public Builder strategyId(String strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * <p>The name of the strategy.</p>
             * 
             * <strong>example:</strong>
             * <p>Collection strategy name</p>
             */
            public Builder strategyName(String strategyName) {
                this.strategyName = strategyName;
                return this;
            }

            /**
             * <p>The strategy type.</p>
             * 
             * <strong>example:</strong>
             * <p>Repeatable</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The working hours.</p>
             */
            public Builder workingTime(java.util.List<WorkingTime> workingTime) {
                this.workingTime = workingTime;
                return this;
            }

            public Strategy build() {
                return new Strategy(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeJobGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobGroupResponseBody</p>
     */
    public static class JobGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallingNumbers")
        private java.util.List<String> callingNumbers;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private Long creationTime;

        @com.aliyun.core.annotation.NameInMap("ExportProgress")
        private ExportProgress exportProgress;

        @com.aliyun.core.annotation.NameInMap("FlashSmsExtras")
        private FlashSmsExtras flashSmsExtras;

        @com.aliyun.core.annotation.NameInMap("JobDataParsingTaskId")
        private String jobDataParsingTaskId;

        @com.aliyun.core.annotation.NameInMap("JobFilePath")
        private String jobFilePath;

        @com.aliyun.core.annotation.NameInMap("JobGroupDescription")
        private String jobGroupDescription;

        @com.aliyun.core.annotation.NameInMap("JobGroupId")
        private String jobGroupId;

        @com.aliyun.core.annotation.NameInMap("JobGroupName")
        private String jobGroupName;

        @com.aliyun.core.annotation.NameInMap("MinConcurrency")
        private Long minConcurrency;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Progress progress;

        @com.aliyun.core.annotation.NameInMap("RecallCallingNumbers")
        private java.util.List<String> recallCallingNumbers;

        @com.aliyun.core.annotation.NameInMap("RecallStrategy")
        private RecallStrategy recallStrategy;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Result result;

        @com.aliyun.core.annotation.NameInMap("RingingDuration")
        private Long ringingDuration;

        @com.aliyun.core.annotation.NameInMap("ScenarioId")
        private String scenarioId;

        @com.aliyun.core.annotation.NameInMap("ScriptId")
        private String scriptId;

        @com.aliyun.core.annotation.NameInMap("ScriptName")
        private String scriptName;

        @com.aliyun.core.annotation.NameInMap("ScriptNluEngine")
        private String scriptNluEngine;

        @com.aliyun.core.annotation.NameInMap("ScriptVersion")
        private String scriptVersion;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private Strategy strategy;

        private JobGroup(Builder builder) {
            this.callingNumbers = builder.callingNumbers;
            this.creationTime = builder.creationTime;
            this.exportProgress = builder.exportProgress;
            this.flashSmsExtras = builder.flashSmsExtras;
            this.jobDataParsingTaskId = builder.jobDataParsingTaskId;
            this.jobFilePath = builder.jobFilePath;
            this.jobGroupDescription = builder.jobGroupDescription;
            this.jobGroupId = builder.jobGroupId;
            this.jobGroupName = builder.jobGroupName;
            this.minConcurrency = builder.minConcurrency;
            this.modifyTime = builder.modifyTime;
            this.priority = builder.priority;
            this.progress = builder.progress;
            this.recallCallingNumbers = builder.recallCallingNumbers;
            this.recallStrategy = builder.recallStrategy;
            this.result = builder.result;
            this.ringingDuration = builder.ringingDuration;
            this.scenarioId = builder.scenarioId;
            this.scriptId = builder.scriptId;
            this.scriptName = builder.scriptName;
            this.scriptNluEngine = builder.scriptNluEngine;
            this.scriptVersion = builder.scriptVersion;
            this.status = builder.status;
            this.strategy = builder.strategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobGroup create() {
            return builder().build();
        }

        /**
         * @return callingNumbers
         */
        public java.util.List<String> getCallingNumbers() {
            return this.callingNumbers;
        }

        /**
         * @return creationTime
         */
        public Long getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return exportProgress
         */
        public ExportProgress getExportProgress() {
            return this.exportProgress;
        }

        /**
         * @return flashSmsExtras
         */
        public FlashSmsExtras getFlashSmsExtras() {
            return this.flashSmsExtras;
        }

        /**
         * @return jobDataParsingTaskId
         */
        public String getJobDataParsingTaskId() {
            return this.jobDataParsingTaskId;
        }

        /**
         * @return jobFilePath
         */
        public String getJobFilePath() {
            return this.jobFilePath;
        }

        /**
         * @return jobGroupDescription
         */
        public String getJobGroupDescription() {
            return this.jobGroupDescription;
        }

        /**
         * @return jobGroupId
         */
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        /**
         * @return jobGroupName
         */
        public String getJobGroupName() {
            return this.jobGroupName;
        }

        /**
         * @return minConcurrency
         */
        public Long getMinConcurrency() {
            return this.minConcurrency;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return progress
         */
        public Progress getProgress() {
            return this.progress;
        }

        /**
         * @return recallCallingNumbers
         */
        public java.util.List<String> getRecallCallingNumbers() {
            return this.recallCallingNumbers;
        }

        /**
         * @return recallStrategy
         */
        public RecallStrategy getRecallStrategy() {
            return this.recallStrategy;
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
        }

        /**
         * @return ringingDuration
         */
        public Long getRingingDuration() {
            return this.ringingDuration;
        }

        /**
         * @return scenarioId
         */
        public String getScenarioId() {
            return this.scenarioId;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return scriptName
         */
        public String getScriptName() {
            return this.scriptName;
        }

        /**
         * @return scriptNluEngine
         */
        public String getScriptNluEngine() {
            return this.scriptNluEngine;
        }

        /**
         * @return scriptVersion
         */
        public String getScriptVersion() {
            return this.scriptVersion;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return strategy
         */
        public Strategy getStrategy() {
            return this.strategy;
        }

        public static final class Builder {
            private java.util.List<String> callingNumbers; 
            private Long creationTime; 
            private ExportProgress exportProgress; 
            private FlashSmsExtras flashSmsExtras; 
            private String jobDataParsingTaskId; 
            private String jobFilePath; 
            private String jobGroupDescription; 
            private String jobGroupId; 
            private String jobGroupName; 
            private Long minConcurrency; 
            private String modifyTime; 
            private String priority; 
            private Progress progress; 
            private java.util.List<String> recallCallingNumbers; 
            private RecallStrategy recallStrategy; 
            private Result result; 
            private Long ringingDuration; 
            private String scenarioId; 
            private String scriptId; 
            private String scriptName; 
            private String scriptNluEngine; 
            private String scriptVersion; 
            private String status; 
            private Strategy strategy; 

            private Builder() {
            } 

            private Builder(JobGroup model) {
                this.callingNumbers = model.callingNumbers;
                this.creationTime = model.creationTime;
                this.exportProgress = model.exportProgress;
                this.flashSmsExtras = model.flashSmsExtras;
                this.jobDataParsingTaskId = model.jobDataParsingTaskId;
                this.jobFilePath = model.jobFilePath;
                this.jobGroupDescription = model.jobGroupDescription;
                this.jobGroupId = model.jobGroupId;
                this.jobGroupName = model.jobGroupName;
                this.minConcurrency = model.minConcurrency;
                this.modifyTime = model.modifyTime;
                this.priority = model.priority;
                this.progress = model.progress;
                this.recallCallingNumbers = model.recallCallingNumbers;
                this.recallStrategy = model.recallStrategy;
                this.result = model.result;
                this.ringingDuration = model.ringingDuration;
                this.scenarioId = model.scenarioId;
                this.scriptId = model.scriptId;
                this.scriptName = model.scriptName;
                this.scriptNluEngine = model.scriptNluEngine;
                this.scriptVersion = model.scriptVersion;
                this.status = model.status;
                this.strategy = model.strategy;
            } 

            /**
             * <p>The list of calling numbers.</p>
             */
            public Builder callingNumbers(java.util.List<String> callingNumbers) {
                this.callingNumbers = callingNumbers;
                return this;
            }

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1578881227404</p>
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The export progress.</p>
             * <blockquote>
             * <p>This information is obtained from the ListJobGroups operation.</p>
             * </blockquote>
             */
            public Builder exportProgress(ExportProgress exportProgress) {
                this.exportProgress = exportProgress;
                return this;
            }

            /**
             * <p>The configuration parameters for flash SMS push in JSON format, including the configuration information of third-party flash SMS.</p>
             */
            public Builder flashSmsExtras(FlashSmsExtras flashSmsExtras) {
                this.flashSmsExtras = flashSmsExtras;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The ID of the job list parsing operation.</p>
             * 
             * <strong>example:</strong>
             * <p>da37319b-6c83-4268-9f19-814aed62e401/a5a9a310-b902-4674-a6e1-29975cbaa312_100.xlsx</p>
             */
            public Builder jobDataParsingTaskId(String jobDataParsingTaskId) {
                this.jobDataParsingTaskId = jobDataParsingTaskId;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The OSS file key of the uploaded job list.</p>
             * 
             * <strong>example:</strong>
             * <p>da37319b-6c83-4268-9f19-814aed62e401/a5a9a310-b902-4674-a6e1-29975cbaa312_100.xlsx</p>
             */
            public Builder jobFilePath(String jobFilePath) {
                this.jobFilePath = jobFilePath;
                return this;
            }

            /**
             * <p>The description of the job group.</p>
             * 
             * <strong>example:</strong>
             * <p>Collection job group</p>
             */
            public Builder jobGroupDescription(String jobGroupDescription) {
                this.jobGroupDescription = jobGroupDescription;
                return this;
            }

            /**
             * <p>The ID of the job group.</p>
             * 
             * <strong>example:</strong>
             * <p>46a9ad0c-3e11-44da-a9a7-2c21bf5ce185</p>
             */
            public Builder jobGroupId(String jobGroupId) {
                this.jobGroupId = jobGroupId;
                return this;
            }

            /**
             * <p>The name of the job group.</p>
             * 
             * <strong>example:</strong>
             * <p>Collection job group</p>
             */
            public Builder jobGroupName(String jobGroupName) {
                this.jobGroupName = jobGroupName;
                return this;
            }

            /**
             * <p>The minimum concurrency.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minConcurrency(Long minConcurrency) {
                this.minConcurrency = minConcurrency;
                return this;
            }

            /**
             * <p>The modification time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1578881227404</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The job progress.</p>
             */
            public Builder progress(Progress progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The list of calling numbers used for recall calls when the initial call fails. If not specified, it defaults to the primary calling number list.</p>
             */
            public Builder recallCallingNumbers(java.util.List<String> recallCallingNumbers) {
                this.recallCallingNumbers = recallCallingNumbers;
                return this;
            }

            /**
             * <p>The redial strategy.</p>
             */
            public Builder recallStrategy(RecallStrategy recallStrategy) {
                this.recallStrategy = recallStrategy;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The statistics information. This is a legacy parameter and is no longer provided.</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The ringing duration.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder ringingDuration(Long ringingDuration) {
                this.ringingDuration = ringingDuration;
                return this;
            }

            /**
             * <p>The scenario ID. This is a legacy canvas parameter. For the new canvas, the scenario ID is the same as the ScriptId.</p>
             * 
             * <strong>example:</strong>
             * <p>fce6c599-8ede-40e3-9f78-0928eda7b4e8</p>
             */
            public Builder scenarioId(String scenarioId) {
                this.scenarioId = scenarioId;
                return this;
            }

            /**
             * <p>The ID of the script scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>49f00b0d-78ac-4d51-91de-a9e8e92b8470</p>
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * <p>The name of the script scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>Collection script</p>
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
                return this;
            }

            /**
             * <p>The natural language understanding (NLU) engine used by the script.</p>
             */
            public Builder scriptNluEngine(String scriptNluEngine) {
                this.scriptNluEngine = scriptNluEngine;
                return this;
            }

            /**
             * <p>The version number of the script scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>49f00b0d-78ac-4d51-91de-a9e8e92b8470</p>
             */
            public Builder scriptVersion(String scriptVersion) {
                this.scriptVersion = scriptVersion;
                return this;
            }

            /**
             * <p>The job status.</p>
             * 
             * <strong>example:</strong>
             * <p>Completed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The execution strategy of the job.</p>
             */
            public Builder strategy(Strategy strategy) {
                this.strategy = strategy;
                return this;
            }

            public JobGroup build() {
                return new JobGroup(this);
            } 

        } 

    }
}
