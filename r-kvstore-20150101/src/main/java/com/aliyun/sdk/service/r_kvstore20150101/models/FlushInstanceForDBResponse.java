// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlushInstanceForDBResponse} extends {@link TeaModel}
 *
 * <p>FlushInstanceForDBResponse</p>
 */
public class FlushInstanceForDBResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private FlushInstanceForDBResponseBody body;

    private FlushInstanceForDBResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static FlushInstanceForDBResponse create() {
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
    public FlushInstanceForDBResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FlushInstanceForDBResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(FlushInstanceForDBResponseBody body);

        @Override
        FlushInstanceForDBResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FlushInstanceForDBResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private FlushInstanceForDBResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FlushInstanceForDBResponse response) {
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
        public Builder body(FlushInstanceForDBResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FlushInstanceForDBResponse build() {
            return new FlushInstanceForDBResponse(this);
        } 

    } 

}
