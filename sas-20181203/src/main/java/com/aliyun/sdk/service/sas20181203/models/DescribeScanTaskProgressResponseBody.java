// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeScanTaskProgressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScanTaskProgressResponseBody</p>
 */
public class DescribeScanTaskProgressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScanTaskProgress")
    private String scanTaskProgress;

    @com.aliyun.core.annotation.NameInMap("TargetInfo")
    private String targetInfo;

    private DescribeScanTaskProgressResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scanTaskProgress = builder.scanTaskProgress;
        this.targetInfo = builder.targetInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScanTaskProgressResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scanTaskProgress
     */
    public String getScanTaskProgress() {
        return this.scanTaskProgress;
    }

    /**
     * @return targetInfo
     */
    public String getTargetInfo() {
        return this.targetInfo;
    }

    public static final class Builder {
        private String requestId; 
        private String scanTaskProgress; 
        private String targetInfo; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScanTaskProgress.
         */
        public Builder scanTaskProgress(String scanTaskProgress) {
            this.scanTaskProgress = scanTaskProgress;
            return this;
        }

        /**
         * TargetInfo.
         */
        public Builder targetInfo(String targetInfo) {
            this.targetInfo = targetInfo;
            return this;
        }

        public DescribeScanTaskProgressResponseBody build() {
            return new DescribeScanTaskProgressResponseBody(this);
        } 

    } 

}
