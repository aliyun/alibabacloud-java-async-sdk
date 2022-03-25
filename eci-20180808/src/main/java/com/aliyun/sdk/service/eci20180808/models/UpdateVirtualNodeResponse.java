// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVirtualNodeResponse} extends {@link TeaModel}
 *
 * <p>UpdateVirtualNodeResponse</p>
 */
public class UpdateVirtualNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateVirtualNodeResponseBody body;

    private UpdateVirtualNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateVirtualNodeResponse create() {
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
    public UpdateVirtualNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateVirtualNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateVirtualNodeResponseBody body);

        @Override
        UpdateVirtualNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateVirtualNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateVirtualNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateVirtualNodeResponse response) {
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
        public Builder body(UpdateVirtualNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateVirtualNodeResponse build() {
            return new UpdateVirtualNodeResponse(this);
        } 

    } 

}
