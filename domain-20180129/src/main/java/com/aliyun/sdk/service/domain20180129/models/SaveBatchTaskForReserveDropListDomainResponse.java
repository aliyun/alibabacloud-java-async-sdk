// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveBatchTaskForReserveDropListDomainResponse} extends {@link TeaModel}
 *
 * <p>SaveBatchTaskForReserveDropListDomainResponse</p>
 */
public class SaveBatchTaskForReserveDropListDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveBatchTaskForReserveDropListDomainResponseBody body;

    private SaveBatchTaskForReserveDropListDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveBatchTaskForReserveDropListDomainResponse create() {
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
    public SaveBatchTaskForReserveDropListDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveBatchTaskForReserveDropListDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveBatchTaskForReserveDropListDomainResponseBody body);

        @Override
        SaveBatchTaskForReserveDropListDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveBatchTaskForReserveDropListDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveBatchTaskForReserveDropListDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveBatchTaskForReserveDropListDomainResponse response) {
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
        public Builder body(SaveBatchTaskForReserveDropListDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveBatchTaskForReserveDropListDomainResponse build() {
            return new SaveBatchTaskForReserveDropListDomainResponse(this);
        } 

    } 

}
