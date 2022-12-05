// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMessageAppResponse} extends {@link TeaModel}
 *
 * <p>UpdateMessageAppResponse</p>
 */
public class UpdateMessageAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMessageAppResponseBody body;

    private UpdateMessageAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMessageAppResponse create() {
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
    public UpdateMessageAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMessageAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMessageAppResponseBody body);

        @Override
        UpdateMessageAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMessageAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMessageAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMessageAppResponse response) {
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
        public Builder body(UpdateMessageAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMessageAppResponse build() {
            return new UpdateMessageAppResponse(this);
        } 

    } 

}
