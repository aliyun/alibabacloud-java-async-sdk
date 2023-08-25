// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOceanBaseDataSourceResponse} extends {@link TeaModel}
 *
 * <p>CreateOceanBaseDataSourceResponse</p>
 */
public class CreateOceanBaseDataSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOceanBaseDataSourceResponseBody body;

    private CreateOceanBaseDataSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOceanBaseDataSourceResponse create() {
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
    public CreateOceanBaseDataSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOceanBaseDataSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOceanBaseDataSourceResponseBody body);

        @Override
        CreateOceanBaseDataSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOceanBaseDataSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOceanBaseDataSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOceanBaseDataSourceResponse response) {
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
        public Builder body(CreateOceanBaseDataSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOceanBaseDataSourceResponse build() {
            return new CreateOceanBaseDataSourceResponse(this);
        } 

    } 

}
