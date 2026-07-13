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
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    private QueryTaskConcurrencyRequest(Builder builder) {
        super(builder);
        this.applicationCode = builder.applicationCode;
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
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<QueryTaskConcurrencyRequest, Builder> {
        private String applicationCode; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(QueryTaskConcurrencyRequest request) {
            super(request);
            this.applicationCode = request.applicationCode;
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
