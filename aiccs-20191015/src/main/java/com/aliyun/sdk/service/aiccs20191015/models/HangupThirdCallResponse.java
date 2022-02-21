// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HangupThirdCallResponse} extends {@link TeaModel}
 *
 * <p>HangupThirdCallResponse</p>
 */
public class HangupThirdCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private HangupThirdCallResponseBody body;

    private HangupThirdCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static HangupThirdCallResponse create() {
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
    public HangupThirdCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<HangupThirdCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(HangupThirdCallResponseBody body);

        @Override
        HangupThirdCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<HangupThirdCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private HangupThirdCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(HangupThirdCallResponse response) {
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
        public Builder body(HangupThirdCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public HangupThirdCallResponse build() {
            return new HangupThirdCallResponse(this);
        } 

    } 

}
