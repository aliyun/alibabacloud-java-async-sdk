// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLiveStreamWatermarkResponse} extends {@link TeaModel}
 *
 * <p>AddLiveStreamWatermarkResponse</p>
 */
public class AddLiveStreamWatermarkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddLiveStreamWatermarkResponseBody body;

    private AddLiveStreamWatermarkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddLiveStreamWatermarkResponse create() {
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
    public AddLiveStreamWatermarkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddLiveStreamWatermarkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddLiveStreamWatermarkResponseBody body);

        @Override
        AddLiveStreamWatermarkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddLiveStreamWatermarkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddLiveStreamWatermarkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddLiveStreamWatermarkResponse response) {
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
        public Builder body(AddLiveStreamWatermarkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddLiveStreamWatermarkResponse build() {
            return new AddLiveStreamWatermarkResponse(this);
        } 

    } 

}
