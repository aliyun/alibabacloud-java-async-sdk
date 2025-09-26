// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link CreateCodeInterpreterRequest} extends {@link RequestModel}
 *
 * <p>CreateCodeInterpreterRequest</p>
 */
public class CreateCodeInterpreterRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateCodeInterpreterInput body;

    private CreateCodeInterpreterRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCodeInterpreterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public CreateCodeInterpreterInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateCodeInterpreterRequest, Builder> {
        private CreateCodeInterpreterInput body; 

        private Builder() {
            super();
        } 

        private Builder(CreateCodeInterpreterRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder body(CreateCodeInterpreterInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateCodeInterpreterRequest build() {
            return new CreateCodeInterpreterRequest(this);
        } 

    } 

}
