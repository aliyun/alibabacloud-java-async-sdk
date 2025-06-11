// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CheckMonitorAlertResponseBody model) {
            this.parameter = model.parameter;
            this.requestId = model.requestId;
            this.state = model.state;
        } 

        /**
         * <p>The parameters that are used to configure the monitoring and alerting feature.</p>
         * 
         * <strong>example:</strong>
         * <p>{   &quot;monitor&quot;:{     &quot;key1&quot;:&quot;value1&quot;,     &quot;key2&quot;:&quot;value2&quot;   },   &quot;alert&quot;:{     &quot;key1&quot;:&quot;value1&quot;,     &quot;key2&quot;:&quot;value2&quot;   } }</p>
         */
        public Builder parameter(String parameter) {
            this.parameter = parameter;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>94F92113-FF63-5E57-8401-6FE123AD11DD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the monitoring and alerting feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>enable</strong>: The monitoring and alerting feature is enabled.</li>
         * <li><strong>disable</strong>: The monitoring and alerting feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
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
