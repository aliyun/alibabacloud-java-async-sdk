// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsDLQMessageGetByIdRequest} extends {@link RequestModel}
 *
 * <p>OnsDLQMessageGetByIdRequest</p>
 */
public class OnsDLQMessageGetByIdRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("MsgId")
    @Validation(required = true)
    private String msgId;

    private OnsDLQMessageGetByIdRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.instanceId = builder.instanceId;
        this.msgId = builder.msgId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsDLQMessageGetByIdRequest create() {
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

    public static final class Builder extends Request.Builder<OnsDLQMessageGetByIdRequest, Builder> {
        private String groupId; 
        private String instanceId; 
        private String msgId; 

        private Builder() {
            super();
        } 

        private Builder(OnsDLQMessageGetByIdRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.instanceId = request.instanceId;
            this.msgId = request.msgId;
        } 

        /**
         * The ID of the consumer group whose dead-letter messages you want to query.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the instance to which the message you want to query belongs.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the dead-letter message that you want to query.
         */
        public Builder msgId(String msgId) {
            this.putQueryParameter("MsgId", msgId);
            this.msgId = msgId;
            return this;
        }

        @Override
        public OnsDLQMessageGetByIdRequest build() {
            return new OnsDLQMessageGetByIdRequest(this);
        } 

    } 

}
