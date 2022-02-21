// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInventoryResponse} extends {@link TeaModel}
 *
 * <p>GetInventoryResponse</p>
 */
public class GetInventoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInventoryResponseBody body;

    private GetInventoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInventoryResponse create() {
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
    public GetInventoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInventoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInventoryResponseBody body);

        @Override
        GetInventoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInventoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInventoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInventoryResponse response) {
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
        public Builder body(GetInventoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInventoryResponse build() {
            return new GetInventoryResponse(this);
        } 

    } 

}
