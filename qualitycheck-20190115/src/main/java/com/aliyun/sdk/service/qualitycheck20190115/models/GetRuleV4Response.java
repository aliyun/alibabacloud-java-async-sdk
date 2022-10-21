// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRuleV4Response} extends {@link TeaModel}
 *
 * <p>GetRuleV4Response</p>
 */
public class GetRuleV4Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRuleV4ResponseBody body;

    private GetRuleV4Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRuleV4Response create() {
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
    public GetRuleV4ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRuleV4Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRuleV4ResponseBody body);

        @Override
        GetRuleV4Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRuleV4Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRuleV4ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRuleV4Response response) {
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
        public Builder body(GetRuleV4ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRuleV4Response build() {
            return new GetRuleV4Response(this);
        } 

    } 

}
