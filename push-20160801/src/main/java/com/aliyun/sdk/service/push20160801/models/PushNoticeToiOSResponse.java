// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushNoticeToiOSResponse} extends {@link TeaModel}
 *
 * <p>PushNoticeToiOSResponse</p>
 */
public class PushNoticeToiOSResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private PushNoticeToiOSResponseBody body;

    private PushNoticeToiOSResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static PushNoticeToiOSResponse create() {
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
    public PushNoticeToiOSResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PushNoticeToiOSResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(PushNoticeToiOSResponseBody body);

        @Override
        PushNoticeToiOSResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PushNoticeToiOSResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private PushNoticeToiOSResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PushNoticeToiOSResponse response) {
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
        public Builder body(PushNoticeToiOSResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PushNoticeToiOSResponse build() {
            return new PushNoticeToiOSResponse(this);
        } 

    } 

}
