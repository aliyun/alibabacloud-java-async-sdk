// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDataTrackResultDownloadStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDataTrackResultDownloadStatusResponseBody</p>
 */
public class QueryDataTrackResultDownloadStatusResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StatusResult")
    private StatusResult statusResult;

    @NameInMap("Success")
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
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StatusResult.
         */
        public Builder statusResult(StatusResult statusResult) {
            this.statusResult = statusResult;
            return this;
        }

        /**
         * Success.
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
        @NameInMap("DownloadStatus")
        private String downloadStatus;

        @NameInMap("DownloadUrl")
        private String downloadUrl;

        @NameInMap("StatusDesc")
        private String statusDesc;

        @NameInMap("TotalCount")
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
             * DownloadStatus.
             */
            public Builder downloadStatus(String downloadStatus) {
                this.downloadStatus = downloadStatus;
                return this;
            }

            /**
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * StatusDesc.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * TotalCount.
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
