// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link GetAnnotationMissionTagInfoListResponse} extends {@link TeaModel}
 *
 * <p>GetAnnotationMissionTagInfoListResponse</p>
 */
public class GetAnnotationMissionTagInfoListResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetAnnotationMissionTagInfoListResponseBody body;

    private GetAnnotationMissionTagInfoListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetAnnotationMissionTagInfoListResponse create() {
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
    public GetAnnotationMissionTagInfoListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAnnotationMissionTagInfoListResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetAnnotationMissionTagInfoListResponseBody body);

        @Override
        GetAnnotationMissionTagInfoListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAnnotationMissionTagInfoListResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetAnnotationMissionTagInfoListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAnnotationMissionTagInfoListResponse response) {
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
        public Builder body(GetAnnotationMissionTagInfoListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAnnotationMissionTagInfoListResponse build() {
            return new GetAnnotationMissionTagInfoListResponse(this);
        } 

    } 

}
