// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetControlRulesResponse} extends {@link TeaModel}
 *
 * <p>GetControlRulesResponse</p>
 */
public class GetControlRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetControlRulesResponseBody body;

    private GetControlRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetControlRulesResponse create() {
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
    public GetControlRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetControlRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetControlRulesResponseBody body);

        @Override
        GetControlRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetControlRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetControlRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetControlRulesResponse response) {
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
        public Builder body(GetControlRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetControlRulesResponse build() {
            return new GetControlRulesResponse(this);
        } 

    } 

}
