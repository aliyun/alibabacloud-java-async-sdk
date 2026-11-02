// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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
 * {@link UpdateTopicConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateTopicConfigRequest</p>
 */
public class UpdateTopicConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topic")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    @com.aliyun.core.annotation.Validation(required = true)
    private String value;

    private UpdateTopicConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.topic = builder.topic;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTopicConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<UpdateTopicConfigRequest, Builder> {
        private String config; 
        private String instanceId; 
        private String regionId; 
        private String topic; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTopicConfigRequest request) {
            super(request);
            this.config = request.config;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.topic = request.topic;
            this.value = request.value;
        } 

        /**
         * <p>The key of the topic configuration.</p>
         * <ul>
         * <li><p>You can modify the configurations only for topics that use the local storage engine on reserved instances. You cannot modify the configurations for topics that use the cloud storage engine.</p>
         * </li>
         * <li><p>You can modify the configurations of topics for Serverless instances.</p>
         * </li>
         * <li><p>For <code>local topics</code> on reserved instances, the supported keys are \<code>retention.ms\\</code>, \<code>max.message.bytes\\</code>, \<code>message.timestamp.type\\</code>, and \<code>message.timestamp.difference.max.ms\\</code>.</p>
         * </li>
         * <li><p>For Serverless instances, the supported keys are \<code>retention.hours\\</code>, \<code>max.message.bytes\\</code>, \<code>message.timestamp.type\\</code>, and \<code>message.timestamp.difference.max.ms\\</code>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>retention.ms</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_post-cn-v0h1fgs2****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The topic name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dqc_test2</p>
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        /**
         * <p>The value of the topic configuration.</p>
         * <ul>
         * <li><p>The following configurations are supported for Serverless instances:</p>
         * <ul>
         * <li><p><code>retention.hours</code> specifies the message retention period. The value must be a string. The value must be in the range of 24 to 8,760.</p>
         * </li>
         * <li><p><code>max.message.bytes</code> specifies the maximum message size. The value must be a string. The value must be in the range of 1,048,576 to 10,485,760.</p>
         * </li>
         * <li><p><code>message.timestamp.type</code> specifies the message timestamp type. \<code>CreateTime\\</code> indicates the timestamp that is specified by the producer when the message is sent. If no timestamp is specified, the time when the message is created on the client is used. \<code>LogAppendTime\\</code> indicates the time when the message is stored on the server. Valid values: \<code>CreateTime\\</code> and \<code>LogAppendTime\\</code>.</p>
         * </li>
         * <li><p><code>message.timestamp.difference.max.ms</code> specifies the maximum allowed difference between the timestamp of the server that receives the message and the timestamp specified in the message. If \<code>message.timestamp.type\\</code> is set to \<code>CreateTime\\</code> and the time difference exceeds this threshold, <strong>the message is rejected</strong>. This configuration does not take effect if \<code>message.timestamp.type\\</code> is set to \<code>LogAppendTime\\</code>.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>The following configurations are supported for reserved instances:</p>
         * <ul>
         * <li><p><code>retention.ms</code> specifies the message retention period. The value must be a string. The value must be in the range of 3,600,000 to 31,536,000,000.</p>
         * </li>
         * <li><p><code>max.message.bytes</code> specifies the maximum message size. The value must be a string. The value must be in the range of 1,048,576 to 10,485,760.</p>
         * </li>
         * <li><p><code>message.timestamp.type</code> specifies the message timestamp type. \<code>CreateTime\\</code> indicates the timestamp that is specified by the producer when the message is sent. If no timestamp is specified, the time when the message is created on the client is used. \<code>LogAppendTime\\</code> indicates the time when the message is stored on the server. Valid values: \<code>CreateTime\\</code> and \<code>LogAppendTime\\</code>.</p>
         * </li>
         * <li><p><code>message.timestamp.difference.max.ms</code> specifies the maximum allowed difference between the timestamp of the server that receives the message and the timestamp specified in the message. If \<code>message.timestamp.type\\</code> is set to \<code>CreateTime\\</code> and the time difference exceeds this threshold, <strong>the message is rejected</strong>. This configuration does not take effect if \<code>message.timestamp.type\\</code> is set to \<code>LogAppendTime\\</code>.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3600000</p>
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public UpdateTopicConfigRequest build() {
            return new UpdateTopicConfigRequest(this);
        } 

    } 

}
