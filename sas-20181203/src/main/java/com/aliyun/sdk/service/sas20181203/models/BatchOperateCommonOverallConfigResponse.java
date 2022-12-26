// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchOperateCommonOverallConfigResponse} extends {@link TeaModel}
 *
 * <p>BatchOperateCommonOverallConfigResponse</p>
 */
public class BatchOperateCommonOverallConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchOperateCommonOverallConfigResponseBody body;

    private BatchOperateCommonOverallConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchOperateCommonOverallConfigResponse create() {
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
    public BatchOperateCommonOverallConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchOperateCommonOverallConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchOperateCommonOverallConfigResponseBody body);

        @Override
        BatchOperateCommonOverallConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchOperateCommonOverallConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchOperateCommonOverallConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchOperateCommonOverallConfigResponse response) {
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
        public Builder body(BatchOperateCommonOverallConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchOperateCommonOverallConfigResponse build() {
            return new BatchOperateCommonOverallConfigResponse(this);
        } 

    } 

}
