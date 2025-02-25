// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSimilarIncidentStatisticsResponse} extends {@link TeaModel}
 *
 * <p>GetSimilarIncidentStatisticsResponse</p>
 */
public class GetSimilarIncidentStatisticsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetSimilarIncidentStatisticsResponseBody body;

    private GetSimilarIncidentStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public GetSimilarIncidentStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSimilarIncidentStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetSimilarIncidentStatisticsResponseBody body);

        @Override
        GetSimilarIncidentStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSimilarIncidentStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetSimilarIncidentStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSimilarIncidentStatisticsResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
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
