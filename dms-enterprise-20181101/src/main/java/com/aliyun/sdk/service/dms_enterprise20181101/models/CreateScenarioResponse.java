// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScenarioResponse} extends {@link TeaModel}
 *
 * <p>CreateScenarioResponse</p>
 */
public class CreateScenarioResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateScenarioResponseBody body;

    private CreateScenarioResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateScenarioResponse create() {
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
    public CreateScenarioResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateScenarioResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateScenarioResponseBody body);

        @Override
        CreateScenarioResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateScenarioResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateScenarioResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateScenarioResponse response) {
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
        public Builder body(CreateScenarioResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateScenarioResponse build() {
            return new CreateScenarioResponse(this);
        } 

    } 

}
