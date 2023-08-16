// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIntlDomainDownloadUrlResponse} extends {@link TeaModel}
 *
 * <p>GetIntlDomainDownloadUrlResponse</p>
 */
public class GetIntlDomainDownloadUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetIntlDomainDownloadUrlResponseBody body;

    private GetIntlDomainDownloadUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetIntlDomainDownloadUrlResponse create() {
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
    public GetIntlDomainDownloadUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetIntlDomainDownloadUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetIntlDomainDownloadUrlResponseBody body);

        @Override
        GetIntlDomainDownloadUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetIntlDomainDownloadUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetIntlDomainDownloadUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetIntlDomainDownloadUrlResponse response) {
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
        public Builder body(GetIntlDomainDownloadUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetIntlDomainDownloadUrlResponse build() {
            return new GetIntlDomainDownloadUrlResponse(this);
        } 

    } 

}
