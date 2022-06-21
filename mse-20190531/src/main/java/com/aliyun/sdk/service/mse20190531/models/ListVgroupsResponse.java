// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVgroupsResponse} extends {@link TeaModel}
 *
 * <p>ListVgroupsResponse</p>
 */
public class ListVgroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVgroupsResponseBody body;

    private ListVgroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVgroupsResponse create() {
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
    public ListVgroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVgroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVgroupsResponseBody body);

        @Override
        ListVgroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVgroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVgroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVgroupsResponse response) {
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
        public Builder body(ListVgroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVgroupsResponse build() {
            return new ListVgroupsResponse(this);
        } 

    } 

}
