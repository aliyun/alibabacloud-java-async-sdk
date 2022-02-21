// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountRelationResponse} extends {@link TeaModel}
 *
 * <p>GetAccountRelationResponse</p>
 */
public class GetAccountRelationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAccountRelationResponseBody body;

    private GetAccountRelationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAccountRelationResponse create() {
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
    public GetAccountRelationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAccountRelationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAccountRelationResponseBody body);

        @Override
        GetAccountRelationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAccountRelationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAccountRelationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAccountRelationResponse response) {
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
        public Builder body(GetAccountRelationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAccountRelationResponse build() {
            return new GetAccountRelationResponse(this);
        } 

    } 

}
