// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationRequest} extends {@link RequestModel}
 *
 * <p>GetApplicationRequest</p>
 */
public class GetApplicationRequest extends Request {
    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetApplicationRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetApplicationRequest, Builder> {
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetApplicationRequest request) {
            super(request);
            this.name = request.name;
            this.regionId = request.regionId;
        } 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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

        @Override
        public GetApplicationRequest build() {
            return new GetApplicationRequest(this);
        } 

    } 

}
