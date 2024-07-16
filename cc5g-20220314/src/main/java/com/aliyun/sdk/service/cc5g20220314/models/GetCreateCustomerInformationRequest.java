// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCreateCustomerInformationRequest} extends {@link RequestModel}
 *
 * <p>GetCreateCustomerInformationRequest</p>
 */
public class GetCreateCustomerInformationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WirelessCloudConnectorId")
    private String wirelessCloudConnectorId;

    private GetCreateCustomerInformationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.wirelessCloudConnectorId = builder.wirelessCloudConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCreateCustomerInformationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return wirelessCloudConnectorId
     */
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

    public static final class Builder extends Request.Builder<GetCreateCustomerInformationRequest, Builder> {
        private String regionId; 
        private String wirelessCloudConnectorId; 

        private Builder() {
            super();
        } 

        private Builder(GetCreateCustomerInformationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.wirelessCloudConnectorId = request.wirelessCloudConnectorId;
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
         * WirelessCloudConnectorId.
         */
        public Builder wirelessCloudConnectorId(String wirelessCloudConnectorId) {
            this.putQueryParameter("WirelessCloudConnectorId", wirelessCloudConnectorId);
            this.wirelessCloudConnectorId = wirelessCloudConnectorId;
            return this;
        }

        @Override
        public GetCreateCustomerInformationRequest build() {
            return new GetCreateCustomerInformationRequest(this);
        } 

    } 

}
