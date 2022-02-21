// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDbfsAttachedEcsInstancesResponse} extends {@link TeaModel}
 *
 * <p>ListDbfsAttachedEcsInstancesResponse</p>
 */
public class ListDbfsAttachedEcsInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDbfsAttachedEcsInstancesResponseBody body;

    private ListDbfsAttachedEcsInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDbfsAttachedEcsInstancesResponse create() {
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
    public ListDbfsAttachedEcsInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDbfsAttachedEcsInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDbfsAttachedEcsInstancesResponseBody body);

        @Override
        ListDbfsAttachedEcsInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDbfsAttachedEcsInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDbfsAttachedEcsInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDbfsAttachedEcsInstancesResponse response) {
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
        public Builder body(ListDbfsAttachedEcsInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDbfsAttachedEcsInstancesResponse build() {
            return new ListDbfsAttachedEcsInstancesResponse(this);
        } 

    } 

}
