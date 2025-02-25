// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

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
 * {@link AddEnterpriseGroupMemberToTaskGroupRequest} extends {@link RequestModel}
 *
 * <p>AddEnterpriseGroupMemberToTaskGroupRequest</p>
 */
public class AddEnterpriseGroupMemberToTaskGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskOrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private AddEnterpriseGroupMemberToTaskGroupRequest(Builder builder) {
        super(builder);
        this.taskOrderId = builder.taskOrderId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddEnterpriseGroupMemberToTaskGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskOrderId
     */
    public String getTaskOrderId() {
        return this.taskOrderId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<AddEnterpriseGroupMemberToTaskGroupRequest, Builder> {
        private String taskOrderId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(AddEnterpriseGroupMemberToTaskGroupRequest request) {
            super(request);
            this.taskOrderId = request.taskOrderId;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>E240815B72K5D3</p>
         */
        public Builder taskOrderId(String taskOrderId) {
            this.putQueryParameter("TaskOrderId", taskOrderId);
            this.taskOrderId = taskOrderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PtWoW82DJI1zcTwsT98kLIgAj7kfASzfC6StcpV7hKs=</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public AddEnterpriseGroupMemberToTaskGroupRequest build() {
            return new AddEnterpriseGroupMemberToTaskGroupRequest(this);
        } 

    } 

}
