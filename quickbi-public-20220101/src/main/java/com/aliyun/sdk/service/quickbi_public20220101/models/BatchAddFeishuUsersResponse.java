// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchAddFeishuUsersResponse} extends {@link TeaModel}
 *
 * <p>BatchAddFeishuUsersResponse</p>
 */
public class BatchAddFeishuUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchAddFeishuUsersResponseBody body;

    private BatchAddFeishuUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchAddFeishuUsersResponse create() {
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
    public BatchAddFeishuUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchAddFeishuUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchAddFeishuUsersResponseBody body);

        @Override
        BatchAddFeishuUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchAddFeishuUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchAddFeishuUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchAddFeishuUsersResponse response) {
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
        public Builder body(BatchAddFeishuUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchAddFeishuUsersResponse build() {
            return new BatchAddFeishuUsersResponse(this);
        } 

    } 

}
