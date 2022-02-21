// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateImageInfosResponse} extends {@link TeaModel}
 *
 * <p>UpdateImageInfosResponse</p>
 */
public class UpdateImageInfosResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateImageInfosResponseBody body;

    private UpdateImageInfosResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateImageInfosResponse create() {
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
    public UpdateImageInfosResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateImageInfosResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateImageInfosResponseBody body);

        @Override
        UpdateImageInfosResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateImageInfosResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateImageInfosResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateImageInfosResponse response) {
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
        public Builder body(UpdateImageInfosResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateImageInfosResponse build() {
            return new UpdateImageInfosResponse(this);
        } 

    } 

}
