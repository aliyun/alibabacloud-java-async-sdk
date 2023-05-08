// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartVirusScanTaskResponseBody} extends {@link TeaModel}
 *
 * <p>StartVirusScanTaskResponseBody</p>
 */
public class StartVirusScanTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScanTaskId")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScanTaskId.
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
