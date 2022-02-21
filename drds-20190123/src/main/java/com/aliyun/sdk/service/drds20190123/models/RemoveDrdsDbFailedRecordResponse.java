// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveDrdsDbFailedRecordResponse} extends {@link TeaModel}
 *
 * <p>RemoveDrdsDbFailedRecordResponse</p>
 */
public class RemoveDrdsDbFailedRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveDrdsDbFailedRecordResponseBody body;

    private RemoveDrdsDbFailedRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveDrdsDbFailedRecordResponse create() {
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
    public RemoveDrdsDbFailedRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveDrdsDbFailedRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveDrdsDbFailedRecordResponseBody body);

        @Override
        RemoveDrdsDbFailedRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveDrdsDbFailedRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveDrdsDbFailedRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveDrdsDbFailedRecordResponse response) {
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
        public Builder body(RemoveDrdsDbFailedRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveDrdsDbFailedRecordResponse build() {
            return new RemoveDrdsDbFailedRecordResponse(this);
        } 

    } 

}
