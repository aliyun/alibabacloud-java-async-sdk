// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WaitApplyInvoiceTaskDetailQueryResponse} extends {@link TeaModel}
 *
 * <p>WaitApplyInvoiceTaskDetailQueryResponse</p>
 */
public class WaitApplyInvoiceTaskDetailQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private WaitApplyInvoiceTaskDetailQueryResponseBody body;

    private WaitApplyInvoiceTaskDetailQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static WaitApplyInvoiceTaskDetailQueryResponse create() {
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
    public WaitApplyInvoiceTaskDetailQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<WaitApplyInvoiceTaskDetailQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(WaitApplyInvoiceTaskDetailQueryResponseBody body);

        @Override
        WaitApplyInvoiceTaskDetailQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<WaitApplyInvoiceTaskDetailQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private WaitApplyInvoiceTaskDetailQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(WaitApplyInvoiceTaskDetailQueryResponse response) {
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
        public Builder body(WaitApplyInvoiceTaskDetailQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public WaitApplyInvoiceTaskDetailQueryResponse build() {
            return new WaitApplyInvoiceTaskDetailQueryResponse(this);
        } 

    } 

}
