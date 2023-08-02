// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDBInstancePlanResponse} extends {@link TeaModel}
 *
 * <p>DeleteDBInstancePlanResponse</p>
 */
public class DeleteDBInstancePlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDBInstancePlanResponseBody body;

    private DeleteDBInstancePlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDBInstancePlanResponse create() {
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
    public DeleteDBInstancePlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDBInstancePlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDBInstancePlanResponseBody body);

        @Override
        DeleteDBInstancePlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDBInstancePlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDBInstancePlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDBInstancePlanResponse response) {
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
        public Builder body(DeleteDBInstancePlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDBInstancePlanResponse build() {
            return new DeleteDBInstancePlanResponse(this);
        } 

    } 

}
