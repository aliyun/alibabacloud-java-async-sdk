// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCycleTaskListResponse} extends {@link TeaModel}
 *
 * <p>DescribeCycleTaskListResponse</p>
 */
public class DescribeCycleTaskListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCycleTaskListResponseBody body;

    private DescribeCycleTaskListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCycleTaskListResponse create() {
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
    public DescribeCycleTaskListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCycleTaskListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCycleTaskListResponseBody body);

        @Override
        DescribeCycleTaskListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCycleTaskListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCycleTaskListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCycleTaskListResponse response) {
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
        public Builder body(DescribeCycleTaskListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCycleTaskListResponse build() {
            return new DescribeCycleTaskListResponse(this);
        } 

    } 

}
