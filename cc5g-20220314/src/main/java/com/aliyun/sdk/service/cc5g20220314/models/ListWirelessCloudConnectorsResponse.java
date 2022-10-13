// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWirelessCloudConnectorsResponse} extends {@link TeaModel}
 *
 * <p>ListWirelessCloudConnectorsResponse</p>
 */
public class ListWirelessCloudConnectorsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListWirelessCloudConnectorsResponseBody body;

    private ListWirelessCloudConnectorsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListWirelessCloudConnectorsResponse create() {
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
    public ListWirelessCloudConnectorsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListWirelessCloudConnectorsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListWirelessCloudConnectorsResponseBody body);

        @Override
        ListWirelessCloudConnectorsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListWirelessCloudConnectorsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListWirelessCloudConnectorsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListWirelessCloudConnectorsResponse response) {
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
        public Builder body(ListWirelessCloudConnectorsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListWirelessCloudConnectorsResponse build() {
            return new ListWirelessCloudConnectorsResponse(this);
        } 

    } 

}
