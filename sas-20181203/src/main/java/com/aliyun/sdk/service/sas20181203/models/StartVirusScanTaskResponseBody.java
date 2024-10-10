// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartVirusScanTaskResponseBody} extends {@link TeaModel}
 *
 * <p>StartVirusScanTaskResponseBody</p>
 */
public class StartVirusScanTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScanTaskId")
    private Long scanTaskId;

    private StartVirusScanTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scanTaskId = builder.scanTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartVirusScanTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scanTaskId
     */
    public Long getScanTaskId() {
        return this.scanTaskId;
    }

    public static final class Builder {
        private String requestId; 
        private Long scanTaskId; 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>DAE17926-4ABE-4DBD-9600-DDCB9B200F35</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the virus scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>282832</p>
         */
        public Builder scanTaskId(Long scanTaskId) {
            this.scanTaskId = scanTaskId;
            return this;
        }

        public StartVirusScanTaskResponseBody build() {
            return new StartVirusScanTaskResponseBody(this);
        } 

    } 

}
