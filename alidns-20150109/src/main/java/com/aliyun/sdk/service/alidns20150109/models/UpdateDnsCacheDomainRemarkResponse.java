// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDnsCacheDomainRemarkResponse} extends {@link TeaModel}
 *
 * <p>UpdateDnsCacheDomainRemarkResponse</p>
 */
public class UpdateDnsCacheDomainRemarkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDnsCacheDomainRemarkResponseBody body;

    private UpdateDnsCacheDomainRemarkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDnsCacheDomainRemarkResponse create() {
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
    public UpdateDnsCacheDomainRemarkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDnsCacheDomainRemarkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDnsCacheDomainRemarkResponseBody body);

        @Override
        UpdateDnsCacheDomainRemarkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDnsCacheDomainRemarkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDnsCacheDomainRemarkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDnsCacheDomainRemarkResponse response) {
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
        public Builder body(UpdateDnsCacheDomainRemarkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDnsCacheDomainRemarkResponse build() {
            return new UpdateDnsCacheDomainRemarkResponse(this);
        } 

    } 

}
