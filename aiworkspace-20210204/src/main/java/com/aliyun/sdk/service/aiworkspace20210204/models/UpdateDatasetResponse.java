// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDatasetResponse} extends {@link TeaModel}
 *
 * <p>UpdateDatasetResponse</p>
 */
public class UpdateDatasetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDatasetResponseBody body;

    private UpdateDatasetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDatasetResponse create() {
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
    public UpdateDatasetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDatasetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDatasetResponseBody body);

        @Override
        UpdateDatasetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDatasetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDatasetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDatasetResponse response) {
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
        public Builder body(UpdateDatasetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDatasetResponse build() {
            return new UpdateDatasetResponse(this);
        } 

    } 

}
