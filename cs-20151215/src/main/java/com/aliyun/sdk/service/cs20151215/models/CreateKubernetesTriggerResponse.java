// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateKubernetesTriggerResponse} extends {@link TeaModel}
 *
 * <p>CreateKubernetesTriggerResponse</p>
 */
public class CreateKubernetesTriggerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateKubernetesTriggerResponseBody body;

    private CreateKubernetesTriggerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateKubernetesTriggerResponse create() {
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
    public CreateKubernetesTriggerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateKubernetesTriggerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateKubernetesTriggerResponseBody body);

        @Override
        CreateKubernetesTriggerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateKubernetesTriggerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateKubernetesTriggerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateKubernetesTriggerResponse response) {
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
        public Builder body(CreateKubernetesTriggerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateKubernetesTriggerResponse build() {
            return new CreateKubernetesTriggerResponse(this);
        } 

    } 

}
