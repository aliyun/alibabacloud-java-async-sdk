// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataExportDownloadURLResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataExportDownloadURLResponseBody</p>
 */
public class GetDataExportDownloadURLResponseBody extends TeaModel {
    @NameInMap("DownloadURLResult")
    private DownloadURLResult downloadURLResult;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetDataExportDownloadURLResponseBody(Builder builder) {
        this.downloadURLResult = builder.downloadURLResult;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataExportDownloadURLResponseBody create() {
        return builder().build();
    }

    /**
     * @return downloadURLResult
     */
    public DownloadURLResult getDownloadURLResult() {
        return this.downloadURLResult;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private DownloadURLResult downloadURLResult; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * The details about the download URL of the file that records the export results for the ticket.
         */
        public Builder downloadURLResult(DownloadURLResult downloadURLResult) {
            this.downloadURLResult = downloadURLResult;
            return this;
        }

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
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

        public GetDataExportDownloadURLResponseBody build() {
            return new GetDataExportDownloadURLResponseBody(this);
        } 

    } 

    public static class DownloadURLResult extends TeaModel {
        @NameInMap("HasResult")
        private Boolean hasResult;

        @NameInMap("TipMessage")
        private String tipMessage;

        @NameInMap("URL")
        private String URL;

        private DownloadURLResult(Builder builder) {
            this.hasResult = builder.hasResult;
            this.tipMessage = builder.tipMessage;
            this.URL = builder.URL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DownloadURLResult create() {
            return builder().build();
        }

        /**
         * @return hasResult
         */
        public Boolean getHasResult() {
            return this.hasResult;
        }

        /**
         * @return tipMessage
         */
        public String getTipMessage() {
            return this.tipMessage;
        }

        /**
         * @return URL
         */
        public String getURL() {
            return this.URL;
        }

        public static final class Builder {
            private Boolean hasResult; 
            private String tipMessage; 
            private String URL; 

            /**
             * Indicates whether export results are available for download. Valid values:
             * <p>
             * 
             * *   **true**: Export results are available for download.
             * *   **false**: No export results are available for download.
             */
            public Builder hasResult(Boolean hasResult) {
                this.hasResult = hasResult;
                return this;
            }

            /**
             * The message that indicates an exception.
             */
            public Builder tipMessage(String tipMessage) {
                this.tipMessage = tipMessage;
                return this;
            }

            /**
             * The download URL of the file that records the export results for the ticket.
             */
            public Builder URL(String URL) {
                this.URL = URL;
                return this;
            }

            public DownloadURLResult build() {
                return new DownloadURLResult(this);
            } 

        } 

    }
}
