// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.anytrans20250707.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UsageQueryRequest} extends {@link RequestModel}
 *
 * <p>UsageQueryRequest</p>
 */
public class UsageQueryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UsageQueryRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UsageQueryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UsageQueryRequest, Builder> {
        private Long endTime; 
        private Long startTime; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UsageQueryRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.startTime = request.startTime;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-kqtrcpdee4xm29xx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UsageQueryRequest build() {
            return new UsageQueryRequest(this);
        } 

    } 

}
