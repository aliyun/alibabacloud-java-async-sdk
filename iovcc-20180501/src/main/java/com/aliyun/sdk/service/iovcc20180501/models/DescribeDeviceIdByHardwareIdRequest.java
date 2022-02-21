// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeviceIdByHardwareIdRequest} extends {@link RequestModel}
 *
 * <p>DescribeDeviceIdByHardwareIdRequest</p>
 */
public class DescribeDeviceIdByHardwareIdRequest extends Request {
    @Query
    @NameInMap("HardwareId")
    private String hardwareId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TargetProjectId")
    private String targetProjectId;

    private DescribeDeviceIdByHardwareIdRequest(Builder builder) {
        super(builder);
        this.hardwareId = builder.hardwareId;
        this.regionId = builder.regionId;
        this.targetProjectId = builder.targetProjectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceIdByHardwareIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hardwareId
     */
    public String getHardwareId() {
        return this.hardwareId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return targetProjectId
     */
    public String getTargetProjectId() {
        return this.targetProjectId;
    }

    public static final class Builder extends Request.Builder<DescribeDeviceIdByHardwareIdRequest, Builder> {
        private String hardwareId; 
        private String regionId; 
        private String targetProjectId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDeviceIdByHardwareIdRequest response) {
            super(response);
            this.hardwareId = response.hardwareId;
            this.regionId = response.regionId;
            this.targetProjectId = response.targetProjectId;
        } 

        /**
         * HardwareId.
         */
        public Builder hardwareId(String hardwareId) {
            this.putQueryParameter("HardwareId", hardwareId);
            this.hardwareId = hardwareId;
            return this;
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
         * TargetProjectId.
         */
        public Builder targetProjectId(String targetProjectId) {
            this.putQueryParameter("TargetProjectId", targetProjectId);
            this.targetProjectId = targetProjectId;
            return this;
        }

        @Override
        public DescribeDeviceIdByHardwareIdRequest build() {
            return new DescribeDeviceIdByHardwareIdRequest(this);
        } 

    } 

}
