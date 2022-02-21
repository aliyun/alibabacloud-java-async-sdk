// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceStatsResponse} extends {@link TeaModel}
 *
 * <p>GetDeviceStatsResponse</p>
 */
public class GetDeviceStatsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDeviceStatsResponseBody body;

    private GetDeviceStatsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDeviceStatsResponse create() {
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
    public GetDeviceStatsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDeviceStatsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDeviceStatsResponseBody body);

        @Override
        GetDeviceStatsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDeviceStatsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDeviceStatsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDeviceStatsResponse response) {
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
        public Builder body(GetDeviceStatsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDeviceStatsResponse build() {
            return new GetDeviceStatsResponse(this);
        } 

    } 

}
