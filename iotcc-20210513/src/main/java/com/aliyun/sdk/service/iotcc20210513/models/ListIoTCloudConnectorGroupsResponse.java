// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIoTCloudConnectorGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListIoTCloudConnectorGroupsResponse</p>
 */
public class ListIoTCloudConnectorGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIoTCloudConnectorGroupsResponseBody body;

    private ListIoTCloudConnectorGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIoTCloudConnectorGroupsResponse create() {
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
    public ListIoTCloudConnectorGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIoTCloudConnectorGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIoTCloudConnectorGroupsResponseBody body);

        @Override
        ListIoTCloudConnectorGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIoTCloudConnectorGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIoTCloudConnectorGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIoTCloudConnectorGroupsResponse response) {
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
        public Builder body(ListIoTCloudConnectorGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIoTCloudConnectorGroupsResponse build() {
            return new ListIoTCloudConnectorGroupsResponse(this);
        } 

    } 

}
