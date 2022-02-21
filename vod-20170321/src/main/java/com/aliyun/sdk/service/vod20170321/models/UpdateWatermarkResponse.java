// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWatermarkResponse} extends {@link TeaModel}
 *
 * <p>UpdateWatermarkResponse</p>
 */
public class UpdateWatermarkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateWatermarkResponseBody body;

    private UpdateWatermarkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateWatermarkResponse create() {
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
    public UpdateWatermarkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateWatermarkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateWatermarkResponseBody body);

        @Override
        UpdateWatermarkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateWatermarkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateWatermarkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateWatermarkResponse response) {
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
        public Builder body(UpdateWatermarkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateWatermarkResponse build() {
            return new UpdateWatermarkResponse(this);
        } 

    } 

}
