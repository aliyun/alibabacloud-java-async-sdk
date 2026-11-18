// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link GetVideoCharacterReplaceJobResponse} extends {@link TeaModel}
 *
 * <p>GetVideoCharacterReplaceJobResponse</p>
 */
public class GetVideoCharacterReplaceJobResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetVideoCharacterReplaceJobResponseBody body;

    private GetVideoCharacterReplaceJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetVideoCharacterReplaceJobResponse create() {
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
    public GetVideoCharacterReplaceJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetVideoCharacterReplaceJobResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetVideoCharacterReplaceJobResponseBody body);

        @Override
        GetVideoCharacterReplaceJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetVideoCharacterReplaceJobResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetVideoCharacterReplaceJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetVideoCharacterReplaceJobResponse response) {
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
        public Builder body(GetVideoCharacterReplaceJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetVideoCharacterReplaceJobResponse build() {
            return new GetVideoCharacterReplaceJobResponse(this);
        } 

    } 

}
