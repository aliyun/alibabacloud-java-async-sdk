// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emas_appmonitor20190611.models;

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
 * {@link GetTlogTaskCollectionsResponse} extends {@link TeaModel}
 *
 * <p>GetTlogTaskCollectionsResponse</p>
 */
public class GetTlogTaskCollectionsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetTlogTaskCollectionsResponseBody body;

    private GetTlogTaskCollectionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetTlogTaskCollectionsResponse create() {
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
    public GetTlogTaskCollectionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTlogTaskCollectionsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetTlogTaskCollectionsResponseBody body);

        @Override
        GetTlogTaskCollectionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTlogTaskCollectionsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetTlogTaskCollectionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTlogTaskCollectionsResponse response) {
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
        public Builder body(GetTlogTaskCollectionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTlogTaskCollectionsResponse build() {
            return new GetTlogTaskCollectionsResponse(this);
        } 

    } 

}
