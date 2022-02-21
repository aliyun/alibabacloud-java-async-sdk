// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAllowedIpRequest} extends {@link RequestModel}
 *
 * <p>UpdateAllowedIpRequest</p>
 */
public class UpdateAllowedIpRequest extends Request {
    @Query
    @NameInMap("AllowedListIp")
    @Validation(required = true)
    private String allowedListIp;

    @Query
    @NameInMap("AllowedListType")
    @Validation(required = true)
    private String allowedListType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PortRange")
    @Validation(required = true)
    private String portRange;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("UpdateType")
    @Validation(required = true)
    private String updateType;

    private UpdateAllowedIpRequest(Builder builder) {
        super(builder);
        this.allowedListIp = builder.allowedListIp;
        this.allowedListType = builder.allowedListType;
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
        private String instanceId; 
        private String portRange; 
        private String regionId; 
        private String updateType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAllowedIpRequest response) {
            super(response);
            this.allowedListIp = response.allowedListIp;
            this.allowedListType = response.allowedListType;
            this.instanceId = response.instanceId;
            this.portRange = response.portRange;
            this.regionId = response.regionId;
            this.updateType = response.updateType;
        } 

        /**
         * AllowedListIp.
         */
        public Builder allowedListIp(String allowedListIp) {
            this.putQueryParameter("AllowedListIp", allowedListIp);
            this.allowedListIp = allowedListIp;
            return this;
        }

        /**
         * AllowedListType.
         */
        public Builder allowedListType(String allowedListType) {
            this.putQueryParameter("AllowedListType", allowedListType);
            this.allowedListType = allowedListType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PortRange.
         */
        public Builder portRange(String portRange) {
            this.putQueryParameter("PortRange", portRange);
            this.portRange = portRange;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * UpdateType.
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
