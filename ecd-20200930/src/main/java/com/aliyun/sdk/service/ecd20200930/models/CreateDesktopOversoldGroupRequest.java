// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDesktopOversoldGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateDesktopOversoldGroupRequest</p>
 */
public class CreateDesktopOversoldGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConcurrenceCount")
    private Integer concurrenceCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDiskSize")
    private Integer dataDiskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopType")
    private String desktopType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdleDisconnectDuration")
    private Long idleDisconnectDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeepDuration")
    private Integer keepDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OversoldUserCount")
    private Integer oversoldUserCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OversoldWarn")
    private Integer oversoldWarn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    private String policyGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StopDuration")
    private Integer stopDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
    private Integer systemDiskSize;

    private CreateDesktopOversoldGroupRequest(Builder builder) {
        super(builder);
        this.concurrenceCount = builder.concurrenceCount;
        this.dataDiskSize = builder.dataDiskSize;
        this.description = builder.description;
        this.desktopType = builder.desktopType;
        this.directoryId = builder.directoryId;
        this.idleDisconnectDuration = builder.idleDisconnectDuration;
        this.imageId = builder.imageId;
        this.keepDuration = builder.keepDuration;
        this.name = builder.name;
        this.oversoldUserCount = builder.oversoldUserCount;
        this.oversoldWarn = builder.oversoldWarn;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.policyGroupId = builder.policyGroupId;
        this.stopDuration = builder.stopDuration;
        this.systemDiskSize = builder.systemDiskSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDesktopOversoldGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return concurrenceCount
     */
    public Integer getConcurrenceCount() {
        return this.concurrenceCount;
    }

    /**
     * @return dataDiskSize
     */
    public Integer getDataDiskSize() {
        return this.dataDiskSize;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return desktopType
     */
    public String getDesktopType() {
        return this.desktopType;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return idleDisconnectDuration
     */
    public Long getIdleDisconnectDuration() {
        return this.idleDisconnectDuration;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return keepDuration
     */
    public Integer getKeepDuration() {
        return this.keepDuration;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return oversoldUserCount
     */
    public Integer getOversoldUserCount() {
        return this.oversoldUserCount;
    }

    /**
     * @return oversoldWarn
     */
    public Integer getOversoldWarn() {
        return this.oversoldWarn;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    /**
     * @return stopDuration
     */
    public Integer getStopDuration() {
        return this.stopDuration;
    }

    /**
     * @return systemDiskSize
     */
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public static final class Builder extends Request.Builder<CreateDesktopOversoldGroupRequest, Builder> {
        private Integer concurrenceCount; 
        private Integer dataDiskSize; 
        private String description; 
        private String desktopType; 
        private String directoryId; 
        private Long idleDisconnectDuration; 
        private String imageId; 
        private Integer keepDuration; 
        private String name; 
        private Integer oversoldUserCount; 
        private Integer oversoldWarn; 
        private Integer period; 
        private String periodUnit; 
        private String policyGroupId; 
        private Integer stopDuration; 
        private Integer systemDiskSize; 

        private Builder() {
            super();
        } 

        private Builder(CreateDesktopOversoldGroupRequest request) {
            super(request);
            this.concurrenceCount = request.concurrenceCount;
            this.dataDiskSize = request.dataDiskSize;
            this.description = request.description;
            this.desktopType = request.desktopType;
            this.directoryId = request.directoryId;
            this.idleDisconnectDuration = request.idleDisconnectDuration;
            this.imageId = request.imageId;
            this.keepDuration = request.keepDuration;
            this.name = request.name;
            this.oversoldUserCount = request.oversoldUserCount;
            this.oversoldWarn = request.oversoldWarn;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.policyGroupId = request.policyGroupId;
            this.stopDuration = request.stopDuration;
            this.systemDiskSize = request.systemDiskSize;
        } 

        /**
         * ConcurrenceCount.
         */
        public Builder concurrenceCount(Integer concurrenceCount) {
            this.putQueryParameter("ConcurrenceCount", concurrenceCount);
            this.concurrenceCount = concurrenceCount;
            return this;
        }

        /**
         * DataDiskSize.
         */
        public Builder dataDiskSize(Integer dataDiskSize) {
            this.putQueryParameter("DataDiskSize", dataDiskSize);
            this.dataDiskSize = dataDiskSize;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DesktopType.
         */
        public Builder desktopType(String desktopType) {
            this.putQueryParameter("DesktopType", desktopType);
            this.desktopType = desktopType;
            return this;
        }

        /**
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * IdleDisconnectDuration.
         */
        public Builder idleDisconnectDuration(Long idleDisconnectDuration) {
            this.putQueryParameter("IdleDisconnectDuration", idleDisconnectDuration);
            this.idleDisconnectDuration = idleDisconnectDuration;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * KeepDuration.
         */
        public Builder keepDuration(Integer keepDuration) {
            this.putQueryParameter("KeepDuration", keepDuration);
            this.keepDuration = keepDuration;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OversoldUserCount.
         */
        public Builder oversoldUserCount(Integer oversoldUserCount) {
            this.putQueryParameter("OversoldUserCount", oversoldUserCount);
            this.oversoldUserCount = oversoldUserCount;
            return this;
        }

        /**
         * OversoldWarn.
         */
        public Builder oversoldWarn(Integer oversoldWarn) {
            this.putQueryParameter("OversoldWarn", oversoldWarn);
            this.oversoldWarn = oversoldWarn;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PeriodUnit.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * PolicyGroupId.
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * StopDuration.
         */
        public Builder stopDuration(Integer stopDuration) {
            this.putQueryParameter("StopDuration", stopDuration);
            this.stopDuration = stopDuration;
            return this;
        }

        /**
         * SystemDiskSize.
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putQueryParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        @Override
        public CreateDesktopOversoldGroupRequest build() {
            return new CreateDesktopOversoldGroupRequest(this);
        } 

    } 

}
