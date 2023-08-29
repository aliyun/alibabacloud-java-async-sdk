// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDcdnKvResponse} extends {@link TeaModel}
 *
 * <p>GetDcdnKvResponse</p>
 */
public class GetDcdnKvResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDcdnKvResponseBody body;

    private GetDcdnKvResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDcdnKvResponse create() {
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
    public GetDcdnKvResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDcdnKvResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDcdnKvResponseBody body);

        @Override
        GetDcdnKvResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDcdnKvResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDcdnKvResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDcdnKvResponse response) {
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
        public Builder body(GetDcdnKvResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDcdnKvResponse build() {
            return new GetDcdnKvResponse(this);
        } 

    } 

}
