// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link UpdateEventStreamingBusinessOptionRequest} extends {@link RequestModel}
 *
 * <p>UpdateEventStreamingBusinessOptionRequest</p>
 */
public class UpdateEventStreamingBusinessOptionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventStreamingName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 255, minLength = 2)
    private String eventStreamingName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxCapacityUnitCount")
    private Long maxCapacityUnitCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MinCapacityUnitCount")
    private Long minCapacityUnitCount;

    private UpdateEventStreamingBusinessOptionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.businessMode = builder.businessMode;
        this.eventStreamingName = builder.eventStreamingName;
        this.maxCapacityUnitCount = builder.maxCapacityUnitCount;
        this.minCapacityUnitCount = builder.minCapacityUnitCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEventStreamingBusinessOptionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return businessMode
     */
    public String getBusinessMode() {
        return this.businessMode;
    }

    /**
     * @return eventStreamingName
     */
    public String getEventStreamingName() {
        return this.eventStreamingName;
    }

    /**
     * @return maxCapacityUnitCount
     */
    public Long getMaxCapacityUnitCount() {
        return this.maxCapacityUnitCount;
    }

    /**
     * @return minCapacityUnitCount
     */
    public Long getMinCapacityUnitCount() {
        return this.minCapacityUnitCount;
    }

    public static final class Builder extends Request.Builder<UpdateEventStreamingBusinessOptionRequest, Builder> {
        private String regionId; 
        private String businessMode; 
        private String eventStreamingName; 
        private Long maxCapacityUnitCount; 
        private Long minCapacityUnitCount; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEventStreamingBusinessOptionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.businessMode = request.businessMode;
            this.eventStreamingName = request.eventStreamingName;
            this.maxCapacityUnitCount = request.maxCapacityUnitCount;
            this.minCapacityUnitCount = request.minCapacityUnitCount;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder businessMode(String businessMode) {
            this.putBodyParameter("BusinessMode", businessMode);
            this.businessMode = businessMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rocketmq-sync</p>
         */
        public Builder eventStreamingName(String eventStreamingName) {
            this.putBodyParameter("EventStreamingName", eventStreamingName);
            this.eventStreamingName = eventStreamingName;
            return this;
        }

        /**
         * MaxCapacityUnitCount.
         */
        public Builder maxCapacityUnitCount(Long maxCapacityUnitCount) {
            this.putBodyParameter("MaxCapacityUnitCount", maxCapacityUnitCount);
            this.maxCapacityUnitCount = maxCapacityUnitCount;
            return this;
        }

        /**
         * MinCapacityUnitCount.
         */
        public Builder minCapacityUnitCount(Long minCapacityUnitCount) {
            this.putBodyParameter("MinCapacityUnitCount", minCapacityUnitCount);
            this.minCapacityUnitCount = minCapacityUnitCount;
            return this;
        }

        @Override
        public UpdateEventStreamingBusinessOptionRequest build() {
            return new UpdateEventStreamingBusinessOptionRequest(this);
        } 

    } 

}
