// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRuleActionResponse} extends {@link TeaModel}
 *
 * <p>GetRuleActionResponse</p>
 */
public class GetRuleActionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRuleActionResponseBody body;

    private GetRuleActionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRuleActionResponse create() {
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
    public GetRuleActionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRuleActionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRuleActionResponseBody body);

        @Override
        GetRuleActionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRuleActionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRuleActionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRuleActionResponse response) {
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
        public Builder body(GetRuleActionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRuleActionResponse build() {
            return new GetRuleActionResponse(this);
        } 

    } 

}
