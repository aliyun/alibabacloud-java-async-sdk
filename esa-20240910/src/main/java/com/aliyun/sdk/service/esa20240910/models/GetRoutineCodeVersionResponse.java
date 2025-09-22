// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetRoutineCodeVersionResponse} extends {@link TeaModel}
 *
 * <p>GetRoutineCodeVersionResponse</p>
 */
public class GetRoutineCodeVersionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetRoutineCodeVersionResponseBody body;

    private GetRoutineCodeVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetRoutineCodeVersionResponse create() {
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
    public GetRoutineCodeVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRoutineCodeVersionResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetRoutineCodeVersionResponseBody body);

        @Override
        GetRoutineCodeVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRoutineCodeVersionResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetRoutineCodeVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRoutineCodeVersionResponse response) {
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
        public Builder body(GetRoutineCodeVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRoutineCodeVersionResponse build() {
            return new GetRoutineCodeVersionResponse(this);
        } 

    } 

}
