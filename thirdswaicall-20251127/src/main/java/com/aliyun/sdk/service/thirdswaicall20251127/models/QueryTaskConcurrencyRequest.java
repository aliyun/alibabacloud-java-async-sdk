// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.thirdswaicall20251127.models;

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
 * {@link QueryTaskConcurrencyRequest} extends {@link RequestModel}
 *
 * <p>QueryTaskConcurrencyRequest</p>
 */
public class QueryTaskConcurrencyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationCode")
    private String applicationCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallerUacAccountId")
    private String callerUacAccountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentWorkspaceId")
    private String currentWorkspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    private QueryTaskConcurrencyRequest(Builder builder) {
        super(builder);
        this.applicationCode = builder.applicationCode;
        this.callerUacAccountId = builder.callerUacAccountId;
        this.currentWorkspaceId = builder.currentWorkspaceId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTaskConcurrencyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationCode
     */
    public String getApplicationCode() {
        return this.applicationCode;
    }

    /**
     * @return callerUacAccountId
     */
    public String getCallerUacAccountId() {
        return this.callerUacAccountId;
    }

    /**
     * @return currentWorkspaceId
     */
    public String getCurrentWorkspaceId() {
        return this.currentWorkspaceId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<QueryTaskConcurrencyRequest, Builder> {
        private String applicationCode; 
        private String callerUacAccountId; 
        private String currentWorkspaceId; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(QueryTaskConcurrencyRequest request) {
            super(request);
            this.applicationCode = request.applicationCode;
            this.callerUacAccountId = request.callerUacAccountId;
            this.currentWorkspaceId = request.currentWorkspaceId;
            this.taskId = request.taskId;
        } 

        /**
         * ApplicationCode.
         */
        public Builder applicationCode(String applicationCode) {
            this.putBodyParameter("ApplicationCode", applicationCode);
            this.applicationCode = applicationCode;
            return this;
        }

        /**
         * CallerUacAccountId.
         */
        public Builder callerUacAccountId(String callerUacAccountId) {
            this.putBodyParameter("CallerUacAccountId", callerUacAccountId);
            this.callerUacAccountId = callerUacAccountId;
            return this;
        }

        /**
         * CurrentWorkspaceId.
         */
        public Builder currentWorkspaceId(String currentWorkspaceId) {
            this.putBodyParameter("CurrentWorkspaceId", currentWorkspaceId);
            this.currentWorkspaceId = currentWorkspaceId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public QueryTaskConcurrencyRequest build() {
            return new QueryTaskConcurrencyRequest(this);
        } 

    } 

}
