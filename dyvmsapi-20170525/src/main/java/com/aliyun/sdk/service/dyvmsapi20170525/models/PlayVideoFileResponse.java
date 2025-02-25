// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PlayVideoFileResponse} extends {@link TeaModel}
 *
 * <p>PlayVideoFileResponse</p>
 */
public class PlayVideoFileResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private PlayVideoFileResponseBody body;

    private PlayVideoFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static PlayVideoFileResponse create() {
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
    public PlayVideoFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PlayVideoFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(PlayVideoFileResponseBody body);

        @Override
        PlayVideoFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PlayVideoFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private PlayVideoFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PlayVideoFileResponse response) {
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
        public Builder body(PlayVideoFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PlayVideoFileResponse build() {
            return new PlayVideoFileResponse(this);
        } 

    } 

}
