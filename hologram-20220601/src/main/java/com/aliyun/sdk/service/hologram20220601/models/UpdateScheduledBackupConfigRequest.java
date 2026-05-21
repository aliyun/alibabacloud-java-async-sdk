// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link UpdateScheduledBackupConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateScheduledBackupConfigRequest</p>
 */
public class UpdateScheduledBackupConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataKeepQuantity")
    private Integer dataKeepQuantity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dstRegion")
    private String dstRegion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hour")
    private Integer hour;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("manualDataKeepQuantity")
    private Integer manualDataKeepQuantity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scheduleType")
    private String scheduleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("week")
    private String week;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("zoneId")
    private String zoneId;

    private UpdateScheduledBackupConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataKeepQuantity = builder.dataKeepQuantity;
        this.dstRegion = builder.dstRegion;
        this.enabled = builder.enabled;
        this.hour = builder.hour;
        this.instanceId = builder.instanceId;
        this.manualDataKeepQuantity = builder.manualDataKeepQuantity;
        this.scheduleType = builder.scheduleType;
        this.week = builder.week;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateScheduledBackupConfigRequest create() {
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
     * @return dataKeepQuantity
     */
    public Integer getDataKeepQuantity() {
        return this.dataKeepQuantity;
    }

    /**
     * @return dstRegion
     */
    public String getDstRegion() {
        return this.dstRegion;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
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
     * @return manualDataKeepQuantity
     */
    public Integer getManualDataKeepQuantity() {
        return this.manualDataKeepQuantity;
    }

    /**
     * @return scheduleType
     */
    public String getScheduleType() {
        return this.scheduleType;
    }

    /**
     * @return week
     */
    public String getWeek() {
        return this.week;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<UpdateScheduledBackupConfigRequest, Builder> {
        private String regionId; 
        private Integer dataKeepQuantity; 
        private String dstRegion; 
        private Boolean enabled; 
        private Integer hour; 
        private String instanceId; 
        private Integer manualDataKeepQuantity; 
        private String scheduleType; 
        private String week; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateScheduledBackupConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataKeepQuantity = request.dataKeepQuantity;
            this.dstRegion = request.dstRegion;
            this.enabled = request.enabled;
            this.hour = request.hour;
            this.instanceId = request.instanceId;
            this.manualDataKeepQuantity = request.manualDataKeepQuantity;
            this.scheduleType = request.scheduleType;
            this.week = request.week;
            this.zoneId = request.zoneId;
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
         * dataKeepQuantity.
         */
        public Builder dataKeepQuantity(Integer dataKeepQuantity) {
            this.putBodyParameter("dataKeepQuantity", dataKeepQuantity);
            this.dataKeepQuantity = dataKeepQuantity;
            return this;
        }

        /**
         * dstRegion.
         */
        public Builder dstRegion(String dstRegion) {
            this.putBodyParameter("dstRegion", dstRegion);
            this.dstRegion = dstRegion;
            return this;
        }

        /**
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * hour.
         */
        public Builder hour(Integer hour) {
            this.putBodyParameter("hour", hour);
            this.hour = hour;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * manualDataKeepQuantity.
         */
        public Builder manualDataKeepQuantity(Integer manualDataKeepQuantity) {
            this.putBodyParameter("manualDataKeepQuantity", manualDataKeepQuantity);
            this.manualDataKeepQuantity = manualDataKeepQuantity;
            return this;
        }

        /**
         * scheduleType.
         */
        public Builder scheduleType(String scheduleType) {
            this.putBodyParameter("scheduleType", scheduleType);
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * week.
         */
        public Builder week(String week) {
            this.putBodyParameter("week", week);
            this.week = week;
            return this;
        }

        /**
         * zoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("zoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public UpdateScheduledBackupConfigRequest build() {
            return new UpdateScheduledBackupConfigRequest(this);
        } 

    } 

}
