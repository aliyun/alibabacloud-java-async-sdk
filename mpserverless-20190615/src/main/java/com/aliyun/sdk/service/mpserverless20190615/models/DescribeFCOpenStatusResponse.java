// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFCOpenStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeFCOpenStatusResponse</p>
 */
public class DescribeFCOpenStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFCOpenStatusResponseBody body;

    private DescribeFCOpenStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFCOpenStatusResponse create() {
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
    public DescribeFCOpenStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFCOpenStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFCOpenStatusResponseBody body);

        @Override
        DescribeFCOpenStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFCOpenStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFCOpenStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFCOpenStatusResponse response) {
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
        public Builder body(DescribeFCOpenStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFCOpenStatusResponse build() {
            return new DescribeFCOpenStatusResponse(this);
        } 

    } 

}
