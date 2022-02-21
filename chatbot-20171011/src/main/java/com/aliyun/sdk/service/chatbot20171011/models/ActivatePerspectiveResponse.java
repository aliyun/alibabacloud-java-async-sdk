// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ActivatePerspectiveResponse} extends {@link TeaModel}
 *
 * <p>ActivatePerspectiveResponse</p>
 */
public class ActivatePerspectiveResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ActivatePerspectiveResponseBody body;

    private ActivatePerspectiveResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ActivatePerspectiveResponse create() {
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
    public ActivatePerspectiveResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ActivatePerspectiveResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ActivatePerspectiveResponseBody body);

        @Override
        ActivatePerspectiveResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ActivatePerspectiveResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ActivatePerspectiveResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ActivatePerspectiveResponse response) {
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
        public Builder body(ActivatePerspectiveResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ActivatePerspectiveResponse build() {
            return new ActivatePerspectiveResponse(this);
        } 

    } 

}
