// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link GetLindormV2InstanceResponse} extends {@link TeaModel}
 *
 * <p>GetLindormV2InstanceResponse</p>
 */
public class GetLindormV2InstanceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetLindormV2InstanceResponseBody body;

    private GetLindormV2InstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetLindormV2InstanceResponse create() {
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
    public GetLindormV2InstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLindormV2InstanceResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetLindormV2InstanceResponseBody body);

        @Override
        GetLindormV2InstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLindormV2InstanceResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetLindormV2InstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLindormV2InstanceResponse response) {
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
        public Builder body(GetLindormV2InstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLindormV2InstanceResponse build() {
            return new GetLindormV2InstanceResponse(this);
        } 

    } 

}
