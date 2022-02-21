// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateClusterResponse} extends {@link TeaModel}
 *
 * <p>UpdateClusterResponse</p>
 */
public class UpdateClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateClusterResponseBody body;

    private UpdateClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateClusterResponse create() {
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
    public UpdateClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateClusterResponseBody body);

        @Override
        UpdateClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateClusterResponse response) {
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
        public Builder body(UpdateClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateClusterResponse build() {
            return new UpdateClusterResponse(this);
        } 

    } 

}
