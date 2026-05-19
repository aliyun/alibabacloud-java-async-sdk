// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link CreateAIStaffConversationRequest} extends {@link RequestModel}
 *
 * <p>CreateAIStaffConversationRequest</p>
 */
public class CreateAIStaffConversationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Text")
    private String text;

    private CreateAIStaffConversationRequest(Builder builder) {
        super(builder);
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAIStaffConversationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder extends Request.Builder<CreateAIStaffConversationRequest, Builder> {
        private String text; 

        private Builder() {
            super();
        } 

        private Builder(CreateAIStaffConversationRequest request) {
            super(request);
            this.text = request.text;
        } 

        /**
         * Text.
         */
        public Builder text(String text) {
            this.putBodyParameter("Text", text);
            this.text = text;
            return this;
        }

        @Override
        public CreateAIStaffConversationRequest build() {
            return new CreateAIStaffConversationRequest(this);
        } 

    } 

}
