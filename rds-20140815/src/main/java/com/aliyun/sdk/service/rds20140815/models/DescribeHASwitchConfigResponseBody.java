// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHASwitchConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHASwitchConfigResponseBody</p>
 */
public class DescribeHASwitchConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HAConfig")
    private String HAConfig;

    @com.aliyun.core.annotation.NameInMap("ManualHATime")
    private String manualHATime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeHASwitchConfigResponseBody(Builder builder) {
        this.HAConfig = builder.HAConfig;
        this.manualHATime = builder.manualHATime;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHASwitchConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return HAConfig
     */
    public String getHAConfig() {
        return this.HAConfig;
    }

    /**
     * @return manualHATime
     */
    public String getManualHATime() {
        return this.manualHATime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String HAConfig; 
        private String manualHATime; 
        private String requestId; 

        /**
         * The status of the automatic primary/secondary switchover feature. Valid values:
         * <p>
         * 
         * *   **Auto:** The automatic primary/secondary switchover feature is enabled. The system automatically switches your workloads over from the instance to its secondary instance in the event of a fault.
         * *   **Manual:** The automatic primary/secondary switchover feature is temporarily disabled.
         */
        public Builder HAConfig(String HAConfig) {
            this.HAConfig = HAConfig;
            return this;
        }

        /**
         * The time when the automatic primary/secondary switchover feature is enabled again. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         */
        public Builder manualHATime(String manualHATime) {
            this.manualHATime = manualHATime;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHASwitchConfigResponseBody build() {
            return new DescribeHASwitchConfigResponseBody(this);
        } 

    } 

}
