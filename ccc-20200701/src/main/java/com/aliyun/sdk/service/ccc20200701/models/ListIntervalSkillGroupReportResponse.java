// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIntervalSkillGroupReportResponse} extends {@link TeaModel}
 *
 * <p>ListIntervalSkillGroupReportResponse</p>
 */
public class ListIntervalSkillGroupReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIntervalSkillGroupReportResponseBody body;

    private ListIntervalSkillGroupReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIntervalSkillGroupReportResponse create() {
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
    public ListIntervalSkillGroupReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIntervalSkillGroupReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIntervalSkillGroupReportResponseBody body);

        @Override
        ListIntervalSkillGroupReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIntervalSkillGroupReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIntervalSkillGroupReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIntervalSkillGroupReportResponse response) {
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
        public Builder body(ListIntervalSkillGroupReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIntervalSkillGroupReportResponse build() {
            return new ListIntervalSkillGroupReportResponse(this);
        } 

    } 

}
