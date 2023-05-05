// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TBAccountInfoQueryResponse} extends {@link TeaModel}
 *
 * <p>TBAccountInfoQueryResponse</p>
 */
public class TBAccountInfoQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TBAccountInfoQueryResponseBody body;

    private TBAccountInfoQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TBAccountInfoQueryResponse create() {
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
    public TBAccountInfoQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TBAccountInfoQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TBAccountInfoQueryResponseBody body);

        @Override
        TBAccountInfoQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TBAccountInfoQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TBAccountInfoQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TBAccountInfoQueryResponse response) {
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
        public Builder body(TBAccountInfoQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TBAccountInfoQueryResponse build() {
            return new TBAccountInfoQueryResponse(this);
        } 

    } 

}
