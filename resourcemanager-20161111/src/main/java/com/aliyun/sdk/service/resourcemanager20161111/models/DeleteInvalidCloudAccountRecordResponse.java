// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInvalidCloudAccountRecordResponse} extends {@link TeaModel}
 *
 * <p>DeleteInvalidCloudAccountRecordResponse</p>
 */
public class DeleteInvalidCloudAccountRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteInvalidCloudAccountRecordResponseBody body;

    private DeleteInvalidCloudAccountRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteInvalidCloudAccountRecordResponse create() {
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
    public DeleteInvalidCloudAccountRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteInvalidCloudAccountRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteInvalidCloudAccountRecordResponseBody body);

        @Override
        DeleteInvalidCloudAccountRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteInvalidCloudAccountRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteInvalidCloudAccountRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteInvalidCloudAccountRecordResponse response) {
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
        public Builder body(DeleteInvalidCloudAccountRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteInvalidCloudAccountRecordResponse build() {
            return new DeleteInvalidCloudAccountRecordResponse(this);
        } 

    } 

}
