// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLogicDatabaseResponse} extends {@link TeaModel}
 *
 * <p>CreateLogicDatabaseResponse</p>
 */
public class CreateLogicDatabaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateLogicDatabaseResponseBody body;

    private CreateLogicDatabaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateLogicDatabaseResponse create() {
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
    public CreateLogicDatabaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateLogicDatabaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateLogicDatabaseResponseBody body);

        @Override
        CreateLogicDatabaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateLogicDatabaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateLogicDatabaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateLogicDatabaseResponse response) {
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
        public Builder body(CreateLogicDatabaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateLogicDatabaseResponse build() {
            return new CreateLogicDatabaseResponse(this);
        } 

    } 

}
