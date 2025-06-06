// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link CreateToolsetRequest} extends {@link RequestModel}
 *
 * <p>CreateToolsetRequest</p>
 */
public class CreateToolsetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private Toolset body;

    private CreateToolsetRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateToolsetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public Toolset getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateToolsetRequest, Builder> {
        private Toolset body; 

        private Builder() {
            super();
        } 

        private Builder(CreateToolsetRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(Toolset body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateToolsetRequest build() {
            return new CreateToolsetRequest(this);
        } 

    } 

}
