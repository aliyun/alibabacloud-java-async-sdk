// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVersionDeviceGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListVersionDeviceGroupsResponse</p>
 */
public class ListVersionDeviceGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVersionDeviceGroupsResponseBody body;

    private ListVersionDeviceGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVersionDeviceGroupsResponse create() {
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
    public ListVersionDeviceGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVersionDeviceGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVersionDeviceGroupsResponseBody body);

        @Override
        ListVersionDeviceGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVersionDeviceGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVersionDeviceGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVersionDeviceGroupsResponse response) {
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
        public Builder body(ListVersionDeviceGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVersionDeviceGroupsResponse build() {
            return new ListVersionDeviceGroupsResponse(this);
        } 

    } 

}
