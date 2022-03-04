// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PurchaseStorageCapacityUnitRequest} extends {@link RequestModel}
 *
 * <p>PurchaseStorageCapacityUnitRequest</p>
 */
public class PurchaseStorageCapacityUnitRequest extends Request {
    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("FromApp")
    private String fromApp;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Capacity")
    @Validation(required = true)
    private Integer capacity;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Amount")
    @Validation(maximum = 20, minimum = 1)
    private Integer amount;

    private PurchaseStorageCapacityUnitRequest(Builder builder) {
        super(builder);
        this.resourceOwnerId = builder.resourceOwnerId;
        this.fromApp = builder.fromApp;
        this.tag = builder.tag;
        this.regionId = builder.regionId;
        this.name = builder.name;
        this.capacity = builder.capacity;
        this.description = builder.description;
        this.startTime = builder.startTime;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.clientToken = builder.clientToken;
        this.amount = builder.amount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PurchaseStorageCapacityUnitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return fromApp
     */
    public String getFromApp() {
        return this.fromApp;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    public static final class Builder extends Request.Builder<PurchaseStorageCapacityUnitRequest, Builder> {
        private Long resourceOwnerId; 
        private String fromApp; 
        private java.util.List < Tag> tag; 
        private String regionId; 
        private String name; 
        private Integer capacity; 
        private String description; 
        private String startTime; 
        private Integer period; 
        private String periodUnit; 
        private String clientToken; 
        private Integer amount; 

        private Builder() {
            super();
        } 

        private Builder(PurchaseStorageCapacityUnitRequest request) {
            super(request);
            this.resourceOwnerId = request.resourceOwnerId;
            this.fromApp = request.fromApp;
            this.tag = request.tag;
            this.regionId = request.regionId;
            this.name = request.name;
            this.capacity = request.capacity;
            this.description = request.description;
            this.startTime = request.startTime;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.clientToken = request.clientToken;
            this.amount = request.amount;
        } 

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
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
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the region to which the SCU belongs. After the region is determined, SCU can only deduct the pay-as-you-go billing of cloud disks in the region. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the SCU. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with "http:// "or "https. It can contain numbers, colons (:), underscores (_), and hyphens (-).
         * <p>
         * 
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The capacity of the SCU. Unit: GiB. Valid values:{20, 40, 100, 200, 500, 1024, 2048, 5120, 10240, 20480, 51200}.
         */
        public Builder capacity(Integer capacity) {
            this.putQueryParameter("Capacity", capacity);
            this.capacity = capacity;
            return this;
        }

        /**
         * The description of the SCU. It must be 2 to 256 characters in length and cannot start with "http:// "or "https.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The effective time of the SCU. The validity period cannot exceed six months. The time follows the ISO 8601 standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
         * <p>
         * 
         * Default value: none.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The validity period of the SCU. Valid values:
         * <p>
         * 
         * -When PeriodUnit is set to Month, the valid value of the Period parameter is {1, 2, 3, 6}.
         * -When PeriodUnit = Year, the valid value of the Period parameter is {1, 3, 5}.
         * 
         * Default value: 1.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The validity period of the SCU. Unit. Valid values:
         * <p>
         * 
         * -Month: Month
         * -Year: Year
         * 
         * Default value: Month
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. "ClientToken" only supports ASCII characters and cannot exceed 64 characters in length. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The number of SCUs purchased. Valid values: 1 to 20.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        @Override
        public PurchaseStorageCapacityUnitRequest build() {
            return new PurchaseStorageCapacityUnitRequest(this);
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
             * SCU的标签键。N表示可以设置的标签键数量，取值范围：1~20。一旦传入该值，则不允许为空字符串。最多支持128个字符，不能以`aliyun`或`acs:`开头，不能包含`http://`或`https://`。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * SCU的标签值。N表示可以设置的标签值数量，且与`Tag.N.Key`的N对应。取值范围：1~20。一旦传入该值，可以为空字符串。最多支持128个字符，不能以`acs:`开头，不能包含`http://`或`https://`。
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
