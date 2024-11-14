// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EnableAutoTopicCreationRequest} extends {@link RequestModel}
 *
 * <p>EnableAutoTopicCreationRequest</p>
 */
public class EnableAutoTopicCreationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PartitionNum")
    private Long partitionNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private EnableAutoTopicCreationRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.operate = builder.operate;
        this.partitionNum = builder.partitionNum;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableAutoTopicCreationRequest create() {
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
     * @return operate
     */
    public String getOperate() {
        return this.operate;
    }

    /**
     * @return partitionNum
     */
    public Long getPartitionNum() {
        return this.partitionNum;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<EnableAutoTopicCreationRequest, Builder> {
        private String instanceId; 
        private String operate; 
        private Long partitionNum; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(EnableAutoTopicCreationRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.operate = request.operate;
            this.partitionNum = request.partitionNum;
            this.regionId = request.regionId;
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
         * <p>The operation that you want to perform. Valid values:</p>
         * <ul>
         * <li>enable: enables the automatic topic creation feature.</li>
         * <li>disable: disables the automatic topic creation feature.</li>
         * <li>updatePartition: changes the number of partitions in topics that are automatically created.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder operate(String operate) {
            this.putQueryParameter("Operate", operate);
            this.operate = operate;
            return this;
        }

        /**
         * <p>The changed number of partitions in topics that are automatically created.</p>
         * <p>This parameter takes effect only if you set Operate to updatePartition.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder partitionNum(Long partitionNum) {
            this.putQueryParameter("PartitionNum", partitionNum);
            this.partitionNum = partitionNum;
            return this;
        }

        /**
         * <p>The region ID.</p>
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

        @Override
        public EnableAutoTopicCreationRequest build() {
            return new EnableAutoTopicCreationRequest(this);
        } 

    } 

}
