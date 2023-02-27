// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendDtmfSignalingResponse} extends {@link TeaModel}
 *
 * <p>SendDtmfSignalingResponse</p>
 */
public class SendDtmfSignalingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendDtmfSignalingResponseBody body;

    private SendDtmfSignalingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendDtmfSignalingResponse create() {
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
    public SendDtmfSignalingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendDtmfSignalingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendDtmfSignalingResponseBody body);

        @Override
        SendDtmfSignalingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendDtmfSignalingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendDtmfSignalingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendDtmfSignalingResponse response) {
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
        public Builder body(SendDtmfSignalingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendDtmfSignalingResponse build() {
            return new SendDtmfSignalingResponse(this);
        } 

    } 

}
