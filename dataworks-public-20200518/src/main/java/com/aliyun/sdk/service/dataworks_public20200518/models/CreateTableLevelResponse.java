// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTableLevelResponse} extends {@link TeaModel}
 *
 * <p>CreateTableLevelResponse</p>
 */
public class CreateTableLevelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTableLevelResponseBody body;

    private CreateTableLevelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTableLevelResponse create() {
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
    public CreateTableLevelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTableLevelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTableLevelResponseBody body);

        @Override
        CreateTableLevelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTableLevelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTableLevelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTableLevelResponse response) {
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
        public Builder body(CreateTableLevelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTableLevelResponse build() {
            return new CreateTableLevelResponse(this);
        } 

    } 

}
