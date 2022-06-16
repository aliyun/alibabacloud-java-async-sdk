// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEciConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateEciConfigResponse</p>
 */
public class UpdateEciConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateEciConfigResponseBody body;

    private UpdateEciConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateEciConfigResponse create() {
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
    public UpdateEciConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateEciConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateEciConfigResponseBody body);

        @Override
        UpdateEciConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateEciConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateEciConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateEciConfigResponse response) {
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
        public Builder body(UpdateEciConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateEciConfigResponse build() {
            return new UpdateEciConfigResponse(this);
        } 

    } 

}
