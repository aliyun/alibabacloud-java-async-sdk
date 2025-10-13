// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.metaspace20221014.models;

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
 * {@link ApplyCoordinationForCoordinatorResponse} extends {@link TeaModel}
 *
 * <p>ApplyCoordinationForCoordinatorResponse</p>
 */
public class ApplyCoordinationForCoordinatorResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ApplyCoordinationForCoordinatorResponseBody body;

    private ApplyCoordinationForCoordinatorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ApplyCoordinationForCoordinatorResponse create() {
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
    public ApplyCoordinationForCoordinatorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApplyCoordinationForCoordinatorResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ApplyCoordinationForCoordinatorResponseBody body);

        @Override
        ApplyCoordinationForCoordinatorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApplyCoordinationForCoordinatorResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ApplyCoordinationForCoordinatorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApplyCoordinationForCoordinatorResponse response) {
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
        public Builder body(ApplyCoordinationForCoordinatorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApplyCoordinationForCoordinatorResponse build() {
            return new ApplyCoordinationForCoordinatorResponse(this);
        } 

    } 

}
