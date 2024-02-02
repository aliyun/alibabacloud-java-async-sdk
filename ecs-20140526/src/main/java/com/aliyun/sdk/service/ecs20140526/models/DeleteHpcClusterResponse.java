// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHpcClusterResponse} extends {@link TeaModel}
 *
 * <p>DeleteHpcClusterResponse</p>
 */
public class DeleteHpcClusterResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DeleteHpcClusterResponseBody body;

    private DeleteHpcClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteHpcClusterResponse create() {
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
    public DeleteHpcClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteHpcClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteHpcClusterResponseBody body);

        @Override
        DeleteHpcClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteHpcClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteHpcClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteHpcClusterResponse response) {
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
        public Builder body(DeleteHpcClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteHpcClusterResponse build() {
            return new DeleteHpcClusterResponse(this);
        } 

    } 

}
