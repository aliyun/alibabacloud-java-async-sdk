// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetShareTaskByDeviceOpenResponse} extends {@link TeaModel}
 *
 * <p>GetShareTaskByDeviceOpenResponse</p>
 */
public class GetShareTaskByDeviceOpenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetShareTaskByDeviceOpenResponseBody body;

    private GetShareTaskByDeviceOpenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetShareTaskByDeviceOpenResponse create() {
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
    public GetShareTaskByDeviceOpenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetShareTaskByDeviceOpenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetShareTaskByDeviceOpenResponseBody body);

        @Override
        GetShareTaskByDeviceOpenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetShareTaskByDeviceOpenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetShareTaskByDeviceOpenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetShareTaskByDeviceOpenResponse response) {
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
        public Builder body(GetShareTaskByDeviceOpenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetShareTaskByDeviceOpenResponse build() {
            return new GetShareTaskByDeviceOpenResponse(this);
        } 

    } 

}
