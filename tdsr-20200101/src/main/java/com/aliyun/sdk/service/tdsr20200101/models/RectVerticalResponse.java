// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RectVerticalResponse} extends {@link TeaModel}
 *
 * <p>RectVerticalResponse</p>
 */
public class RectVerticalResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RectVerticalResponseBody body;

    private RectVerticalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RectVerticalResponse create() {
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
    public RectVerticalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RectVerticalResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RectVerticalResponseBody body);

        @Override
        RectVerticalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RectVerticalResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RectVerticalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RectVerticalResponse response) {
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
        public Builder body(RectVerticalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RectVerticalResponse build() {
            return new RectVerticalResponse(this);
        } 

    } 

}
