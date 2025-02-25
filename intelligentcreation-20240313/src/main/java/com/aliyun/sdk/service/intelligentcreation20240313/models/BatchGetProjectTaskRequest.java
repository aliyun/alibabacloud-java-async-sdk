// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link BatchGetProjectTaskRequest} extends {@link RequestModel}
 *
 * <p>BatchGetProjectTaskRequest</p>
 */
public class BatchGetProjectTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskIdList")
    private java.util.List<String> taskIdList;

    private BatchGetProjectTaskRequest(Builder builder) {
        super(builder);
        this.taskIdList = builder.taskIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetProjectTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskIdList
     */
    public java.util.List<String> getTaskIdList() {
        return this.taskIdList;
    }

    public static final class Builder extends Request.Builder<BatchGetProjectTaskRequest, Builder> {
        private java.util.List<String> taskIdList; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetProjectTaskRequest request) {
            super(request);
            this.taskIdList = request.taskIdList;
        } 

        /**
         * taskIdList.
         */
        public Builder taskIdList(java.util.List<String> taskIdList) {
            String taskIdListShrink = shrink(taskIdList, "taskIdList", "simple");
            this.putQueryParameter("taskIdList", taskIdListShrink);
            this.taskIdList = taskIdList;
            return this;
        }

        @Override
        public BatchGetProjectTaskRequest build() {
            return new BatchGetProjectTaskRequest(this);
        } 

    } 

}
