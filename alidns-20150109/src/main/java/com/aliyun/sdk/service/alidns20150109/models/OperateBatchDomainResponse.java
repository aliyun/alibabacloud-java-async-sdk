// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateBatchDomainResponse} extends {@link TeaModel}
 *
 * <p>OperateBatchDomainResponse</p>
 */
public class OperateBatchDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OperateBatchDomainResponseBody body;

    private OperateBatchDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OperateBatchDomainResponse create() {
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
    public OperateBatchDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OperateBatchDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OperateBatchDomainResponseBody body);

        @Override
        OperateBatchDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OperateBatchDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OperateBatchDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OperateBatchDomainResponse response) {
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
        public Builder body(OperateBatchDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OperateBatchDomainResponse build() {
            return new OperateBatchDomainResponse(this);
        } 

    } 

}
