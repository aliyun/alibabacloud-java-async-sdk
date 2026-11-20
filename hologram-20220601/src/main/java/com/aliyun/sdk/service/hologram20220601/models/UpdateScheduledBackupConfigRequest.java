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
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The number of periodic backups to retain. For example, if you set this parameter to 3, the system automatically retains the latest three backups and deletes other expired backups.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder dataKeepQuantity(Integer dataKeepQuantity) {
            this.putBodyParameter("dataKeepQuantity", dataKeepQuantity);
            this.dataKeepQuantity = dataKeepQuantity;
            return this;
        }

        /**
         * <p>The destination region for backups. This parameter takes effect only for remote backups. You can back up data from the local region to another region to implement cross-region disaster recovery. For example, you can back up an instance in Hangzhou to Beijing.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder dstRegion(String dstRegion) {
            this.putBodyParameter("dstRegion", dstRegion);
            this.dstRegion = dstRegion;
            return this;
        }

        /**
         * <p>Specifies whether to enable periodic backup. Valid values:</p>
         * <ul>
         * <li>true: Periodic backup is enabled.</li>
         * <li>false: Periodic backup is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The start time for backup dates. The backup task starts at this time. The time applies to all valid dates. For example, if week is set to 1,3,5 and hour is set to 20, backups start at 20:00:00 every Monday, Wednesday, and Friday.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder hour(Integer hour) {
            this.putBodyParameter("hour", hour);
            this.hour = hour;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hgprecn-cn-zvp25ysxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The number of manual backups to retain. Manual backups and automatic backups are stored separately, and each has a completely independent data retention policy.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder manualDataKeepQuantity(Integer manualDataKeepQuantity) {
            this.putBodyParameter("manualDataKeepQuantity", manualDataKeepQuantity);
            this.manualDataKeepQuantity = manualDataKeepQuantity;
            return this;
        }

        /**
         * <p>The backup type. You need to configure this field only for remote backups. You can ignore this field for other backup types.</p>
         * 
         * <strong>example:</strong>
         * <p>remote</p>
         */
        public Builder scheduleType(String scheduleType) {
            this.putBodyParameter("scheduleType", scheduleType);
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * <p>The weekly configuration for backup dates. You can specify multiple days separated by commas. For example, to configure Monday, Wednesday, and Friday, set the value to &quot;1,3,5&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>1,3,5</p>
         */
        public Builder week(String week) {
            this.putBodyParameter("week", week);
            this.week = week;
            return this;
        }

        /**
         * <p>The destination zone for backups. This parameter takes effect only for remote backups.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-i</p>
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
