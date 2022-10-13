// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDatasetItemResponse} extends {@link TeaModel}
 *
 * <p>CreateDatasetItemResponse</p>
 */
public class CreateDatasetItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDatasetItemResponseBody body;

    private CreateDatasetItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDatasetItemResponse create() {
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
    public CreateDatasetItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDatasetItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDatasetItemResponseBody body);

        @Override
        CreateDatasetItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDatasetItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDatasetItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDatasetItemResponse response) {
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
        public Builder body(CreateDatasetItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDatasetItemResponse build() {
            return new CreateDatasetItemResponse(this);
        } 

    } 

}
