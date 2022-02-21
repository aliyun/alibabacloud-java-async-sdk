// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateModelServiceResponse} extends {@link TeaModel}
 *
 * <p>UpdateModelServiceResponse</p>
 */
public class UpdateModelServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateModelServiceResponseBody body;

    private UpdateModelServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateModelServiceResponse create() {
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
    public UpdateModelServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateModelServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateModelServiceResponseBody body);

        @Override
        UpdateModelServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateModelServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateModelServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateModelServiceResponse response) {
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
        public Builder body(UpdateModelServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateModelServiceResponse build() {
            return new UpdateModelServiceResponse(this);
        } 

    } 

}
