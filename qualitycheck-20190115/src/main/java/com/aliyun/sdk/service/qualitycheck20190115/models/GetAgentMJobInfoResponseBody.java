// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link GetAgentMJobInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentMJobInfoResponseBody</p>
 */
public class GetAgentMJobInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAgentMJobInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentMJobInfoResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAgentMJobInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. A value of <strong>200</strong> indicates success. Any other value indicates failure. You can use this field to determine the cause of the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned when an error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F190ADE9-619A-447D-84E3-7E241A5C428E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false/null: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAgentMJobInfoResponseBody build() {
            return new GetAgentMJobInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentMJobInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentMJobInfoResponseBody</p>
     */
    public static class SummaryUrls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("OssUrl")
        private String ossUrl;

        private SummaryUrls(Builder builder) {
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.ossUrl = builder.ossUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SummaryUrls create() {
            return builder().build();
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
         * @return ossUrl
         */
        public String getOssUrl() {
            return this.ossUrl;
        }

        public static final class Builder {
            private String fileName; 
            private String fileType; 
            private String ossUrl; 

            private Builder() {
            } 

            private Builder(SummaryUrls model) {
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.ossUrl = model.ossUrl;
            } 

            /**
             * <p>The file name.</p>
             * 
             * <strong>example:</strong>
             * <p>SatisfactionAnalysis.xlsx</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The file type.</p>
             * 
             * <strong>example:</strong>
             * <p>xlsx</p>
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>The file URL.</p>
             * 
             * <strong>example:</strong>
             * <p>http://******.oss-cn-hangzhou.aliyuncs.com/uploadTransfer/17****dline-express.zip</p>
             */
            public Builder ossUrl(String ossUrl) {
                this.ossUrl = ossUrl;
                return this;
            }

            public SummaryUrls build() {
                return new SummaryUrls(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentMJobInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentMJobInfoResponseBody</p>
     */
    public static class AgentMDetailResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("SummaryUrls")
        private java.util.List<SummaryUrls> summaryUrls;

        private AgentMDetailResponse(Builder builder) {
            this.summary = builder.summary;
            this.summaryUrls = builder.summaryUrls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentMDetailResponse create() {
            return builder().build();
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return summaryUrls
         */
        public java.util.List<SummaryUrls> getSummaryUrls() {
            return this.summaryUrls;
        }

        public static final class Builder {
            private String summary; 
            private java.util.List<SummaryUrls> summaryUrls; 

            private Builder() {
            } 

            private Builder(AgentMDetailResponse model) {
                this.summary = model.summary;
                this.summaryUrls = model.summaryUrls;
            } 

            /**
             * <p>The execution summary.</p>
             * 
             * <strong>example:</strong>
             * <p>This quality inspection analyzed a total of 120 conversations..</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The list of result files. Each item contains complete file fields.</p>
             */
            public Builder summaryUrls(java.util.List<SummaryUrls> summaryUrls) {
                this.summaryUrls = summaryUrls;
                return this;
            }

            public AgentMDetailResponse build() {
                return new AgentMDetailResponse(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentMJobInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentMJobInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentMDetailResponse")
        private AgentMDetailResponse agentMDetailResponse;

        @com.aliyun.core.annotation.NameInMap("DataEndTime")
        private String dataEndTime;

        @com.aliyun.core.annotation.NameInMap("DataStartTime")
        private String dataStartTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskEndTime")
        private String taskEndTime;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStartTime")
        private String taskStartTime;

        private Data(Builder builder) {
            this.agentMDetailResponse = builder.agentMDetailResponse;
            this.dataEndTime = builder.dataEndTime;
            this.dataStartTime = builder.dataStartTime;
            this.id = builder.id;
            this.message = builder.message;
            this.status = builder.status;
            this.taskEndTime = builder.taskEndTime;
            this.taskId = builder.taskId;
            this.taskStartTime = builder.taskStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentMDetailResponse
         */
        public AgentMDetailResponse getAgentMDetailResponse() {
            return this.agentMDetailResponse;
        }

        /**
         * @return dataEndTime
         */
        public String getDataEndTime() {
            return this.dataEndTime;
        }

        /**
         * @return dataStartTime
         */
        public String getDataStartTime() {
            return this.dataStartTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskEndTime
         */
        public String getTaskEndTime() {
            return this.taskEndTime;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStartTime
         */
        public String getTaskStartTime() {
            return this.taskStartTime;
        }

        public static final class Builder {
            private AgentMDetailResponse agentMDetailResponse; 
            private String dataEndTime; 
            private String dataStartTime; 
            private Long id; 
            private String message; 
            private String status; 
            private String taskEndTime; 
            private String taskId; 
            private String taskStartTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentMDetailResponse = model.agentMDetailResponse;
                this.dataEndTime = model.dataEndTime;
                this.dataStartTime = model.dataStartTime;
                this.id = model.id;
                this.message = model.message;
                this.status = model.status;
                this.taskEndTime = model.taskEndTime;
                this.taskId = model.taskId;
                this.taskStartTime = model.taskStartTime;
            } 

            /**
             * <p>The details of the task processing result.</p>
             */
            public Builder agentMDetailResponse(AgentMDetailResponse agentMDetailResponse) {
                this.agentMDetailResponse = agentMDetailResponse;
                return this;
            }

            /**
             * <p>The end time of the scan range.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-26 20:00:00</p>
             */
            public Builder dataEndTime(String dataEndTime) {
                this.dataEndTime = dataEndTime;
                return this;
            }

            /**
             * <p>The start time of the scan range.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-26 19:00:00</p>
             */
            public Builder dataStartTime(String dataStartTime) {
                this.dataStartTime = dataStartTime;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The error message returned when an error occurs.</p>
             * 
             * <strong>example:</strong>
             * <p>successful</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>queing: queuing.</li>
             * <li>readyAnalysis: pending analysis.</li>
             * <li>running: running.</li>
             * <li>error: failed.</li>
             * <li>finish: completed.</li>
             * <li>fileUploadUser: user-specified file upload completed.</li>
             * <li>fileUploadSystem: system-generated file upload completed.</li>
             * <li>expired: expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>finish</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The actual end time of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-26 20:00:00</p>
             */
            public Builder taskEndTime(String taskEndTime) {
                this.taskEndTime = taskEndTime;
                return this;
            }

            /**
             * <p>The scheduled task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>A6BEC8D-9A5B-4BE5-8432-4F635E***</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The actual start time of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-26 19:00:00</p>
             */
            public Builder taskStartTime(String taskStartTime) {
                this.taskStartTime = taskStartTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
