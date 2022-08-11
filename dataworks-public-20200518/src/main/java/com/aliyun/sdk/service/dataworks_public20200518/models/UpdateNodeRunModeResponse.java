// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNodeRunModeResponse} extends {@link TeaModel}
 *
 * <p>UpdateNodeRunModeResponse</p>
 */
public class UpdateNodeRunModeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateNodeRunModeResponseBody body;

    private UpdateNodeRunModeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateNodeRunModeResponse create() {
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
    public UpdateNodeRunModeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateNodeRunModeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateNodeRunModeResponseBody body);

        @Override
        UpdateNodeRunModeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateNodeRunModeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateNodeRunModeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateNodeRunModeResponse response) {
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
        public Builder body(UpdateNodeRunModeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateNodeRunModeResponse build() {
            return new UpdateNodeRunModeResponse(this);
        } 

    } 

}
