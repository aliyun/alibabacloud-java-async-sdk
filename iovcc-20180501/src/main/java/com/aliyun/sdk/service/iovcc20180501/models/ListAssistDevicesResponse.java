// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAssistDevicesResponse} extends {@link TeaModel}
 *
 * <p>ListAssistDevicesResponse</p>
 */
public class ListAssistDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAssistDevicesResponseBody body;

    private ListAssistDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAssistDevicesResponse create() {
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
    public ListAssistDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAssistDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAssistDevicesResponseBody body);

        @Override
        ListAssistDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAssistDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAssistDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAssistDevicesResponse response) {
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
        public Builder body(ListAssistDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAssistDevicesResponse build() {
            return new ListAssistDevicesResponse(this);
        } 

    } 

}
