// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListImageAnalysisRuleProjectResponse} extends {@link TeaModel}
 *
 * <p>ListImageAnalysisRuleProjectResponse</p>
 */
public class ListImageAnalysisRuleProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListImageAnalysisRuleProjectResponseBody body;

    private ListImageAnalysisRuleProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListImageAnalysisRuleProjectResponse create() {
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
    public ListImageAnalysisRuleProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListImageAnalysisRuleProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListImageAnalysisRuleProjectResponseBody body);

        @Override
        ListImageAnalysisRuleProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListImageAnalysisRuleProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListImageAnalysisRuleProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListImageAnalysisRuleProjectResponse response) {
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
        public Builder body(ListImageAnalysisRuleProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListImageAnalysisRuleProjectResponse build() {
            return new ListImageAnalysisRuleProjectResponse(this);
        } 

    } 

}
