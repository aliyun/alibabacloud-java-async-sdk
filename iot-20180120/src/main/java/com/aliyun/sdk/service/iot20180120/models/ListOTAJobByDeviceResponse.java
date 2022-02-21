// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOTAJobByDeviceResponse} extends {@link TeaModel}
 *
 * <p>ListOTAJobByDeviceResponse</p>
 */
public class ListOTAJobByDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOTAJobByDeviceResponseBody body;

    private ListOTAJobByDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOTAJobByDeviceResponse create() {
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
    public ListOTAJobByDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOTAJobByDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOTAJobByDeviceResponseBody body);

        @Override
        ListOTAJobByDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOTAJobByDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOTAJobByDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOTAJobByDeviceResponse response) {
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
        public Builder body(ListOTAJobByDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOTAJobByDeviceResponse build() {
            return new ListOTAJobByDeviceResponse(this);
        } 

    } 

}
