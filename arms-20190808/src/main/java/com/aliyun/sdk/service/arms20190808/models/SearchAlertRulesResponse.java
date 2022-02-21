// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchAlertRulesResponse} extends {@link TeaModel}
 *
 * <p>SearchAlertRulesResponse</p>
 */
public class SearchAlertRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchAlertRulesResponseBody body;

    private SearchAlertRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchAlertRulesResponse create() {
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
    public SearchAlertRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchAlertRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchAlertRulesResponseBody body);

        @Override
        SearchAlertRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchAlertRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchAlertRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchAlertRulesResponse response) {
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
        public Builder body(SearchAlertRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchAlertRulesResponse build() {
            return new SearchAlertRulesResponse(this);
        } 

    } 

}
