// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSingleTaskForDomainNameProxyServiceResponse} extends {@link TeaModel}
 *
 * <p>SaveSingleTaskForDomainNameProxyServiceResponse</p>
 */
public class SaveSingleTaskForDomainNameProxyServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveSingleTaskForDomainNameProxyServiceResponseBody body;

    private SaveSingleTaskForDomainNameProxyServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveSingleTaskForDomainNameProxyServiceResponse create() {
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
    public SaveSingleTaskForDomainNameProxyServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveSingleTaskForDomainNameProxyServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveSingleTaskForDomainNameProxyServiceResponseBody body);

        @Override
        SaveSingleTaskForDomainNameProxyServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveSingleTaskForDomainNameProxyServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveSingleTaskForDomainNameProxyServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveSingleTaskForDomainNameProxyServiceResponse response) {
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
        public Builder body(SaveSingleTaskForDomainNameProxyServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveSingleTaskForDomainNameProxyServiceResponse build() {
            return new SaveSingleTaskForDomainNameProxyServiceResponse(this);
        } 

    } 

}
