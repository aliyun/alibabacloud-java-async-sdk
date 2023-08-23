// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlarmsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlarmsRequest</p>
 */
public class DescribeAlarmsRequest extends Request {
    @Query
    @NameInMap("AlarmTaskId")
    private String alarmTaskId;

    @Query
    @NameInMap("IsEnable")
    private Boolean isEnable;

    @Query
    @NameInMap("MetricName")
    private String metricName;

    @Query
    @NameInMap("MetricType")
    private String metricType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 50)
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ScalingGroupId")
    private String scalingGroupId;

    @Query
    @NameInMap("State")
    private String state;

    private DescribeAlarmsRequest(Builder builder) {
        super(builder);
        this.alarmTaskId = builder.alarmTaskId;
        this.isEnable = builder.isEnable;
        this.metricName = builder.metricName;
        this.metricType = builder.metricType;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlarmsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmTaskId
     */
    public String getAlarmTaskId() {
        return this.alarmTaskId;
    }

    /**
     * @return isEnable
     */
    public Boolean getIsEnable() {
        return this.isEnable;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<DescribeAlarmsRequest, Builder> {
        private String alarmTaskId; 
        private Boolean isEnable; 
        private String metricName; 
        private String metricType; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlarmsRequest request) {
            super(request);
            this.alarmTaskId = request.alarmTaskId;
            this.isEnable = request.isEnable;
            this.metricName = request.metricName;
            this.metricType = request.metricType;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupId = request.scalingGroupId;
            this.state = request.state;
        } 

        /**
         * AlarmTaskId.
         */
        public Builder alarmTaskId(String alarmTaskId) {
            this.putQueryParameter("AlarmTaskId", alarmTaskId);
            this.alarmTaskId = alarmTaskId;
            return this;
        }

        /**
         * IsEnable.
         */
        public Builder isEnable(Boolean isEnable) {
            this.putQueryParameter("IsEnable", isEnable);
            this.isEnable = isEnable;
            return this;
        }

        /**
         * MetricName.
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * MetricType.
         */
        public Builder metricType(String metricType) {
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ScalingGroupId.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public DescribeAlarmsRequest build() {
            return new DescribeAlarmsRequest(this);
        } 

    } 

}
