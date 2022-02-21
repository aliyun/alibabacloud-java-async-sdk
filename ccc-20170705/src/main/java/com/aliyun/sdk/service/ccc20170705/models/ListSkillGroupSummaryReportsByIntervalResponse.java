// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSkillGroupSummaryReportsByIntervalResponse} extends {@link TeaModel}
 *
 * <p>ListSkillGroupSummaryReportsByIntervalResponse</p>
 */
public class ListSkillGroupSummaryReportsByIntervalResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSkillGroupSummaryReportsByIntervalResponseBody body;

    private ListSkillGroupSummaryReportsByIntervalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSkillGroupSummaryReportsByIntervalResponse create() {
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
    public ListSkillGroupSummaryReportsByIntervalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSkillGroupSummaryReportsByIntervalResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSkillGroupSummaryReportsByIntervalResponseBody body);

        @Override
        ListSkillGroupSummaryReportsByIntervalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSkillGroupSummaryReportsByIntervalResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSkillGroupSummaryReportsByIntervalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSkillGroupSummaryReportsByIntervalResponse response) {
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
        public Builder body(ListSkillGroupSummaryReportsByIntervalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSkillGroupSummaryReportsByIntervalResponse build() {
            return new ListSkillGroupSummaryReportsByIntervalResponse(this);
        } 

    } 

}
