// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTraceGetResultRequest} extends {@link RequestModel}
 *
 * <p>OnsTraceGetResultRequest</p>
 */
public class OnsTraceGetResultRequest extends Request {
    @Query
    @NameInMap("QueryId")
    @Validation(required = true)
    private String queryId;

    private OnsTraceGetResultRequest(Builder builder) {
        super(builder);
        this.queryId = builder.queryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsTraceGetResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    public static final class Builder extends Request.Builder<OnsTraceGetResultRequest, Builder> {
        private String queryId; 

        private Builder() {
            super();
        } 

        private Builder(OnsTraceGetResultRequest request) {
            super(request);
            this.queryId = request.queryId;
        } 

        /**
         * The ID of the task that was created to query the trace of the message.
         */
        public Builder queryId(String queryId) {
            this.putQueryParameter("QueryId", queryId);
            this.queryId = queryId;
            return this;
        }

        @Override
        public OnsTraceGetResultRequest build() {
            return new OnsTraceGetResultRequest(this);
        } 

    } 

}
