// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePriceForCreateDesktopOversoldGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribePriceForCreateDesktopOversoldGroupRequest</p>
 */
public class DescribePriceForCreateDesktopOversoldGroupRequest extends Request {
    @Query
    @NameInMap("ConcurrenceCount")
    private Integer concurrenceCount;

    @Query
    @NameInMap("DataDiskSize")
    private Integer dataDiskSize;

    @Query
    @NameInMap("DesktopType")
    private String desktopType;

    @Query
    @NameInMap("OversoldUserCount")
    private Integer oversoldUserCount;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("SystemDiskSize")
    private Integer systemDiskSize;

    private DescribePriceForCreateDesktopOversoldGroupRequest(Builder builder) {
        super(builder);
        this.concurrenceCount = builder.concurrenceCount;
        this.dataDiskSize = builder.dataDiskSize;
        this.desktopType = builder.desktopType;
        this.oversoldUserCount = builder.oversoldUserCount;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.systemDiskSize = builder.systemDiskSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePriceForCreateDesktopOversoldGroupRequest create() {
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
     * @return desktopType
     */
    public String getDesktopType() {
        return this.desktopType;
    }

    /**
     * @return oversoldUserCount
     */
    public Integer getOversoldUserCount() {
        return this.oversoldUserCount;
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
     * @return systemDiskSize
     */
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public static final class Builder extends Request.Builder<DescribePriceForCreateDesktopOversoldGroupRequest, Builder> {
        private Integer concurrenceCount; 
        private Integer dataDiskSize; 
        private String desktopType; 
        private Integer oversoldUserCount; 
        private Integer period; 
        private String periodUnit; 
        private Integer systemDiskSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribePriceForCreateDesktopOversoldGroupRequest request) {
            super(request);
            this.concurrenceCount = request.concurrenceCount;
            this.dataDiskSize = request.dataDiskSize;
            this.desktopType = request.desktopType;
            this.oversoldUserCount = request.oversoldUserCount;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
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
         * DesktopType.
         */
        public Builder desktopType(String desktopType) {
            this.putQueryParameter("DesktopType", desktopType);
            this.desktopType = desktopType;
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
         * SystemDiskSize.
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putQueryParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        @Override
        public DescribePriceForCreateDesktopOversoldGroupRequest build() {
            return new DescribePriceForCreateDesktopOversoldGroupRequest(this);
        } 

    } 

}
