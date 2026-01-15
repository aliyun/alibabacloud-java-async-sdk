// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

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
 * {@link DescribeSafRmmpOrderResponse} extends {@link TeaModel}
 *
 * <p>DescribeSafRmmpOrderResponse</p>
 */
public class DescribeSafRmmpOrderResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeSafRmmpOrderResponseBody body;

    private DescribeSafRmmpOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeSafRmmpOrderResponse create() {
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
    public DescribeSafRmmpOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSafRmmpOrderResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeSafRmmpOrderResponseBody body);

        @Override
        DescribeSafRmmpOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSafRmmpOrderResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeSafRmmpOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSafRmmpOrderResponse response) {
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
        public Builder body(DescribeSafRmmpOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSafRmmpOrderResponse build() {
            return new DescribeSafRmmpOrderResponse(this);
        } 

    } 

}
