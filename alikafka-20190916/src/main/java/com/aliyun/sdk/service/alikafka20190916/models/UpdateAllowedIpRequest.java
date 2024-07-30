// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAllowedIpRequest} extends {@link RequestModel}
 *
 * <p>UpdateAllowedIpRequest</p>
 */
public class UpdateAllowedIpRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowedListIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String allowedListIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowedListType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String allowedListType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortRange")
    @com.aliyun.core.annotation.Validation(required = true)
    private String portRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String updateType;

    private UpdateAllowedIpRequest(Builder builder) {
        super(builder);
        this.allowedListIp = builder.allowedListIp;
        this.allowedListType = builder.allowedListType;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.portRange = builder.portRange;
        this.regionId = builder.regionId;
        this.updateType = builder.updateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAllowedIpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowedListIp
     */
    public String getAllowedListIp() {
        return this.allowedListIp;
    }

    /**
     * @return allowedListType
     */
    public String getAllowedListType() {
        return this.allowedListType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return portRange
     */
    public String getPortRange() {
        return this.portRange;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return updateType
     */
    public String getUpdateType() {
        return this.updateType;
    }

    public static final class Builder extends Request.Builder<UpdateAllowedIpRequest, Builder> {
        private String allowedListIp; 
        private String allowedListType; 
        private String description; 
        private String instanceId; 
        private String portRange; 
        private String regionId; 
        private String updateType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAllowedIpRequest request) {
            super(request);
            this.allowedListIp = request.allowedListIp;
            this.allowedListType = request.allowedListType;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.portRange = request.portRange;
            this.regionId = request.regionId;
            this.updateType = request.updateType;
        } 

        /**
         * The IP addresses that you want to manage. You can specify a CIDR block. Example: **192.168.0.0/16**.
         * <p>
         * 
         * *   If the **UpdateType** parameter is set to **add**, specify one or more IP addresses for this parameter. Separate multiple IP addresses with commas (,).
         * *   If the **UpdateType** parameter is set to **delete**, specify only one IP address.
         * *   Exercise caution when you delete IP addresses.
         */
        public Builder allowedListIp(String allowedListIp) {
            this.putQueryParameter("AllowedListIp", allowedListIp);
            this.allowedListIp = allowedListIp;
            return this;
        }

        /**
         * The type of the whitelist. Valid values:
         * <p>
         * 
         * *   **vpc**: a whitelist for access from a VPC.
         * *   **internet**: a whitelist for access from the Internet.
         */
        public Builder allowedListType(String allowedListType) {
            this.putQueryParameter("AllowedListType", allowedListType);
            this.allowedListType = allowedListType;
            return this;
        }

        /**
         * The description of the whitelist.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The port range. Valid values:
         * <p>
         * 
         * *   **9092/9092**: Messages are transmitted in a virtual private cloud (VPC) by using the PLAINTEXT protocol.
         * *   **9093/9093**: Messages are transmitted over the Internet by using the SASL_SSL protocol.
         * *   **9094/9094**: Messages are transmitted in a VPC by using the SASL_PLAINTEXT protocol.
         * *   **9095/9095**: Messages are transmitted in a VPC by using the SASL_SSL protocol.
         * 
         * This parameter must correspond to **AllowdedListType**.
         */
        public Builder portRange(String portRange) {
            this.putQueryParameter("PortRange", portRange);
            this.portRange = portRange;
            return this;
        }

        /**
         * The ID of the region where the instance resides.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of configuration change. Valid values:
         * <p>
         * 
         * *   **add**
         * *   **delete**
         */
        public Builder updateType(String updateType) {
            this.putQueryParameter("UpdateType", updateType);
            this.updateType = updateType;
            return this;
        }

        @Override
        public UpdateAllowedIpRequest build() {
            return new UpdateAllowedIpRequest(this);
        } 

    } 

}
