// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFunctionResponse} extends {@link TeaModel}
 *
 * <p>UpdateFunctionResponse</p>
 */
public class UpdateFunctionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private Function body;

    private UpdateFunctionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateFunctionResponse create() {
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
    public Function getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateFunctionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(Function body);

        @Override
        UpdateFunctionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateFunctionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Function body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateFunctionResponse response) {
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
        public Builder body(Function body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateFunctionResponse build() {
            return new UpdateFunctionResponse(this);
        } 

    } 

}
