// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIntentRequest} extends {@link RequestModel}
 *
 * <p>CreateIntentRequest</p>
 */
public class CreateIntentRequest extends Request {
    @Query
    @NameInMap("DialogId")
    @Validation(required = true)
    private Long dialogId;

    @Query
    @NameInMap("IntentDefinition")
    @Validation(required = true)
    private IntentCreateDTO intentDefinition;

    private CreateIntentRequest(Builder builder) {
        super(builder);
        this.dialogId = builder.dialogId;
        this.intentDefinition = builder.intentDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIntentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dialogId
     */
    public Long getDialogId() {
        return this.dialogId;
    }

    /**
     * @return intentDefinition
     */
    public IntentCreateDTO getIntentDefinition() {
        return this.intentDefinition;
    }

    public static final class Builder extends Request.Builder<CreateIntentRequest, Builder> {
        private Long dialogId; 
        private IntentCreateDTO intentDefinition; 

        private Builder() {
            super();
        } 

        private Builder(CreateIntentRequest response) {
            super(response);
            this.dialogId = response.dialogId;
            this.intentDefinition = response.intentDefinition;
        } 

        /**
         * DialogId.
         */
        public Builder dialogId(Long dialogId) {
            this.putQueryParameter("DialogId", dialogId);
            this.dialogId = dialogId;
            return this;
        }

        /**
         * IntentDefinition.
         */
        public Builder intentDefinition(IntentCreateDTO intentDefinition) {
            this.putQueryParameter("IntentDefinition", intentDefinition);
            this.intentDefinition = intentDefinition;
            return this;
        }

        @Override
        public CreateIntentRequest build() {
            return new CreateIntentRequest(this);
        } 

    } 

}
