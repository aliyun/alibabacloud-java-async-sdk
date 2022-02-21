// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOssPolicyResponse} extends {@link TeaModel}
 *
 * <p>GetOssPolicyResponse</p>
 */
public class GetOssPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOssPolicyResponseBody body;

    private GetOssPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOssPolicyResponse create() {
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
    public GetOssPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOssPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOssPolicyResponseBody body);

        @Override
        GetOssPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOssPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOssPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOssPolicyResponse response) {
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
        public Builder body(GetOssPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOssPolicyResponse build() {
            return new GetOssPolicyResponse(this);
        } 

    } 

}
