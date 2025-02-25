// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomQAResponse} extends {@link TeaModel}
 *
 * <p>DeleteCustomQAResponse</p>
 */
public class DeleteCustomQAResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DeleteCustomQAResponseBody body;

    private DeleteCustomQAResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteCustomQAResponse create() {
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
    public DeleteCustomQAResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCustomQAResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteCustomQAResponseBody body);

        @Override
        DeleteCustomQAResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCustomQAResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteCustomQAResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCustomQAResponse response) {
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
        public Builder body(DeleteCustomQAResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCustomQAResponse build() {
            return new DeleteCustomQAResponse(this);
        } 

    } 

}
