// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBatchSlsDispatchStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeBatchSlsDispatchStatusResponse</p>
 */
public class DescribeBatchSlsDispatchStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBatchSlsDispatchStatusResponseBody body;

    private DescribeBatchSlsDispatchStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBatchSlsDispatchStatusResponse create() {
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
    public DescribeBatchSlsDispatchStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBatchSlsDispatchStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBatchSlsDispatchStatusResponseBody body);

        @Override
        DescribeBatchSlsDispatchStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBatchSlsDispatchStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBatchSlsDispatchStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBatchSlsDispatchStatusResponse response) {
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
        public Builder body(DescribeBatchSlsDispatchStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBatchSlsDispatchStatusResponse build() {
            return new DescribeBatchSlsDispatchStatusResponse(this);
        } 

    } 

}
