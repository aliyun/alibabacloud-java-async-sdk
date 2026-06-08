// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link QueryAskLumaLogRequest} extends {@link RequestModel}
 *
 * <p>QueryAskLumaLogRequest</p>
 */
public class QueryAskLumaLogRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("After")
    private String after;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentName")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 2)
    private String agentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    private QueryAskLumaLogRequest(Builder builder) {
        super(builder);
        this.after = builder.after;
        this.agentName = builder.agentName;
        this.limit = builder.limit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAskLumaLogRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return after
     */
    public String getAfter() {
        return this.after;
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    public static final class Builder extends Request.Builder<QueryAskLumaLogRequest, Builder> {
        private String after; 
        private String agentName; 
        private Integer limit; 

        private Builder() {
            super();
        } 

        private Builder(QueryAskLumaLogRequest request) {
            super(request);
            this.after = request.after;
            this.agentName = request.agentName;
            this.limit = request.limit;
        } 

        /**
         * After.
         */
        public Builder after(String after) {
            this.putBodyParameter("After", after);
            this.after = after;
            return this;
        }

        /**
         * AgentName.
         */
        public Builder agentName(String agentName) {
            this.putBodyParameter("AgentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        @Override
        public QueryAskLumaLogRequest build() {
            return new QueryAskLumaLogRequest(this);
        } 

    } 

}
