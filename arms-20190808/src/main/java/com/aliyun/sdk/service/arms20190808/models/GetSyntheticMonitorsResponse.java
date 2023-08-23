// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSyntheticMonitorsResponse} extends {@link TeaModel}
 *
 * <p>GetSyntheticMonitorsResponse</p>
 */
public class GetSyntheticMonitorsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSyntheticMonitorsResponseBody body;

    private GetSyntheticMonitorsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSyntheticMonitorsResponse create() {
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
    public GetSyntheticMonitorsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSyntheticMonitorsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSyntheticMonitorsResponseBody body);

        @Override
        GetSyntheticMonitorsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSyntheticMonitorsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSyntheticMonitorsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSyntheticMonitorsResponse response) {
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
        public Builder body(GetSyntheticMonitorsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSyntheticMonitorsResponse build() {
            return new GetSyntheticMonitorsResponse(this);
        } 

    } 

}
