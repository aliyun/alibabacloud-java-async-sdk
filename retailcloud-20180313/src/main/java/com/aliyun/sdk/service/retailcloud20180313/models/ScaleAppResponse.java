// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScaleAppResponse} extends {@link TeaModel}
 *
 * <p>ScaleAppResponse</p>
 */
public class ScaleAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ScaleAppResponseBody body;

    private ScaleAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ScaleAppResponse create() {
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
    public ScaleAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ScaleAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ScaleAppResponseBody body);

        @Override
        ScaleAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ScaleAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ScaleAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ScaleAppResponse response) {
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
        public Builder body(ScaleAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ScaleAppResponse build() {
            return new ScaleAppResponse(this);
        } 

    } 

}
