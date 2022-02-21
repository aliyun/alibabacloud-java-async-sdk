// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIntentRequest} extends {@link RequestModel}
 *
 * <p>UpdateIntentRequest</p>
 */
public class UpdateIntentRequest extends Request {
    @Query
    @NameInMap("IntentDefinition")
    @Validation(required = true)
    private IntentCreateDTO intentDefinition;

    @Query
    @NameInMap("IntentId")
    @Validation(required = true)
    private Long intentId;

    private UpdateIntentRequest(Builder builder) {
        super(builder);
        this.intentDefinition = builder.intentDefinition;
        this.intentId = builder.intentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIntentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return intentDefinition
     */
    public IntentCreateDTO getIntentDefinition() {
        return this.intentDefinition;
    }

    /**
     * @return intentId
     */
    public Long getIntentId() {
        return this.intentId;
    }

    public static final class Builder extends Request.Builder<UpdateIntentRequest, Builder> {
        private IntentCreateDTO intentDefinition; 
        private Long intentId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIntentRequest response) {
            super(response);
            this.intentDefinition = response.intentDefinition;
            this.intentId = response.intentId;
        } 

        /**
         * IntentDefinition.
         */
        public Builder intentDefinition(IntentCreateDTO intentDefinition) {
            this.putQueryParameter("IntentDefinition", intentDefinition);
            this.intentDefinition = intentDefinition;
            return this;
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
        public UpdateIntentRequest build() {
            return new UpdateIntentRequest(this);
        } 

    } 

}
