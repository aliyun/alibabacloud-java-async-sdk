// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDataWithSignatureResponse} extends {@link TeaModel}
 *
 * <p>SetDataWithSignatureResponse</p>
 */
public class SetDataWithSignatureResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDataWithSignatureResponseBody body;

    private SetDataWithSignatureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDataWithSignatureResponse create() {
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
    public SetDataWithSignatureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDataWithSignatureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDataWithSignatureResponseBody body);

        @Override
        SetDataWithSignatureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDataWithSignatureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDataWithSignatureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDataWithSignatureResponse response) {
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
        public Builder body(SetDataWithSignatureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDataWithSignatureResponse build() {
            return new SetDataWithSignatureResponse(this);
        } 

    } 

}
