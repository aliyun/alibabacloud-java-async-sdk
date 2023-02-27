// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTurnCredentialsResponse} extends {@link TeaModel}
 *
 * <p>GetTurnCredentialsResponse</p>
 */
public class GetTurnCredentialsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTurnCredentialsResponseBody body;

    private GetTurnCredentialsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTurnCredentialsResponse create() {
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
    public GetTurnCredentialsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTurnCredentialsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTurnCredentialsResponseBody body);

        @Override
        GetTurnCredentialsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTurnCredentialsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTurnCredentialsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTurnCredentialsResponse response) {
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
        public Builder body(GetTurnCredentialsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTurnCredentialsResponse build() {
            return new GetTurnCredentialsResponse(this);
        } 

    } 

}
