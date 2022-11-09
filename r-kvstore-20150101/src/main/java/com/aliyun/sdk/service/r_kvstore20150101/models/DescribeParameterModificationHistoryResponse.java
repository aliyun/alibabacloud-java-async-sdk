// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParameterModificationHistoryResponse} extends {@link TeaModel}
 *
 * <p>DescribeParameterModificationHistoryResponse</p>
 */
public class DescribeParameterModificationHistoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeParameterModificationHistoryResponseBody body;

    private DescribeParameterModificationHistoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeParameterModificationHistoryResponse create() {
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
    public DescribeParameterModificationHistoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeParameterModificationHistoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeParameterModificationHistoryResponseBody body);

        @Override
        DescribeParameterModificationHistoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeParameterModificationHistoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeParameterModificationHistoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeParameterModificationHistoryResponse response) {
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
        public Builder body(DescribeParameterModificationHistoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeParameterModificationHistoryResponse build() {
            return new DescribeParameterModificationHistoryResponse(this);
        } 

    } 

}
