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
         * <p>The alert rule ID.</p>
         * <p>For more information about how to obtain the ID of an alert rule, see <a href="https://help.aliyun.com/document_detail/2612348.html">GetAlertRules</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
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
