// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetJobAttemptLogResponse} extends {@link TeaModel}
 *
 * <p>GetJobAttemptLogResponse</p>
 */
public class GetJobAttemptLogResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetJobAttemptLogResponseBody body;

    private GetJobAttemptLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetJobAttemptLogResponse create() {
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
    public GetJobAttemptLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetJobAttemptLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetJobAttemptLogResponseBody body);

        @Override
        GetJobAttemptLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetJobAttemptLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetJobAttemptLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetJobAttemptLogResponse response) {
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
        public Builder body(GetJobAttemptLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetJobAttemptLogResponse build() {
            return new GetJobAttemptLogResponse(this);
        } 

    } 

}
