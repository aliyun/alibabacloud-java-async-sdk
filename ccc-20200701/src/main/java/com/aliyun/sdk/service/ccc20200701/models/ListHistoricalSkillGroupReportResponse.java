// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHistoricalSkillGroupReportResponse} extends {@link TeaModel}
 *
 * <p>ListHistoricalSkillGroupReportResponse</p>
 */
public class ListHistoricalSkillGroupReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHistoricalSkillGroupReportResponseBody body;

    private ListHistoricalSkillGroupReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHistoricalSkillGroupReportResponse create() {
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
    public ListHistoricalSkillGroupReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHistoricalSkillGroupReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHistoricalSkillGroupReportResponseBody body);

        @Override
        ListHistoricalSkillGroupReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHistoricalSkillGroupReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHistoricalSkillGroupReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHistoricalSkillGroupReportResponse response) {
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
        public Builder body(ListHistoricalSkillGroupReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHistoricalSkillGroupReportResponse build() {
            return new ListHistoricalSkillGroupReportResponse(this);
        } 

    } 

}
