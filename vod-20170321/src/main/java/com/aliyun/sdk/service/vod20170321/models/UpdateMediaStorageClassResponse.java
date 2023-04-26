// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMediaStorageClassResponse} extends {@link TeaModel}
 *
 * <p>UpdateMediaStorageClassResponse</p>
 */
public class UpdateMediaStorageClassResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMediaStorageClassResponseBody body;

    private UpdateMediaStorageClassResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMediaStorageClassResponse create() {
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
    public UpdateMediaStorageClassResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMediaStorageClassResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMediaStorageClassResponseBody body);

        @Override
        UpdateMediaStorageClassResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMediaStorageClassResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMediaStorageClassResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMediaStorageClassResponse response) {
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
        public Builder body(UpdateMediaStorageClassResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMediaStorageClassResponse build() {
            return new UpdateMediaStorageClassResponse(this);
        } 

    } 

}
