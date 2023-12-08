// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteElasticPlanResponse} extends {@link TeaModel}
 *
 * <p>DeleteElasticPlanResponse</p>
 */
public class DeleteElasticPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteElasticPlanResponseBody body;

    private DeleteElasticPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteElasticPlanResponse create() {
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
    public DeleteElasticPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteElasticPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteElasticPlanResponseBody body);

        @Override
        DeleteElasticPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteElasticPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteElasticPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteElasticPlanResponse response) {
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
        public Builder body(DeleteElasticPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteElasticPlanResponse build() {
            return new DeleteElasticPlanResponse(this);
        } 

    } 

}
