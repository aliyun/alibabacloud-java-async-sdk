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
 * {@link CreateBrowserRequest} extends {@link RequestModel}
 *
 * <p>CreateBrowserRequest</p>
 */
public class CreateBrowserRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateBrowserInput body;

    private CreateBrowserRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBrowserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public CreateBrowserInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateBrowserRequest, Builder> {
        private CreateBrowserInput body; 

        private Builder() {
            super();
        } 

        private Builder(CreateBrowserRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder body(CreateBrowserInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateBrowserRequest build() {
            return new CreateBrowserRequest(this);
        } 

    } 

}
