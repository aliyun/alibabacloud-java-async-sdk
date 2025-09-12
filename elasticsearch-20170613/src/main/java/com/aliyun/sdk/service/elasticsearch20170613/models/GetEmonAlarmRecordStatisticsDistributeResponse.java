// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetEmonAlarmRecordStatisticsDistributeResponse} extends {@link TeaModel}
 *
 * <p>GetEmonAlarmRecordStatisticsDistributeResponse</p>
 */
public class GetEmonAlarmRecordStatisticsDistributeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetEmonAlarmRecordStatisticsDistributeResponseBody body;

    private GetEmonAlarmRecordStatisticsDistributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetEmonAlarmRecordStatisticsDistributeResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public GetEmonAlarmRecordStatisticsDistributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEmonAlarmRecordStatisticsDistributeResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetEmonAlarmRecordStatisticsDistributeResponseBody body);

        @Override
        GetEmonAlarmRecordStatisticsDistributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEmonAlarmRecordStatisticsDistributeResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetEmonAlarmRecordStatisticsDistributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEmonAlarmRecordStatisticsDistributeResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(GetEmonAlarmRecordStatisticsDistributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEmonAlarmRecordStatisticsDistributeResponse build() {
            return new GetEmonAlarmRecordStatisticsDistributeResponse(this);
        } 

    } 

}
