// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateActivationRequest} extends {@link RequestModel}
 *
 * <p>CreateActivationRequest</p>
 */
public class CreateActivationRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InstanceCount")
    private Integer instanceCount;

    @Query
    @NameInMap("TimeToLiveInHours")
    private Long timeToLiveInHours;

    @Query
    @NameInMap("IpAddressRange")
    private String ipAddressRange;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    private CreateActivationRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.instanceCount = builder.instanceCount;
        this.timeToLiveInHours = builder.timeToLiveInHours;
        this.ipAddressRange = builder.ipAddressRange;
        this.instanceName = builder.instanceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateActivationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceCount
     */
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * @return timeToLiveInHours
     */
    public Long getTimeToLiveInHours() {
        return this.timeToLiveInHours;
    }

    /**
     * @return ipAddressRange
     */
    public String getIpAddressRange() {
        return this.ipAddressRange;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    public static final class Builder extends Request.Builder<CreateActivationRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String description; 
        private Integer instanceCount; 
        private Long timeToLiveInHours; 
        private String ipAddressRange; 
        private String instanceName; 

        private Builder() {
            super();
        } 

        private Builder(CreateActivationRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.regionId = response.regionId;
            this.description = response.description;
            this.instanceCount = response.instanceCount;
            this.timeToLiveInHours = response.timeToLiveInHours;
            this.ipAddressRange = response.ipAddressRange;
            this.instanceName = response.instanceName;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
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
         * The ID of the region. Supported regions: China (Qingdao), China (Beijing), China (Zhangjiakou), China (Hohhot), China (Hangzhou), and China (Shanghai) china (Shenzhen), China (Heyuan), and China (Hong Kong).
         * <p>
         * 
         * You can call [DescribeRegions](~~ 25609 ~~) to view the region ID and other information.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The description of the activation code. It can be 1 to 100 characters in length and cannot start with "http:// "or "https.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The maximum number of times an activation code is used to register a managed instance. Valid values: 1 to 1000.
         * <p>
         * 
         * Default value: 10.
         */
        public Builder instanceCount(Integer instanceCount) {
            this.putQueryParameter("InstanceCount", instanceCount);
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * The validity period of the activation code. After the activation code expires, it cannot be used to register a new instance. Unit: Hour. Valid values: 1 to 24.
         * <p>
         * 
         * Default value: 4.
         */
        public Builder timeToLiveInHours(Long timeToLiveInHours) {
            this.putQueryParameter("TimeToLiveInHours", timeToLiveInHours);
            this.timeToLiveInHours = timeToLiveInHours;
            return this;
        }

        /**
         * The IP address of the host that allows the activation code. Valid values: IPv4 address, IPv6 address, or CIDR block.
         */
        public Builder ipAddressRange(String ipAddressRange) {
            this.putQueryParameter("IpAddressRange", ipAddressRange);
            this.ipAddressRange = ipAddressRange;
            return this;
        }

        /**
         * The default instance name prefix. It can be 1 to 50 characters in length and must start with a letter. It cannot start with a special character or digit. It can only contain half-width periods (.) in special characters., underscores (_), hyphens (-), and colons (:) cannot start with "http:// "or "https.
         * <p>
         * 
         * For instances registered with the activation code created by using this API, this name is used as the prefix to generate ordered instance names. You can also specify a new instance name when registering a managed instance to overwrite this default value.
         * 
         * When registering a managed instance, if the value of the InstanceName is specified, the name "< InstanceName>-00" is generated, where the number of digits numbered "00" depends on the number of digits of the "InstanceCount" value. If the value of the InstanceName is not specified, the host name (Hostname) is used as the instance name.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        @Override
        public CreateActivationRequest build() {
            return new CreateActivationRequest(this);
        } 

    } 

}
