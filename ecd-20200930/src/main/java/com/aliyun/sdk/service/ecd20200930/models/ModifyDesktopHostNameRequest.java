// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopHostNameRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesktopHostNameRequest</p>
 */
public class ModifyDesktopHostNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewHostName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newHostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyDesktopHostNameRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.newHostName = builder.newHostName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopHostNameRequest create() {
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
     * @return newHostName
     */
    public String getNewHostName() {
        return this.newHostName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDesktopHostNameRequest, Builder> {
        private String desktopId; 
        private String newHostName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDesktopHostNameRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.newHostName = request.newHostName;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the cloud computer.
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The new hostname of the cloud computer. The hostname must meet the following requirements:
         * <p>
         * 
         * *   The hostname must be 2 to 15 characters in length.
         * *   The hostname can contain only letters, digits, and hyphens (-). The hostname cannot start or end with a hyphen (-), contain consecutive hyphens (-), or contain only digits.
         */
        public Builder newHostName(String newHostName) {
            this.putQueryParameter("NewHostName", newHostName);
            this.newHostName = newHostName;
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
        public ModifyDesktopHostNameRequest build() {
            return new ModifyDesktopHostNameRequest(this);
        } 

    } 

}
