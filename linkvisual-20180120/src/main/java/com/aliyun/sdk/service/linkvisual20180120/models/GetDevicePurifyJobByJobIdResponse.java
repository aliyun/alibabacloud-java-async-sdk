// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDevicePurifyJobByJobIdResponse} extends {@link TeaModel}
 *
 * <p>GetDevicePurifyJobByJobIdResponse</p>
 */
public class GetDevicePurifyJobByJobIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDevicePurifyJobByJobIdResponseBody body;

    private GetDevicePurifyJobByJobIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDevicePurifyJobByJobIdResponse create() {
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
    public GetDevicePurifyJobByJobIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDevicePurifyJobByJobIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDevicePurifyJobByJobIdResponseBody body);

        @Override
        GetDevicePurifyJobByJobIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDevicePurifyJobByJobIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDevicePurifyJobByJobIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDevicePurifyJobByJobIdResponse response) {
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
        public Builder body(GetDevicePurifyJobByJobIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDevicePurifyJobByJobIdResponse build() {
            return new GetDevicePurifyJobByJobIdResponse(this);
        } 

    } 

}
