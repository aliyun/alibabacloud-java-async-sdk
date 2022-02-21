// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplaceAppGroupCommodityCodeResponse} extends {@link TeaModel}
 *
 * <p>ReplaceAppGroupCommodityCodeResponse</p>
 */
public class ReplaceAppGroupCommodityCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReplaceAppGroupCommodityCodeResponseBody body;

    private ReplaceAppGroupCommodityCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReplaceAppGroupCommodityCodeResponse create() {
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
    public ReplaceAppGroupCommodityCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReplaceAppGroupCommodityCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReplaceAppGroupCommodityCodeResponseBody body);

        @Override
        ReplaceAppGroupCommodityCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReplaceAppGroupCommodityCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReplaceAppGroupCommodityCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReplaceAppGroupCommodityCodeResponse response) {
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
        public Builder body(ReplaceAppGroupCommodityCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReplaceAppGroupCommodityCodeResponse build() {
            return new ReplaceAppGroupCommodityCodeResponse(this);
        } 

    } 

}
