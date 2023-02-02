// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTrendGroupOutputTpsResponse} extends {@link TeaModel}
 *
 * <p>OnsTrendGroupOutputTpsResponse</p>
 */
public class OnsTrendGroupOutputTpsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsTrendGroupOutputTpsResponseBody body;

    private OnsTrendGroupOutputTpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsTrendGroupOutputTpsResponse create() {
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
    public OnsTrendGroupOutputTpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsTrendGroupOutputTpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsTrendGroupOutputTpsResponseBody body);

        @Override
        OnsTrendGroupOutputTpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsTrendGroupOutputTpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsTrendGroupOutputTpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsTrendGroupOutputTpsResponse response) {
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
        public Builder body(OnsTrendGroupOutputTpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsTrendGroupOutputTpsResponse build() {
            return new OnsTrendGroupOutputTpsResponse(this);
        } 

    } 

}
