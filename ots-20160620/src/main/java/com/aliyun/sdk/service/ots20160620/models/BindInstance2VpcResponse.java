// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ots20160620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindInstance2VpcResponse} extends {@link TeaModel}
 *
 * <p>BindInstance2VpcResponse</p>
 */
public class BindInstance2VpcResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private BindInstance2VpcResponseBody body;

    private BindInstance2VpcResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static BindInstance2VpcResponse create() {
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
    public BindInstance2VpcResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindInstance2VpcResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(BindInstance2VpcResponseBody body);

        @Override
        BindInstance2VpcResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindInstance2VpcResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private BindInstance2VpcResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindInstance2VpcResponse response) {
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
        public Builder body(BindInstance2VpcResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindInstance2VpcResponse build() {
            return new BindInstance2VpcResponse(this);
        } 

    } 

}
