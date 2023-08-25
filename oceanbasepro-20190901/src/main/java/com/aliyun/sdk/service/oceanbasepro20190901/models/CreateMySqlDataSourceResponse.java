// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMySqlDataSourceResponse} extends {@link TeaModel}
 *
 * <p>CreateMySqlDataSourceResponse</p>
 */
public class CreateMySqlDataSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMySqlDataSourceResponseBody body;

    private CreateMySqlDataSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMySqlDataSourceResponse create() {
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
    public CreateMySqlDataSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMySqlDataSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMySqlDataSourceResponseBody body);

        @Override
        CreateMySqlDataSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMySqlDataSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMySqlDataSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMySqlDataSourceResponse response) {
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
        public Builder body(CreateMySqlDataSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMySqlDataSourceResponse build() {
            return new CreateMySqlDataSourceResponse(this);
        } 

    } 

}
