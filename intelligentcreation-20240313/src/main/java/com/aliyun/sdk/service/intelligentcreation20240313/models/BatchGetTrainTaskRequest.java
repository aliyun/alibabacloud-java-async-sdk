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
 * {@link BatchGetTrainTaskRequest} extends {@link RequestModel}
 *
 * <p>BatchGetTrainTaskRequest</p>
 */
public class BatchGetTrainTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("aliyunMainId")
    private String aliyunMainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskIdList")
    private java.util.List<String> taskIdList;

    private BatchGetTrainTaskRequest(Builder builder) {
        super(builder);
        this.aliyunMainId = builder.aliyunMainId;
        this.taskIdList = builder.taskIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetTrainTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunMainId
     */
    public String getAliyunMainId() {
        return this.aliyunMainId;
    }

    /**
     * @return taskIdList
     */
    public java.util.List<String> getTaskIdList() {
        return this.taskIdList;
    }

    public static final class Builder extends Request.Builder<BatchGetTrainTaskRequest, Builder> {
        private String aliyunMainId; 
        private java.util.List<String> taskIdList; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetTrainTaskRequest request) {
            super(request);
            this.aliyunMainId = request.aliyunMainId;
            this.taskIdList = request.taskIdList;
        } 

        /**
         * aliyunMainId.
         */
        public Builder aliyunMainId(String aliyunMainId) {
            this.putQueryParameter("aliyunMainId", aliyunMainId);
            this.aliyunMainId = aliyunMainId;
            return this;
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
        public BatchGetTrainTaskRequest build() {
            return new BatchGetTrainTaskRequest(this);
        } 

    } 

}
