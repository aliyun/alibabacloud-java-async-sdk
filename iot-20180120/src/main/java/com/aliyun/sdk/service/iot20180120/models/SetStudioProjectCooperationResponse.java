// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetStudioProjectCooperationResponse} extends {@link TeaModel}
 *
 * <p>SetStudioProjectCooperationResponse</p>
 */
public class SetStudioProjectCooperationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetStudioProjectCooperationResponseBody body;

    private SetStudioProjectCooperationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetStudioProjectCooperationResponse create() {
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
    public SetStudioProjectCooperationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetStudioProjectCooperationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetStudioProjectCooperationResponseBody body);

        @Override
        SetStudioProjectCooperationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetStudioProjectCooperationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetStudioProjectCooperationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetStudioProjectCooperationResponse response) {
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
        public Builder body(SetStudioProjectCooperationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetStudioProjectCooperationResponse build() {
            return new SetStudioProjectCooperationResponse(this);
        } 

    } 

}
