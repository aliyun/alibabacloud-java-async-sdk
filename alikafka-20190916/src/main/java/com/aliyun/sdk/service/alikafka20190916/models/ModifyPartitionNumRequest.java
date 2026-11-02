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
 * {@link ModifyPartitionNumRequest} extends {@link RequestModel}
 *
 * <p>ModifyPartitionNumRequest</p>
 */
public class ModifyPartitionNumRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddPartitionNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer addPartitionNum;

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

    private ModifyPartitionNumRequest(Builder builder) {
        super(builder);
        this.addPartitionNum = builder.addPartitionNum;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPartitionNumRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addPartitionNum
     */
    public Integer getAddPartitionNum() {
        return this.addPartitionNum;
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

    public static final class Builder extends Request.Builder<ModifyPartitionNumRequest, Builder> {
        private Integer addPartitionNum; 
        private String instanceId; 
        private String regionId; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPartitionNumRequest request) {
            super(request);
            this.addPartitionNum = request.addPartitionNum;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.topic = request.topic;
        } 

        /**
         * <p>The number of partitions to add.</p>
         * <ul>
         * <li><p>The value must be greater than 0.</p>
         * </li>
         * <li><p>Set the value to a multiple of 6 to reduce the risk of data skew.</p>
         * </li>
         * <li><p>The total number of partitions must be between 1 and 360.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder addPartitionNum(Integer addPartitionNum) {
            this.putQueryParameter("AddPartitionNum", addPartitionNum);
            this.addPartitionNum = addPartitionNum;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_post-cn-0pp1l9z****</p>
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
         * <p>TopicPartitionNum</p>
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public ModifyPartitionNumRequest build() {
            return new ModifyPartitionNumRequest(this);
        } 

    } 

}
