// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTraceQueryByMsgKeyRequest} extends {@link RequestModel}
 *
 * <p>OnsTraceQueryByMsgKeyRequest</p>
 */
public class OnsTraceQueryByMsgKeyRequest extends Request {
    @Query
    @NameInMap("BeginTime")
    @Validation(required = true)
    private Long beginTime;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("MsgKey")
    @Validation(required = true)
    private String msgKey;

    @Query
    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    private OnsTraceQueryByMsgKeyRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.msgKey = builder.msgKey;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsTraceQueryByMsgKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return msgKey
     */
    public String getMsgKey() {
        return this.msgKey;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<OnsTraceQueryByMsgKeyRequest, Builder> {
        private Long beginTime; 
        private Long endTime; 
        private String instanceId; 
        private String msgKey; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(OnsTraceQueryByMsgKeyRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.msgKey = request.msgKey;
            this.topic = request.topic;
        } 

        /**
         * The beginning of the time range to query. The value of this parameter is a UNIX timestamp in milliseconds.
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * The end of the time range to query. The value of this parameter is a UNIX timestamp in milliseconds.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the Message Queue for Apache RocketMQ instance that contains the specified topic.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The key of the messages that you want to query.
         */
        public Builder msgKey(String msgKey) {
            this.putQueryParameter("MsgKey", msgKey);
            this.msgKey = msgKey;
            return this;
        }

        /**
         * The topic that contains the messages you want to query.
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public OnsTraceQueryByMsgKeyRequest build() {
            return new OnsTraceQueryByMsgKeyRequest(this);
        } 

    } 

}
