// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetRangeConfigResponse} extends {@link TeaModel}
 *
 * <p>SetRangeConfigResponse</p>
 */
public class SetRangeConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetRangeConfigResponseBody body;

    private SetRangeConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetRangeConfigResponse create() {
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
    public SetRangeConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetRangeConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetRangeConfigResponseBody body);

        @Override
        SetRangeConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetRangeConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetRangeConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetRangeConfigResponse response) {
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
        public Builder body(SetRangeConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetRangeConfigResponse build() {
            return new SetRangeConfigResponse(this);
        } 

    } 

}
