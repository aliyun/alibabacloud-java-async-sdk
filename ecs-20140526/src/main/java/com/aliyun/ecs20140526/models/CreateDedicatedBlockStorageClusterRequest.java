// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDedicatedBlockStorageClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateDedicatedBlockStorageClusterRequest</p>
 */
public class CreateDedicatedBlockStorageClusterRequest extends Request {
    @Query
    @NameInMap("FromApp")
    private String fromApp;

    @Query
    @NameInMap("DedicatedBlockStorageClusterName")
    private String dedicatedBlockStorageClusterName;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("Capacity")
    private Integer capacity;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("Period")
    private Integer period;

    private CreateDedicatedBlockStorageClusterRequest(Builder builder) {
        super(builder);
        this.fromApp = builder.fromApp;
        this.dedicatedBlockStorageClusterName = builder.dedicatedBlockStorageClusterName;
        this.zoneId = builder.zoneId;
        this.category = builder.category;
        this.capacity = builder.capacity;
        this.description = builder.description;
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
        this.periodUnit = builder.periodUnit;
        this.type = builder.type;
        this.period = builder.period;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDedicatedBlockStorageClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fromApp
     */
    public String getFromApp() {
        return this.fromApp;
    }

    /**
     * @return dedicatedBlockStorageClusterName
     */
    public String getDedicatedBlockStorageClusterName() {
        return this.dedicatedBlockStorageClusterName;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return capacity
     */
    public Integer getCapacity() {
        return this.capacity;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    public static final class Builder extends Request.Builder<CreateDedicatedBlockStorageClusterRequest, Builder> {
        private String fromApp; 
        private String dedicatedBlockStorageClusterName; 
        private String zoneId; 
        private String category; 
        private Integer capacity; 
        private String description; 
        private String clientToken; 
        private String regionId; 
        private String periodUnit; 
        private String type; 
        private Integer period; 

        private Builder() {
            super();
        } 

        private Builder(CreateDedicatedBlockStorageClusterRequest response) {
            super(response);
            this.fromApp = response.fromApp;
            this.dedicatedBlockStorageClusterName = response.dedicatedBlockStorageClusterName;
            this.zoneId = response.zoneId;
            this.category = response.category;
            this.capacity = response.capacity;
            this.description = response.description;
            this.clientToken = response.clientToken;
            this.regionId = response.regionId;
            this.periodUnit = response.periodUnit;
            this.type = response.type;
            this.period = response.period;
        } 

        /**
         * FromApp.
         */
        public Builder fromApp(String fromApp) {
            this.putQueryParameter("FromApp", fromApp);
            this.fromApp = fromApp;
            return this;
        }

        /**
         * The name of the dedicated block storage cluster.
         */
        public Builder dedicatedBlockStorageClusterName(String dedicatedBlockStorageClusterName) {
            this.putQueryParameter("DedicatedBlockStorageClusterName", dedicatedBlockStorageClusterName);
            this.dedicatedBlockStorageClusterName = dedicatedBlockStorageClusterName;
            return this;
        }

        /**
         * The ID of the zone to which the cluster belongs. You can call [DescribeZones](~~ 25610 ~~) to obtain the list of zones.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The type of cloud disk that can be created in the exclusive block storage cluster.
         * <p>
         * 
         * The value can only be cloud_essd, that is, ESSD.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The capacity of the dedicated cluster. Valid values: 60 to 2304. Unit: TiB.
         */
        public Builder capacity(Integer capacity) {
            this.putQueryParameter("Capacity", capacity);
            this.capacity = capacity;
            return this;
        }

        /**
         * The description of the dedicated block storage cluster.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests.
         * <p>
         * 
         * "ClientToken" only supports ASCII characters and cannot exceed 64 characters in length. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Clusters belong geo ID. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The duration of the cluster. Unit. Valid values:
         * <p>
         * 
         * -Year: Year
         * 
         * -Month: Month
         * 
         * > Exclusive block storage clusters only support the subscription billing method. Therefore, you must set the **and** duncles parameters.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The performance type of the cluster. Valid values:
         * <p>
         * 
         * -Standard: Basic. ESSD PL0 disks can be created in exclusive block storage clusters of this type.
         * -Premium: performance type. ESSD PL1 cloud disks can be created in exclusive block storage clusters of this type.
         * 
         * Default value: Premium
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Buy cluster length, unit by "periodunit" specified. Valid values:
         * <p>
         * 
         * -When "PeriodUnit = Year", the value range of this parameter is {"1", "2", "3", "4"}.
         * 
         * -When "PeriodUnit = Month", the value range of this parameter is {"6", "7", "8", "9", "10", "11"}.
         * 
         * > Exclusive block storage cluster support only annual commitment monthly ways of paying for, you must set "period" and "periodunit" parameters.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        @Override
        public CreateDedicatedBlockStorageClusterRequest build() {
            return new CreateDedicatedBlockStorageClusterRequest(this);
        } 

    } 

}
