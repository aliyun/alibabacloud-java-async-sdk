// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetContactBlockListResponse} extends {@link TeaModel}
 *
 * <p>GetContactBlockListResponse</p>
 */
public class GetContactBlockListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetContactBlockListResponseBody body;

    private GetContactBlockListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetContactBlockListResponse create() {
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
    public GetContactBlockListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetContactBlockListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetContactBlockListResponseBody body);

        @Override
        GetContactBlockListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetContactBlockListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetContactBlockListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetContactBlockListResponse response) {
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
        public Builder body(GetContactBlockListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetContactBlockListResponse build() {
            return new GetContactBlockListResponse(this);
        } 

    } 

}
