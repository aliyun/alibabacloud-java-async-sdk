// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricTopResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetricTopResponseBody</p>
 */
public class DescribeMetricTopResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Datapoints")
    private String datapoints;

    @NameInMap("Message")
    private String message;

    @NameInMap("Period")
    private String period;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMetricTopResponseBody(Builder builder) {
        this.code = builder.code;
        this.datapoints = builder.datapoints;
        this.message = builder.message;
        this.period = builder.period;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricTopResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return datapoints
     */
    public String getDatapoints() {
        return this.datapoints;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String datapoints; 
        private String message; 
        private String period; 
        private String requestId; 

        /**
         * The ID of the request.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Datapoints.
         */
        public Builder datapoints(String datapoints) {
            this.datapoints = datapoints;
            return this;
        }

        /**
         * The monitoring data.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(String period) {
            this.period = period;
            return this;
        }

        /**
         * For more information about common request parameters, see [Common parameters](~~199331~~).
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMetricTopResponseBody build() {
            return new DescribeMetricTopResponseBody(this);
        } 

    } 

}
