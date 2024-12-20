// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link DeletePrometheusAlertRuleRequest} extends {@link RequestModel}
 *
 * <p>DeletePrometheusAlertRuleRequest</p>
 */
public class DeletePrometheusAlertRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long alertId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    private DeletePrometheusAlertRuleRequest(Builder builder) {
        super(builder);
        this.alertId = builder.alertId;
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePrometheusAlertRuleRequest create() {
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

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static final class Builder extends Request.Builder<DeletePrometheusAlertRuleRequest, Builder> {
        private Long alertId; 
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePrometheusAlertRuleRequest request) {
            super(request);
            this.alertId = request.alertId;
            this.clusterId = request.clusterId;
        } 

        /**
         * <p>The ID of the alert rule. You can call the ListPrometheusAlertRules operation to query the ID of the alert rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3888704</p>
         */
        public Builder alertId(Long alertId) {
            this.putQueryParameter("AlertId", alertId);
            this.alertId = alertId;
            return this;
        }

        /**
         * <p>The cluster ID of the Prometheus monitoring alarm rule.</p>
         * 
         * <strong>example:</strong>
         * <p>cc7a37ee31aea4ed1a059eff8034b****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public DeletePrometheusAlertRuleRequest build() {
            return new DeletePrometheusAlertRuleRequest(this);
        } 

    } 

}
