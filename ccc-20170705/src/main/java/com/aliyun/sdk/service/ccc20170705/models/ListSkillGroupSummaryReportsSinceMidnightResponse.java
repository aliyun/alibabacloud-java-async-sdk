// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSkillGroupSummaryReportsSinceMidnightResponse} extends {@link TeaModel}
 *
 * <p>ListSkillGroupSummaryReportsSinceMidnightResponse</p>
 */
public class ListSkillGroupSummaryReportsSinceMidnightResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSkillGroupSummaryReportsSinceMidnightResponseBody body;

    private ListSkillGroupSummaryReportsSinceMidnightResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSkillGroupSummaryReportsSinceMidnightResponse create() {
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
    public ListSkillGroupSummaryReportsSinceMidnightResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSkillGroupSummaryReportsSinceMidnightResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSkillGroupSummaryReportsSinceMidnightResponseBody body);

        @Override
        ListSkillGroupSummaryReportsSinceMidnightResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSkillGroupSummaryReportsSinceMidnightResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSkillGroupSummaryReportsSinceMidnightResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSkillGroupSummaryReportsSinceMidnightResponse response) {
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
        public Builder body(ListSkillGroupSummaryReportsSinceMidnightResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSkillGroupSummaryReportsSinceMidnightResponse build() {
            return new ListSkillGroupSummaryReportsSinceMidnightResponse(this);
        } 

    } 

}
