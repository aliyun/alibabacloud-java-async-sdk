// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTURNCredentialsResponse} extends {@link TeaModel}
 *
 * <p>GetTURNCredentialsResponse</p>
 */
public class GetTURNCredentialsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTURNCredentialsResponseBody body;

    private GetTURNCredentialsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTURNCredentialsResponse create() {
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
    public GetTURNCredentialsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTURNCredentialsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTURNCredentialsResponseBody body);

        @Override
        GetTURNCredentialsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTURNCredentialsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTURNCredentialsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTURNCredentialsResponse response) {
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
        public Builder body(GetTURNCredentialsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTURNCredentialsResponse build() {
            return new GetTURNCredentialsResponse(this);
        } 

    } 

}
