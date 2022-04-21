// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDBExportTaskStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDBExportTaskStatusResponseBody</p>
 */
public class QueryDBExportTaskStatusResponseBody extends TeaModel {
    @NameInMap("DetailMessage")
    private String detailMessage;

    @NameInMap("DownloadUrl")
    private String downloadUrl;

    @NameInMap("ExportedCount")
    private String exportedCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private QueryDBExportTaskStatusResponseBody(Builder builder) {
        this.detailMessage = builder.detailMessage;
        this.downloadUrl = builder.downloadUrl;
        this.exportedCount = builder.exportedCount;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDBExportTaskStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return detailMessage
     */
    public String getDetailMessage() {
        return this.detailMessage;
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return exportedCount
     */
    public String getExportedCount() {
        return this.exportedCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String detailMessage; 
        private String downloadUrl; 
        private String exportedCount; 
        private String requestId; 
        private String status; 

        /**
         * DetailMessage.
         */
        public Builder detailMessage(String detailMessage) {
            this.detailMessage = detailMessage;
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
         * ExportedCount.
         */
        public Builder exportedCount(String exportedCount) {
            this.exportedCount = exportedCount;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public QueryDBExportTaskStatusResponseBody build() {
            return new QueryDBExportTaskStatusResponseBody(this);
        } 

    } 

}
