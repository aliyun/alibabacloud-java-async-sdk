// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateProduceForPartnerResponse} extends {@link TeaModel}
 *
 * <p>OperateProduceForPartnerResponse</p>
 */
public class OperateProduceForPartnerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OperateProduceForPartnerResponseBody body;

    private OperateProduceForPartnerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OperateProduceForPartnerResponse create() {
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
    public OperateProduceForPartnerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OperateProduceForPartnerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OperateProduceForPartnerResponseBody body);

        @Override
        OperateProduceForPartnerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OperateProduceForPartnerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OperateProduceForPartnerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OperateProduceForPartnerResponse response) {
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
        public Builder body(OperateProduceForPartnerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OperateProduceForPartnerResponse build() {
            return new OperateProduceForPartnerResponse(this);
        } 

    } 

}
