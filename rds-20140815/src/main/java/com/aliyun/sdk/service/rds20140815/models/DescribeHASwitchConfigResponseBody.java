// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHASwitchConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHASwitchConfigResponseBody</p>
 */
public class DescribeHASwitchConfigResponseBody extends TeaModel {
    @NameInMap("HAConfig")
    private String HAConfig;

    @NameInMap("ManualHATime")
    private String manualHATime;

    @NameInMap("RequestId")
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
         * HAConfig.
         */
        public Builder HAConfig(String HAConfig) {
            this.HAConfig = HAConfig;
            return this;
        }

        /**
         * ManualHATime.
         */
        public Builder manualHATime(String manualHATime) {
            this.manualHATime = manualHATime;
            return this;
        }

        /**
         * RequestId.
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
