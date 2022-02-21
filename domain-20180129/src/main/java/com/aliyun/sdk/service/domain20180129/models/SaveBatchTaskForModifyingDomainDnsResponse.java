// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveBatchTaskForModifyingDomainDnsResponse} extends {@link TeaModel}
 *
 * <p>SaveBatchTaskForModifyingDomainDnsResponse</p>
 */
public class SaveBatchTaskForModifyingDomainDnsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveBatchTaskForModifyingDomainDnsResponseBody body;

    private SaveBatchTaskForModifyingDomainDnsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveBatchTaskForModifyingDomainDnsResponse create() {
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
    public SaveBatchTaskForModifyingDomainDnsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveBatchTaskForModifyingDomainDnsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveBatchTaskForModifyingDomainDnsResponseBody body);

        @Override
        SaveBatchTaskForModifyingDomainDnsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveBatchTaskForModifyingDomainDnsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveBatchTaskForModifyingDomainDnsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveBatchTaskForModifyingDomainDnsResponse response) {
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
        public Builder body(SaveBatchTaskForModifyingDomainDnsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveBatchTaskForModifyingDomainDnsResponse build() {
            return new SaveBatchTaskForModifyingDomainDnsResponse(this);
        } 

    } 

}
