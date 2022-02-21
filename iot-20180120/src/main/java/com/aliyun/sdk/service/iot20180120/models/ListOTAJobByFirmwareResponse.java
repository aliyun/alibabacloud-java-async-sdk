// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOTAJobByFirmwareResponse} extends {@link TeaModel}
 *
 * <p>ListOTAJobByFirmwareResponse</p>
 */
public class ListOTAJobByFirmwareResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOTAJobByFirmwareResponseBody body;

    private ListOTAJobByFirmwareResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOTAJobByFirmwareResponse create() {
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
    public ListOTAJobByFirmwareResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOTAJobByFirmwareResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOTAJobByFirmwareResponseBody body);

        @Override
        ListOTAJobByFirmwareResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOTAJobByFirmwareResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOTAJobByFirmwareResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOTAJobByFirmwareResponse response) {
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
        public Builder body(ListOTAJobByFirmwareResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOTAJobByFirmwareResponse build() {
            return new ListOTAJobByFirmwareResponse(this);
        } 

    } 

}
