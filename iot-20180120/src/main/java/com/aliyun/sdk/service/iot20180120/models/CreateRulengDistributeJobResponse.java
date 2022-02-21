// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRulengDistributeJobResponse} extends {@link TeaModel}
 *
 * <p>CreateRulengDistributeJobResponse</p>
 */
public class CreateRulengDistributeJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRulengDistributeJobResponseBody body;

    private CreateRulengDistributeJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRulengDistributeJobResponse create() {
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
    public CreateRulengDistributeJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRulengDistributeJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRulengDistributeJobResponseBody body);

        @Override
        CreateRulengDistributeJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRulengDistributeJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRulengDistributeJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRulengDistributeJobResponse response) {
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
        public Builder body(CreateRulengDistributeJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRulengDistributeJobResponse build() {
            return new CreateRulengDistributeJobResponse(this);
        } 

    } 

}
