// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQualityRuleListResponse} extends {@link TeaModel}
 *
 * <p>GetQualityRuleListResponse</p>
 */
public class GetQualityRuleListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetQualityRuleListResponseBody body;

    private GetQualityRuleListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetQualityRuleListResponse create() {
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
    public GetQualityRuleListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetQualityRuleListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetQualityRuleListResponseBody body);

        @Override
        GetQualityRuleListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetQualityRuleListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetQualityRuleListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetQualityRuleListResponse response) {
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
        public Builder body(GetQualityRuleListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetQualityRuleListResponse build() {
            return new GetQualityRuleListResponse(this);
        } 

    } 

}
