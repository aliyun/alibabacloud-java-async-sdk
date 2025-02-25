// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSupportRuleListResponse} extends {@link TeaModel}
 *
 * <p>DescribeSupportRuleListResponse</p>
 */
public class DescribeSupportRuleListResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeSupportRuleListResponseBody body;

    private DescribeSupportRuleListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeSupportRuleListResponse create() {
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
    public DescribeSupportRuleListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSupportRuleListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeSupportRuleListResponseBody body);

        @Override
        DescribeSupportRuleListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSupportRuleListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeSupportRuleListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSupportRuleListResponse response) {
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
        public Builder body(DescribeSupportRuleListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSupportRuleListResponse build() {
            return new DescribeSupportRuleListResponse(this);
        } 

    } 

}
