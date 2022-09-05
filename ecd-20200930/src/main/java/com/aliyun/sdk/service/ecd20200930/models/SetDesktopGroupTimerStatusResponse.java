// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDesktopGroupTimerStatusResponse} extends {@link TeaModel}
 *
 * <p>SetDesktopGroupTimerStatusResponse</p>
 */
public class SetDesktopGroupTimerStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDesktopGroupTimerStatusResponseBody body;

    private SetDesktopGroupTimerStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDesktopGroupTimerStatusResponse create() {
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
    public SetDesktopGroupTimerStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDesktopGroupTimerStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDesktopGroupTimerStatusResponseBody body);

        @Override
        SetDesktopGroupTimerStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDesktopGroupTimerStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDesktopGroupTimerStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDesktopGroupTimerStatusResponse response) {
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
        public Builder body(SetDesktopGroupTimerStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDesktopGroupTimerStatusResponse build() {
            return new SetDesktopGroupTimerStatusResponse(this);
        } 

    } 

}
