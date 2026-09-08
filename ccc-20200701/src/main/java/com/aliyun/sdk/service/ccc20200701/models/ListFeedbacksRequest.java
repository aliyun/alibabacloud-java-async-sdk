// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListFeedbacksRequest} extends {@link RequestModel}
 *
 * <p>ListFeedbacksRequest</p>
 */
public class ListFeedbacksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIdList")
    private String taskIdList;

    private ListFeedbacksRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.taskIdList = builder.taskIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFeedbacksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return taskIdList
     */
    public String getTaskIdList() {
        return this.taskIdList;
    }

    public static final class Builder extends Request.Builder<ListFeedbacksRequest, Builder> {
        private String instanceId; 
        private String taskIdList; 

        private Builder() {
            super();
        } 

        private Builder(ListFeedbacksRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.taskIdList = request.taskIdList;
        } 

        /**
         * <p>The ID of the CCC instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>A list of task IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;20251216-8B9B7B02-16FE-54BE-942A-F59DE0656032&quot;]</p>
         */
        public Builder taskIdList(String taskIdList) {
            this.putQueryParameter("TaskIdList", taskIdList);
            this.taskIdList = taskIdList;
            return this;
        }

        @Override
        public ListFeedbacksRequest build() {
            return new ListFeedbacksRequest(this);
        } 

    } 

}
