// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOTAModuleResponse} extends {@link TeaModel}
 *
 * <p>UpdateOTAModuleResponse</p>
 */
public class UpdateOTAModuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateOTAModuleResponseBody body;

    private UpdateOTAModuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateOTAModuleResponse create() {
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
    public UpdateOTAModuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateOTAModuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateOTAModuleResponseBody body);

        @Override
        UpdateOTAModuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateOTAModuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateOTAModuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateOTAModuleResponse response) {
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
        public Builder body(UpdateOTAModuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateOTAModuleResponse build() {
            return new UpdateOTAModuleResponse(this);
        } 

    } 

}
