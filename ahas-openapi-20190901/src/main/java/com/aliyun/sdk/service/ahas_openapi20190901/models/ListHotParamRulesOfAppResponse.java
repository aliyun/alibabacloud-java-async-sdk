// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotParamRulesOfAppResponse} extends {@link TeaModel}
 *
 * <p>ListHotParamRulesOfAppResponse</p>
 */
public class ListHotParamRulesOfAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHotParamRulesOfAppResponseBody body;

    private ListHotParamRulesOfAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHotParamRulesOfAppResponse create() {
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
    public ListHotParamRulesOfAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHotParamRulesOfAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHotParamRulesOfAppResponseBody body);

        @Override
        ListHotParamRulesOfAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHotParamRulesOfAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHotParamRulesOfAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHotParamRulesOfAppResponse response) {
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
        public Builder body(ListHotParamRulesOfAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHotParamRulesOfAppResponse build() {
            return new ListHotParamRulesOfAppResponse(this);
        } 

    } 

}
