// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveTopDomainsByFlowResponse} extends {@link TeaModel}
 *
 * <p>DescribeLiveTopDomainsByFlowResponse</p>
 */
public class DescribeLiveTopDomainsByFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLiveTopDomainsByFlowResponseBody body;

    private DescribeLiveTopDomainsByFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLiveTopDomainsByFlowResponse create() {
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
    public DescribeLiveTopDomainsByFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLiveTopDomainsByFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLiveTopDomainsByFlowResponseBody body);

        @Override
        DescribeLiveTopDomainsByFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLiveTopDomainsByFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLiveTopDomainsByFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLiveTopDomainsByFlowResponse response) {
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
        public Builder body(DescribeLiveTopDomainsByFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLiveTopDomainsByFlowResponse build() {
            return new DescribeLiveTopDomainsByFlowResponse(this);
        } 

    } 

}
