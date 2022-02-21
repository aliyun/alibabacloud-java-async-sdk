// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSimilarIncidentStatisticsResponse} extends {@link TeaModel}
 *
 * <p>GetSimilarIncidentStatisticsResponse</p>
 */
public class GetSimilarIncidentStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSimilarIncidentStatisticsResponseBody body;

    private GetSimilarIncidentStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSimilarIncidentStatisticsResponse create() {
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
    public GetSimilarIncidentStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSimilarIncidentStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSimilarIncidentStatisticsResponseBody body);

        @Override
        GetSimilarIncidentStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSimilarIncidentStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSimilarIncidentStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSimilarIncidentStatisticsResponse response) {
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
        public Builder body(GetSimilarIncidentStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSimilarIncidentStatisticsResponse build() {
            return new GetSimilarIncidentStatisticsResponse(this);
        } 

    } 

}
