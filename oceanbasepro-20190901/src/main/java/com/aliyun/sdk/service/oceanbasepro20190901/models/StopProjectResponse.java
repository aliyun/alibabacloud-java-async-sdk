// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopProjectResponse} extends {@link TeaModel}
 *
 * <p>StopProjectResponse</p>
 */
public class StopProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopProjectResponseBody body;

    private StopProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopProjectResponse create() {
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
    public StopProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopProjectResponseBody body);

        @Override
        StopProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopProjectResponse response) {
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
        public Builder body(StopProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopProjectResponse build() {
            return new StopProjectResponse(this);
        } 

    } 

}
