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
 * {@link CreateOrUpdateSwimmingLaneResponse} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateSwimmingLaneResponse</p>
 */
public class CreateOrUpdateSwimmingLaneResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateOrUpdateSwimmingLaneResponseBody body;

    private CreateOrUpdateSwimmingLaneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateOrUpdateSwimmingLaneResponse create() {
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
    public CreateOrUpdateSwimmingLaneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOrUpdateSwimmingLaneResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateOrUpdateSwimmingLaneResponseBody body);

        @Override
        CreateOrUpdateSwimmingLaneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOrUpdateSwimmingLaneResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreateOrUpdateSwimmingLaneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOrUpdateSwimmingLaneResponse response) {
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
        public Builder body(CreateOrUpdateSwimmingLaneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOrUpdateSwimmingLaneResponse build() {
            return new CreateOrUpdateSwimmingLaneResponse(this);
        } 

    } 

}
