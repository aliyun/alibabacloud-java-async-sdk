// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataSourceItemResponse} extends {@link TeaModel}
 *
 * <p>CreateDataSourceItemResponse</p>
 */
public class CreateDataSourceItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDataSourceItemResponseBody body;

    private CreateDataSourceItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDataSourceItemResponse create() {
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
    public CreateDataSourceItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDataSourceItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDataSourceItemResponseBody body);

        @Override
        CreateDataSourceItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDataSourceItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDataSourceItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDataSourceItemResponse response) {
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
        public Builder body(CreateDataSourceItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDataSourceItemResponse build() {
            return new CreateDataSourceItemResponse(this);
        } 

    } 

}
