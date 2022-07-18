// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResourceResponse} extends {@link TeaModel}
 *
 * <p>UpdateResourceResponse</p>
 */
public class UpdateResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateResourceResponseBody body;

    private UpdateResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateResourceResponse create() {
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
    public UpdateResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateResourceResponseBody body);

        @Override
        UpdateResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateResourceResponse response) {
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
        public Builder body(UpdateResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateResourceResponse build() {
            return new UpdateResourceResponse(this);
        } 

    } 

}
