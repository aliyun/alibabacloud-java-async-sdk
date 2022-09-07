// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIoTCloudConnectorEIPsResponse} extends {@link TeaModel}
 *
 * <p>ListIoTCloudConnectorEIPsResponse</p>
 */
public class ListIoTCloudConnectorEIPsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIoTCloudConnectorEIPsResponseBody body;

    private ListIoTCloudConnectorEIPsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIoTCloudConnectorEIPsResponse create() {
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
    public ListIoTCloudConnectorEIPsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIoTCloudConnectorEIPsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIoTCloudConnectorEIPsResponseBody body);

        @Override
        ListIoTCloudConnectorEIPsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIoTCloudConnectorEIPsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIoTCloudConnectorEIPsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIoTCloudConnectorEIPsResponse response) {
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
        public Builder body(ListIoTCloudConnectorEIPsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIoTCloudConnectorEIPsResponse build() {
            return new ListIoTCloudConnectorEIPsResponse(this);
        } 

    } 

}
