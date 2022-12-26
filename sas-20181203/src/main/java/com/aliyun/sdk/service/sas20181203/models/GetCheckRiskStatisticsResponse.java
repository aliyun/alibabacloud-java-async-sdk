// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCheckRiskStatisticsResponse} extends {@link TeaModel}
 *
 * <p>GetCheckRiskStatisticsResponse</p>
 */
public class GetCheckRiskStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCheckRiskStatisticsResponseBody body;

    private GetCheckRiskStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCheckRiskStatisticsResponse create() {
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
    public GetCheckRiskStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCheckRiskStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCheckRiskStatisticsResponseBody body);

        @Override
        GetCheckRiskStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCheckRiskStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCheckRiskStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCheckRiskStatisticsResponse response) {
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
        public Builder body(GetCheckRiskStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCheckRiskStatisticsResponse build() {
            return new GetCheckRiskStatisticsResponse(this);
        } 

    } 

}
