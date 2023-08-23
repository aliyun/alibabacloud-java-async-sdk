// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUnionIdResponse} extends {@link TeaModel}
 *
 * <p>GetUnionIdResponse</p>
 */
public class GetUnionIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUnionIdResponseBody body;

    private GetUnionIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUnionIdResponse create() {
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
    public GetUnionIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUnionIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUnionIdResponseBody body);

        @Override
        GetUnionIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUnionIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUnionIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUnionIdResponse response) {
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
        public Builder body(GetUnionIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUnionIdResponse build() {
            return new GetUnionIdResponse(this);
        } 

    } 

}
