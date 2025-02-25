// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link CreateTextTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateTextTaskRequest</p>
 */
public class CreateTextTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private TextTaskCreateCmd body;

    private CreateTextTaskRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTextTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public TextTaskCreateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateTextTaskRequest, Builder> {
        private TextTaskCreateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(CreateTextTaskRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(TextTaskCreateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateTextTaskRequest build() {
            return new CreateTextTaskRequest(this);
        } 

    } 

}
