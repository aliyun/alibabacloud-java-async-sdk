// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSyntheticTaskMonitorsResponse} extends {@link TeaModel}
 *
 * <p>GetSyntheticTaskMonitorsResponse</p>
 */
public class GetSyntheticTaskMonitorsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSyntheticTaskMonitorsResponseBody body;

    private GetSyntheticTaskMonitorsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSyntheticTaskMonitorsResponse create() {
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
    public GetSyntheticTaskMonitorsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSyntheticTaskMonitorsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSyntheticTaskMonitorsResponseBody body);

        @Override
        GetSyntheticTaskMonitorsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSyntheticTaskMonitorsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSyntheticTaskMonitorsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSyntheticTaskMonitorsResponse response) {
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
        public Builder body(GetSyntheticTaskMonitorsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSyntheticTaskMonitorsResponse build() {
            return new GetSyntheticTaskMonitorsResponse(this);
        } 

    } 

}
