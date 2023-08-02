// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadSQLLogsRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DownloadSQLLogsRecordsResponseBody</p>
 */
public class DownloadSQLLogsRecordsResponseBody extends TeaModel {
    @NameInMap("DownloadId")
    private Long downloadId;

    @NameInMap("RequestId")
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
         * DownloadId.
         */
        public Builder downloadId(Long downloadId) {
            this.downloadId = downloadId;
            return this;
        }

        /**
         * RequestId.
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
