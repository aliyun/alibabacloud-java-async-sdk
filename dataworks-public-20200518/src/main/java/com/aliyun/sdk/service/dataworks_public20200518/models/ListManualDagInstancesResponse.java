// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListManualDagInstancesResponse} extends {@link TeaModel}
 *
 * <p>ListManualDagInstancesResponse</p>
 */
public class ListManualDagInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListManualDagInstancesResponseBody body;

    private ListManualDagInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListManualDagInstancesResponse create() {
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
    public ListManualDagInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListManualDagInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListManualDagInstancesResponseBody body);

        @Override
        ListManualDagInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListManualDagInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListManualDagInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListManualDagInstancesResponse response) {
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
        public Builder body(ListManualDagInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListManualDagInstancesResponse build() {
            return new ListManualDagInstancesResponse(this);
        } 

    } 

}
