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
 * {@link GetDataExportDownloadURLResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataExportDownloadURLResponseBody</p>
 */
public class GetDataExportDownloadURLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DownloadURLResult")
    private DownloadURLResult downloadURLResult;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The details of the download URL of the file that records the export results for the ticket.</p>
         */
        public Builder downloadURLResult(DownloadURLResult downloadURLResult) {
            this.downloadURLResult = downloadURLResult;
            return this;
        }

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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4BF24EA5-9013-4C85-AE68-6C23AF5E0097</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataExportDownloadURLResponseBody build() {
            return new GetDataExportDownloadURLResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataExportDownloadURLResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataExportDownloadURLResponseBody</p>
     */
    public static class DownloadURLResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasResult")
        private Boolean hasResult;

        @com.aliyun.core.annotation.NameInMap("TipMessage")
        private String tipMessage;

        @com.aliyun.core.annotation.NameInMap("URL")
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
             * <p>Indicates whether export results are available for download. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasResult(Boolean hasResult) {
                this.hasResult = hasResult;
                return this;
            }

            /**
             * <p>The message that indicates an exception.</p>
             * 
             * <strong>example:</strong>
             * <p>tip message</p>
             */
            public Builder tipMessage(String tipMessage) {
                this.tipMessage = tipMessage;
                return this;
            }

            /**
             * <p>The download URL of the file that records the export results for the ticket.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dms-idb-hangzhou.oss-cn-hangzhou.aliyuncs.com/xxx.zip">https://dms-idb-hangzhou.oss-cn-hangzhou.aliyuncs.com/xxx.zip</a></p>
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
