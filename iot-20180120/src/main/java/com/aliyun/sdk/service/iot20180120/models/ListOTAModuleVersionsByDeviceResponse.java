// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOTAModuleVersionsByDeviceResponse} extends {@link TeaModel}
 *
 * <p>ListOTAModuleVersionsByDeviceResponse</p>
 */
public class ListOTAModuleVersionsByDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOTAModuleVersionsByDeviceResponseBody body;

    private ListOTAModuleVersionsByDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOTAModuleVersionsByDeviceResponse create() {
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
    public ListOTAModuleVersionsByDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOTAModuleVersionsByDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOTAModuleVersionsByDeviceResponseBody body);

        @Override
        ListOTAModuleVersionsByDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOTAModuleVersionsByDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOTAModuleVersionsByDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOTAModuleVersionsByDeviceResponse response) {
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
        public Builder body(ListOTAModuleVersionsByDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOTAModuleVersionsByDeviceResponse build() {
            return new ListOTAModuleVersionsByDeviceResponse(this);
        } 

    } 

}
