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
 * {@link GetScannerTaskHitDataUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetScannerTaskHitDataUrlResponseBody</p>
 */
public class GetScannerTaskHitDataUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetScannerTaskHitDataUrlResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScannerTaskHitDataUrlResponseBody create() {
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

        private Builder(GetScannerTaskHitDataUrlResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The query result, which contains the task identifier and the temporary download URL for the hit data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID. You can use this ID for troubleshooting and log tracing.</p>
         * 
         * <strong>example:</strong>
         * <p>1EBD0C05-6C1F-4C95-9C63-B7AB7B5A9C8E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetScannerTaskHitDataUrlResponseBody build() {
            return new GetScannerTaskHitDataUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetScannerTaskHitDataUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetScannerTaskHitDataUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScannerTaskHitDataDownloadUrl")
        private String scannerTaskHitDataDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("ScannerTaskId")
        private String scannerTaskId;

        private Data(Builder builder) {
            this.scannerTaskHitDataDownloadUrl = builder.scannerTaskHitDataDownloadUrl;
            this.scannerTaskId = builder.scannerTaskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return scannerTaskHitDataDownloadUrl
         */
        public String getScannerTaskHitDataDownloadUrl() {
            return this.scannerTaskHitDataDownloadUrl;
        }

        /**
         * @return scannerTaskId
         */
        public String getScannerTaskId() {
            return this.scannerTaskId;
        }

        public static final class Builder {
            private String scannerTaskHitDataDownloadUrl; 
            private String scannerTaskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.scannerTaskHitDataDownloadUrl = model.scannerTaskHitDataDownloadUrl;
                this.scannerTaskId = model.scannerTaskId;
            } 

            /**
             * <p>The temporary download URL for the attack hit data (hits.csv). The URL is valid for 2 hours. After the URL expires, call this operation again to obtain a new URL. If the task is an existing task or the agent execution mode does not produce hit data, this parameter is an empty string. The actual value is a signed temporary URL of Object Storage Service (OSS) that contains signature parameters.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/result.task-abc123def4567.hits.csv">https://example.com/result.task-abc123def4567.hits.csv</a></p>
             */
            public Builder scannerTaskHitDataDownloadUrl(String scannerTaskHitDataDownloadUrl) {
                this.scannerTaskHitDataDownloadUrl = scannerTaskHitDataDownloadUrl;
                return this;
            }

            /**
             * <p>The scan task identifier echoed from the request.</p>
             * 
             * <strong>example:</strong>
             * <p>task-abc123def4567</p>
             */
            public Builder scannerTaskId(String scannerTaskId) {
                this.scannerTaskId = scannerTaskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
