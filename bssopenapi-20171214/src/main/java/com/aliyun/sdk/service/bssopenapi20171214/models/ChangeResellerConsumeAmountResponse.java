// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ChangeResellerConsumeAmountResponse} extends {@link TeaModel}
 *
 * <p>ChangeResellerConsumeAmountResponse</p>
 */
public class ChangeResellerConsumeAmountResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ChangeResellerConsumeAmountResponseBody body;

    private ChangeResellerConsumeAmountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ChangeResellerConsumeAmountResponse create() {
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
    public ChangeResellerConsumeAmountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeResellerConsumeAmountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ChangeResellerConsumeAmountResponseBody body);

        @Override
        ChangeResellerConsumeAmountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeResellerConsumeAmountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ChangeResellerConsumeAmountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeResellerConsumeAmountResponse response) {
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
        public Builder body(ChangeResellerConsumeAmountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeResellerConsumeAmountResponse build() {
            return new ChangeResellerConsumeAmountResponse(this);
        } 

    } 

}
