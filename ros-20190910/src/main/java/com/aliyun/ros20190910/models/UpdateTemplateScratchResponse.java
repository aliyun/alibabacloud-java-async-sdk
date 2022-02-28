// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTemplateScratchResponse} extends {@link TeaModel}
 *
 * <p>UpdateTemplateScratchResponse</p>
 */
public class UpdateTemplateScratchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTemplateScratchResponseBody body;

    private UpdateTemplateScratchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTemplateScratchResponse create() {
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
    public UpdateTemplateScratchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTemplateScratchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTemplateScratchResponseBody body);

        @Override
        UpdateTemplateScratchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTemplateScratchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTemplateScratchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTemplateScratchResponse response) {
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
        public Builder body(UpdateTemplateScratchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTemplateScratchResponse build() {
            return new UpdateTemplateScratchResponse(this);
        } 

    } 

}
