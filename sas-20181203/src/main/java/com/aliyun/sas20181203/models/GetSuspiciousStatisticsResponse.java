// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSuspiciousStatisticsResponse} extends {@link TeaModel}
 *
 * <p>GetSuspiciousStatisticsResponse</p>
 */
public class GetSuspiciousStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSuspiciousStatisticsResponseBody body;

    private GetSuspiciousStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSuspiciousStatisticsResponse create() {
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
    public GetSuspiciousStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSuspiciousStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSuspiciousStatisticsResponseBody body);

        @Override
        GetSuspiciousStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSuspiciousStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSuspiciousStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSuspiciousStatisticsResponse response) {
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
        public Builder body(GetSuspiciousStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSuspiciousStatisticsResponse build() {
            return new GetSuspiciousStatisticsResponse(this);
        } 

    } 

}
