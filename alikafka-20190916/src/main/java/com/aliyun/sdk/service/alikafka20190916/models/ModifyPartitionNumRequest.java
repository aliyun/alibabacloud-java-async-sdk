// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPartitionNumRequest} extends {@link RequestModel}
 *
 * <p>ModifyPartitionNumRequest</p>
 */
public class ModifyPartitionNumRequest extends Request {
    @Query
    @NameInMap("AddPartitionNum")
    @Validation(required = true)
    private Integer addPartitionNum;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Topic")
    @Validation(required = true)
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

        private Builder(ModifyPartitionNumRequest response) {
            super(response);
            this.addPartitionNum = response.addPartitionNum;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.topic = response.topic;
        } 

        /**
         * AddPartitionNum.
         */
        public Builder addPartitionNum(Integer addPartitionNum) {
            this.putQueryParameter("AddPartitionNum", addPartitionNum);
            this.addPartitionNum = addPartitionNum;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Topic.
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
