// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterImpPlayBackTimeByLiveIdResponse} extends {@link TeaModel}
 *
 * <p>DescribeMeterImpPlayBackTimeByLiveIdResponse</p>
 */
public class DescribeMeterImpPlayBackTimeByLiveIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMeterImpPlayBackTimeByLiveIdResponseBody body;

    private DescribeMeterImpPlayBackTimeByLiveIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMeterImpPlayBackTimeByLiveIdResponse create() {
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
    public DescribeMeterImpPlayBackTimeByLiveIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMeterImpPlayBackTimeByLiveIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMeterImpPlayBackTimeByLiveIdResponseBody body);

        @Override
        DescribeMeterImpPlayBackTimeByLiveIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMeterImpPlayBackTimeByLiveIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMeterImpPlayBackTimeByLiveIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMeterImpPlayBackTimeByLiveIdResponse response) {
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
        public Builder body(DescribeMeterImpPlayBackTimeByLiveIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMeterImpPlayBackTimeByLiveIdResponse build() {
            return new DescribeMeterImpPlayBackTimeByLiveIdResponse(this);
        } 

    } 

}
