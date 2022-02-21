// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePrometheusAlertRuleRequest} extends {@link RequestModel}
 *
 * <p>DeletePrometheusAlertRuleRequest</p>
 */
public class DeletePrometheusAlertRuleRequest extends Request {
    @Query
    @NameInMap("AlertId")
    @Validation(required = true)
    private Long alertId;

    private DeletePrometheusAlertRuleRequest(Builder builder) {
        super(builder);
        this.alertId = builder.alertId;
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

    public static final class Builder extends Request.Builder<DeletePrometheusAlertRuleRequest, Builder> {
        private Long alertId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePrometheusAlertRuleRequest response) {
            super(response);
            this.alertId = response.alertId;
        } 

        /**
         * AlertId.
         */
        public Builder alertId(Long alertId) {
            this.putQueryParameter("AlertId", alertId);
            this.alertId = alertId;
            return this;
        }

        @Override
        public DeletePrometheusAlertRuleRequest build() {
            return new DeletePrometheusAlertRuleRequest(this);
        } 

    } 

}
