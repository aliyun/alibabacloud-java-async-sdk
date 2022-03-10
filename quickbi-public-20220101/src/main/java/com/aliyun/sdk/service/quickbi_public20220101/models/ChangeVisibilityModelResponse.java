// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeVisibilityModelResponse} extends {@link TeaModel}
 *
 * <p>ChangeVisibilityModelResponse</p>
 */
public class ChangeVisibilityModelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChangeVisibilityModelResponseBody body;

    private ChangeVisibilityModelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChangeVisibilityModelResponse create() {
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
    public ChangeVisibilityModelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeVisibilityModelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChangeVisibilityModelResponseBody body);

        @Override
        ChangeVisibilityModelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeVisibilityModelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChangeVisibilityModelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeVisibilityModelResponse response) {
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
        public Builder body(ChangeVisibilityModelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeVisibilityModelResponse build() {
            return new ChangeVisibilityModelResponse(this);
        } 

    } 

}
