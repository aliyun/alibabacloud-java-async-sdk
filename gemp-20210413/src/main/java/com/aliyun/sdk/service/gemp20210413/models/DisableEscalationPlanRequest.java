// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableEscalationPlanRequest} extends {@link RequestModel}
 *
 * <p>DisableEscalationPlanRequest</p>
 */
public class DisableEscalationPlanRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("escalationPlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long escalationPlanId;

    private DisableEscalationPlanRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.escalationPlanId = builder.escalationPlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableEscalationPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return escalationPlanId
     */
    public Long getEscalationPlanId() {
        return this.escalationPlanId;
    }

    public static final class Builder extends Request.Builder<DisableEscalationPlanRequest, Builder> {
        private String clientToken; 
        private Long escalationPlanId; 

        private Builder() {
            super();
        } 

        private Builder(DisableEscalationPlanRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.escalationPlanId = request.escalationPlanId;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * escalationPlanId.
         */
        public Builder escalationPlanId(Long escalationPlanId) {
            this.putBodyParameter("escalationPlanId", escalationPlanId);
            this.escalationPlanId = escalationPlanId;
            return this;
        }

        @Override
        public DisableEscalationPlanRequest build() {
            return new DisableEscalationPlanRequest(this);
        } 

    } 

}
