// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The ID of the download task.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder downloadId(String downloadId) {
            this.downloadId = downloadId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
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
