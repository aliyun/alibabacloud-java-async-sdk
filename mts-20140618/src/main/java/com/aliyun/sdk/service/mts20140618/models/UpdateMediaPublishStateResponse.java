// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMediaPublishStateResponse} extends {@link TeaModel}
 *
 * <p>UpdateMediaPublishStateResponse</p>
 */
public class UpdateMediaPublishStateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMediaPublishStateResponseBody body;

    private UpdateMediaPublishStateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMediaPublishStateResponse create() {
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
    public UpdateMediaPublishStateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMediaPublishStateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMediaPublishStateResponseBody body);

        @Override
        UpdateMediaPublishStateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMediaPublishStateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMediaPublishStateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMediaPublishStateResponse response) {
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
        public Builder body(UpdateMediaPublishStateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMediaPublishStateResponse build() {
            return new UpdateMediaPublishStateResponse(this);
        } 

    } 

}
