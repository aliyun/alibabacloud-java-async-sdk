// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateExecutionResponse} extends {@link TeaModel}
 *
 * <p>UpdateExecutionResponse</p>
 */
public class UpdateExecutionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateExecutionResponseBody body;

    private UpdateExecutionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateExecutionResponse create() {
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
    public UpdateExecutionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateExecutionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateExecutionResponseBody body);

        @Override
        UpdateExecutionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateExecutionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateExecutionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateExecutionResponse response) {
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
        public Builder body(UpdateExecutionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateExecutionResponse build() {
            return new UpdateExecutionResponse(this);
        } 

    } 

}
