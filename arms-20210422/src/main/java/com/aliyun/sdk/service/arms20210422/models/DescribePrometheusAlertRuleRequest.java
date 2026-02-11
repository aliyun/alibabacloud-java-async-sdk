// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

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
 * {@link DescribePrometheusAlertRuleRequest} extends {@link RequestModel}
 *
 * <p>DescribePrometheusAlertRuleRequest</p>
 */
public class DescribePrometheusAlertRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long alertId;

    private DescribePrometheusAlertRuleRequest(Builder builder) {
        super(builder);
        this.alertId = builder.alertId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrometheusAlertRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertId
     */
    public Long getAlertId() {
        return this.alertId;
    }

    public static final class Builder extends Request.Builder<DescribePrometheusAlertRuleRequest, Builder> {
        private Long alertId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePrometheusAlertRuleRequest request) {
            super(request);
            this.alertId = request.alertId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder alertId(Long alertId) {
            this.putQueryParameter("AlertId", alertId);
            this.alertId = alertId;
            return this;
        }

        @Override
        public DescribePrometheusAlertRuleRequest build() {
            return new DescribePrometheusAlertRuleRequest(this);
        } 

    } 

}
