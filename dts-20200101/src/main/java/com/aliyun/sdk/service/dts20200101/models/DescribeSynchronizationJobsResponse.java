// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSynchronizationJobsResponse} extends {@link TeaModel}
 *
 * <p>DescribeSynchronizationJobsResponse</p>
 */
public class DescribeSynchronizationJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSynchronizationJobsResponseBody body;

    private DescribeSynchronizationJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSynchronizationJobsResponse create() {
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
    public DescribeSynchronizationJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSynchronizationJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSynchronizationJobsResponseBody body);

        @Override
        DescribeSynchronizationJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSynchronizationJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSynchronizationJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSynchronizationJobsResponse response) {
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
        public Builder body(DescribeSynchronizationJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSynchronizationJobsResponse build() {
            return new DescribeSynchronizationJobsResponse(this);
        } 

    } 

}
