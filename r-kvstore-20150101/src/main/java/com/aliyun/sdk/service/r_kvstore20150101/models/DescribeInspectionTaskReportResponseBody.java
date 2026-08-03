// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeInspectionTaskReportResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInspectionTaskReportResponseBody</p>
 */
public class DescribeInspectionTaskReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeInspectionTaskReportResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInspectionTaskReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeInspectionTaskReportResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeInspectionTaskReportResponseBody build() {
            return new DescribeInspectionTaskReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInspectionTaskReportResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInspectionTaskReportResponseBody</p>
     */
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Error")
        private Long error;

        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Normal")
        private Long normal;

        @com.aliyun.core.annotation.NameInMap("Warning")
        private Long warning;

        private Summary(Builder builder) {
            this.error = builder.error;
            this.failed = builder.failed;
            this.normal = builder.normal;
            this.warning = builder.warning;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summary create() {
            return builder().build();
        }

        /**
         * @return error
         */
        public Long getError() {
            return this.error;
        }

        /**
         * @return failed
         */
        public Long getFailed() {
            return this.failed;
        }

        /**
         * @return normal
         */
        public Long getNormal() {
            return this.normal;
        }

        /**
         * @return warning
         */
        public Long getWarning() {
            return this.warning;
        }

        public static final class Builder {
            private Long error; 
            private Long failed; 
            private Long normal; 
            private Long warning; 

            private Builder() {
            } 

            private Builder(Summary model) {
                this.error = model.error;
                this.failed = model.failed;
                this.normal = model.normal;
                this.warning = model.warning;
            } 

            /**
             * Error.
             */
            public Builder error(Long error) {
                this.error = error;
                return this;
            }

            /**
             * Failed.
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * Normal.
             */
            public Builder normal(Long normal) {
                this.normal = normal;
                return this;
            }

            /**
             * Warning.
             */
            public Builder warning(Long warning) {
                this.warning = warning;
                return this;
            }

            public Summary build() {
                return new Summary(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInspectionTaskReportResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInspectionTaskReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private java.util.List<String> instanceIds;

        @com.aliyun.core.annotation.NameInMap("MarkdownText")
        private String markdownText;

        @com.aliyun.core.annotation.NameInMap("ReportLanguage")
        private String reportLanguage;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private Summary summary;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Data(Builder builder) {
            this.instanceIds = builder.instanceIds;
            this.markdownText = builder.markdownText;
            this.reportLanguage = builder.reportLanguage;
            this.status = builder.status;
            this.summary = builder.summary;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return instanceIds
         */
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return markdownText
         */
        public String getMarkdownText() {
            return this.markdownText;
        }

        /**
         * @return reportLanguage
         */
        public String getReportLanguage() {
            return this.reportLanguage;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return summary
         */
        public Summary getSummary() {
            return this.summary;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private java.util.List<String> instanceIds; 
            private String markdownText; 
            private String reportLanguage; 
            private String status; 
            private Summary summary; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.instanceIds = model.instanceIds;
                this.markdownText = model.markdownText;
                this.reportLanguage = model.reportLanguage;
                this.status = model.status;
                this.summary = model.summary;
                this.taskId = model.taskId;
            } 

            /**
             * InstanceIds.
             */
            public Builder instanceIds(java.util.List<String> instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * MarkdownText.
             */
            public Builder markdownText(String markdownText) {
                this.markdownText = markdownText;
                return this;
            }

            /**
             * ReportLanguage.
             */
            public Builder reportLanguage(String reportLanguage) {
                this.reportLanguage = reportLanguage;
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
             * Summary.
             */
            public Builder summary(Summary summary) {
                this.summary = summary;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
