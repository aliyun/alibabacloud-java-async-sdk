// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDesktopOversoldGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateDesktopOversoldGroupRequest</p>
 */
public class CreateDesktopOversoldGroupRequest extends Request {
    @Query
    @NameInMap("ConcurrenceCount")
    private Integer concurrenceCount;

    @Query
    @NameInMap("DataDiskSize")
    private Integer dataDiskSize;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DesktopType")
    private String desktopType;

    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OversoldUserCount")
    private Integer oversoldUserCount;

    @Query
    @NameInMap("OversoldWarn")
    private Integer oversoldWarn;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("PolicyGroupId")
    private String policyGroupId;

    @Query
    @NameInMap("StopDuration")
    private Integer stopDuration;

    @Query
    @NameInMap("SystemDiskSize")
    private Integer systemDiskSize;

    private CreateDesktopOversoldGroupRequest(Builder builder) {
        super(builder);
        this.concurrenceCount = builder.concurrenceCount;
        this.dataDiskSize = builder.dataDiskSize;
        this.description = builder.description;
        this.desktopType = builder.desktopType;
        this.directoryId = builder.directoryId;
        this.imageId = builder.imageId;
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
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
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
        private String imageId; 
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
            this.imageId = request.imageId;
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
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
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
