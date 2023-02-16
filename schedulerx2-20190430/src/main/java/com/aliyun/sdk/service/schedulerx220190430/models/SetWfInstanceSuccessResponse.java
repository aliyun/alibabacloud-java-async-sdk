// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetWfInstanceSuccessResponse} extends {@link TeaModel}
 *
 * <p>SetWfInstanceSuccessResponse</p>
 */
public class SetWfInstanceSuccessResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetWfInstanceSuccessResponseBody body;

    private SetWfInstanceSuccessResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetWfInstanceSuccessResponse create() {
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
    public SetWfInstanceSuccessResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetWfInstanceSuccessResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetWfInstanceSuccessResponseBody body);

        @Override
        SetWfInstanceSuccessResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetWfInstanceSuccessResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetWfInstanceSuccessResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetWfInstanceSuccessResponse response) {
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
        public Builder body(SetWfInstanceSuccessResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetWfInstanceSuccessResponse build() {
            return new SetWfInstanceSuccessResponse(this);
        } 

    } 

}
