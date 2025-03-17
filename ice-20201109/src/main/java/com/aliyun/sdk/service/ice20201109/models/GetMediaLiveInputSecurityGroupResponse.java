// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetMediaLiveInputSecurityGroupResponse} extends {@link TeaModel}
 *
 * <p>GetMediaLiveInputSecurityGroupResponse</p>
 */
public class GetMediaLiveInputSecurityGroupResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetMediaLiveInputSecurityGroupResponseBody body;

    private GetMediaLiveInputSecurityGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetMediaLiveInputSecurityGroupResponse create() {
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
    public GetMediaLiveInputSecurityGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMediaLiveInputSecurityGroupResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetMediaLiveInputSecurityGroupResponseBody body);

        @Override
        GetMediaLiveInputSecurityGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMediaLiveInputSecurityGroupResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetMediaLiveInputSecurityGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMediaLiveInputSecurityGroupResponse response) {
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
        public Builder body(GetMediaLiveInputSecurityGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMediaLiveInputSecurityGroupResponse build() {
            return new GetMediaLiveInputSecurityGroupResponse(this);
        } 

    } 

}
