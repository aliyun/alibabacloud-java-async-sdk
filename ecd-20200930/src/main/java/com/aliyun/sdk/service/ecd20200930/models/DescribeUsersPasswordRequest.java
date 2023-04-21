// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUsersPasswordRequest} extends {@link RequestModel}
 *
 * <p>DescribeUsersPasswordRequest</p>
 */
public class DescribeUsersPasswordRequest extends Request {
    @Query
    @NameInMap("DesktopId")
    @Validation(required = true)
    private String desktopId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeUsersPasswordRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUsersPasswordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeUsersPasswordRequest, Builder> {
        private String desktopId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUsersPasswordRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the cloud desktop.
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeUsersPasswordRequest build() {
            return new DescribeUsersPasswordRequest(this);
        } 

    } 

}
