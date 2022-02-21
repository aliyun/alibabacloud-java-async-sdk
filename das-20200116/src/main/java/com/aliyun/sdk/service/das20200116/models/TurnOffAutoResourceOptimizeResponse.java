// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TurnOffAutoResourceOptimizeResponse} extends {@link TeaModel}
 *
 * <p>TurnOffAutoResourceOptimizeResponse</p>
 */
public class TurnOffAutoResourceOptimizeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TurnOffAutoResourceOptimizeResponseBody body;

    private TurnOffAutoResourceOptimizeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TurnOffAutoResourceOptimizeResponse create() {
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
    public TurnOffAutoResourceOptimizeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TurnOffAutoResourceOptimizeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TurnOffAutoResourceOptimizeResponseBody body);

        @Override
        TurnOffAutoResourceOptimizeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TurnOffAutoResourceOptimizeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TurnOffAutoResourceOptimizeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TurnOffAutoResourceOptimizeResponse response) {
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
        public Builder body(TurnOffAutoResourceOptimizeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TurnOffAutoResourceOptimizeResponse build() {
            return new TurnOffAutoResourceOptimizeResponse(this);
        } 

    } 

}
