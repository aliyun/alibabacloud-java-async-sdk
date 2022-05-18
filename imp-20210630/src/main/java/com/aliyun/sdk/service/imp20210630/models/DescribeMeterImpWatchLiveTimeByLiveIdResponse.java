// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterImpWatchLiveTimeByLiveIdResponse} extends {@link TeaModel}
 *
 * <p>DescribeMeterImpWatchLiveTimeByLiveIdResponse</p>
 */
public class DescribeMeterImpWatchLiveTimeByLiveIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMeterImpWatchLiveTimeByLiveIdResponseBody body;

    private DescribeMeterImpWatchLiveTimeByLiveIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMeterImpWatchLiveTimeByLiveIdResponse create() {
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
    public DescribeMeterImpWatchLiveTimeByLiveIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMeterImpWatchLiveTimeByLiveIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMeterImpWatchLiveTimeByLiveIdResponseBody body);

        @Override
        DescribeMeterImpWatchLiveTimeByLiveIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMeterImpWatchLiveTimeByLiveIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMeterImpWatchLiveTimeByLiveIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMeterImpWatchLiveTimeByLiveIdResponse response) {
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
        public Builder body(DescribeMeterImpWatchLiveTimeByLiveIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMeterImpWatchLiveTimeByLiveIdResponse build() {
            return new DescribeMeterImpWatchLiveTimeByLiveIdResponse(this);
        } 

    } 

}
