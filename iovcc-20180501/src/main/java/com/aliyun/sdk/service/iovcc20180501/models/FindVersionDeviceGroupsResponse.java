// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindVersionDeviceGroupsResponse} extends {@link TeaModel}
 *
 * <p>FindVersionDeviceGroupsResponse</p>
 */
public class FindVersionDeviceGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FindVersionDeviceGroupsResponseBody body;

    private FindVersionDeviceGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FindVersionDeviceGroupsResponse create() {
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
    public FindVersionDeviceGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FindVersionDeviceGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FindVersionDeviceGroupsResponseBody body);

        @Override
        FindVersionDeviceGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FindVersionDeviceGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FindVersionDeviceGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FindVersionDeviceGroupsResponse response) {
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
        public Builder body(FindVersionDeviceGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FindVersionDeviceGroupsResponse build() {
            return new FindVersionDeviceGroupsResponse(this);
        } 

    } 

}
