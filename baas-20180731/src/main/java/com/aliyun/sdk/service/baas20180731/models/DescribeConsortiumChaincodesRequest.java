// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConsortiumChaincodesRequest} extends {@link RequestModel}
 *
 * <p>DescribeConsortiumChaincodesRequest</p>
 */
public class DescribeConsortiumChaincodesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ConsortiumId")
    @Validation(required = true)
    private String consortiumId;

    @Body
    @NameInMap("Location")
    private String location;

    private DescribeConsortiumChaincodesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.consortiumId = builder.consortiumId;
        this.location = builder.location;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConsortiumChaincodesRequest create() {
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
     * @return consortiumId
     */
    public String getConsortiumId() {
        return this.consortiumId;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    public static final class Builder extends Request.Builder<DescribeConsortiumChaincodesRequest, Builder> {
        private String regionId; 
        private String consortiumId; 
        private String location; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConsortiumChaincodesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.consortiumId = request.consortiumId;
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
         * ConsortiumId.
         */
        public Builder consortiumId(String consortiumId) {
            this.putBodyParameter("ConsortiumId", consortiumId);
            this.consortiumId = consortiumId;
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
        public DescribeConsortiumChaincodesRequest build() {
            return new DescribeConsortiumChaincodesRequest(this);
        } 

    } 

}
