// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOmsMysqlDataSourceResponse} extends {@link TeaModel}
 *
 * <p>CreateOmsMysqlDataSourceResponse</p>
 */
public class CreateOmsMysqlDataSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOmsMysqlDataSourceResponseBody body;

    private CreateOmsMysqlDataSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOmsMysqlDataSourceResponse create() {
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
    public CreateOmsMysqlDataSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOmsMysqlDataSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOmsMysqlDataSourceResponseBody body);

        @Override
        CreateOmsMysqlDataSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOmsMysqlDataSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOmsMysqlDataSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOmsMysqlDataSourceResponse response) {
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
        public Builder body(CreateOmsMysqlDataSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOmsMysqlDataSourceResponse build() {
            return new CreateOmsMysqlDataSourceResponse(this);
        } 

    } 

}
