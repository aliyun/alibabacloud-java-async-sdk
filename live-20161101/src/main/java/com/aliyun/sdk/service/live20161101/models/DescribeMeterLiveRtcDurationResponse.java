// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterLiveRtcDurationResponse} extends {@link TeaModel}
 *
 * <p>DescribeMeterLiveRtcDurationResponse</p>
 */
public class DescribeMeterLiveRtcDurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMeterLiveRtcDurationResponseBody body;

    private DescribeMeterLiveRtcDurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMeterLiveRtcDurationResponse create() {
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
    public DescribeMeterLiveRtcDurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMeterLiveRtcDurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMeterLiveRtcDurationResponseBody body);

        @Override
        DescribeMeterLiveRtcDurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMeterLiveRtcDurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMeterLiveRtcDurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMeterLiveRtcDurationResponse response) {
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
        public Builder body(DescribeMeterLiveRtcDurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMeterLiveRtcDurationResponse build() {
            return new DescribeMeterLiveRtcDurationResponse(this);
        } 

    } 

}
