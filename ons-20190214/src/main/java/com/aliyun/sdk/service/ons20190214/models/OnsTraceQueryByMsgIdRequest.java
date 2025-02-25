// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsTraceQueryByMsgIdRequest} extends {@link RequestModel}
 *
 * <p>OnsTraceQueryByMsgIdRequest</p>
 */
public class OnsTraceQueryByMsgIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MsgId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String msgId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topic")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The beginning of the time range to query. The value of this parameter is a UNIX timestamp in milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1570852800000</p>
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value of this parameter is a UNIX timestamp in milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1570968000000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the ApsaraMQ for RocketMQ instance that contains the specified topic.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_111111111111_DOxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the message that you want to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1E05791C117818B4AAC23B1BB0CE****</p>
         */
        public Builder msgId(String msgId) {
            this.putQueryParameter("MsgId", msgId);
            this.msgId = msgId;
            return this;
        }

        /**
         * <p>The topic that contains the message you want to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
