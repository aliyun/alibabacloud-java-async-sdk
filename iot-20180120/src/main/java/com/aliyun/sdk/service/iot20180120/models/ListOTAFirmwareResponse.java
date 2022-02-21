// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOTAFirmwareResponse} extends {@link TeaModel}
 *
 * <p>ListOTAFirmwareResponse</p>
 */
public class ListOTAFirmwareResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOTAFirmwareResponseBody body;

    private ListOTAFirmwareResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOTAFirmwareResponse create() {
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
    public ListOTAFirmwareResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOTAFirmwareResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOTAFirmwareResponseBody body);

        @Override
        ListOTAFirmwareResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOTAFirmwareResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOTAFirmwareResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOTAFirmwareResponse response) {
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
        public Builder body(ListOTAFirmwareResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOTAFirmwareResponse build() {
            return new ListOTAFirmwareResponse(this);
        } 

    } 

}
