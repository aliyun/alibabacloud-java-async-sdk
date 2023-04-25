// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConsumerOffsetRequest} extends {@link RequestModel}
 *
 * <p>UpdateConsumerOffsetRequest</p>
 */
public class UpdateConsumerOffsetRequest extends Request {
    @Query
    @NameInMap("ConsumerId")
    @Validation(required = true)
    private String consumerId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Offsets")
    private java.util.List < Offsets> offsets;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResetType")
    private String resetType;

    @Query
    @NameInMap("Time")
    @Validation(required = true)
    private String time;

    @Query
    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    private UpdateConsumerOffsetRequest(Builder builder) {
        super(builder);
        this.consumerId = builder.consumerId;
        this.instanceId = builder.instanceId;
        this.offsets = builder.offsets;
        this.regionId = builder.regionId;
        this.resetType = builder.resetType;
        this.time = builder.time;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConsumerOffsetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerId
     */
    public String getConsumerId() {
        return this.consumerId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return offsets
     */
    public java.util.List < Offsets> getOffsets() {
        return this.offsets;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resetType
     */
    public String getResetType() {
        return this.resetType;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<UpdateConsumerOffsetRequest, Builder> {
        private String consumerId; 
        private String instanceId; 
        private java.util.List < Offsets> offsets; 
        private String regionId; 
        private String resetType; 
        private String time; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConsumerOffsetRequest request) {
            super(request);
            this.consumerId = request.consumerId;
            this.instanceId = request.instanceId;
            this.offsets = request.offsets;
            this.regionId = request.regionId;
            this.resetType = request.resetType;
            this.time = request.time;
            this.topic = request.topic;
        } 

        /**
         * ConsumerId.
         */
        public Builder consumerId(String consumerId) {
            this.putQueryParameter("ConsumerId", consumerId);
            this.consumerId = consumerId;
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
         * Offsets.
         */
        public Builder offsets(java.util.List < Offsets> offsets) {
            String offsetsShrink = shrink(offsets, "Offsets", "json");
            this.putQueryParameter("Offsets", offsetsShrink);
            this.offsets = offsets;
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
         * ResetType.
         */
        public Builder resetType(String resetType) {
            this.putQueryParameter("ResetType", resetType);
            this.resetType = resetType;
            return this;
        }

        /**
         * Time.
         */
        public Builder time(String time) {
            this.putQueryParameter("Time", time);
            this.time = time;
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
        public UpdateConsumerOffsetRequest build() {
            return new UpdateConsumerOffsetRequest(this);
        } 

    } 

    public static class Offsets extends TeaModel {
        @NameInMap("Offset")
        private Long offset;

        @NameInMap("Partition")
        private Integer partition;

        private Offsets(Builder builder) {
            this.offset = builder.offset;
            this.partition = builder.partition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Offsets create() {
            return builder().build();
        }

        /**
         * @return offset
         */
        public Long getOffset() {
            return this.offset;
        }

        /**
         * @return partition
         */
        public Integer getPartition() {
            return this.partition;
        }

        public static final class Builder {
            private Long offset; 
            private Integer partition; 

            /**
             * Offset.
             */
            public Builder offset(Long offset) {
                this.offset = offset;
                return this;
            }

            /**
             * Partition.
             */
            public Builder partition(Integer partition) {
                this.partition = partition;
                return this;
            }

            public Offsets build() {
                return new Offsets(this);
            } 

        } 

    }
}
