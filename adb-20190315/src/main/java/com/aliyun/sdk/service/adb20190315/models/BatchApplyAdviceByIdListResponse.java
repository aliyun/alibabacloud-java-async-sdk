// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchApplyAdviceByIdListResponse} extends {@link TeaModel}
 *
 * <p>BatchApplyAdviceByIdListResponse</p>
 */
public class BatchApplyAdviceByIdListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchApplyAdviceByIdListResponseBody body;

    private BatchApplyAdviceByIdListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchApplyAdviceByIdListResponse create() {
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
    public BatchApplyAdviceByIdListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchApplyAdviceByIdListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchApplyAdviceByIdListResponseBody body);

        @Override
        BatchApplyAdviceByIdListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchApplyAdviceByIdListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchApplyAdviceByIdListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchApplyAdviceByIdListResponse response) {
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
        public Builder body(BatchApplyAdviceByIdListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchApplyAdviceByIdListResponse build() {
            return new BatchApplyAdviceByIdListResponse(this);
        } 

    } 

}
