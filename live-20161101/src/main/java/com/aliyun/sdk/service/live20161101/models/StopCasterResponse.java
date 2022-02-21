// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopCasterResponse} extends {@link TeaModel}
 *
 * <p>StopCasterResponse</p>
 */
public class StopCasterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopCasterResponseBody body;

    private StopCasterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopCasterResponse create() {
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
    public StopCasterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopCasterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopCasterResponseBody body);

        @Override
        StopCasterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopCasterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopCasterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopCasterResponse response) {
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
        public Builder body(StopCasterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopCasterResponse build() {
            return new StopCasterResponse(this);
        } 

    } 

}
