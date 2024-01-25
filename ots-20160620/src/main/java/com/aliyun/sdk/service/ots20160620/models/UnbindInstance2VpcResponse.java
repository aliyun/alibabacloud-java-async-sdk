// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ots20160620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindInstance2VpcResponse} extends {@link TeaModel}
 *
 * <p>UnbindInstance2VpcResponse</p>
 */
public class UnbindInstance2VpcResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private UnbindInstance2VpcResponseBody body;

    private UnbindInstance2VpcResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UnbindInstance2VpcResponse create() {
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
    public UnbindInstance2VpcResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindInstance2VpcResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UnbindInstance2VpcResponseBody body);

        @Override
        UnbindInstance2VpcResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindInstance2VpcResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UnbindInstance2VpcResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindInstance2VpcResponse response) {
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
        public Builder body(UnbindInstance2VpcResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindInstance2VpcResponse build() {
            return new UnbindInstance2VpcResponse(this);
        } 

    } 

}
