// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScanSubDevicesResponse} extends {@link TeaModel}
 *
 * <p>GetScanSubDevicesResponse</p>
 */
public class GetScanSubDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetScanSubDevicesResponseBody body;

    private GetScanSubDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetScanSubDevicesResponse create() {
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
    public GetScanSubDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetScanSubDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetScanSubDevicesResponseBody body);

        @Override
        GetScanSubDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetScanSubDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetScanSubDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetScanSubDevicesResponse response) {
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
        public Builder body(GetScanSubDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetScanSubDevicesResponse build() {
            return new GetScanSubDevicesResponse(this);
        } 

    } 

}
