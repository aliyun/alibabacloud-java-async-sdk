// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEscalationPlanRequest} extends {@link RequestModel}
 *
 * <p>DeleteEscalationPlanRequest</p>
 */
public class DeleteEscalationPlanRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("escalationPlanId")
    @Validation(required = true)
    private Long escalationPlanId;

    private DeleteEscalationPlanRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.escalationPlanId = builder.escalationPlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEscalationPlanRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteEscalationPlanRequest, Builder> {
        private String clientToken; 
        private Long escalationPlanId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEscalationPlanRequest request) {
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
        public DeleteEscalationPlanRequest build() {
            return new DeleteEscalationPlanRequest(this);
        } 

    } 

}
