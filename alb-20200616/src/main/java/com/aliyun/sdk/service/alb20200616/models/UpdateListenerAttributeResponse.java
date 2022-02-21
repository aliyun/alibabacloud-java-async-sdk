// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateListenerAttributeResponse} extends {@link TeaModel}
 *
 * <p>UpdateListenerAttributeResponse</p>
 */
public class UpdateListenerAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateListenerAttributeResponseBody body;

    private UpdateListenerAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateListenerAttributeResponse create() {
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
    public UpdateListenerAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateListenerAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateListenerAttributeResponseBody body);

        @Override
        UpdateListenerAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateListenerAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateListenerAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateListenerAttributeResponse response) {
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
        public Builder body(UpdateListenerAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateListenerAttributeResponse build() {
            return new UpdateListenerAttributeResponse(this);
        } 

    } 

}
