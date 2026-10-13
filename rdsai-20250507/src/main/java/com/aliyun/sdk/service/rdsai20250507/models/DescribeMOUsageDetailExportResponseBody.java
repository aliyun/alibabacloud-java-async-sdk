// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link DescribeMOUsageDetailExportResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMOUsageDetailExportResponseBody</p>
 */
public class DescribeMOUsageDetailExportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeMOUsageDetailExportResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMOUsageDetailExportResponseBody create() {
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeMOUsageDetailExportResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The result.</p>
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The request result.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeMOUsageDetailExportResponseBody build() {
            return new DescribeMOUsageDetailExportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMOUsageDetailExportResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMOUsageDetailExportResponseBody</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private Filters(Builder builder) {
            this.apiKey = builder.apiKey;
            this.endTime = builder.endTime;
            this.instanceId = builder.instanceId;
            this.model = builder.model;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String apiKey; 
            private String endTime; 
            private String instanceId; 
            private String model; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(Filters model) {
                this.apiKey = model.apiKey;
                this.endTime = model.endTime;
                this.instanceId = model.instanceId;
                this.model = model.model;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The API key that is used.</p>
             * 
             * <strong>example:</strong>
             * <p>sk-rds-**</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>The end time of the instance in ISO 8601 format. The interval between EndTime and StartTime cannot exceed 30 days.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-30T01:45:03Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>rds_copilot**</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The model that is called.</p>
             * 
             * <strong>example:</strong>
             * <p>glm-5</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The start time of the instance in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-28T01:45:03Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMOUsageDetailExportResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMOUsageDetailExportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompletedAt")
        private String completedAt;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("ExpiresAt")
        private String expiresAt;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("Filters")
        private Filters filters;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("RowCount")
        private Long rowCount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.completedAt = builder.completedAt;
            this.createdAt = builder.createdAt;
            this.downloadUrl = builder.downloadUrl;
            this.errorMessage = builder.errorMessage;
            this.expiresAt = builder.expiresAt;
            this.fileSize = builder.fileSize;
            this.filters = builder.filters;
            this.format = builder.format;
            this.rowCount = builder.rowCount;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return completedAt
         */
        public String getCompletedAt() {
            return this.completedAt;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return expiresAt
         */
        public String getExpiresAt() {
            return this.expiresAt;
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return filters
         */
        public Filters getFilters() {
            return this.filters;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return rowCount
         */
        public Long getRowCount() {
            return this.rowCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String completedAt; 
            private String createdAt; 
            private String downloadUrl; 
            private String errorMessage; 
            private String expiresAt; 
            private Long fileSize; 
            private Filters filters; 
            private String format; 
            private Long rowCount; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.completedAt = model.completedAt;
                this.createdAt = model.createdAt;
                this.downloadUrl = model.downloadUrl;
                this.errorMessage = model.errorMessage;
                this.expiresAt = model.expiresAt;
                this.fileSize = model.fileSize;
                this.filters = model.filters;
                this.format = model.format;
                this.rowCount = model.rowCount;
                this.status = model.status;
            } 

            /**
             * <p>The completion time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-02-01T01:50:03Z</p>
             */
            public Builder completedAt(String completedAt) {
                this.completedAt = completedAt;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-02-01T01:45:03Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The download URL.</p>
             * 
             * <strong>example:</strong>
             * <p>http://***</p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The error message. Read this message to determine the error when the final value of Status is not SUCCESSED.</p>
             * 
             * <strong>example:</strong>
             * <p>tenant auth error</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The expiration time in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-02-04T01:45:03Z</p>
             */
            public Builder expiresAt(String expiresAt) {
                this.expiresAt = expiresAt;
                return this;
            }

            /**
             * <p>The total size of the source backup file.</p>
             * 
             * <strong>example:</strong>
             * <p>252</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The query filter conditions.</p>
             */
            public Builder filters(Filters filters) {
                this.filters = filters;
                return this;
            }

            /**
             * <p>The target conversion format.</p>
             * 
             * <strong>example:</strong>
             * <p>csv</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The total number of data rows.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder rowCount(Long rowCount) {
                this.rowCount = rowCount;
                return this;
            }

            /**
             * <p>The module status.</p>
             * 
             * <strong>example:</strong>
             * <p>pending / processing / completed / failed / expired</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
