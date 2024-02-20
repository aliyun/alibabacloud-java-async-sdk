// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SingleSendMailV2Response} extends {@link TeaModel}
 *
 * <p>SingleSendMailV2Response</p>
 */
public class SingleSendMailV2Response extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private SingleSendMailV2ResponseBody body;

    private SingleSendMailV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SingleSendMailV2Response create() {
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
    public SingleSendMailV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SingleSendMailV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SingleSendMailV2ResponseBody body);

        @Override
        SingleSendMailV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SingleSendMailV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SingleSendMailV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SingleSendMailV2Response response) {
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
        public Builder body(SingleSendMailV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SingleSendMailV2Response build() {
            return new SingleSendMailV2Response(this);
        } 

    } 

}
