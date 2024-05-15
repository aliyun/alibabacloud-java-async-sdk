// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryScheduleConferenceInfoResponse} extends {@link TeaModel}
 *
 * <p>QueryScheduleConferenceInfoResponse</p>
 */
public class QueryScheduleConferenceInfoResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryScheduleConferenceInfoResponseBody body;

    private QueryScheduleConferenceInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryScheduleConferenceInfoResponse create() {
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
    public QueryScheduleConferenceInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryScheduleConferenceInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryScheduleConferenceInfoResponseBody body);

        @Override
        QueryScheduleConferenceInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryScheduleConferenceInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryScheduleConferenceInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryScheduleConferenceInfoResponse response) {
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
        public Builder body(QueryScheduleConferenceInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryScheduleConferenceInfoResponse build() {
            return new QueryScheduleConferenceInfoResponse(this);
        } 

    } 

}
