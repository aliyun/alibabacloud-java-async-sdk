// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
         * <p>The ID of the download task.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder downloadId(Long downloadId) {
            this.downloadId = downloadId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7565770E-7C45-462D-BA4A-8A5396F2CAD1</p>
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
