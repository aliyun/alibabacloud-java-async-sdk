// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotParamRulesOfResourceResponse} extends {@link TeaModel}
 *
 * <p>ListHotParamRulesOfResourceResponse</p>
 */
public class ListHotParamRulesOfResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHotParamRulesOfResourceResponseBody body;

    private ListHotParamRulesOfResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHotParamRulesOfResourceResponse create() {
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
    public ListHotParamRulesOfResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHotParamRulesOfResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHotParamRulesOfResourceResponseBody body);

        @Override
        ListHotParamRulesOfResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHotParamRulesOfResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHotParamRulesOfResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHotParamRulesOfResourceResponse response) {
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
        public Builder body(ListHotParamRulesOfResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHotParamRulesOfResourceResponse build() {
            return new ListHotParamRulesOfResourceResponse(this);
        } 

    } 

}
