// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetGpuClusterListAlarmRecordResponse} extends {@link TeaModel}
 *
 * <p>GetGpuClusterListAlarmRecordResponse</p>
 */
public class GetGpuClusterListAlarmRecordResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetGpuClusterListAlarmRecordResponseBody body;

    private GetGpuClusterListAlarmRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetGpuClusterListAlarmRecordResponse create() {
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
    public GetGpuClusterListAlarmRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetGpuClusterListAlarmRecordResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetGpuClusterListAlarmRecordResponseBody body);

        @Override
        GetGpuClusterListAlarmRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetGpuClusterListAlarmRecordResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetGpuClusterListAlarmRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetGpuClusterListAlarmRecordResponse response) {
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
        public Builder body(GetGpuClusterListAlarmRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetGpuClusterListAlarmRecordResponse build() {
            return new GetGpuClusterListAlarmRecordResponse(this);
        } 

    } 

}
