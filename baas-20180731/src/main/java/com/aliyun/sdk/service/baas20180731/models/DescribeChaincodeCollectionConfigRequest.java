// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChaincodeCollectionConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeChaincodeCollectionConfigRequest</p>
 */
public class DescribeChaincodeCollectionConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChaincodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chaincodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    private DescribeChaincodeCollectionConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.chaincodeId = builder.chaincodeId;
        this.location = builder.location;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChaincodeCollectionConfigRequest create() {
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
     * @return chaincodeId
     */
    public String getChaincodeId() {
        return this.chaincodeId;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    public static final class Builder extends Request.Builder<DescribeChaincodeCollectionConfigRequest, Builder> {
        private String regionId; 
        private String chaincodeId; 
        private String location; 

        private Builder() {
            super();
        } 

        private Builder(DescribeChaincodeCollectionConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.chaincodeId = request.chaincodeId;
            this.location = request.location;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ChaincodeId.
         */
        public Builder chaincodeId(String chaincodeId) {
            this.putBodyParameter("ChaincodeId", chaincodeId);
            this.chaincodeId = chaincodeId;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.putBodyParameter("Location", location);
            this.location = location;
            return this;
        }

        @Override
        public DescribeChaincodeCollectionConfigRequest build() {
            return new DescribeChaincodeCollectionConfigRequest(this);
        } 

    } 

}
