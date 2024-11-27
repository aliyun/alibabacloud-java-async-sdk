// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsDLQMessageResendByIdRequest} extends {@link RequestModel}
 *
 * <p>OnsDLQMessageResendByIdRequest</p>
 */
public class OnsDLQMessageResendByIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MsgId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String msgId;

    private OnsDLQMessageResendByIdRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.instanceId = builder.instanceId;
        this.msgId = builder.msgId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsDLQMessageResendByIdRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return msgId
     */
    public String getMsgId() {
        return this.msgId;
    }

    public static final class Builder extends Request.Builder<OnsDLQMessageResendByIdRequest, Builder> {
        private String groupId; 
        private String instanceId; 
        private String msgId; 

        private Builder() {
            super();
        } 

        private Builder(OnsDLQMessageResendByIdRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.instanceId = request.instanceId;
            this.msgId = request.msgId;
        } 

        /**
         * <p>The ID of the consumer group in which you want to query dead-letter messages.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_test_group_id</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the instance in which the dead-letter message you want to query resides.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_188077086902****_BXSuW61e</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the dead-letter message that you want to send to a consumer group for consumption.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0BC16699343051CD9F1D798E7734****</p>
         */
        public Builder msgId(String msgId) {
            this.putQueryParameter("MsgId", msgId);
            this.msgId = msgId;
            return this;
        }

        @Override
        public OnsDLQMessageResendByIdRequest build() {
            return new OnsDLQMessageResendByIdRequest(this);
        } 

    } 

}
