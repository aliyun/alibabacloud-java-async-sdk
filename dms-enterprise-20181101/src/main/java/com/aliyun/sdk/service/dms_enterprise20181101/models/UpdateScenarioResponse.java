// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateScenarioResponse} extends {@link TeaModel}
 *
 * <p>UpdateScenarioResponse</p>
 */
public class UpdateScenarioResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateScenarioResponseBody body;

    private UpdateScenarioResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateScenarioResponse create() {
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
    public UpdateScenarioResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateScenarioResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateScenarioResponseBody body);

        @Override
        UpdateScenarioResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateScenarioResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateScenarioResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateScenarioResponse response) {
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
        public Builder body(UpdateScenarioResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateScenarioResponse build() {
            return new UpdateScenarioResponse(this);
        } 

    } 

}
