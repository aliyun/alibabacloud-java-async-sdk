// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStreamInfoResponse} extends {@link TeaModel}
 *
 * <p>UpdateStreamInfoResponse</p>
 */
public class UpdateStreamInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateStreamInfoResponseBody body;

    private UpdateStreamInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateStreamInfoResponse create() {
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
    public UpdateStreamInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateStreamInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateStreamInfoResponseBody body);

        @Override
        UpdateStreamInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateStreamInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateStreamInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateStreamInfoResponse response) {
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
        public Builder body(UpdateStreamInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateStreamInfoResponse build() {
            return new UpdateStreamInfoResponse(this);
        } 

    } 

}
