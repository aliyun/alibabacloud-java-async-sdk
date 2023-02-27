// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BargeInCallResponse} extends {@link TeaModel}
 *
 * <p>BargeInCallResponse</p>
 */
public class BargeInCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BargeInCallResponseBody body;

    private BargeInCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BargeInCallResponse create() {
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
    public BargeInCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BargeInCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BargeInCallResponseBody body);

        @Override
        BargeInCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BargeInCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BargeInCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BargeInCallResponse response) {
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
        public Builder body(BargeInCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BargeInCallResponse build() {
            return new BargeInCallResponse(this);
        } 

    } 

}
