// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteMediaFromSearchLibResponse} extends {@link TeaModel}
 *
 * <p>DeleteMediaFromSearchLibResponse</p>
 */
public class DeleteMediaFromSearchLibResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteMediaFromSearchLibResponseBody body;

    private DeleteMediaFromSearchLibResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteMediaFromSearchLibResponse create() {
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
    public DeleteMediaFromSearchLibResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMediaFromSearchLibResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteMediaFromSearchLibResponseBody body);

        @Override
        DeleteMediaFromSearchLibResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMediaFromSearchLibResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteMediaFromSearchLibResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMediaFromSearchLibResponse response) {
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
        public Builder body(DeleteMediaFromSearchLibResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMediaFromSearchLibResponse build() {
            return new DeleteMediaFromSearchLibResponse(this);
        } 

    } 

}
