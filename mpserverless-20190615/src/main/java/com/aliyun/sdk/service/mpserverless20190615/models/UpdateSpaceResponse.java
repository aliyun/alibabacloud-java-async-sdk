// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSpaceResponse} extends {@link TeaModel}
 *
 * <p>UpdateSpaceResponse</p>
 */
public class UpdateSpaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSpaceResponseBody body;

    private UpdateSpaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSpaceResponse create() {
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
    public UpdateSpaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSpaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSpaceResponseBody body);

        @Override
        UpdateSpaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSpaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSpaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSpaceResponse response) {
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
        public Builder body(UpdateSpaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSpaceResponse build() {
            return new UpdateSpaceResponse(this);
        } 

    } 

}
