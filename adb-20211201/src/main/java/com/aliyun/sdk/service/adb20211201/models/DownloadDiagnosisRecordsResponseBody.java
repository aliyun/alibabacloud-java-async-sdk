// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadDiagnosisRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DownloadDiagnosisRecordsResponseBody</p>
 */
public class DownloadDiagnosisRecordsResponseBody extends TeaModel {
    @NameInMap("DownloadId")
    private Integer downloadId;

    @NameInMap("RequestId")
    private String requestId;

    private DownloadDiagnosisRecordsResponseBody(Builder builder) {
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
     * @return downloadId
     */
    public Integer getDownloadId() {
        return this.downloadId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer downloadId; 
        private String requestId; 

        /**
         * DownloadId.
         */
        public Builder downloadId(Integer downloadId) {
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

        public DownloadDiagnosisRecordsResponseBody build() {
            return new DownloadDiagnosisRecordsResponseBody(this);
        } 

    } 

}
