// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSkillGroupAndAgentStatusSummaryResponse} extends {@link TeaModel}
 *
 * <p>GetSkillGroupAndAgentStatusSummaryResponse</p>
 */
public class GetSkillGroupAndAgentStatusSummaryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSkillGroupAndAgentStatusSummaryResponseBody body;

    private GetSkillGroupAndAgentStatusSummaryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSkillGroupAndAgentStatusSummaryResponse create() {
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
    public GetSkillGroupAndAgentStatusSummaryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSkillGroupAndAgentStatusSummaryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSkillGroupAndAgentStatusSummaryResponseBody body);

        @Override
        GetSkillGroupAndAgentStatusSummaryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSkillGroupAndAgentStatusSummaryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSkillGroupAndAgentStatusSummaryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSkillGroupAndAgentStatusSummaryResponse response) {
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
        public Builder body(GetSkillGroupAndAgentStatusSummaryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSkillGroupAndAgentStatusSummaryResponse build() {
            return new GetSkillGroupAndAgentStatusSummaryResponse(this);
        } 

    } 

}
