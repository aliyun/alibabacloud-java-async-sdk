// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRestorePlanResponse} extends {@link TeaModel}
 *
 * <p>CreateRestorePlanResponse</p>
 */
public class CreateRestorePlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRestorePlanResponseBody body;

    private CreateRestorePlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRestorePlanResponse create() {
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
    public CreateRestorePlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRestorePlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRestorePlanResponseBody body);

        @Override
        CreateRestorePlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRestorePlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRestorePlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRestorePlanResponse response) {
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
        public Builder body(CreateRestorePlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRestorePlanResponse build() {
            return new CreateRestorePlanResponse(this);
        } 

    } 

}
