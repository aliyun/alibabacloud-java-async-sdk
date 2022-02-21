// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppInfoResponse} extends {@link TeaModel}
 *
 * <p>UpdateAppInfoResponse</p>
 */
public class UpdateAppInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAppInfoResponseBody body;

    private UpdateAppInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAppInfoResponse create() {
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
    public UpdateAppInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAppInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAppInfoResponseBody body);

        @Override
        UpdateAppInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAppInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAppInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAppInfoResponse response) {
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
        public Builder body(UpdateAppInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAppInfoResponse build() {
            return new UpdateAppInfoResponse(this);
        } 

    } 

}
