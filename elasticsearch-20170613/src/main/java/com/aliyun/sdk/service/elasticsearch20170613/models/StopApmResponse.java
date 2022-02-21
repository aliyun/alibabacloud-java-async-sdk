// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopApmResponse} extends {@link TeaModel}
 *
 * <p>StopApmResponse</p>
 */
public class StopApmResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopApmResponseBody body;

    private StopApmResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopApmResponse create() {
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
    public StopApmResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopApmResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopApmResponseBody body);

        @Override
        StopApmResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopApmResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopApmResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopApmResponse response) {
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
        public Builder body(StopApmResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopApmResponse build() {
            return new StopApmResponse(this);
        } 

    } 

}
