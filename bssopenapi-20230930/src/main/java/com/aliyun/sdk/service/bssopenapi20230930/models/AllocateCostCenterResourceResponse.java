// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link AllocateCostCenterResourceResponse} extends {@link TeaModel}
 *
 * <p>AllocateCostCenterResourceResponse</p>
 */
public class AllocateCostCenterResourceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AllocateCostCenterResourceResponseBody body;

    private AllocateCostCenterResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AllocateCostCenterResourceResponse create() {
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
    public AllocateCostCenterResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AllocateCostCenterResourceResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(AllocateCostCenterResourceResponseBody body);

        @Override
        AllocateCostCenterResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AllocateCostCenterResourceResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private AllocateCostCenterResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AllocateCostCenterResourceResponse response) {
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
        public Builder body(AllocateCostCenterResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AllocateCostCenterResourceResponse build() {
            return new AllocateCostCenterResourceResponse(this);
        } 

    } 

}
