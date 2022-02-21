// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVodDomainResponse} extends {@link TeaModel}
 *
 * <p>UpdateVodDomainResponse</p>
 */
public class UpdateVodDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateVodDomainResponseBody body;

    private UpdateVodDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateVodDomainResponse create() {
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
    public UpdateVodDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateVodDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateVodDomainResponseBody body);

        @Override
        UpdateVodDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateVodDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateVodDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateVodDomainResponse response) {
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
        public Builder body(UpdateVodDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateVodDomainResponse build() {
            return new UpdateVodDomainResponse(this);
        } 

    } 

}
