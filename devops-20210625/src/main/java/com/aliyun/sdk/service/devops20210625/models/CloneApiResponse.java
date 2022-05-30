// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloneApiResponse} extends {@link TeaModel}
 *
 * <p>CloneApiResponse</p>
 */
public class CloneApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CloneApiResponseBody body;

    private CloneApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CloneApiResponse create() {
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
    public CloneApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CloneApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CloneApiResponseBody body);

        @Override
        CloneApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CloneApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CloneApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CloneApiResponse response) {
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
        public Builder body(CloneApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CloneApiResponse build() {
            return new CloneApiResponse(this);
        } 

    } 

}
