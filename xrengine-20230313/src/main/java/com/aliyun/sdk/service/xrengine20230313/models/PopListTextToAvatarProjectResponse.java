// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopListTextToAvatarProjectResponse} extends {@link TeaModel}
 *
 * <p>PopListTextToAvatarProjectResponse</p>
 */
public class PopListTextToAvatarProjectResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private PopListTextToAvatarProjectResponseBody body;

    private PopListTextToAvatarProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static PopListTextToAvatarProjectResponse create() {
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
    public PopListTextToAvatarProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PopListTextToAvatarProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(PopListTextToAvatarProjectResponseBody body);

        @Override
        PopListTextToAvatarProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PopListTextToAvatarProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private PopListTextToAvatarProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PopListTextToAvatarProjectResponse response) {
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
        public Builder body(PopListTextToAvatarProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PopListTextToAvatarProjectResponse build() {
            return new PopListTextToAvatarProjectResponse(this);
        } 

    } 

}
