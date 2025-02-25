// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the download progress.</p>
         */
        public Builder statusResult(StatusResult statusResult) {
            this.statusResult = statusResult;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDataTrackResultDownloadStatusResponseBody build() {
            return new QueryDataTrackResultDownloadStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDataTrackResultDownloadStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDataTrackResultDownloadStatusResponseBody</p>
     */
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
             * <p>The status of the download task. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The download task is being initialized.</li>
             * <li><strong>LISTING</strong>: The download task is in a transient intermediate state during the initialization.</li>
             * <li><strong>DOWNLOADING</strong>: The download task is being processed.</li>
             * <li><strong>DOWNLOAD_SUCCESS</strong>: The download task was successfully processed.</li>
             * <li><strong>DOWNLOAD_FAIL</strong>: The download task failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DOWNLOAD_SUCCESS</p>
             */
            public Builder downloadStatus(String downloadStatus) {
                this.downloadStatus = downloadStatus;
                return this;
            }

            /**
             * <p>The URL that is used to download data tracking logs. This parameter is returned only when the value of DownloadStatus is DOWNLOAD_SUCCESS.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://idbsaasstore.oss-cn-zhangjiakou.aliyuncs.com/****_REDO_31201_207.zip?Expires=1682239593&OSSAccessKeyId=****&Signature=">https://idbsaasstore.oss-cn-zhangjiakou.aliyuncs.com/****_REDO_31201_207.zip?Expires=1682239593&amp;OSSAccessKeyId=****&amp;Signature=</a>****</p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The description of the state.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>69</p>
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
