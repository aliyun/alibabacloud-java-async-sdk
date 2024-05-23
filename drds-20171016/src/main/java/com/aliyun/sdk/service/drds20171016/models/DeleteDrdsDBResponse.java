// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDrdsDBResponse} extends {@link TeaModel}
 *
 * <p>DeleteDrdsDBResponse</p>
 */
public class DeleteDrdsDBResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteDrdsDBResponseBody body;

    private DeleteDrdsDBResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteDrdsDBResponse create() {
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
    public DeleteDrdsDBResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDrdsDBResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteDrdsDBResponseBody body);

        @Override
        DeleteDrdsDBResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDrdsDBResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteDrdsDBResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDrdsDBResponse response) {
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
        public Builder body(DeleteDrdsDBResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDrdsDBResponse build() {
            return new DeleteDrdsDBResponse(this);
        } 

    } 

}
