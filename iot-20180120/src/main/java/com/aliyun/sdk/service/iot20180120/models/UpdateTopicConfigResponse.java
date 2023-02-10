// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTopicConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateTopicConfigResponse</p>
 */
public class UpdateTopicConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTopicConfigResponseBody body;

    private UpdateTopicConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTopicConfigResponse create() {
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
    public UpdateTopicConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTopicConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTopicConfigResponseBody body);

        @Override
        UpdateTopicConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTopicConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTopicConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTopicConfigResponse response) {
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
        public Builder body(UpdateTopicConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTopicConfigResponse build() {
            return new UpdateTopicConfigResponse(this);
        } 

    } 

}
