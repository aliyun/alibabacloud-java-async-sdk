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
         * <p>A list of cloud computer IDs for which you want to set maintenance mode. A maximum of 100 cloud computer IDs are supported.</p>
         * <p>This parameter is required.</p>
         */
        public Builder desktopIds(java.util.List<String> desktopIds) {
            this.putQueryParameter("DesktopIds", desktopIds);
            this.desktopIds = desktopIds;
            return this;
        }

        /**
         * <p>Enter or exit cloud computer maintenance mode.</p>
         * <p>Enumerated values:</p>
         * <ul>
         * <li>ENTER: The enters the maintenance mode.</li>
         * <li>EXIT: The exits the maintenance mode.</li>
         * </ul>
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
         * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
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
