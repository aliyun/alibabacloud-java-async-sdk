// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckMonitorAlertResponseBody} extends {@link TeaModel}
 *
 * <p>CheckMonitorAlertResponseBody</p>
 */
public class CheckMonitorAlertResponseBody extends TeaModel {
    @NameInMap("Parameter")
    private String parameter;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("State")
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
         * Parameter.
         */
        public Builder parameter(String parameter) {
            this.parameter = parameter;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * State.
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
