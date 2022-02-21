// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDefaultWatermarkResponse} extends {@link TeaModel}
 *
 * <p>SetDefaultWatermarkResponse</p>
 */
public class SetDefaultWatermarkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDefaultWatermarkResponseBody body;

    private SetDefaultWatermarkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDefaultWatermarkResponse create() {
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
    public SetDefaultWatermarkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDefaultWatermarkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDefaultWatermarkResponseBody body);

        @Override
        SetDefaultWatermarkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDefaultWatermarkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDefaultWatermarkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDefaultWatermarkResponse response) {
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
        public Builder body(SetDefaultWatermarkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDefaultWatermarkResponse build() {
            return new SetDefaultWatermarkResponse(this);
        } 

    } 

}
