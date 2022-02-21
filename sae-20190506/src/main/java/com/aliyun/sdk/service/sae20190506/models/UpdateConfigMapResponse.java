// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConfigMapResponse} extends {@link TeaModel}
 *
 * <p>UpdateConfigMapResponse</p>
 */
public class UpdateConfigMapResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateConfigMapResponseBody body;

    private UpdateConfigMapResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateConfigMapResponse create() {
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
    public UpdateConfigMapResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateConfigMapResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateConfigMapResponseBody body);

        @Override
        UpdateConfigMapResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateConfigMapResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateConfigMapResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateConfigMapResponse response) {
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
        public Builder body(UpdateConfigMapResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateConfigMapResponse build() {
            return new UpdateConfigMapResponse(this);
        } 

    } 

}
