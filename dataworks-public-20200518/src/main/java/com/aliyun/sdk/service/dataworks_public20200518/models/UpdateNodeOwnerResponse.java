// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNodeOwnerResponse} extends {@link TeaModel}
 *
 * <p>UpdateNodeOwnerResponse</p>
 */
public class UpdateNodeOwnerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateNodeOwnerResponseBody body;

    private UpdateNodeOwnerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateNodeOwnerResponse create() {
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
    public UpdateNodeOwnerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateNodeOwnerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateNodeOwnerResponseBody body);

        @Override
        UpdateNodeOwnerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateNodeOwnerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateNodeOwnerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateNodeOwnerResponse response) {
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
        public Builder body(UpdateNodeOwnerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateNodeOwnerResponse build() {
            return new UpdateNodeOwnerResponse(this);
        } 

    } 

}
