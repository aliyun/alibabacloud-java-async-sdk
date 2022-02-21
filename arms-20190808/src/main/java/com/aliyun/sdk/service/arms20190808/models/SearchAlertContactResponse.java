// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchAlertContactResponse} extends {@link TeaModel}
 *
 * <p>SearchAlertContactResponse</p>
 */
public class SearchAlertContactResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchAlertContactResponseBody body;

    private SearchAlertContactResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchAlertContactResponse create() {
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
    public SearchAlertContactResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchAlertContactResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchAlertContactResponseBody body);

        @Override
        SearchAlertContactResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchAlertContactResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchAlertContactResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchAlertContactResponse response) {
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
        public Builder body(SearchAlertContactResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchAlertContactResponse build() {
            return new SearchAlertContactResponse(this);
        } 

    } 

}
