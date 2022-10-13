// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDatasetResponse} extends {@link TeaModel}
 *
 * <p>CreateDatasetResponse</p>
 */
public class CreateDatasetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDatasetResponseBody body;

    private CreateDatasetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDatasetResponse create() {
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
    public CreateDatasetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDatasetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDatasetResponseBody body);

        @Override
        CreateDatasetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDatasetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDatasetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDatasetResponse response) {
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
        public Builder body(CreateDatasetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDatasetResponse build() {
            return new CreateDatasetResponse(this);
        } 

    } 

}
