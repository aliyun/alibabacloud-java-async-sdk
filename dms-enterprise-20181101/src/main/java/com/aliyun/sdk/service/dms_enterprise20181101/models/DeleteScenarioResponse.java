// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteScenarioResponse} extends {@link TeaModel}
 *
 * <p>DeleteScenarioResponse</p>
 */
public class DeleteScenarioResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteScenarioResponseBody body;

    private DeleteScenarioResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteScenarioResponse create() {
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
    public DeleteScenarioResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteScenarioResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteScenarioResponseBody body);

        @Override
        DeleteScenarioResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteScenarioResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteScenarioResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteScenarioResponse response) {
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
        public Builder body(DeleteScenarioResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteScenarioResponse build() {
            return new DeleteScenarioResponse(this);
        } 

    } 

}
