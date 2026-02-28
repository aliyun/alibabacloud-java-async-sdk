// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link UpdateConsumerGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateConsumerGroupRequest</p>
 */
public class UpdateConsumerGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newGroupName;

    private UpdateConsumerGroupRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.iotInstanceId = builder.iotInstanceId;
        this.newGroupName = builder.newGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConsumerGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return newGroupName
     */
    public String getNewGroupName() {
        return this.newGroupName;
    }

    public static final class Builder extends Request.Builder<UpdateConsumerGroupRequest, Builder> {
        private String groupId; 
        private String iotInstanceId; 
        private String newGroupName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConsumerGroupRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.iotInstanceId = request.iotInstanceId;
            this.newGroupName = request.newGroupName;
        } 

        /**
         * <p>The consumer group ID. After you call the <a href="https://help.aliyun.com/document_detail/170388.html">CreateConsumerGroup</a> operation to create a consumer group, the consumer group ID is returned. You can call the <a href="https://help.aliyun.com/document_detail/170419.html">QueryConsumerGroupList</a> operation to query the consumer group ID by group name. You can also go to the IoT Platform console,and choose <strong>Rules</strong> &gt; <strong>Server-side Subscription</strong> &gt; <strong>Consumer Groups</strong> to view the consumer group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nJRaJPn5U1JITGf******</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
         * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-0pp1n8t****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The new name of the consumer group. The name must be 4 to 30 characters in length and can contain letters, digits, and underscores (_).</p>
         * <p>This parameter is required.</p>
         */
        public Builder newGroupName(String newGroupName) {
            this.putQueryParameter("NewGroupName", newGroupName);
            this.newGroupName = newGroupName;
            return this;
        }

        @Override
        public UpdateConsumerGroupRequest build() {
            return new UpdateConsumerGroupRequest(this);
        } 

    } 

}
