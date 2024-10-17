// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateAlertRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAlertRuleResponseBody</p>
 */
public class UpdateAlertRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlertId")
    private Long alertId;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateAlertRuleResponseBody(Builder builder) {
        this.alertId = builder.alertId;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAlertRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return alertId
     */
    public Long getAlertId() {
        return this.alertId;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long alertId; 
        private String data; 
        private String requestId; 

        /**
         * <p>The ID of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        public Builder alertId(Long alertId) {
            this.alertId = alertId;
            return this;
        }

        /**
         * <p>The struct returned.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6A9AEA84-7186-4D8D-B498-4585C6A2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateAlertRuleResponseBody build() {
            return new UpdateAlertRuleResponseBody(this);
        } 

    } 

}
