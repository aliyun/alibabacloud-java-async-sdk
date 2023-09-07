// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCriteriaStrategyResponse} extends {@link TeaModel}
 *
 * <p>ListCriteriaStrategyResponse</p>
 */
public class ListCriteriaStrategyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCriteriaStrategyResponseBody body;

    private ListCriteriaStrategyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCriteriaStrategyResponse create() {
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
    public ListCriteriaStrategyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCriteriaStrategyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCriteriaStrategyResponseBody body);

        @Override
        ListCriteriaStrategyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCriteriaStrategyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCriteriaStrategyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCriteriaStrategyResponse response) {
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
        public Builder body(ListCriteriaStrategyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCriteriaStrategyResponse build() {
            return new ListCriteriaStrategyResponse(this);
        } 

    } 

}
