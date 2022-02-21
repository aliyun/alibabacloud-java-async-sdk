// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachSceneDefenseObjectResponse} extends {@link TeaModel}
 *
 * <p>AttachSceneDefenseObjectResponse</p>
 */
public class AttachSceneDefenseObjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachSceneDefenseObjectResponseBody body;

    private AttachSceneDefenseObjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachSceneDefenseObjectResponse create() {
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
    public AttachSceneDefenseObjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachSceneDefenseObjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachSceneDefenseObjectResponseBody body);

        @Override
        AttachSceneDefenseObjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachSceneDefenseObjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachSceneDefenseObjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachSceneDefenseObjectResponse response) {
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
        public Builder body(AttachSceneDefenseObjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachSceneDefenseObjectResponse build() {
            return new AttachSceneDefenseObjectResponse(this);
        } 

    } 

}
