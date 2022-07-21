// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSpeechDeviceDetailResponse} extends {@link TeaModel}
 *
 * <p>GetSpeechDeviceDetailResponse</p>
 */
public class GetSpeechDeviceDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSpeechDeviceDetailResponseBody body;

    private GetSpeechDeviceDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSpeechDeviceDetailResponse create() {
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
    public GetSpeechDeviceDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSpeechDeviceDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSpeechDeviceDetailResponseBody body);

        @Override
        GetSpeechDeviceDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSpeechDeviceDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSpeechDeviceDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSpeechDeviceDetailResponse response) {
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
        public Builder body(GetSpeechDeviceDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSpeechDeviceDetailResponse build() {
            return new GetSpeechDeviceDetailResponse(this);
        } 

    } 

}
