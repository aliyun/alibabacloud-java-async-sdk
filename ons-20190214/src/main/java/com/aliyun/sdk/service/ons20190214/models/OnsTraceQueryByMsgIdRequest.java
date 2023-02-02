// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTraceQueryByMsgIdRequest} extends {@link RequestModel}
 *
 * <p>OnsTraceQueryByMsgIdRequest</p>
 */
public class OnsTraceQueryByMsgIdRequest extends Request {
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
    @NameInMap("MsgId")
    @Validation(required = true)
    private String msgId;

    @Query
    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    private OnsTraceQueryByMsgIdRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.msgId = builder.msgId;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsTraceQueryByMsgIdRequest create() {
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

    public static final class Builder extends Request.Builder<OnsTraceQueryByMsgIdRequest, Builder> {
        private Long beginTime; 
        private Long endTime; 
        private String instanceId; 
        private String msgId; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(OnsTraceQueryByMsgIdRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.msgId = request.msgId;
            this.topic = request.topic;
        } 

        /**
         * The beginning of the time range to query. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * The end of the time range to query. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the Message Queue for Apache RocketMQ instance which contains the specified topic.
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
         * The topic in which the message you want to query is stored.
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public OnsTraceQueryByMsgIdRequest build() {
            return new OnsTraceQueryByMsgIdRequest(this);
        } 

    } 

}
