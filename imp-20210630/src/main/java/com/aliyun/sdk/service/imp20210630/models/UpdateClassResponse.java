// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateClassResponse} extends {@link TeaModel}
 *
 * <p>UpdateClassResponse</p>
 */
public class UpdateClassResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateClassResponseBody body;

    private UpdateClassResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateClassResponse create() {
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
    public UpdateClassResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateClassResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateClassResponseBody body);

        @Override
        UpdateClassResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateClassResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateClassResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateClassResponse response) {
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
        public Builder body(UpdateClassResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateClassResponse build() {
            return new UpdateClassResponse(this);
        } 

    } 

}
