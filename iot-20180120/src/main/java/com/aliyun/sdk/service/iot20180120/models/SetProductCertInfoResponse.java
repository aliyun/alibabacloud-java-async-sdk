// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetProductCertInfoResponse} extends {@link TeaModel}
 *
 * <p>SetProductCertInfoResponse</p>
 */
public class SetProductCertInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetProductCertInfoResponseBody body;

    private SetProductCertInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetProductCertInfoResponse create() {
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
    public SetProductCertInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetProductCertInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetProductCertInfoResponseBody body);

        @Override
        SetProductCertInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetProductCertInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetProductCertInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetProductCertInfoResponse response) {
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
        public Builder body(SetProductCertInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetProductCertInfoResponse build() {
            return new SetProductCertInfoResponse(this);
        } 

    } 

}
