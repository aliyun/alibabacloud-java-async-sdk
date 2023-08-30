// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSynchronizationJobStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeSynchronizationJobStatusResponse</p>
 */
public class DescribeSynchronizationJobStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSynchronizationJobStatusResponseBody body;

    private DescribeSynchronizationJobStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSynchronizationJobStatusResponse create() {
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
    public DescribeSynchronizationJobStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSynchronizationJobStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSynchronizationJobStatusResponseBody body);

        @Override
        DescribeSynchronizationJobStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSynchronizationJobStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSynchronizationJobStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSynchronizationJobStatusResponse response) {
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
        public Builder body(DescribeSynchronizationJobStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSynchronizationJobStatusResponse build() {
            return new DescribeSynchronizationJobStatusResponse(this);
        } 

    } 

}
