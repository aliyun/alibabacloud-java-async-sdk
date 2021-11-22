// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetFeatureDetailsRequest} extends {@link RequestModel}
 *
 * <p>GetFeatureDetailsRequest</p>
 */
public class GetFeatureDetailsRequest extends Request {
    @Query
    @NameInMap("Feature")
    private String feature;

    @Query
    @NameInMap("RegionId")
    private String regionId;


    private GetFeatureDetailsRequest(Builder builder) {
        super(builder);
        this.feature = builder.feature;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFeatureDetailsRequest create() {
        return builder().build();
    }

    /**
     * @return feature
     */
    public String getFeature() {
        return this.feature;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder {
        private String feature; 
        private String regionId; 

        /**
         * <p>Feature.</p>
         */
        public Builder feature(String feature) {
            this.putQueryParameter("Feature", feature);
            this.feature = feature;
            return this;
        }

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        public GetFeatureDetailsRequest build() {
            return new GetFeatureDetailsRequest(this);
        } 

    } 

}
