// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIoTCloudConnectorsResponse} extends {@link TeaModel}
 *
 * <p>ListIoTCloudConnectorsResponse</p>
 */
public class ListIoTCloudConnectorsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIoTCloudConnectorsResponseBody body;

    private ListIoTCloudConnectorsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIoTCloudConnectorsResponse create() {
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
    public ListIoTCloudConnectorsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIoTCloudConnectorsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIoTCloudConnectorsResponseBody body);

        @Override
        ListIoTCloudConnectorsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIoTCloudConnectorsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIoTCloudConnectorsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIoTCloudConnectorsResponse response) {
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
        public Builder body(ListIoTCloudConnectorsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIoTCloudConnectorsResponse build() {
            return new ListIoTCloudConnectorsResponse(this);
        } 

    } 

}
