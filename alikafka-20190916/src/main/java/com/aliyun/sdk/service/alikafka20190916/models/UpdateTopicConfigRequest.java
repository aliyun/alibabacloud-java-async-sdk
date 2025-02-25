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
         * <li>For reserved instances, you can modify only the configurations of the topics that use local storage.</li>
         * <li>For serverless instances, you can modify the configurations of all topics.</li>
         * <li>Reserved instances whose topics use local storage support the following keys: retention.ms, max.message.bytes, replications, message.timestamp.type, and message.timestamp.difference.max.ms.``</li>
         * <li>Serverless instances support the following keys: retention.hours, max.message.bytes, message.timestamp.type, message.timestamp.difference.max.ms.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>replications</p>
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
         * <p>The ID of the region where the instance resides.</p>
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
         * <li><p>Serverless instances support the following values:</p>
         * <ul>
         * <li><code>retention.hours</code>: the message retention period. Value type: string. Valid values: 24 to 8760.</li>
         * <li><code>max.message.bytes</code>: the maximum size of a sent message. Value type: string. Valid values: 1048576 to 10485760.</li>
         * <li><code>message.timestamp.type</code>: the timestamp type of a message. Valid values: CreateTime and LogAppendTime. The value CreateTime specifies the timestamp that is specified by the producer when the message is sent. The value LogAppendTime specifies the time when the broker appends the message to its log. If you do not specify this parameter, the time when the message is created on the client is used.</li>
         * <li><code>message.timestamp.difference.max.ms</code>: the maximum positive or negative difference allowed between the timestamp when the broker receives a message and the timestamp specified in the message. If you set message.timestamp.type to CreateTime, <strong>a message is rejected</strong> if the difference in timestamp exceeds the threshold. If you set message.timestamp.type to LogAppendTime, this configuration does not take effect.</li>
         * </ul>
         * </li>
         * <li><p>Reserved instances support the following values:</p>
         * <ul>
         * <li><code>retention.ms</code>: the message retention period. Value type: string. Valid values: 3600000 to 31536000000.</li>
         * <li><code>max.message.bytes</code>: the maximum size of a sent message. Value type: string. Valid values: 1048576 to 10485760.</li>
         * <li><code>replications</code>: the number of replicas. Value type: string. Valid values: 1 to 3.</li>
         * <li><code>message.timestamp.type</code>: the timestamp type of a message. Valid values: CreateTime and LogAppendTime. The value CreateTime specifies the timestamp that is specified by the producer when the message is sent. The value LogAppendTime specifies the time when the broker appends the message to its log. If you do not specify this parameter, the time when the message is created on the client is used.</li>
         * <li><code>message.timestamp.difference.max.ms</code>: the maximum positive or negative difference allowed between the timestamp when the broker receives a message and the timestamp specified in the message. If you set message.timestamp.type to CreateTime, <strong>a message is rejected</strong> if the difference in timestamp exceeds the threshold. If you set message.timestamp.type to LogAppendTime, this configuration does not take effect.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
