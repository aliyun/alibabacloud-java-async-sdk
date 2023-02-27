// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableQAServiceInfoByIdResponse} extends {@link TeaModel}
 *
 * <p>GetTableQAServiceInfoByIdResponse</p>
 */
public class GetTableQAServiceInfoByIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTableQAServiceInfoByIdResponseBody body;

    private GetTableQAServiceInfoByIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTableQAServiceInfoByIdResponse create() {
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
    public GetTableQAServiceInfoByIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTableQAServiceInfoByIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTableQAServiceInfoByIdResponseBody body);

        @Override
        GetTableQAServiceInfoByIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTableQAServiceInfoByIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTableQAServiceInfoByIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTableQAServiceInfoByIdResponse response) {
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
        public Builder body(GetTableQAServiceInfoByIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTableQAServiceInfoByIdResponse build() {
            return new GetTableQAServiceInfoByIdResponse(this);
        } 

    } 

}
