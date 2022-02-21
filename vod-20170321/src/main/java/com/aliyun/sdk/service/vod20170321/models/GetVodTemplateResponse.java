// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVodTemplateResponse} extends {@link TeaModel}
 *
 * <p>GetVodTemplateResponse</p>
 */
public class GetVodTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetVodTemplateResponseBody body;

    private GetVodTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetVodTemplateResponse create() {
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
    public GetVodTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetVodTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetVodTemplateResponseBody body);

        @Override
        GetVodTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetVodTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetVodTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetVodTemplateResponse response) {
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
        public Builder body(GetVodTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetVodTemplateResponse build() {
            return new GetVodTemplateResponse(this);
        } 

    } 

}
