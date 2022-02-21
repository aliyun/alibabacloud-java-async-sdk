// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateListenerResponse} extends {@link TeaModel}
 *
 * <p>UpdateListenerResponse</p>
 */
public class UpdateListenerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateListenerResponseBody body;

    private UpdateListenerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateListenerResponse create() {
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
    public UpdateListenerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateListenerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateListenerResponseBody body);

        @Override
        UpdateListenerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateListenerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateListenerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateListenerResponse response) {
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
        public Builder body(UpdateListenerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateListenerResponse build() {
            return new UpdateListenerResponse(this);
        } 

    } 

}
