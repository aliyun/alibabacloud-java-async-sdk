// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSynchronizationJobStatusListResponse} extends {@link TeaModel}
 *
 * <p>DescribeSynchronizationJobStatusListResponse</p>
 */
public class DescribeSynchronizationJobStatusListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSynchronizationJobStatusListResponseBody body;

    private DescribeSynchronizationJobStatusListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSynchronizationJobStatusListResponse create() {
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
    public DescribeSynchronizationJobStatusListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSynchronizationJobStatusListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSynchronizationJobStatusListResponseBody body);

        @Override
        DescribeSynchronizationJobStatusListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSynchronizationJobStatusListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSynchronizationJobStatusListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSynchronizationJobStatusListResponse response) {
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
        public Builder body(DescribeSynchronizationJobStatusListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSynchronizationJobStatusListResponse build() {
            return new DescribeSynchronizationJobStatusListResponse(this);
        } 

    } 

}
