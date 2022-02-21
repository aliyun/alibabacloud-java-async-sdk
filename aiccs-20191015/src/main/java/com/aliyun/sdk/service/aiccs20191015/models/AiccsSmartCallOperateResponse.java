// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AiccsSmartCallOperateResponse} extends {@link TeaModel}
 *
 * <p>AiccsSmartCallOperateResponse</p>
 */
public class AiccsSmartCallOperateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AiccsSmartCallOperateResponseBody body;

    private AiccsSmartCallOperateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AiccsSmartCallOperateResponse create() {
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
    public AiccsSmartCallOperateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AiccsSmartCallOperateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AiccsSmartCallOperateResponseBody body);

        @Override
        AiccsSmartCallOperateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AiccsSmartCallOperateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AiccsSmartCallOperateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AiccsSmartCallOperateResponse response) {
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
        public Builder body(AiccsSmartCallOperateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AiccsSmartCallOperateResponse build() {
            return new AiccsSmartCallOperateResponse(this);
        } 

    } 

}
