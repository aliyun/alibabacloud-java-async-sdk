// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFunctionDefaultInstanceResponse} extends {@link TeaModel}
 *
 * <p>UpdateFunctionDefaultInstanceResponse</p>
 */
public class UpdateFunctionDefaultInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateFunctionDefaultInstanceResponseBody body;

    private UpdateFunctionDefaultInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateFunctionDefaultInstanceResponse create() {
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
    public UpdateFunctionDefaultInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateFunctionDefaultInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateFunctionDefaultInstanceResponseBody body);

        @Override
        UpdateFunctionDefaultInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateFunctionDefaultInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateFunctionDefaultInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateFunctionDefaultInstanceResponse response) {
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
        public Builder body(UpdateFunctionDefaultInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateFunctionDefaultInstanceResponse build() {
            return new UpdateFunctionDefaultInstanceResponse(this);
        } 

    } 

}
