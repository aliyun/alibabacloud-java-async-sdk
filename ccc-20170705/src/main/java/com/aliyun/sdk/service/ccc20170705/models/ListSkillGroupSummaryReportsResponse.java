// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSkillGroupSummaryReportsResponse} extends {@link TeaModel}
 *
 * <p>ListSkillGroupSummaryReportsResponse</p>
 */
public class ListSkillGroupSummaryReportsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSkillGroupSummaryReportsResponseBody body;

    private ListSkillGroupSummaryReportsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSkillGroupSummaryReportsResponse create() {
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
    public ListSkillGroupSummaryReportsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSkillGroupSummaryReportsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSkillGroupSummaryReportsResponseBody body);

        @Override
        ListSkillGroupSummaryReportsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSkillGroupSummaryReportsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSkillGroupSummaryReportsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSkillGroupSummaryReportsResponse response) {
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
        public Builder body(ListSkillGroupSummaryReportsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSkillGroupSummaryReportsResponse build() {
            return new ListSkillGroupSummaryReportsResponse(this);
        } 

    } 

}
