// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadDiagnosisRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DownloadDiagnosisRecordsResponseBody</p>
 */
public class DownloadDiagnosisRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("DownloadId")
    private String downloadId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DownloadDiagnosisRecordsResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.downloadId = builder.downloadId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadDiagnosisRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return downloadId
     */
    public String getDownloadId() {
        return this.downloadId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private String downloadId; 
        private String requestId; 

        /**
         * The ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The ID of the download task.
         */
        public Builder downloadId(String downloadId) {
            this.downloadId = downloadId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DownloadDiagnosisRecordsResponseBody build() {
            return new DownloadDiagnosisRecordsResponseBody(this);
        } 

    } 

}
