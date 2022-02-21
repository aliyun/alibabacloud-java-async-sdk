// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LogicalDeleteResourceResponse} extends {@link TeaModel}
 *
 * <p>LogicalDeleteResourceResponse</p>
 */
public class LogicalDeleteResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private LogicalDeleteResourceResponseBody body;

    private LogicalDeleteResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static LogicalDeleteResourceResponse create() {
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
    public LogicalDeleteResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LogicalDeleteResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(LogicalDeleteResourceResponseBody body);

        @Override
        LogicalDeleteResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LogicalDeleteResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private LogicalDeleteResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LogicalDeleteResourceResponse response) {
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
        public Builder body(LogicalDeleteResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LogicalDeleteResourceResponse build() {
            return new LogicalDeleteResourceResponse(this);
        } 

    } 

}
