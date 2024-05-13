// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDataTrackResultDownloadStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDataTrackResultDownloadStatusResponseBody</p>
 */
public class QueryDataTrackResultDownloadStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StatusResult")
    private StatusResult statusResult;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryDataTrackResultDownloadStatusResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.statusResult = builder.statusResult;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDataTrackResultDownloadStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statusResult
     */
    public StatusResult getStatusResult() {
        return this.statusResult;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private StatusResult statusResult; 
        private Boolean success; 

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the download progress.
         */
        public Builder statusResult(StatusResult statusResult) {
            this.statusResult = statusResult;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDataTrackResultDownloadStatusResponseBody build() {
            return new QueryDataTrackResultDownloadStatusResponseBody(this);
        } 

    } 

    public static class StatusResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadStatus")
        private String downloadStatus;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("StatusDesc")
        private String statusDesc;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private StatusResult(Builder builder) {
            this.downloadStatus = builder.downloadStatus;
            this.downloadUrl = builder.downloadUrl;
            this.statusDesc = builder.statusDesc;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatusResult create() {
            return builder().build();
        }

        /**
         * @return downloadStatus
         */
        public String getDownloadStatus() {
            return this.downloadStatus;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String downloadStatus; 
            private String downloadUrl; 
            private String statusDesc; 
            private Long totalCount; 

            /**
             * The status of the download task. Valid values:
             * <p>
             * 
             * *   **INIT**: The download task is being initialized.
             * *   **LISTING**: The download task is in a transient intermediate state during the initialization.
             * *   **DOWNLOADING**: The download task is being processed.
             * *   **DOWNLOAD_SUCCESS**: The download task was successfully processed.
             * *   **DOWNLOAD_FAIL**: The download task failed.
             */
            public Builder downloadStatus(String downloadStatus) {
                this.downloadStatus = downloadStatus;
                return this;
            }

            /**
             * The URL that is used to download data tracking logs. This parameter is returned only when the value of DownloadStatus is DOWNLOAD_SUCCESS.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * The description of the state.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public StatusResult build() {
                return new StatusResult(this);
            } 

        } 

    }
}
