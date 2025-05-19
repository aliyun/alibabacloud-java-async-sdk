// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link DeleteTasksRequest} extends {@link RequestModel}
 *
 * <p>DeleteTasksRequest</p>
 */
public class DeleteTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDeleteAlarms")
    private Integer isDeleteAlarms;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskIds;

    private DeleteTasksRequest(Builder builder) {
        super(builder);
        this.isDeleteAlarms = builder.isDeleteAlarms;
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTasksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isDeleteAlarms
     */
    public Integer getIsDeleteAlarms() {
        return this.isDeleteAlarms;
    }

    /**
     * @return taskIds
     */
    public String getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder extends Request.Builder<DeleteTasksRequest, Builder> {
        private Integer isDeleteAlarms; 
        private String taskIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTasksRequest request) {
            super(request);
            this.isDeleteAlarms = request.isDeleteAlarms;
            this.taskIds = request.taskIds;
        } 

        /**
         * IsDeleteAlarms.
         */
        public Builder isDeleteAlarms(Integer isDeleteAlarms) {
            this.putQueryParameter("IsDeleteAlarms", isDeleteAlarms);
            this.isDeleteAlarms = isDeleteAlarms;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;2b5e6f7d-108f-4117-85fb-b202ba033468&quot;]</p>
         */
        public Builder taskIds(String taskIds) {
            this.putQueryParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        @Override
        public DeleteTasksRequest build() {
            return new DeleteTasksRequest(this);
        } 

    } 

}
