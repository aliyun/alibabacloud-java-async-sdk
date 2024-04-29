// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopNameRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesktopNameRequest</p>
 */
public class ModifyDesktopNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewDesktopName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newDesktopName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyDesktopNameRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.newDesktopName = builder.newDesktopName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopNameRequest create() {
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
     * @return newDesktopName
     */
    public String getNewDesktopName() {
        return this.newDesktopName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDesktopNameRequest, Builder> {
        private String desktopId; 
        private String newDesktopName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDesktopNameRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.newDesktopName = request.newDesktopName;
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
         * The new name of the cloud computer. The name of the cloud computer must meet the following requirements:
         * <p>
         * 
         * *   The name must be 1 to 64 characters in length.
         * *   The name must start with a letter but cannot start with `http://` or `https://`.
         * *   The name can only contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-).
         */
        public Builder newDesktopName(String newDesktopName) {
            this.putQueryParameter("NewDesktopName", newDesktopName);
            this.newDesktopName = newDesktopName;
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
        public ModifyDesktopNameRequest build() {
            return new ModifyDesktopNameRequest(this);
        } 

    } 

}
