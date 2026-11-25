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
         * <p>The text of the user question. The first 100 characters are truncated and used as the session title.</p>
         * 
         * <strong>example:</strong>
         * <p>Bathroom hardware products, featuring a brushed stainless steel surface with a modern silver-gray color tone, presenting a minimalist and textured style. The products include showerheads, faucets, and towel racks, all of which are rust-proof and corrosion-resistant, making them suitable for humid environments. The connections between components are precisely designed with hidden screw structures to enhance overall aesthetics. The faucets and showerheads support multiple water flow modes, and the handles operate smoothly, conforming to ergonomic design. All hardware components have passed the national water-saving certification, support cold and hot water connections, and are wall-mounted</p>
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
