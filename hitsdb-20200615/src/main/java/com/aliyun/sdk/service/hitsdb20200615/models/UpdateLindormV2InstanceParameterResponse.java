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
 * {@link UpdateLindormV2InstanceParameterResponse} extends {@link TeaModel}
 *
 * <p>UpdateLindormV2InstanceParameterResponse</p>
 */
public class UpdateLindormV2InstanceParameterResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateLindormV2InstanceParameterResponseBody body;

    private UpdateLindormV2InstanceParameterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateLindormV2InstanceParameterResponse create() {
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
    public UpdateLindormV2InstanceParameterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateLindormV2InstanceParameterResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateLindormV2InstanceParameterResponseBody body);

        @Override
        UpdateLindormV2InstanceParameterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateLindormV2InstanceParameterResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private UpdateLindormV2InstanceParameterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateLindormV2InstanceParameterResponse response) {
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
        public Builder body(UpdateLindormV2InstanceParameterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateLindormV2InstanceParameterResponse build() {
            return new UpdateLindormV2InstanceParameterResponse(this);
        } 

    } 

}
