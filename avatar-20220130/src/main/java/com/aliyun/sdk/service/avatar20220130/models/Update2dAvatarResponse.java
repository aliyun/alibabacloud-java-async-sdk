// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Update2dAvatarResponse} extends {@link TeaModel}
 *
 * <p>Update2dAvatarResponse</p>
 */
public class Update2dAvatarResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private Update2dAvatarResponseBody body;

    private Update2dAvatarResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Update2dAvatarResponse create() {
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
     * @return body
     */
    public Update2dAvatarResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<Update2dAvatarResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(Update2dAvatarResponseBody body);

        @Override
        Update2dAvatarResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<Update2dAvatarResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Update2dAvatarResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(Update2dAvatarResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(Update2dAvatarResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public Update2dAvatarResponse build() {
            return new Update2dAvatarResponse(this);
        } 

    } 

}
