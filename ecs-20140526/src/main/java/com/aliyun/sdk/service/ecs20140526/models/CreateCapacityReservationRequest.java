// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCapacityReservationRequest} extends {@link RequestModel}
 *
 * <p>CreateCapacityReservationRequest</p>
 */
public class CreateCapacityReservationRequest extends Request {
    @Query
    @NameInMap("PrivatePoolOptions")
    private PrivatePoolOptions privatePoolOptions;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("EndTimeType")
    private String endTimeType;

    @Query
    @NameInMap("Platform")
    private String platform;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("InstanceAmount")
    @Validation(required = true, minimum = 1)
    private Integer instanceAmount;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private java.util.List < String > zoneId;

    private CreateCapacityReservationRequest(Builder builder) {
        super(builder);
        this.privatePoolOptions = builder.privatePoolOptions;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.instanceType = builder.instanceType;
        this.endTime = builder.endTime;
        this.endTimeType = builder.endTimeType;
        this.platform = builder.platform;
        this.startTime = builder.startTime;
        this.instanceAmount = builder.instanceAmount;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCapacityReservationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return privatePoolOptions
     */
    public PrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
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
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return endTimeType
     */
    public String getEndTimeType() {
        return this.endTimeType;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return instanceAmount
     */
    public Integer getInstanceAmount() {
        return this.instanceAmount;
    }

    /**
     * @return zoneId
     */
    public java.util.List < String > getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateCapacityReservationRequest, Builder> {
        private PrivatePoolOptions privatePoolOptions; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List < Tag> tag; 
        private String clientToken; 
        private String description; 
        private String instanceType; 
        private String endTime; 
        private String endTimeType; 
        private String platform; 
        private String startTime; 
        private Integer instanceAmount; 
        private java.util.List < String > zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCapacityReservationRequest request) {
            super(request);
            this.privatePoolOptions = request.privatePoolOptions;
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.instanceType = request.instanceType;
            this.endTime = request.endTime;
            this.endTimeType = request.endTimeType;
            this.platform = request.platform;
            this.startTime = request.startTime;
            this.instanceAmount = request.instanceAmount;
            this.zoneId = request.zoneId;
        } 

        /**
         * PrivatePoolOptions.
         */
        public Builder privatePoolOptions(PrivatePoolOptions privatePoolOptions) {
            this.putQueryParameter("PrivatePoolOptions", privatePoolOptions);
            this.privatePoolOptions = privatePoolOptions;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account (primary account).
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the region to which the capacity reservation service belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the capacity reservation service belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Tag list
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
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
         * The description of the capacity reservation service. The description must be 2 to 256 characters in length and cannot start with "http:// "or "https.
         * <p>
         * 
         * Default value: Null.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The instance type. Currently, you can only set the capacity reservation service for one instance type. You can call [DescribeInstanceTypes](~~ 25620 ~~) to query the instance types provided by ECS.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The expiration time of the subscription service. The time format is ISO 8601 and UTC +0 is required. The format is yyyy-MM-ddTHH:mm:ssZ ". For more information, see [ISO 8601](~~ 25696 ~~).
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The expiration method of the capacity reservation service. Valid values:
         * <p>
         * 
         * -Limited: release at the specified time. You must specify the "EndTime" parameter at the same time.
         * -Unlimited: manually released. No time limit.
         */
        public Builder endTimeType(String endTimeType) {
            this.putQueryParameter("EndTimeType", endTimeType);
            this.endTimeType = endTimeType;
            return this;
        }

        /**
         * The operating system type of the image used by the instance. This parameter corresponds to the "Platform" parameter of the regional reserved instance. If the capacity reservation service matches the operating system type of the regional reserved instance, you can use the regional reserved instance to offset the unused capacity bill in the capacity reservation service. Valid values:
         * <p>
         * 
         * -Windows:Windows Server-type operating system.
         * -Linux:Linux and Unix-like operating systems.
         * 
         * Default value: Linux
         * 
         * > This parameter is not available.
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * The effective method of the capacity reservation service. Currently, you can only set the method to take effect immediately.
         * <p>
         * 
         * > If this parameter is not set, it takes effect immediately.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The total number of instances to be reserved within an instance type.
         */
        public Builder instanceAmount(Integer instanceAmount) {
            this.putQueryParameter("InstanceAmount", instanceAmount);
            this.instanceAmount = instanceAmount;
            return this;
        }

        /**
         * The ID of the zone to which the capacity reservation service belongs. Currently, you can create a capacity reservation service in only one zone.
         */
        public Builder zoneId(java.util.List < String > zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateCapacityReservationRequest build() {
            return new CreateCapacityReservationRequest(this);
        } 

    } 

    public static class PrivatePoolOptions extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("MatchCriteria")
        private String matchCriteria;

        private PrivatePoolOptions(Builder builder) {
            this.name = builder.name;
            this.matchCriteria = builder.matchCriteria;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivatePoolOptions create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return matchCriteria
         */
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        public static final class Builder {
            private String name; 
            private String matchCriteria; 

            /**
             * The name of the capacity reservation service. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with "http:// "or "https. It can contain numbers, colons (:), underscores (_), and hyphens (-).
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the private resource pool generated after the capacity reservation service takes effect. Valid values:
             * <p>
             * 
             * -Open: Open mode.
             * -Target: The dedicated mode.
             * 
             * Default value: Open
             */
            public Builder matchCriteria(String matchCriteria) {
                this.matchCriteria = matchCriteria;
                return this;
            }

            public PrivatePoolOptions build() {
                return new PrivatePoolOptions(this);
            } 

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
             * 容量预定服务的标签键。N的取值范围：1~20。一旦传入该值，则不允许为空字符串。最多支持128个字符，不能以`aliyun`和`acs:`开头，不能包含`http://`或者`https://`。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 容量预定服务的标签值。N的取值范围：1~20。一旦传入该值，允许为空字符串。最多支持128个字符，不能以`acs:`开头，不能包含`http://`或者`https://`。
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
