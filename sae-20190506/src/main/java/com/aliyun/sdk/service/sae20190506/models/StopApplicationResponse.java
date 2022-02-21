// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopApplicationResponse} extends {@link TeaModel}
 *
 * <p>StopApplicationResponse</p>
 */
public class StopApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopApplicationResponseBody body;

    private StopApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopApplicationResponse create() {
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
    public StopApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopApplicationResponseBody body);

        @Override
        StopApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopApplicationResponse response) {
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
        public Builder body(StopApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopApplicationResponse build() {
            return new StopApplicationResponse(this);
        } 

    } 

}
