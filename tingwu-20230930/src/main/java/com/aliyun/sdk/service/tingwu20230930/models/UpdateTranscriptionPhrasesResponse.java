// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTranscriptionPhrasesResponse} extends {@link TeaModel}
 *
 * <p>UpdateTranscriptionPhrasesResponse</p>
 */
public class UpdateTranscriptionPhrasesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateTranscriptionPhrasesResponseBody body;

    private UpdateTranscriptionPhrasesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateTranscriptionPhrasesResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
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
    public UpdateTranscriptionPhrasesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTranscriptionPhrasesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateTranscriptionPhrasesResponseBody body);

        @Override
        UpdateTranscriptionPhrasesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTranscriptionPhrasesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateTranscriptionPhrasesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTranscriptionPhrasesResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
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
        public Builder body(UpdateTranscriptionPhrasesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTranscriptionPhrasesResponse build() {
            return new UpdateTranscriptionPhrasesResponse(this);
        } 

    } 

}
