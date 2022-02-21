// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVodTemplateResponse} extends {@link TeaModel}
 *
 * <p>UpdateVodTemplateResponse</p>
 */
public class UpdateVodTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateVodTemplateResponseBody body;

    private UpdateVodTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateVodTemplateResponse create() {
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
    public UpdateVodTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateVodTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateVodTemplateResponseBody body);

        @Override
        UpdateVodTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateVodTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateVodTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateVodTemplateResponse response) {
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
        public Builder body(UpdateVodTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateVodTemplateResponse build() {
            return new UpdateVodTemplateResponse(this);
        } 

    } 

}
