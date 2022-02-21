// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreviewStackResponse} extends {@link TeaModel}
 *
 * <p>PreviewStackResponse</p>
 */
public class PreviewStackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PreviewStackResponseBody body;

    private PreviewStackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PreviewStackResponse create() {
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
    public PreviewStackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PreviewStackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PreviewStackResponseBody body);

        @Override
        PreviewStackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PreviewStackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PreviewStackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PreviewStackResponse response) {
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
        public Builder body(PreviewStackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PreviewStackResponse build() {
            return new PreviewStackResponse(this);
        } 

    } 

}
