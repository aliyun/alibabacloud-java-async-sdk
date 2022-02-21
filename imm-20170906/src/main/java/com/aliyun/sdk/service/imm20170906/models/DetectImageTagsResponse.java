// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectImageTagsResponse} extends {@link TeaModel}
 *
 * <p>DetectImageTagsResponse</p>
 */
public class DetectImageTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetectImageTagsResponseBody body;

    private DetectImageTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetectImageTagsResponse create() {
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
    public DetectImageTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetectImageTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetectImageTagsResponseBody body);

        @Override
        DetectImageTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetectImageTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetectImageTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetectImageTagsResponse response) {
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
        public Builder body(DetectImageTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetectImageTagsResponse build() {
            return new DetectImageTagsResponse(this);
        } 

    } 

}
