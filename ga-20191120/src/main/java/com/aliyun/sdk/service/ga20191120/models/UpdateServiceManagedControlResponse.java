// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceManagedControlResponse} extends {@link TeaModel}
 *
 * <p>UpdateServiceManagedControlResponse</p>
 */
public class UpdateServiceManagedControlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateServiceManagedControlResponseBody body;

    private UpdateServiceManagedControlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateServiceManagedControlResponse create() {
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
    public UpdateServiceManagedControlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateServiceManagedControlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateServiceManagedControlResponseBody body);

        @Override
        UpdateServiceManagedControlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateServiceManagedControlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateServiceManagedControlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateServiceManagedControlResponse response) {
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
        public Builder body(UpdateServiceManagedControlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateServiceManagedControlResponse build() {
            return new UpdateServiceManagedControlResponse(this);
        } 

    } 

}
