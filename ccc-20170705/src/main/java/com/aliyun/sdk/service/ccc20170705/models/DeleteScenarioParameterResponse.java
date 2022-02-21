// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteScenarioParameterResponse} extends {@link TeaModel}
 *
 * <p>DeleteScenarioParameterResponse</p>
 */
public class DeleteScenarioParameterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteScenarioParameterResponseBody body;

    private DeleteScenarioParameterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteScenarioParameterResponse create() {
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
    public DeleteScenarioParameterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteScenarioParameterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteScenarioParameterResponseBody body);

        @Override
        DeleteScenarioParameterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteScenarioParameterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteScenarioParameterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteScenarioParameterResponse response) {
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
        public Builder body(DeleteScenarioParameterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteScenarioParameterResponse build() {
            return new DeleteScenarioParameterResponse(this);
        } 

    } 

}
