// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteEnsSaleControlResponse} extends {@link TeaModel}
 *
 * <p>DeleteEnsSaleControlResponse</p>
 */
public class DeleteEnsSaleControlResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteEnsSaleControlResponseBody body;

    private DeleteEnsSaleControlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteEnsSaleControlResponse create() {
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
    public DeleteEnsSaleControlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEnsSaleControlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteEnsSaleControlResponseBody body);

        @Override
        DeleteEnsSaleControlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEnsSaleControlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteEnsSaleControlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEnsSaleControlResponse response) {
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
        public Builder body(DeleteEnsSaleControlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEnsSaleControlResponse build() {
            return new DeleteEnsSaleControlResponse(this);
        } 

    } 

}
