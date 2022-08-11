// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTablePartitionResponse} extends {@link TeaModel}
 *
 * <p>GetMetaTablePartitionResponse</p>
 */
public class GetMetaTablePartitionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMetaTablePartitionResponseBody body;

    private GetMetaTablePartitionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMetaTablePartitionResponse create() {
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
    public GetMetaTablePartitionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMetaTablePartitionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMetaTablePartitionResponseBody body);

        @Override
        GetMetaTablePartitionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMetaTablePartitionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMetaTablePartitionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMetaTablePartitionResponse response) {
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
        public Builder body(GetMetaTablePartitionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMetaTablePartitionResponse build() {
            return new GetMetaTablePartitionResponse(this);
        } 

    } 

}
