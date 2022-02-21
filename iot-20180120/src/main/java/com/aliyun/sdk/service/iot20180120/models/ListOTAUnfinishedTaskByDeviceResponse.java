// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOTAUnfinishedTaskByDeviceResponse} extends {@link TeaModel}
 *
 * <p>ListOTAUnfinishedTaskByDeviceResponse</p>
 */
public class ListOTAUnfinishedTaskByDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOTAUnfinishedTaskByDeviceResponseBody body;

    private ListOTAUnfinishedTaskByDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOTAUnfinishedTaskByDeviceResponse create() {
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
    public ListOTAUnfinishedTaskByDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOTAUnfinishedTaskByDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOTAUnfinishedTaskByDeviceResponseBody body);

        @Override
        ListOTAUnfinishedTaskByDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOTAUnfinishedTaskByDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOTAUnfinishedTaskByDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOTAUnfinishedTaskByDeviceResponse response) {
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
        public Builder body(ListOTAUnfinishedTaskByDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOTAUnfinishedTaskByDeviceResponse build() {
            return new ListOTAUnfinishedTaskByDeviceResponse(this);
        } 

    } 

}
