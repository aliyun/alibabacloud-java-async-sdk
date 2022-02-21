// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CountDevicesResponse} extends {@link TeaModel}
 *
 * <p>CountDevicesResponse</p>
 */
public class CountDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CountDevicesResponseBody body;

    private CountDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CountDevicesResponse create() {
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
    public CountDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CountDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CountDevicesResponseBody body);

        @Override
        CountDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CountDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CountDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CountDevicesResponse response) {
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
        public Builder body(CountDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CountDevicesResponse build() {
            return new CountDevicesResponse(this);
        } 

    } 

}
