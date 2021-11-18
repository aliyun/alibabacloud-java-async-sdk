// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetInstanceCountRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceCountRequest</p>
 */
public class GetInstanceCountRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;


    private GetInstanceCountRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceCountRequest create() {
        return builder().build();
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder {
        private String regionId; 

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        public GetInstanceCountRequest build() {
            return new GetInstanceCountRequest(this);
        } 

    } 

}
