// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetDesktopMaintenanceRequest} extends {@link RequestModel}
 *
 * <p>SetDesktopMaintenanceRequest</p>
 */
public class SetDesktopMaintenanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> desktopIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private SetDesktopMaintenanceRequest(Builder builder) {
        super(builder);
        this.desktopIds = builder.desktopIds;
        this.mode = builder.mode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDesktopMaintenanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopIds
     */
    public java.util.List<String> getDesktopIds() {
        return this.desktopIds;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SetDesktopMaintenanceRequest, Builder> {
        private java.util.List<String> desktopIds; 
        private String mode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetDesktopMaintenanceRequest request) {
            super(request);
            this.desktopIds = request.desktopIds;
            this.mode = request.mode;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The IDs of the cloud computers for which you want to set the maintenance mode. You can specify up to 100 cloud computer IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder desktopIds(java.util.List<String> desktopIds) {
            this.putQueryParameter("DesktopIds", desktopIds);
            this.desktopIds = desktopIds;
            return this;
        }

        /**
         * <p>Specifies whether to enter or exit maintenance mode for the cloud computer.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>enter</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the list of regions supported by Elastic Desktop Service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SetDesktopMaintenanceRequest build() {
            return new SetDesktopMaintenanceRequest(this);
        } 

    } 

}
