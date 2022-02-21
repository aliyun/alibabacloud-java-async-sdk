// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchInsertMembersResponse} extends {@link TeaModel}
 *
 * <p>BatchInsertMembersResponse</p>
 */
public class BatchInsertMembersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchInsertMembersResponseBody body;

    private BatchInsertMembersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchInsertMembersResponse create() {
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
    public BatchInsertMembersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchInsertMembersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchInsertMembersResponseBody body);

        @Override
        BatchInsertMembersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchInsertMembersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchInsertMembersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchInsertMembersResponse response) {
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
        public Builder body(BatchInsertMembersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchInsertMembersResponse build() {
            return new BatchInsertMembersResponse(this);
        } 

    } 

}
