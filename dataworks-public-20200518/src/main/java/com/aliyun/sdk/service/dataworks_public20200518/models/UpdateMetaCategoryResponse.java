// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMetaCategoryResponse} extends {@link TeaModel}
 *
 * <p>UpdateMetaCategoryResponse</p>
 */
public class UpdateMetaCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMetaCategoryResponseBody body;

    private UpdateMetaCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMetaCategoryResponse create() {
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
    public UpdateMetaCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMetaCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMetaCategoryResponseBody body);

        @Override
        UpdateMetaCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMetaCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMetaCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMetaCategoryResponse response) {
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
        public Builder body(UpdateMetaCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMetaCategoryResponse build() {
            return new UpdateMetaCategoryResponse(this);
        } 

    } 

}
