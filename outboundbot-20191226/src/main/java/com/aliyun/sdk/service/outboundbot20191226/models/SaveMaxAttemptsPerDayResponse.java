// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveMaxAttemptsPerDayResponse} extends {@link TeaModel}
 *
 * <p>SaveMaxAttemptsPerDayResponse</p>
 */
public class SaveMaxAttemptsPerDayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveMaxAttemptsPerDayResponseBody body;

    private SaveMaxAttemptsPerDayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveMaxAttemptsPerDayResponse create() {
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
    public SaveMaxAttemptsPerDayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveMaxAttemptsPerDayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveMaxAttemptsPerDayResponseBody body);

        @Override
        SaveMaxAttemptsPerDayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveMaxAttemptsPerDayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveMaxAttemptsPerDayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveMaxAttemptsPerDayResponse response) {
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
        public Builder body(SaveMaxAttemptsPerDayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveMaxAttemptsPerDayResponse build() {
            return new SaveMaxAttemptsPerDayResponse(this);
        } 

    } 

}
