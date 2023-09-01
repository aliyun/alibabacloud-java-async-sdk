// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopEaisEiResponse} extends {@link TeaModel}
 *
 * <p>StopEaisEiResponse</p>
 */
public class StopEaisEiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopEaisEiResponseBody body;

    private StopEaisEiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopEaisEiResponse create() {
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
    public StopEaisEiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopEaisEiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopEaisEiResponseBody body);

        @Override
        StopEaisEiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopEaisEiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopEaisEiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopEaisEiResponse response) {
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
        public Builder body(StopEaisEiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopEaisEiResponse build() {
            return new StopEaisEiResponse(this);
        } 

    } 

}
