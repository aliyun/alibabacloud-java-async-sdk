// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTagValResponse} extends {@link TeaModel}
 *
 * <p>GetTagValResponse</p>
 */
public class GetTagValResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTagValResponseBody body;

    private GetTagValResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTagValResponse create() {
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
    public GetTagValResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTagValResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTagValResponseBody body);

        @Override
        GetTagValResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTagValResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTagValResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTagValResponse response) {
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
        public Builder body(GetTagValResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTagValResponse build() {
            return new GetTagValResponse(this);
        } 

    } 

}
