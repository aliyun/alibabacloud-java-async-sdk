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
 * {@link GetKafkaClientIpRequest} extends {@link RequestModel}
 *
 * <p>GetKafkaClientIpRequest</p>
 */
public class GetKafkaClientIpRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Group")
    private String group;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topic")
    private String topic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private GetKafkaClientIpRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.group = builder.group;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
        this.topic = builder.topic;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKafkaClientIpRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetKafkaClientIpRequest, Builder> {
        private Long endTime; 
        private String group; 
        private String instanceId; 
        private String regionId; 
        private Long startTime; 
        private String topic; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetKafkaClientIpRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.group = request.group;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
            this.topic = request.topic;
            this.type = request.type;
        } 

        /**
         * <p>The end of the time range to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1716343502000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the consumer group.</p>
         * <blockquote>
         * <p> This parameter is required only if you set Type to byGroup.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>group_name</p>
         */
        public Builder group(String group) {
            this.putQueryParameter("Group", group);
            this.group = group;
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
         * <p>The ID of the region where the instance is deployed.</p>
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
         * <p>The beginning of the time range to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1716343501000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The topic name.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>This parameter is required only if you set Type to byTopic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>topic_name</p>
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        /**
         * <p>The query method that you want to use to query the client IP addresses. Valid values:</p>
         * <ul>
         * <li>byInstance: queries the IP addresses of the clients that are connected to the instance within a specific period of time.</li>
         * <li>byTopic: queries the IP addresses of the clients that are connected to a specific topic on the instance within a specific period of time.</li>
         * <li>byGroup: queries the IP addresses of the clients that are connected to a specific group on the instance within a specific period of time.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>byInstance</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetKafkaClientIpRequest build() {
            return new GetKafkaClientIpRequest(this);
        } 

    } 

}
