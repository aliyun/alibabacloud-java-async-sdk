// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRuleActionResponse} extends {@link TeaModel}
 *
 * <p>UpdateRuleActionResponse</p>
 */
public class UpdateRuleActionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateRuleActionResponseBody body;

    private UpdateRuleActionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateRuleActionResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public UpdateRuleActionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateRuleActionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateRuleActionResponseBody body);

        @Override
        UpdateRuleActionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateRuleActionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateRuleActionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateRuleActionResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(UpdateRuleActionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateRuleActionResponse build() {
            return new UpdateRuleActionResponse(this);
        } 

    } 

}
