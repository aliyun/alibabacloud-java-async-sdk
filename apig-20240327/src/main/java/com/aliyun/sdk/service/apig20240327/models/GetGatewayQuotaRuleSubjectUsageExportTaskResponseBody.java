// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetGatewayQuotaRuleSubjectUsageExportTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayQuotaRuleSubjectUsageExportTaskResponseBody</p>
 */
public class GetGatewayQuotaRuleSubjectUsageExportTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetGatewayQuotaRuleSubjectUsageExportTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayQuotaRuleSubjectUsageExportTaskResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetGatewayQuotaRuleSubjectUsageExportTaskResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID of this OpenAPI query call, which is used to troubleshoot call issues. This is different from the request_id of each consumption record in the exported file.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBody build() {
            return new GetGatewayQuotaRuleSubjectUsageExportTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGatewayQuotaRuleSubjectUsageExportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayQuotaRuleSubjectUsageExportTaskResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("downloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("downloadUrlExpiredAt")
        private Long downloadUrlExpiredAt;

        @com.aliyun.core.annotation.NameInMap("effectiveWindowStart")
        private Long effectiveWindowStart;

        @com.aliyun.core.annotation.NameInMap("fileExpired")
        private Boolean fileExpired;

        @com.aliyun.core.annotation.NameInMap("fileExpiredAt")
        private Long fileExpiredAt;

        @com.aliyun.core.annotation.NameInMap("fileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("filterFailedRequests")
        private Boolean filterFailedRequests;

        @com.aliyun.core.annotation.NameInMap("format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("queryWindowEnd")
        private Long queryWindowEnd;

        @com.aliyun.core.annotation.NameInMap("queryWindowStart")
        private Long queryWindowStart;

        @com.aliyun.core.annotation.NameInMap("quotaDimension")
        private String quotaDimension;

        @com.aliyun.core.annotation.NameInMap("rowCount")
        private Long rowCount;

        private Result(Builder builder) {
            this.downloadUrl = builder.downloadUrl;
            this.downloadUrlExpiredAt = builder.downloadUrlExpiredAt;
            this.effectiveWindowStart = builder.effectiveWindowStart;
            this.fileExpired = builder.fileExpired;
            this.fileExpiredAt = builder.fileExpiredAt;
            this.fileSize = builder.fileSize;
            this.filterFailedRequests = builder.filterFailedRequests;
            this.format = builder.format;
            this.queryWindowEnd = builder.queryWindowEnd;
            this.queryWindowStart = builder.queryWindowStart;
            this.quotaDimension = builder.quotaDimension;
            this.rowCount = builder.rowCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return downloadUrlExpiredAt
         */
        public Long getDownloadUrlExpiredAt() {
            return this.downloadUrlExpiredAt;
        }

        /**
         * @return effectiveWindowStart
         */
        public Long getEffectiveWindowStart() {
            return this.effectiveWindowStart;
        }

        /**
         * @return fileExpired
         */
        public Boolean getFileExpired() {
            return this.fileExpired;
        }

        /**
         * @return fileExpiredAt
         */
        public Long getFileExpiredAt() {
            return this.fileExpiredAt;
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return filterFailedRequests
         */
        public Boolean getFilterFailedRequests() {
            return this.filterFailedRequests;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return queryWindowEnd
         */
        public Long getQueryWindowEnd() {
            return this.queryWindowEnd;
        }

        /**
         * @return queryWindowStart
         */
        public Long getQueryWindowStart() {
            return this.queryWindowStart;
        }

        /**
         * @return quotaDimension
         */
        public String getQuotaDimension() {
            return this.quotaDimension;
        }

        /**
         * @return rowCount
         */
        public Long getRowCount() {
            return this.rowCount;
        }

        public static final class Builder {
            private String downloadUrl; 
            private Long downloadUrlExpiredAt; 
            private Long effectiveWindowStart; 
            private Boolean fileExpired; 
            private Long fileExpiredAt; 
            private Long fileSize; 
            private Boolean filterFailedRequests; 
            private String format; 
            private Long queryWindowEnd; 
            private Long queryWindowStart; 
            private String quotaDimension; 
            private Long rowCount; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.downloadUrl = model.downloadUrl;
                this.downloadUrlExpiredAt = model.downloadUrlExpiredAt;
                this.effectiveWindowStart = model.effectiveWindowStart;
                this.fileExpired = model.fileExpired;
                this.fileExpiredAt = model.fileExpiredAt;
                this.fileSize = model.fileSize;
                this.filterFailedRequests = model.filterFailedRequests;
                this.format = model.format;
                this.queryWindowEnd = model.queryWindowEnd;
                this.queryWindowStart = model.queryWindowStart;
                this.quotaDimension = model.quotaDimension;
                this.rowCount = model.rowCount;
            } 

            /**
             * <p>The temporary signed download URL of the exported file. It is returned only when status=Success and the file is not expired. It is dynamically generated for each query and is valid for 10 minutes from the generation time. If the link expires but fileExpiredAt is not reached, you can call this operation again to obtain the link. You do not need to pass the internal storage path as a request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.oss-cn-hangzhou.aliyuncs.com/export.csv.gz">https://example.oss-cn-hangzhou.aliyuncs.com/export.csv.gz</a></p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The expiration time of the downloadUrl returned in this response. It is a UNIX timestamp in seconds. It is provided only when a download link is returned and is approximately 10 minutes after the link generation time. It can be updated by querying again and cannot be used to replace fileExpiredAt.</p>
             * 
             * <strong>example:</strong>
             * <p>1783938800</p>
             */
            public Builder downloadUrlExpiredAt(Long downloadUrlExpiredAt) {
                this.downloadUrlExpiredAt = downloadUrlExpiredAt;
                return this;
            }

            /**
             * <p>The start time of the actual export time range. It is a UNIX timestamp in seconds. The actual start time is also limited by the rule creation time, rule reset, or the effective start time of clearing history records. No details are available if the start time is not earlier than the end time.</p>
             * 
             * <strong>example:</strong>
             * <p>1783931600</p>
             */
            public Builder effectiveWindowStart(Long effectiveWindowStart) {
                this.effectiveWindowStart = effectiveWindowStart;
                return this;
            }

            /**
             * <p>Indicates whether the exported file has exceeded the server-side period for providing download links. A value of true indicates that the file has expired, downloadUrl and downloadUrlExpiredAt are not returned, and you need to create a new export task. This field may be omitted when the value is false. To determine whether the file is downloadable, check both status and downloadUrl.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder fileExpired(Boolean fileExpired) {
                this.fileExpired = fileExpired;
                return this;
            }

            /**
             * <p>The time when the file stops providing new download links. It is a UNIX timestamp in seconds and is usually 24 hours after the file is successfully uploaded. After this time, this operation returns fileExpired=true and no longer generates downloadUrl. The task remains in the Success state. This time is different from the downloadUrlExpiredAt of a single signed link.</p>
             * 
             * <strong>example:</strong>
             * <p>1784021600</p>
             */
            public Builder fileExpiredAt(Long fileExpiredAt) {
                this.fileExpiredAt = fileExpiredAt;
                return this;
            }

            /**
             * <p>The size of the successfully generated and uploaded GZIP compressed file, in bytes. This field may be omitted when the task is not successful.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>Specifies whether to filter out requests with failed or zero usage, which is specified when the task is created. A value of true filters out records with 0 usage and retains only records with usage. This field may be omitted when the value is false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder filterFailedRequests(Boolean filterFailedRequests) {
                this.filterFailedRequests = filterFailedRequests;
                return this;
            }

            /**
             * <p>The format of the exported file. The value is currently fixed as CSV_GZIP. The downloaded file is a .csv.gz file, which becomes a CSV file after decompression.</p>
             * 
             * <strong>example:</strong>
             * <p>CSV_GZIP</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The end time of the request time range determined when the task was created. It is a UNIX timestamp in seconds and does not include this moment. If no time range is specified, this value is the task creation time and is not updated when the task is queried.</p>
             * 
             * <strong>example:</strong>
             * <p>1783935200</p>
             */
            public Builder queryWindowEnd(Long queryWindowEnd) {
                this.queryWindowEnd = queryWindowEnd;
                return this;
            }

            /**
             * <p>The start time of the request time range determined when the task was created. It is a UNIX timestamp in seconds and includes this moment. If only one time parameter is passed, this value may be derived from the rule period. For the actual export start time, see effectiveWindowStart.</p>
             * 
             * <strong>example:</strong>
             * <p>1783931600</p>
             */
            public Builder queryWindowStart(Long queryWindowStart) {
                this.queryWindowStart = queryWindowStart;
                return this;
            }

            /**
             * <p>The quota metering dimension determined when the task was created. token indicates token usage, and credit indicates credit usage. The CSV file outputs the corresponding columns based on this dimension. Credit usage retains decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>token</p>
             */
            public Builder quotaDimension(String quotaDimension) {
                this.quotaDimension = quotaDimension;
                return this;
            }

            /**
             * <p>The number of successfully exported consumption detail rows, excluding the CSV header. This field may be omitted when the task is not successful or the export result contains 0 rows. If the task is successful but no matching details exist, the file contains only the header.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder rowCount(Long rowCount) {
                this.rowCount = rowCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayQuotaRuleSubjectUsageExportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayQuotaRuleSubjectUsageExportTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("processedCount")
        private Integer processedCount;

        @com.aliyun.core.annotation.NameInMap("result")
        private Result result;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("subjectId")
        private String subjectId;

        @com.aliyun.core.annotation.NameInMap("subjectName")
        private String subjectName;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("taskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.gatewayId = builder.gatewayId;
            this.processedCount = builder.processedCount;
            this.result = builder.result;
            this.ruleId = builder.ruleId;
            this.status = builder.status;
            this.subjectId = builder.subjectId;
            this.subjectName = builder.subjectName;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return processedCount
         */
        public Integer getProcessedCount() {
            return this.processedCount;
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subjectId
         */
        public String getSubjectId() {
            return this.subjectId;
        }

        /**
         * @return subjectName
         */
        public String getSubjectName() {
            return this.subjectName;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String errorMessage; 
            private String gatewayId; 
            private Integer processedCount; 
            private Result result; 
            private String ruleId; 
            private String status; 
            private String subjectId; 
            private String subjectName; 
            private String taskId; 
            private String taskType; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.errorMessage = model.errorMessage;
                this.gatewayId = model.gatewayId;
                this.processedCount = model.processedCount;
                this.result = model.result;
                this.ruleId = model.ruleId;
                this.status = model.status;
                this.subjectId = model.subjectId;
                this.subjectName = model.subjectName;
                this.taskId = model.taskId;
                this.taskType = model.taskType;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The error summary when the task fails, which is used to troubleshoot issues such as disabled logs, query failures, exceeded detail limits, processing timeouts, or file generation failures. This field may be omitted when no errors occur.</p>
             * 
             * <strong>example:</strong>
             * <p>log delivery is not enabled</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The gateway ID recorded when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-123456</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The number of detail rows written to the exported file, excluding the header. This value is used to check the processing progress. Even if this value equals totalCount, you should determine whether the file is downloadable based on status=Success.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder processedCount(Integer processedCount) {
                this.processedCount = processedCount;
                return this;
            }

            /**
             * <p>The export conditions and file results determined when the task was created. The time range, format, and metering dimension may be returned even in non-Success states. File and download information is available only after success. Fields with values of 0, false, or empty strings are omitted.</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The quota rule ID recorded when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>qr-123456</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The current status of the task. Valid values:</p>
             * <ul>
             * <li>Pending: The task is submitted and waiting to be processed.</li>
             * <li>Running: The task is querying details, generating files, or uploading files.</li>
             * <li>Success: The file is generated and uploaded. You still need to check whether the file is expired.</li>
             * <li>Failed: The task failed. For the cause, see errorMessage.</li>
             * </ul>
             * <p>Tasks that are not completed within 10 minutes after creation are processed as Failed. After a file expires, the task remains in the Success state.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The consumer or consumer group ID recorded when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>cs-123456</p>
             */
            public Builder subjectId(String subjectId) {
                this.subjectId = subjectId;
                return this;
            }

            /**
             * <p>The subject name recorded when the task was created, which is used to match consumption logs. Subsequent changes to the subject name do not modify the name recorded for this task.</p>
             * 
             * <strong>example:</strong>
             * <p>consumer-name</p>
             */
            public Builder subjectName(String subjectName) {
                this.subjectName = subjectName;
                return this;
            }

            /**
             * <p>The export task ID, which is the same as the taskId request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>finops-export-abcdef1234567890</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task type. The value is fixed as FinOpsUsageDetailExport, which indicates the export of quota rule subject consumption details.</p>
             * 
             * <strong>example:</strong>
             * <p>FinOpsUsageDetailExport</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The total number of detail rows to be exported as counted by backend queries, excluding the CSV header. This value may be 0 before the counting is completed. You cannot determine whether the result is empty or the task is completed based solely on this value.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
