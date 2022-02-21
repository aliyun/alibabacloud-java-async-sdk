// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVideoInfoResponse} extends {@link TeaModel}
 *
 * <p>UpdateVideoInfoResponse</p>
 */
public class UpdateVideoInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateVideoInfoResponseBody body;

    private UpdateVideoInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateVideoInfoResponse create() {
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
    public UpdateVideoInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateVideoInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateVideoInfoResponseBody body);

        @Override
        UpdateVideoInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateVideoInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateVideoInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateVideoInfoResponse response) {
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
        public Builder body(UpdateVideoInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateVideoInfoResponse build() {
            return new UpdateVideoInfoResponse(this);
        } 

    } 

}
