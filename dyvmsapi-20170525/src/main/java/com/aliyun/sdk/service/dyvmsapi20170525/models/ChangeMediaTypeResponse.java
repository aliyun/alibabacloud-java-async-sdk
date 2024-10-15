// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ChangeMediaTypeResponse} extends {@link TeaModel}
 *
 * <p>ChangeMediaTypeResponse</p>
 */
public class ChangeMediaTypeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ChangeMediaTypeResponseBody body;

    private ChangeMediaTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ChangeMediaTypeResponse create() {
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
    public ChangeMediaTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeMediaTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ChangeMediaTypeResponseBody body);

        @Override
        ChangeMediaTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeMediaTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ChangeMediaTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeMediaTypeResponse response) {
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
        public Builder body(ChangeMediaTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeMediaTypeResponse build() {
            return new ChangeMediaTypeResponse(this);
        } 

    } 

}
