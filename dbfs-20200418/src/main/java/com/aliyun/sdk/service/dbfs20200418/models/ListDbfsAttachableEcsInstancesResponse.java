// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDbfsAttachableEcsInstancesResponse} extends {@link TeaModel}
 *
 * <p>ListDbfsAttachableEcsInstancesResponse</p>
 */
public class ListDbfsAttachableEcsInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDbfsAttachableEcsInstancesResponseBody body;

    private ListDbfsAttachableEcsInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDbfsAttachableEcsInstancesResponse create() {
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
    public ListDbfsAttachableEcsInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDbfsAttachableEcsInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDbfsAttachableEcsInstancesResponseBody body);

        @Override
        ListDbfsAttachableEcsInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDbfsAttachableEcsInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDbfsAttachableEcsInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDbfsAttachableEcsInstancesResponse response) {
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
        public Builder body(ListDbfsAttachableEcsInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDbfsAttachableEcsInstancesResponse build() {
            return new ListDbfsAttachableEcsInstancesResponse(this);
        } 

    } 

}
