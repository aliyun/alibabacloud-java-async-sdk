// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTranscriptionPhrasesResponse} extends {@link TeaModel}
 *
 * <p>ListTranscriptionPhrasesResponse</p>
 */
public class ListTranscriptionPhrasesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListTranscriptionPhrasesResponseBody body;

    private ListTranscriptionPhrasesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListTranscriptionPhrasesResponse create() {
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
    public ListTranscriptionPhrasesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTranscriptionPhrasesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListTranscriptionPhrasesResponseBody body);

        @Override
        ListTranscriptionPhrasesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTranscriptionPhrasesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListTranscriptionPhrasesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTranscriptionPhrasesResponse response) {
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
        public Builder body(ListTranscriptionPhrasesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTranscriptionPhrasesResponse build() {
            return new ListTranscriptionPhrasesResponse(this);
        } 

    } 

}
