// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadSQLLogsRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DownloadSQLLogsRecordsResponseBody</p>
 */
public class DownloadSQLLogsRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DownloadId")
    private Long downloadId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DownloadSQLLogsRecordsResponseBody(Builder builder) {
        this.downloadId = builder.downloadId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadSQLLogsRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return downloadId
     */
    public Long getDownloadId() {
        return this.downloadId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long downloadId; 
        private String requestId; 

        /**
         * The ID of the download task.
         */
        public Builder downloadId(Long downloadId) {
            this.downloadId = downloadId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DownloadSQLLogsRecordsResponseBody build() {
            return new DownloadSQLLogsRecordsResponseBody(this);
        } 

    } 

}
