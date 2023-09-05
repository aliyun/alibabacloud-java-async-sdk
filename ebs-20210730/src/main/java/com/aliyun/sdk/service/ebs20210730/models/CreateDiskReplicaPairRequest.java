// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiskReplicaPairRequest} extends {@link RequestModel}
 *
 * <p>CreateDiskReplicaPairRequest</p>
 */
public class CreateDiskReplicaPairRequest extends Request {
    @Query
    @NameInMap("Bandwidth")
    private Long bandwidth;

    @Query
    @NameInMap("ChargeType")
    private String chargeType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DestinationDiskId")
    @Validation(required = true)
    private String destinationDiskId;

    @Query
    @NameInMap("DestinationRegionId")
    @Validation(required = true)
    private String destinationRegionId;

    @Query
    @NameInMap("DestinationZoneId")
    @Validation(required = true)
    private String destinationZoneId;

    @Query
    @NameInMap("DiskId")
    @Validation(required = true)
    private String diskId;

    @Query
    @NameInMap("PairName")
    private String pairName;

    @Query
    @NameInMap("Period")
    private Long period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("RPO")
    private Long RPO;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SourceZoneId")
    @Validation(required = true)
    private String sourceZoneId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private CreateDiskReplicaPairRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.chargeType = builder.chargeType;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.destinationDiskId = builder.destinationDiskId;
        this.destinationRegionId = builder.destinationRegionId;
        this.destinationZoneId = builder.destinationZoneId;
        this.diskId = builder.diskId;
        this.pairName = builder.pairName;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.RPO = builder.RPO;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceZoneId = builder.sourceZoneId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiskReplicaPairRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Long getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destinationDiskId
     */
    public String getDestinationDiskId() {
        return this.destinationDiskId;
    }

    /**
     * @return destinationRegionId
     */
    public String getDestinationRegionId() {
        return this.destinationRegionId;
    }

    /**
     * @return destinationZoneId
     */
    public String getDestinationZoneId() {
        return this.destinationZoneId;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return pairName
     */
    public String getPairName() {
        return this.pairName;
    }

    /**
     * @return period
     */
    public Long getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return RPO
     */
    public Long getRPO() {
        return this.RPO;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sourceZoneId
     */
    public String getSourceZoneId() {
        return this.sourceZoneId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateDiskReplicaPairRequest, Builder> {
        private Long bandwidth; 
        private String chargeType; 
        private String clientToken; 
        private String description; 
        private String destinationDiskId; 
        private String destinationRegionId; 
        private String destinationZoneId; 
        private String diskId; 
        private String pairName; 
        private Long period; 
        private String periodUnit; 
        private Long RPO; 
        private String regionId; 
        private String resourceGroupId; 
        private String sourceZoneId; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateDiskReplicaPairRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.chargeType = request.chargeType;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.destinationDiskId = request.destinationDiskId;
            this.destinationRegionId = request.destinationRegionId;
            this.destinationZoneId = request.destinationZoneId;
            this.diskId = request.diskId;
            this.pairName = request.pairName;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.RPO = request.RPO;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.sourceZoneId = request.sourceZoneId;
            this.tag = request.tag;
        } 

        /**
         * The bandwidth to use to asynchronously replicate data between the primary disk and secondary disk. Unit: Kbit/s. Valid values:
         * <p>
         * 
         * *   10240 : equal to 10 Mbit/s
         * *   20480 : equal to 20 Mbit/s
         * *   51200 : equal to 50 Mbit/s
         * *   102400 : equal to 100 Mbit/s
         * 
         * Default value: 10240.
         * 
         * When you set the ChargeType parameter to POSTPAY, the Bandwidth parameter is automatically set to 0 and cannot be modified. The value 0 indicates that bandwidth is dynamically allocated based on the volume of data that is asynchronously replicated from the primary disk to the secondary disk.
         */
        public Builder bandwidth(Long bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The billing method of the replication pair. Valid values:
         * <p>
         * 
         * *   PREPAY: subscription
         * *   POSTPAY: pay-as-you-go
         * 
         * Default value: POSTPAY.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the replication pair. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the secondary disk.
         */
        public Builder destinationDiskId(String destinationDiskId) {
            this.putQueryParameter("DestinationDiskId", destinationDiskId);
            this.destinationDiskId = destinationDiskId;
            return this;
        }

        /**
         * The region ID of the secondary disk. You can call the [DescribeRegions](~~354276~~) operation to query the most recent list of regions in which async replication is supported.
         */
        public Builder destinationRegionId(String destinationRegionId) {
            this.putQueryParameter("DestinationRegionId", destinationRegionId);
            this.destinationRegionId = destinationRegionId;
            return this;
        }

        /**
         * The zone ID of the secondary disk.
         */
        public Builder destinationZoneId(String destinationZoneId) {
            this.putQueryParameter("DestinationZoneId", destinationZoneId);
            this.destinationZoneId = destinationZoneId;
            return this;
        }

        /**
         * The ID of the primary disk.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * The name of the replication pair. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-).
         */
        public Builder pairName(String pairName) {
            this.putQueryParameter("PairName", pairName);
            this.pairName = pairName;
            return this;
        }

        /**
         * The subscription duration of the replication pair. This parameter is required when the `ChargeType` parameter is set to PREPAY. The unit of the subscription duration is specified by the `PeriodUnit` parameter.
         * <p>
         * 
         * *   Valid values when the `PeriodUnit` parameter is set to Week: 1, 2, 3, and 4.
         * *   Valid values when the `PeriodUnit` parameter is set to Month: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.
         */
        public Builder period(Long period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The unit of the subscription duration of the replication pair. Valid values:
         * <p>
         * 
         * *   Week.
         * *   Month
         * 
         * Default value: Month.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The recovery point objective (RPO) of the replication pair. Unit: seconds. Set the value to 900.
         */
        public Builder RPO(Long RPO) {
            this.putQueryParameter("RPO", RPO);
            this.RPO = RPO;
            return this;
        }

        /**
         * The ID of the region in which to create the replication pair.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which to assign the replication group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The zone ID of the primary disk.
         */
        public Builder sourceZoneId(String sourceZoneId) {
            this.putQueryParameter("SourceZoneId", sourceZoneId);
            this.sourceZoneId = sourceZoneId;
            return this;
        }

        /**
         * The resource tags. You can specify up to 20 tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateDiskReplicaPairRequest build() {
            return new CreateDiskReplicaPairRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of tag N to add to the resource. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. It cannot start with `acs:` or `aliyun`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N to add to the resource. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with `acs:` or contain `http://` or `https://`.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
