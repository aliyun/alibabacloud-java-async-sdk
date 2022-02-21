// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListDeviceGroupsResponse</p>
 */
public class ListDeviceGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDeviceGroupsResponseBody body;

    private ListDeviceGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDeviceGroupsResponse create() {
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
    public ListDeviceGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDeviceGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDeviceGroupsResponseBody body);

        @Override
        ListDeviceGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDeviceGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDeviceGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDeviceGroupsResponse response) {
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
        public Builder body(ListDeviceGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDeviceGroupsResponse build() {
            return new ListDeviceGroupsResponse(this);
        } 

    } 

}
