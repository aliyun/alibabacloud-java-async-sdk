// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParameterModificationHistoriesResponse} extends {@link TeaModel}
 *
 * <p>DescribeParameterModificationHistoriesResponse</p>
 */
public class DescribeParameterModificationHistoriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeParameterModificationHistoriesResponseBody body;

    private DescribeParameterModificationHistoriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeParameterModificationHistoriesResponse create() {
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
    public DescribeParameterModificationHistoriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeParameterModificationHistoriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeParameterModificationHistoriesResponseBody body);

        @Override
        DescribeParameterModificationHistoriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeParameterModificationHistoriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeParameterModificationHistoriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeParameterModificationHistoriesResponse response) {
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
        public Builder body(DescribeParameterModificationHistoriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeParameterModificationHistoriesResponse build() {
            return new DescribeParameterModificationHistoriesResponse(this);
        } 

    } 

}
