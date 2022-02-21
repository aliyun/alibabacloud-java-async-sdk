// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModelOssPolicyResponse} extends {@link TeaModel}
 *
 * <p>GetModelOssPolicyResponse</p>
 */
public class GetModelOssPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetModelOssPolicyResponseBody body;

    private GetModelOssPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetModelOssPolicyResponse create() {
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
    public GetModelOssPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetModelOssPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetModelOssPolicyResponseBody body);

        @Override
        GetModelOssPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetModelOssPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetModelOssPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetModelOssPolicyResponse response) {
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
        public Builder body(GetModelOssPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetModelOssPolicyResponse build() {
            return new GetModelOssPolicyResponse(this);
        } 

    } 

}
