// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScanTaskProgressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScanTaskProgressResponseBody</p>
 */
public class DescribeScanTaskProgressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScanTaskProgress")
    private String scanTaskProgress;

    @NameInMap("TargetInfo")
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
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The progress of the virus scan task. Valid values:
         * <p>
         * 
         * *   **init**: The task is being initialized.
         * *   **Processing**: The task is running.
         * *   **Success**: The task is complete.
         * *   **Failed**: The task fails.
         */
        public Builder scanTaskProgress(String scanTaskProgress) {
            this.scanTaskProgress = scanTaskProgress;
            return this;
        }

        /**
         * The information about the asset on which the virus scan task runs. The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:
         * <p>
         * 
         * *   **type**: the type of the asset on which the virus scan task runs. Valid values:
         * 
         *     *   **groupId**: server group.
         *     *   **uuid**: server.
         * 
         * *   **name**: the name of the server group or server.
         * 
         * *   **target**: the asset on which the virus scan task runs. The value of this field varies based on the value of the type field.
         * 
         *     *   If the value of **type** is **groupId**, the value of this field is the ID of the server group.
         *     *   If the value of **type** is **uuid**, the value of this field is the UUID of the server.
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
