// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsMessageGetByMsgIdRequest} extends {@link RequestModel}
 *
 * <p>OnsMessageGetByMsgIdRequest</p>
 */
public class OnsMessageGetByMsgIdRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("MsgId")
    @Validation(required = true)
    private String msgId;

    @Query
    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    private OnsMessageGetByMsgIdRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.msgId = builder.msgId;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsMessageGetByMsgIdRequest create() {
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
     * @return msgId
     */
    public String getMsgId() {
        return this.msgId;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<OnsMessageGetByMsgIdRequest, Builder> {
        private String instanceId; 
        private String msgId; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(OnsMessageGetByMsgIdRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.msgId = request.msgId;
            this.topic = request.topic;
        } 

        /**
         * The ID of the instance where the message that you want to query resides.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the message that you want to query.
         */
        public Builder msgId(String msgId) {
            this.putQueryParameter("MsgId", msgId);
            this.msgId = msgId;
            return this;
        }

        /**
         * The topic that contains the message that you want to query.
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public OnsMessageGetByMsgIdRequest build() {
            return new OnsMessageGetByMsgIdRequest(this);
        } 

    } 

}
