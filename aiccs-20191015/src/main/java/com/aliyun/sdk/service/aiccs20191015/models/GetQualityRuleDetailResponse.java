// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQualityRuleDetailResponse} extends {@link TeaModel}
 *
 * <p>GetQualityRuleDetailResponse</p>
 */
public class GetQualityRuleDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetQualityRuleDetailResponseBody body;

    private GetQualityRuleDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetQualityRuleDetailResponse create() {
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
    public GetQualityRuleDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetQualityRuleDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetQualityRuleDetailResponseBody body);

        @Override
        GetQualityRuleDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetQualityRuleDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetQualityRuleDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetQualityRuleDetailResponse response) {
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
        public Builder body(GetQualityRuleDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetQualityRuleDetailResponse build() {
            return new GetQualityRuleDetailResponse(this);
        } 

    } 

}
