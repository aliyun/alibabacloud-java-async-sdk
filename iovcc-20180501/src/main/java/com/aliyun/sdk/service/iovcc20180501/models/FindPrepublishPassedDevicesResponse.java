// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindPrepublishPassedDevicesResponse} extends {@link TeaModel}
 *
 * <p>FindPrepublishPassedDevicesResponse</p>
 */
public class FindPrepublishPassedDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FindPrepublishPassedDevicesResponseBody body;

    private FindPrepublishPassedDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FindPrepublishPassedDevicesResponse create() {
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
    public FindPrepublishPassedDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FindPrepublishPassedDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FindPrepublishPassedDevicesResponseBody body);

        @Override
        FindPrepublishPassedDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FindPrepublishPassedDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FindPrepublishPassedDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FindPrepublishPassedDevicesResponse response) {
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
        public Builder body(FindPrepublishPassedDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FindPrepublishPassedDevicesResponse build() {
            return new FindPrepublishPassedDevicesResponse(this);
        } 

    } 

}
