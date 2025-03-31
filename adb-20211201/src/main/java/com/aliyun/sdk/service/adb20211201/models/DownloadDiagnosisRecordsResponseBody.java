// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DownloadDiagnosisRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DownloadDiagnosisRecordsResponseBody</p>
 */
public class DownloadDiagnosisRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DownloadId")
    private Integer downloadId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DownloadDiagnosisRecordsResponseBody model) {
            this.downloadId = model.downloadId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The download ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25494</p>
         */
        public Builder downloadId(Integer downloadId) {
            this.downloadId = downloadId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>845774AC-5D43-53A2-AAB8-C73828E68508</p>
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
