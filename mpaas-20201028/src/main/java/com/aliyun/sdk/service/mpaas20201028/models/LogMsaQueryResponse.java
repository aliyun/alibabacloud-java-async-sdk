// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LogMsaQueryResponse} extends {@link TeaModel}
 *
 * <p>LogMsaQueryResponse</p>
 */
public class LogMsaQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private LogMsaQueryResponseBody body;

    private LogMsaQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static LogMsaQueryResponse create() {
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
    public LogMsaQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LogMsaQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(LogMsaQueryResponseBody body);

        @Override
        LogMsaQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LogMsaQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private LogMsaQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LogMsaQueryResponse response) {
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
        public Builder body(LogMsaQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LogMsaQueryResponse build() {
            return new LogMsaQueryResponse(this);
        } 

    } 

}
