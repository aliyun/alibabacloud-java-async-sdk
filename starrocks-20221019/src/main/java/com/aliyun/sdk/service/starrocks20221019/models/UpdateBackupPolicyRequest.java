// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link UpdateBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateBackupPolicyRequest</p>
 */
public class UpdateBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExpireDays")
    private Integer expireDays;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Hour")
    @com.aliyun.core.annotation.Validation(maximum = 23)
    private Integer hour;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Minute")
    @com.aliyun.core.annotation.Validation(maximum = 59)
    private Integer minute;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private String policyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecurrenceValues")
    private java.util.List<Integer> recurrenceValues;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeoutSeconds")
    private Integer timeoutSeconds;

    private UpdateBackupPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.expireDays = builder.expireDays;
        this.hour = builder.hour;
        this.instanceId = builder.instanceId;
        this.minute = builder.minute;
        this.policyId = builder.policyId;
        this.recurrenceValues = builder.recurrenceValues;
        this.timeoutSeconds = builder.timeoutSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBackupPolicyRequest create() {
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
     * @return expireDays
     */
    public Integer getExpireDays() {
        return this.expireDays;
    }

    /**
     * @return hour
     */
    public Integer getHour() {
        return this.hour;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return minute
     */
    public Integer getMinute() {
        return this.minute;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return recurrenceValues
     */
    public java.util.List<Integer> getRecurrenceValues() {
        return this.recurrenceValues;
    }

    /**
     * @return timeoutSeconds
     */
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public static final class Builder extends Request.Builder<UpdateBackupPolicyRequest, Builder> {
        private String regionId; 
        private Integer expireDays; 
        private Integer hour; 
        private String instanceId; 
        private Integer minute; 
        private String policyId; 
        private java.util.List<Integer> recurrenceValues; 
        private Integer timeoutSeconds; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBackupPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.expireDays = request.expireDays;
            this.hour = request.hour;
            this.instanceId = request.instanceId;
            this.minute = request.minute;
            this.policyId = request.policyId;
            this.recurrenceValues = request.recurrenceValues;
            this.timeoutSeconds = request.timeoutSeconds;
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
         * ExpireDays.
         */
        public Builder expireDays(Integer expireDays) {
            this.putBodyParameter("ExpireDays", expireDays);
            this.expireDays = expireDays;
            return this;
        }

        /**
         * Hour.
         */
        public Builder hour(Integer hour) {
            this.putBodyParameter("Hour", hour);
            this.hour = hour;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Minute.
         */
        public Builder minute(Integer minute) {
            this.putBodyParameter("Minute", minute);
            this.minute = minute;
            return this;
        }

        /**
         * PolicyId.
         */
        public Builder policyId(String policyId) {
            this.putBodyParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * RecurrenceValues.
         */
        public Builder recurrenceValues(java.util.List<Integer> recurrenceValues) {
            this.putBodyParameter("RecurrenceValues", recurrenceValues);
            this.recurrenceValues = recurrenceValues;
            return this;
        }

        /**
         * TimeoutSeconds.
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            this.putBodyParameter("TimeoutSeconds", timeoutSeconds);
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        @Override
        public UpdateBackupPolicyRequest build() {
            return new UpdateBackupPolicyRequest(this);
        } 

    } 

}
