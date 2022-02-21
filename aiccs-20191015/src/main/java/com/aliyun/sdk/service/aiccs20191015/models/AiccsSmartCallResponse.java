// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AiccsSmartCallResponse} extends {@link TeaModel}
 *
 * <p>AiccsSmartCallResponse</p>
 */
public class AiccsSmartCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AiccsSmartCallResponseBody body;

    private AiccsSmartCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AiccsSmartCallResponse create() {
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
    public AiccsSmartCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AiccsSmartCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AiccsSmartCallResponseBody body);

        @Override
        AiccsSmartCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AiccsSmartCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AiccsSmartCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AiccsSmartCallResponse response) {
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
        public Builder body(AiccsSmartCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AiccsSmartCallResponse build() {
            return new AiccsSmartCallResponse(this);
        } 

    } 

}
