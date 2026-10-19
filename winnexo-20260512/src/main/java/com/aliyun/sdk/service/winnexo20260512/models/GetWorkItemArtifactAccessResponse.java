// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetWorkItemArtifactAccessResponse} extends {@link TeaModel}
 *
 * <p>GetWorkItemArtifactAccessResponse</p>
 */
public class GetWorkItemArtifactAccessResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetWorkItemArtifactAccessResponseBody body;

    private GetWorkItemArtifactAccessResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetWorkItemArtifactAccessResponse create() {
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
    public GetWorkItemArtifactAccessResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWorkItemArtifactAccessResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetWorkItemArtifactAccessResponseBody body);

        @Override
        GetWorkItemArtifactAccessResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWorkItemArtifactAccessResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetWorkItemArtifactAccessResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWorkItemArtifactAccessResponse response) {
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
        public Builder body(GetWorkItemArtifactAccessResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWorkItemArtifactAccessResponse build() {
            return new GetWorkItemArtifactAccessResponse(this);
        } 

    } 

}
