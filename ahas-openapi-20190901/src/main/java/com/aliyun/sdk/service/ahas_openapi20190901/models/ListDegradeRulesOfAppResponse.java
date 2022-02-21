// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDegradeRulesOfAppResponse} extends {@link TeaModel}
 *
 * <p>ListDegradeRulesOfAppResponse</p>
 */
public class ListDegradeRulesOfAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDegradeRulesOfAppResponseBody body;

    private ListDegradeRulesOfAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDegradeRulesOfAppResponse create() {
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
    public ListDegradeRulesOfAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDegradeRulesOfAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDegradeRulesOfAppResponseBody body);

        @Override
        ListDegradeRulesOfAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDegradeRulesOfAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDegradeRulesOfAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDegradeRulesOfAppResponse response) {
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
        public Builder body(ListDegradeRulesOfAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDegradeRulesOfAppResponse build() {
            return new ListDegradeRulesOfAppResponse(this);
        } 

    } 

}
