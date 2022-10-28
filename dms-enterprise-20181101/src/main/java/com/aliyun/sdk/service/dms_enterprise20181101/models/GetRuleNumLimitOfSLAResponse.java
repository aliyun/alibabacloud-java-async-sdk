// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRuleNumLimitOfSLAResponse} extends {@link TeaModel}
 *
 * <p>GetRuleNumLimitOfSLAResponse</p>
 */
public class GetRuleNumLimitOfSLAResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRuleNumLimitOfSLAResponseBody body;

    private GetRuleNumLimitOfSLAResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRuleNumLimitOfSLAResponse create() {
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
    public GetRuleNumLimitOfSLAResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRuleNumLimitOfSLAResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRuleNumLimitOfSLAResponseBody body);

        @Override
        GetRuleNumLimitOfSLAResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRuleNumLimitOfSLAResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRuleNumLimitOfSLAResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRuleNumLimitOfSLAResponse response) {
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
        public Builder body(GetRuleNumLimitOfSLAResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRuleNumLimitOfSLAResponse build() {
            return new GetRuleNumLimitOfSLAResponse(this);
        } 

    } 

}
