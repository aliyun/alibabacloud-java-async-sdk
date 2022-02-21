// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAlertRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAlertRuleResponseBody</p>
 */
public class UpdateAlertRuleResponseBody extends TeaModel {
    @NameInMap("AlertId")
    private Long alertId;

    @NameInMap("Data")
    private String data;

    @NameInMap("RequestId")
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
         * AlertId.
         */
        public Builder alertId(Long alertId) {
            this.alertId = alertId;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
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
