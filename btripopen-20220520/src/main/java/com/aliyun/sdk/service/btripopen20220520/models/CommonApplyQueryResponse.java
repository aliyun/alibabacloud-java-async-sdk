// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CommonApplyQueryResponse} extends {@link TeaModel}
 *
 * <p>CommonApplyQueryResponse</p>
 */
public class CommonApplyQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CommonApplyQueryResponseBody body;

    private CommonApplyQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CommonApplyQueryResponse create() {
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
    public CommonApplyQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CommonApplyQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CommonApplyQueryResponseBody body);

        @Override
        CommonApplyQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CommonApplyQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CommonApplyQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CommonApplyQueryResponse response) {
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
        public Builder body(CommonApplyQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CommonApplyQueryResponse build() {
            return new CommonApplyQueryResponse(this);
        } 

    } 

}
