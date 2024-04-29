// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDesktopGroupDetailRequest} extends {@link RequestModel}
 *
 * <p>GetDesktopGroupDetailRequest</p>
 */
public class GetDesktopGroupDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desktopGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private GetDesktopGroupDetailRequest(Builder builder) {
        super(builder);
        this.desktopGroupId = builder.desktopGroupId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDesktopGroupDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetDesktopGroupDetailRequest, Builder> {
        private String desktopGroupId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetDesktopGroupDetailRequest request) {
            super(request);
            this.desktopGroupId = request.desktopGroupId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the cloud computer pool.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetDesktopGroupDetailRequest build() {
            return new GetDesktopGroupDetailRequest(this);
        } 

    } 

}
