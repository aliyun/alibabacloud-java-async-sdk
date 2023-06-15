// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLCollectorRetentionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLCollectorRetentionResponseBody</p>
 */
public class DescribeSQLCollectorRetentionResponseBody extends TeaModel {
    @NameInMap("ConfigValue")
    private String configValue;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeSQLCollectorRetentionResponseBody(Builder builder) {
        this.configValue = builder.configValue;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLCollectorRetentionResponseBody create() {
        return builder().build();
    }

    /**
     * @return configValue
     */
    public String getConfigValue() {
        return this.configValue;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String configValue; 
        private String requestId; 

        /**
         * The log backup retention duration that is allowed by the SQL explorer feature on the instance. Valid values:
         * <p>
         * 
         * *   **30:** 30 days
         * *   **180:** 180 days
         * *   **365:** one year
         * *   **1095:** three years
         * *   **1825:** five years
         */
        public Builder configValue(String configValue) {
            this.configValue = configValue;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSQLCollectorRetentionResponseBody build() {
            return new DescribeSQLCollectorRetentionResponseBody(this);
        } 

    } 

}
