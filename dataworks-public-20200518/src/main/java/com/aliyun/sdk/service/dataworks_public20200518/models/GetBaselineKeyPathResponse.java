// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBaselineKeyPathResponse} extends {@link TeaModel}
 *
 * <p>GetBaselineKeyPathResponse</p>
 */
public class GetBaselineKeyPathResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBaselineKeyPathResponseBody body;

    private GetBaselineKeyPathResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBaselineKeyPathResponse create() {
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
    public GetBaselineKeyPathResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBaselineKeyPathResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBaselineKeyPathResponseBody body);

        @Override
        GetBaselineKeyPathResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBaselineKeyPathResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBaselineKeyPathResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBaselineKeyPathResponse response) {
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
        public Builder body(GetBaselineKeyPathResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBaselineKeyPathResponse build() {
            return new GetBaselineKeyPathResponse(this);
        } 

    } 

}
