// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeHASwitchConfigResponseBody model) {
            this.HAConfig = model.HAConfig;
            this.manualHATime = model.manualHATime;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status of the automatic primary/secondary switchover feature. Valid values:</p>
         * <ul>
         * <li><strong>Auto:</strong> The automatic primary/secondary switchover feature is enabled. The system automatically switches your workloads over from the instance to its secondary instance in the event of a fault.</li>
         * <li><strong>Manual:</strong> The automatic primary/secondary switchover feature is temporarily disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        public Builder HAConfig(String HAConfig) {
            this.HAConfig = HAConfig;
            return this;
        }

        /**
         * <p>The time when the automatic primary/secondary switchover feature is enabled again. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-29T15:00:00Z</p>
         */
        public Builder manualHATime(String manualHATime) {
            this.manualHATime = manualHATime;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4FDF4B79-2741-4C5F-8C76-4B953FC5C2B1</p>
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
