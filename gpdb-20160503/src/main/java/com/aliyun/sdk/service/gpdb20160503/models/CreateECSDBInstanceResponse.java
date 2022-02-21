// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateECSDBInstanceResponse} extends {@link TeaModel}
 *
 * <p>CreateECSDBInstanceResponse</p>
 */
public class CreateECSDBInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateECSDBInstanceResponseBody body;

    private CreateECSDBInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateECSDBInstanceResponse create() {
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
    public CreateECSDBInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateECSDBInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateECSDBInstanceResponseBody body);

        @Override
        CreateECSDBInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateECSDBInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateECSDBInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateECSDBInstanceResponse response) {
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
        public Builder body(CreateECSDBInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateECSDBInstanceResponse build() {
            return new CreateECSDBInstanceResponse(this);
        } 

    } 

}
