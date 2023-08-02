// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDBInstancePlanResponse} extends {@link TeaModel}
 *
 * <p>UpdateDBInstancePlanResponse</p>
 */
public class UpdateDBInstancePlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDBInstancePlanResponseBody body;

    private UpdateDBInstancePlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDBInstancePlanResponse create() {
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
    public UpdateDBInstancePlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDBInstancePlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDBInstancePlanResponseBody body);

        @Override
        UpdateDBInstancePlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDBInstancePlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDBInstancePlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDBInstancePlanResponse response) {
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
        public Builder body(UpdateDBInstancePlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDBInstancePlanResponse build() {
            return new UpdateDBInstancePlanResponse(this);
        } 

    } 

}
