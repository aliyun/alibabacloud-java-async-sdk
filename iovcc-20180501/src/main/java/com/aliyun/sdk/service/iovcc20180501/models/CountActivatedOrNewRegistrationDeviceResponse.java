// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CountActivatedOrNewRegistrationDeviceResponse} extends {@link TeaModel}
 *
 * <p>CountActivatedOrNewRegistrationDeviceResponse</p>
 */
public class CountActivatedOrNewRegistrationDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CountActivatedOrNewRegistrationDeviceResponseBody body;

    private CountActivatedOrNewRegistrationDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CountActivatedOrNewRegistrationDeviceResponse create() {
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
    public CountActivatedOrNewRegistrationDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CountActivatedOrNewRegistrationDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CountActivatedOrNewRegistrationDeviceResponseBody body);

        @Override
        CountActivatedOrNewRegistrationDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CountActivatedOrNewRegistrationDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CountActivatedOrNewRegistrationDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CountActivatedOrNewRegistrationDeviceResponse response) {
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
        public Builder body(CountActivatedOrNewRegistrationDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CountActivatedOrNewRegistrationDeviceResponse build() {
            return new CountActivatedOrNewRegistrationDeviceResponse(this);
        } 

    } 

}
