// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChannelTriggersResponse} extends {@link TeaModel}
 *
 * <p>DescribeChannelTriggersResponse</p>
 */
public class DescribeChannelTriggersResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeChannelTriggersResponseBody body;

    private DescribeChannelTriggersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeChannelTriggersResponse create() {
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
    public DescribeChannelTriggersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeChannelTriggersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeChannelTriggersResponseBody body);

        @Override
        DescribeChannelTriggersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeChannelTriggersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeChannelTriggersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeChannelTriggersResponse response) {
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
        public Builder body(DescribeChannelTriggersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeChannelTriggersResponse build() {
            return new DescribeChannelTriggersResponse(this);
        } 

    } 

}
