// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIntentRequest} extends {@link RequestModel}
 *
 * <p>DeleteIntentRequest</p>
 */
public class DeleteIntentRequest extends Request {
    @Query
    @NameInMap("IntentId")
    @Validation(required = true)
    private Long intentId;

    private DeleteIntentRequest(Builder builder) {
        super(builder);
        this.intentId = builder.intentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIntentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return intentId
     */
    public Long getIntentId() {
        return this.intentId;
    }

    public static final class Builder extends Request.Builder<DeleteIntentRequest, Builder> {
        private Long intentId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIntentRequest response) {
            super(response);
            this.intentId = response.intentId;
        } 

        /**
         * IntentId.
         */
        public Builder intentId(Long intentId) {
            this.putQueryParameter("IntentId", intentId);
            this.intentId = intentId;
            return this;
        }

        @Override
        public DeleteIntentRequest build() {
            return new DeleteIntentRequest(this);
        } 

    } 

}
