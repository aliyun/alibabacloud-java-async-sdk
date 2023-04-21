// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDesktopGroupScaleTimerResponse} extends {@link TeaModel}
 *
 * <p>SetDesktopGroupScaleTimerResponse</p>
 */
public class SetDesktopGroupScaleTimerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDesktopGroupScaleTimerResponseBody body;

    private SetDesktopGroupScaleTimerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDesktopGroupScaleTimerResponse create() {
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
    public SetDesktopGroupScaleTimerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDesktopGroupScaleTimerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDesktopGroupScaleTimerResponseBody body);

        @Override
        SetDesktopGroupScaleTimerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDesktopGroupScaleTimerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDesktopGroupScaleTimerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDesktopGroupScaleTimerResponse response) {
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
        public Builder body(SetDesktopGroupScaleTimerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDesktopGroupScaleTimerResponse build() {
            return new SetDesktopGroupScaleTimerResponse(this);
        } 

    } 

}
