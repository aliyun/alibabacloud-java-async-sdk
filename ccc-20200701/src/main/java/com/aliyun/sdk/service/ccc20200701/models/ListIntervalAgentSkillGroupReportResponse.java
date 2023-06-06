// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIntervalAgentSkillGroupReportResponse} extends {@link TeaModel}
 *
 * <p>ListIntervalAgentSkillGroupReportResponse</p>
 */
public class ListIntervalAgentSkillGroupReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIntervalAgentSkillGroupReportResponseBody body;

    private ListIntervalAgentSkillGroupReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIntervalAgentSkillGroupReportResponse create() {
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
    public ListIntervalAgentSkillGroupReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIntervalAgentSkillGroupReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIntervalAgentSkillGroupReportResponseBody body);

        @Override
        ListIntervalAgentSkillGroupReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIntervalAgentSkillGroupReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIntervalAgentSkillGroupReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIntervalAgentSkillGroupReportResponse response) {
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
        public Builder body(ListIntervalAgentSkillGroupReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIntervalAgentSkillGroupReportResponse build() {
            return new ListIntervalAgentSkillGroupReportResponse(this);
        } 

    } 

}
