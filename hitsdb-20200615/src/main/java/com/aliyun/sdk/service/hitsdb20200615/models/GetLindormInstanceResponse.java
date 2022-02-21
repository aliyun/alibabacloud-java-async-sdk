// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLindormInstanceResponse} extends {@link TeaModel}
 *
 * <p>GetLindormInstanceResponse</p>
 */
public class GetLindormInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLindormInstanceResponseBody body;

    private GetLindormInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLindormInstanceResponse create() {
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
    public GetLindormInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLindormInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLindormInstanceResponseBody body);

        @Override
        GetLindormInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLindormInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLindormInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLindormInstanceResponse response) {
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
        public Builder body(GetLindormInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLindormInstanceResponse build() {
            return new GetLindormInstanceResponse(this);
        } 

    } 

}
