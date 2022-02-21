// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVirtualMFADevicesResponse} extends {@link TeaModel}
 *
 * <p>ListVirtualMFADevicesResponse</p>
 */
public class ListVirtualMFADevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVirtualMFADevicesResponseBody body;

    private ListVirtualMFADevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVirtualMFADevicesResponse create() {
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
    public ListVirtualMFADevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVirtualMFADevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVirtualMFADevicesResponseBody body);

        @Override
        ListVirtualMFADevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVirtualMFADevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVirtualMFADevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVirtualMFADevicesResponse response) {
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
        public Builder body(ListVirtualMFADevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVirtualMFADevicesResponse build() {
            return new ListVirtualMFADevicesResponse(this);
        } 

    } 

}
