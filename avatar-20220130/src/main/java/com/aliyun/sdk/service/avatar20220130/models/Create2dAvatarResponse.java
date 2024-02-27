// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Create2dAvatarResponse} extends {@link TeaModel}
 *
 * <p>Create2dAvatarResponse</p>
 */
public class Create2dAvatarResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private Create2dAvatarResponseBody body;

    private Create2dAvatarResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static Create2dAvatarResponse create() {
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
    public Create2dAvatarResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<Create2dAvatarResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(Create2dAvatarResponseBody body);

        @Override
        Create2dAvatarResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<Create2dAvatarResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private Create2dAvatarResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(Create2dAvatarResponse response) {
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
        public Builder body(Create2dAvatarResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public Create2dAvatarResponse build() {
            return new Create2dAvatarResponse(this);
        } 

    } 

}
