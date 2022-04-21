// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIoTCloudConnectorAvailableZonesResponse} extends {@link TeaModel}
 *
 * <p>ListIoTCloudConnectorAvailableZonesResponse</p>
 */
public class ListIoTCloudConnectorAvailableZonesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIoTCloudConnectorAvailableZonesResponseBody body;

    private ListIoTCloudConnectorAvailableZonesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIoTCloudConnectorAvailableZonesResponse create() {
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
    public ListIoTCloudConnectorAvailableZonesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIoTCloudConnectorAvailableZonesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIoTCloudConnectorAvailableZonesResponseBody body);

        @Override
        ListIoTCloudConnectorAvailableZonesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIoTCloudConnectorAvailableZonesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIoTCloudConnectorAvailableZonesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIoTCloudConnectorAvailableZonesResponse response) {
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
        public Builder body(ListIoTCloudConnectorAvailableZonesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIoTCloudConnectorAvailableZonesResponse build() {
            return new ListIoTCloudConnectorAvailableZonesResponse(this);
        } 

    } 

}
