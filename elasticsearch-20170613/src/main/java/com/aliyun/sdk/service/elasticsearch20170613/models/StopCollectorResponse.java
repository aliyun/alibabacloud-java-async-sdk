// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopCollectorResponse} extends {@link TeaModel}
 *
 * <p>StopCollectorResponse</p>
 */
public class StopCollectorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopCollectorResponseBody body;

    private StopCollectorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopCollectorResponse create() {
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
    public StopCollectorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopCollectorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopCollectorResponseBody body);

        @Override
        StopCollectorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopCollectorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopCollectorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopCollectorResponse response) {
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
        public Builder body(StopCollectorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopCollectorResponse build() {
            return new StopCollectorResponse(this);
        } 

    } 

}
