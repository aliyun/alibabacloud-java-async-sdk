// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Render3dAvatarResponse} extends {@link TeaModel}
 *
 * <p>Render3dAvatarResponse</p>
 */
public class Render3dAvatarResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private Render3dAvatarResponseBody body;

    private Render3dAvatarResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static Render3dAvatarResponse create() {
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
    public Render3dAvatarResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<Render3dAvatarResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(Render3dAvatarResponseBody body);

        @Override
        Render3dAvatarResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<Render3dAvatarResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private Render3dAvatarResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(Render3dAvatarResponse response) {
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
        public Builder body(Render3dAvatarResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public Render3dAvatarResponse build() {
            return new Render3dAvatarResponse(this);
        } 

    } 

}
