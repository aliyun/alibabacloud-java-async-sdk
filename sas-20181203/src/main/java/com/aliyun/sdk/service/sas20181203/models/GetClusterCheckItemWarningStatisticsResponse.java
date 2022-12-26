// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterCheckItemWarningStatisticsResponse} extends {@link TeaModel}
 *
 * <p>GetClusterCheckItemWarningStatisticsResponse</p>
 */
public class GetClusterCheckItemWarningStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetClusterCheckItemWarningStatisticsResponseBody body;

    private GetClusterCheckItemWarningStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetClusterCheckItemWarningStatisticsResponse create() {
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
    public GetClusterCheckItemWarningStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetClusterCheckItemWarningStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetClusterCheckItemWarningStatisticsResponseBody body);

        @Override
        GetClusterCheckItemWarningStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetClusterCheckItemWarningStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetClusterCheckItemWarningStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetClusterCheckItemWarningStatisticsResponse response) {
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
        public Builder body(GetClusterCheckItemWarningStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetClusterCheckItemWarningStatisticsResponse build() {
            return new GetClusterCheckItemWarningStatisticsResponse(this);
        } 

    } 

}
