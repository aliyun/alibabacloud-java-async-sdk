// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePtsSceneBaseLineResponse} extends {@link TeaModel}
 *
 * <p>DeletePtsSceneBaseLineResponse</p>
 */
public class DeletePtsSceneBaseLineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePtsSceneBaseLineResponseBody body;

    private DeletePtsSceneBaseLineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeletePtsSceneBaseLineResponse create() {
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
    public DeletePtsSceneBaseLineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePtsSceneBaseLineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeletePtsSceneBaseLineResponseBody body);

        @Override
        DeletePtsSceneBaseLineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePtsSceneBaseLineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeletePtsSceneBaseLineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePtsSceneBaseLineResponse response) {
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
        public Builder body(DeletePtsSceneBaseLineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePtsSceneBaseLineResponse build() {
            return new DeletePtsSceneBaseLineResponse(this);
        } 

    } 

}
