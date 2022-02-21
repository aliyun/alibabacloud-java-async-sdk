// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLiveResponse} extends {@link TeaModel}
 *
 * <p>UpdateLiveResponse</p>
 */
public class UpdateLiveResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateLiveResponseBody body;

    private UpdateLiveResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateLiveResponse create() {
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
    public UpdateLiveResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateLiveResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateLiveResponseBody body);

        @Override
        UpdateLiveResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateLiveResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateLiveResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateLiveResponse response) {
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
        public Builder body(UpdateLiveResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateLiveResponse build() {
            return new UpdateLiveResponse(this);
        } 

    } 

}
