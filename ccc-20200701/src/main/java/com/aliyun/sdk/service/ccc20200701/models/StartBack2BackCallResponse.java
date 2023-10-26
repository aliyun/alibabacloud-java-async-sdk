// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartBack2BackCallResponse} extends {@link TeaModel}
 *
 * <p>StartBack2BackCallResponse</p>
 */
public class StartBack2BackCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private StartBack2BackCallResponseBody body;

    private StartBack2BackCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static StartBack2BackCallResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public StartBack2BackCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartBack2BackCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(StartBack2BackCallResponseBody body);

        @Override
        StartBack2BackCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartBack2BackCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private StartBack2BackCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartBack2BackCallResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(StartBack2BackCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartBack2BackCallResponse build() {
            return new StartBack2BackCallResponse(this);
        } 

    } 

}
