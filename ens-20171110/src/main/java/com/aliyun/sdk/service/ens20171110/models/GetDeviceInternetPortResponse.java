// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceInternetPortResponse} extends {@link TeaModel}
 *
 * <p>GetDeviceInternetPortResponse</p>
 */
public class GetDeviceInternetPortResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDeviceInternetPortResponseBody body;

    private GetDeviceInternetPortResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDeviceInternetPortResponse create() {
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
    public GetDeviceInternetPortResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDeviceInternetPortResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDeviceInternetPortResponseBody body);

        @Override
        GetDeviceInternetPortResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDeviceInternetPortResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDeviceInternetPortResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDeviceInternetPortResponse response) {
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
        public Builder body(GetDeviceInternetPortResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDeviceInternetPortResponse build() {
            return new GetDeviceInternetPortResponse(this);
        } 

    } 

}
