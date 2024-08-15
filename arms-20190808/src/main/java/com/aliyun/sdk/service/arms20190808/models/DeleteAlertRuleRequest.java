// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAlertRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteAlertRuleRequest</p>
 */
public class DeleteAlertRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long alertId;

    private DeleteAlertRuleRequest(Builder builder) {
        super(builder);
        this.alertId = builder.alertId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAlertRuleRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteAlertRuleRequest, Builder> {
        private Long alertId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAlertRuleRequest request) {
            super(request);
            this.alertId = request.alertId;
        } 

        /**
         * The alert rule ID.
         * <p>
         * 
         * For more information about how to obtain the ID of an alert rule, see [GetAlertRules](~~2612348~~).
         */
        public Builder alertId(Long alertId) {
            this.putQueryParameter("AlertId", alertId);
            this.alertId = alertId;
            return this;
        }

        @Override
        public DeleteAlertRuleRequest build() {
            return new DeleteAlertRuleRequest(this);
        } 

    } 

}
