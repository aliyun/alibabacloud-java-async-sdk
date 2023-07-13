// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDynamicTagRuleListResponse} extends {@link TeaModel}
 *
 * <p>DescribeDynamicTagRuleListResponse</p>
 */
public class DescribeDynamicTagRuleListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDynamicTagRuleListResponseBody body;

    private DescribeDynamicTagRuleListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDynamicTagRuleListResponse create() {
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
     * @return body
     */
    public DescribeDynamicTagRuleListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDynamicTagRuleListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDynamicTagRuleListResponseBody body);

        @Override
        DescribeDynamicTagRuleListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDynamicTagRuleListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDynamicTagRuleListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDynamicTagRuleListResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(DescribeDynamicTagRuleListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDynamicTagRuleListResponse build() {
            return new DescribeDynamicTagRuleListResponse(this);
        } 

    } 

}
