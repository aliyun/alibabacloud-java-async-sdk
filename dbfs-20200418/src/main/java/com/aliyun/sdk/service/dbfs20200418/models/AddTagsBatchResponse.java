// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTagsBatchResponse} extends {@link TeaModel}
 *
 * <p>AddTagsBatchResponse</p>
 */
public class AddTagsBatchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddTagsBatchResponseBody body;

    private AddTagsBatchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddTagsBatchResponse create() {
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
    public AddTagsBatchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddTagsBatchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddTagsBatchResponseBody body);

        @Override
        AddTagsBatchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddTagsBatchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddTagsBatchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddTagsBatchResponse response) {
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
        public Builder body(AddTagsBatchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddTagsBatchResponse build() {
            return new AddTagsBatchResponse(this);
        } 

    } 

}
