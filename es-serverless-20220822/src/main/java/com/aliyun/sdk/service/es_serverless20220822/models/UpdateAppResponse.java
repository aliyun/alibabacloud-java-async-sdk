// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppResponse} extends {@link TeaModel}
 *
 * <p>UpdateAppResponse</p>
 */
public class UpdateAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAppResponseBody body;

    private UpdateAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAppResponse create() {
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
    public UpdateAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAppResponseBody body);

        @Override
        UpdateAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAppResponse response) {
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
        public Builder body(UpdateAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAppResponse build() {
            return new UpdateAppResponse(this);
        } 

    } 

}
