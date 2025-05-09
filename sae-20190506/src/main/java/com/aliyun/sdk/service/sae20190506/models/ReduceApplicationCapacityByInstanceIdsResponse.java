// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ReduceApplicationCapacityByInstanceIdsResponse} extends {@link TeaModel}
 *
 * <p>ReduceApplicationCapacityByInstanceIdsResponse</p>
 */
public class ReduceApplicationCapacityByInstanceIdsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ReduceApplicationCapacityByInstanceIdsResponseBody body;

    private ReduceApplicationCapacityByInstanceIdsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ReduceApplicationCapacityByInstanceIdsResponse create() {
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
    public ReduceApplicationCapacityByInstanceIdsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReduceApplicationCapacityByInstanceIdsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ReduceApplicationCapacityByInstanceIdsResponseBody body);

        @Override
        ReduceApplicationCapacityByInstanceIdsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReduceApplicationCapacityByInstanceIdsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ReduceApplicationCapacityByInstanceIdsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReduceApplicationCapacityByInstanceIdsResponse response) {
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
        public Builder body(ReduceApplicationCapacityByInstanceIdsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReduceApplicationCapacityByInstanceIdsResponse build() {
            return new ReduceApplicationCapacityByInstanceIdsResponse(this);
        } 

    } 

}
