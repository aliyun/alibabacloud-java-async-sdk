// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFunctionInstanceResponse} extends {@link TeaModel}
 *
 * <p>UpdateFunctionInstanceResponse</p>
 */
public class UpdateFunctionInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateFunctionInstanceResponseBody body;

    private UpdateFunctionInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateFunctionInstanceResponse create() {
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
    public UpdateFunctionInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateFunctionInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateFunctionInstanceResponseBody body);

        @Override
        UpdateFunctionInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateFunctionInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateFunctionInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateFunctionInstanceResponse response) {
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
        public Builder body(UpdateFunctionInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateFunctionInstanceResponse build() {
            return new UpdateFunctionInstanceResponse(this);
        } 

    } 

}
