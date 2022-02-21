// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFCTriggerResponse} extends {@link TeaModel}
 *
 * <p>DescribeFCTriggerResponse</p>
 */
public class DescribeFCTriggerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFCTriggerResponseBody body;

    private DescribeFCTriggerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFCTriggerResponse create() {
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
    public DescribeFCTriggerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFCTriggerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFCTriggerResponseBody body);

        @Override
        DescribeFCTriggerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFCTriggerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFCTriggerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFCTriggerResponse response) {
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
        public Builder body(DescribeFCTriggerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFCTriggerResponse build() {
            return new DescribeFCTriggerResponse(this);
        } 

    } 

}
