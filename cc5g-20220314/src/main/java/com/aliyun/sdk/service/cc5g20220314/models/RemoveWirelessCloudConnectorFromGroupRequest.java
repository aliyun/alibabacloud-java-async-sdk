// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveWirelessCloudConnectorFromGroupRequest} extends {@link RequestModel}
 *
 * <p>RemoveWirelessCloudConnectorFromGroupRequest</p>
 */
public class RemoveWirelessCloudConnectorFromGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WirelessCloudConnectorGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wirelessCloudConnectorGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WirelessCloudConnectorIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > wirelessCloudConnectorIds;

    private RemoveWirelessCloudConnectorFromGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.regionId = builder.regionId;
        this.wirelessCloudConnectorGroupId = builder.wirelessCloudConnectorGroupId;
        this.wirelessCloudConnectorIds = builder.wirelessCloudConnectorIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveWirelessCloudConnectorFromGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return wirelessCloudConnectorGroupId
     */
    public String getWirelessCloudConnectorGroupId() {
        return this.wirelessCloudConnectorGroupId;
    }

    /**
     * @return wirelessCloudConnectorIds
     */
    public java.util.List < String > getWirelessCloudConnectorIds() {
        return this.wirelessCloudConnectorIds;
    }

    public static final class Builder extends Request.Builder<RemoveWirelessCloudConnectorFromGroupRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String regionId; 
        private String wirelessCloudConnectorGroupId; 
        private java.util.List < String > wirelessCloudConnectorIds; 

        private Builder() {
            super();
        } 

        private Builder(RemoveWirelessCloudConnectorFromGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.regionId = request.regionId;
            this.wirelessCloudConnectorGroupId = request.wirelessCloudConnectorGroupId;
            this.wirelessCloudConnectorIds = request.wirelessCloudConnectorIds;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
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
         * WirelessCloudConnectorGroupId.
         */
        public Builder wirelessCloudConnectorGroupId(String wirelessCloudConnectorGroupId) {
            this.putQueryParameter("WirelessCloudConnectorGroupId", wirelessCloudConnectorGroupId);
            this.wirelessCloudConnectorGroupId = wirelessCloudConnectorGroupId;
            return this;
        }

        /**
         * WirelessCloudConnectorIds.
         */
        public Builder wirelessCloudConnectorIds(java.util.List < String > wirelessCloudConnectorIds) {
            this.putQueryParameter("WirelessCloudConnectorIds", wirelessCloudConnectorIds);
            this.wirelessCloudConnectorIds = wirelessCloudConnectorIds;
            return this;
        }

        @Override
        public RemoveWirelessCloudConnectorFromGroupRequest build() {
            return new RemoveWirelessCloudConnectorFromGroupRequest(this);
        } 

    } 

}
