// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveBatchTaskForDomainNameProxyServiceResponse} extends {@link TeaModel}
 *
 * <p>SaveBatchTaskForDomainNameProxyServiceResponse</p>
 */
public class SaveBatchTaskForDomainNameProxyServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveBatchTaskForDomainNameProxyServiceResponseBody body;

    private SaveBatchTaskForDomainNameProxyServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveBatchTaskForDomainNameProxyServiceResponse create() {
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
    public SaveBatchTaskForDomainNameProxyServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveBatchTaskForDomainNameProxyServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveBatchTaskForDomainNameProxyServiceResponseBody body);

        @Override
        SaveBatchTaskForDomainNameProxyServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveBatchTaskForDomainNameProxyServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveBatchTaskForDomainNameProxyServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveBatchTaskForDomainNameProxyServiceResponse response) {
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
        public Builder body(SaveBatchTaskForDomainNameProxyServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveBatchTaskForDomainNameProxyServiceResponse build() {
            return new SaveBatchTaskForDomainNameProxyServiceResponse(this);
        } 

    } 

}
