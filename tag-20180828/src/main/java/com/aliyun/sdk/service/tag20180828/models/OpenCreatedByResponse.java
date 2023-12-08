// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenCreatedByResponse} extends {@link TeaModel}
 *
 * <p>OpenCreatedByResponse</p>
 */
public class OpenCreatedByResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenCreatedByResponseBody body;

    private OpenCreatedByResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenCreatedByResponse create() {
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
    public OpenCreatedByResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenCreatedByResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenCreatedByResponseBody body);

        @Override
        OpenCreatedByResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenCreatedByResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenCreatedByResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenCreatedByResponse response) {
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
        public Builder body(OpenCreatedByResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenCreatedByResponse build() {
            return new OpenCreatedByResponse(this);
        } 

    } 

}
