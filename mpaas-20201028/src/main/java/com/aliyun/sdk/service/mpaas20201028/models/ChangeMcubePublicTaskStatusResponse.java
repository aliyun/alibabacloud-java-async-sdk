// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeMcubePublicTaskStatusResponse} extends {@link TeaModel}
 *
 * <p>ChangeMcubePublicTaskStatusResponse</p>
 */
public class ChangeMcubePublicTaskStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChangeMcubePublicTaskStatusResponseBody body;

    private ChangeMcubePublicTaskStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChangeMcubePublicTaskStatusResponse create() {
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
    public ChangeMcubePublicTaskStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeMcubePublicTaskStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChangeMcubePublicTaskStatusResponseBody body);

        @Override
        ChangeMcubePublicTaskStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeMcubePublicTaskStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChangeMcubePublicTaskStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeMcubePublicTaskStatusResponse response) {
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
        public Builder body(ChangeMcubePublicTaskStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeMcubePublicTaskStatusResponse build() {
            return new ChangeMcubePublicTaskStatusResponse(this);
        } 

    } 

}
