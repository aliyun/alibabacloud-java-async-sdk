// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HoldCallResponse} extends {@link TeaModel}
 *
 * <p>HoldCallResponse</p>
 */
public class HoldCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private HoldCallResponseBody body;

    private HoldCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static HoldCallResponse create() {
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
    public HoldCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<HoldCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(HoldCallResponseBody body);

        @Override
        HoldCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<HoldCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private HoldCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(HoldCallResponse response) {
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
        public Builder body(HoldCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public HoldCallResponse build() {
            return new HoldCallResponse(this);
        } 

    } 

}
