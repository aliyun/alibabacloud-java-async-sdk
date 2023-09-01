// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateModelResponse} extends {@link TeaModel}
 *
 * <p>UpdateModelResponse</p>
 */
public class UpdateModelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateModelResponseBody body;

    private UpdateModelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateModelResponse create() {
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
    public UpdateModelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateModelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateModelResponseBody body);

        @Override
        UpdateModelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateModelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateModelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateModelResponse response) {
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
        public Builder body(UpdateModelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateModelResponse build() {
            return new UpdateModelResponse(this);
        } 

    } 

}
