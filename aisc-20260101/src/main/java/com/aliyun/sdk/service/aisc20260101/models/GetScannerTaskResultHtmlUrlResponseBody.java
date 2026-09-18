// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101.models;

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
 * {@link GetScannerTaskResultHtmlUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetScannerTaskResultHtmlUrlResponseBody</p>
 */
public class GetScannerTaskResultHtmlUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetScannerTaskResultHtmlUrlResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScannerTaskResultHtmlUrlResponseBody create() {
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

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetScannerTaskResultHtmlUrlResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The query result, which contains the temporary download URL for the HTML result report.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID, which is used for troubleshooting and log tracing.</p>
         * 
         * <strong>example:</strong>
         * <p>1EBD0C05-6C1F-4C95-9C63-B7AB7B5A9C8E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetScannerTaskResultHtmlUrlResponseBody build() {
            return new GetScannerTaskResultHtmlUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetScannerTaskResultHtmlUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetScannerTaskResultHtmlUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScannerTaskResultHtmlDownloadUrl")
        private String scannerTaskResultHtmlDownloadUrl;

        private Data(Builder builder) {
            this.scannerTaskResultHtmlDownloadUrl = builder.scannerTaskResultHtmlDownloadUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return scannerTaskResultHtmlDownloadUrl
         */
        public String getScannerTaskResultHtmlDownloadUrl() {
            return this.scannerTaskResultHtmlDownloadUrl;
        }

        public static final class Builder {
            private String scannerTaskResultHtmlDownloadUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.scannerTaskResultHtmlDownloadUrl = model.scannerTaskResultHtmlDownloadUrl;
            } 

            /**
             * <p>The temporary download URL for the HTML result report. The URL is valid for 2 hours. After the URL expires, call this operation again to obtain a new URL. If the report has not been generated, this value is an empty string. The actual value is a signed temporary URL from object storage that includes signature parameters.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/result.task-abc123def4567.report.html">https://example.com/result.task-abc123def4567.report.html</a></p>
             */
            public Builder scannerTaskResultHtmlDownloadUrl(String scannerTaskResultHtmlDownloadUrl) {
                this.scannerTaskResultHtmlDownloadUrl = scannerTaskResultHtmlDownloadUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
