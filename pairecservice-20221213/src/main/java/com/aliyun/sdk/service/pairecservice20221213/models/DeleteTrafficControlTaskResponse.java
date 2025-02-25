// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTrafficControlTaskResponse} extends {@link TeaModel}
 *
 * <p>DeleteTrafficControlTaskResponse</p>
 */
public class DeleteTrafficControlTaskResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteTrafficControlTaskResponseBody body;

    private DeleteTrafficControlTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteTrafficControlTaskResponse create() {
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
    public DeleteTrafficControlTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTrafficControlTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteTrafficControlTaskResponseBody body);

        @Override
        DeleteTrafficControlTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTrafficControlTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteTrafficControlTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTrafficControlTaskResponse response) {
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
        public Builder body(DeleteTrafficControlTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTrafficControlTaskResponse build() {
            return new DeleteTrafficControlTaskResponse(this);
        } 

    } 

}
