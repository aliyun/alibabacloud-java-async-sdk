// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeMcubeMiniTaskStatusResponse} extends {@link TeaModel}
 *
 * <p>ChangeMcubeMiniTaskStatusResponse</p>
 */
public class ChangeMcubeMiniTaskStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChangeMcubeMiniTaskStatusResponseBody body;

    private ChangeMcubeMiniTaskStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChangeMcubeMiniTaskStatusResponse create() {
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
    public ChangeMcubeMiniTaskStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeMcubeMiniTaskStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChangeMcubeMiniTaskStatusResponseBody body);

        @Override
        ChangeMcubeMiniTaskStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeMcubeMiniTaskStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChangeMcubeMiniTaskStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeMcubeMiniTaskStatusResponse response) {
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
        public Builder body(ChangeMcubeMiniTaskStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeMcubeMiniTaskStatusResponse build() {
            return new ChangeMcubeMiniTaskStatusResponse(this);
        } 

    } 

}
