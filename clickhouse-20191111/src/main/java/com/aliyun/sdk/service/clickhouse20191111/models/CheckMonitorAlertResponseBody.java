// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckMonitorAlertResponseBody} extends {@link TeaModel}
 *
 * <p>CheckMonitorAlertResponseBody</p>
 */
public class CheckMonitorAlertResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Parameter")
    private String parameter;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private CheckMonitorAlertResponseBody(Builder builder) {
        this.parameter = builder.parameter;
        this.requestId = builder.requestId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckMonitorAlertResponseBody create() {
        return builder().build();
    }

    /**
     * @return parameter
     */
    public String getParameter() {
        return this.parameter;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private String parameter; 
        private String requestId; 
        private String state; 

        /**
         * The parameters that are used to configure the monitoring and alerting feature.
         */
        public Builder parameter(String parameter) {
            this.parameter = parameter;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the monitoring and alerting feature is enabled. Valid values:
         * <p>
         * 
         * *   **enable**: The monitoring and alerting feature is enabled.
         * *   **disable**: The monitoring and alerting feature is disabled.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public CheckMonitorAlertResponseBody build() {
            return new CheckMonitorAlertResponseBody(this);
        } 

    } 

}
