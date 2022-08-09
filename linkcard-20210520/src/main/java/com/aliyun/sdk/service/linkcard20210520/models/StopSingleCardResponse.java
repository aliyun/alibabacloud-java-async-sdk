// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopSingleCardResponse} extends {@link TeaModel}
 *
 * <p>StopSingleCardResponse</p>
 */
public class StopSingleCardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopSingleCardResponseBody body;

    private StopSingleCardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopSingleCardResponse create() {
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
    public StopSingleCardResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopSingleCardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopSingleCardResponseBody body);

        @Override
        StopSingleCardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopSingleCardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopSingleCardResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopSingleCardResponse response) {
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
        public Builder body(StopSingleCardResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopSingleCardResponse build() {
            return new StopSingleCardResponse(this);
        } 

    } 

}
