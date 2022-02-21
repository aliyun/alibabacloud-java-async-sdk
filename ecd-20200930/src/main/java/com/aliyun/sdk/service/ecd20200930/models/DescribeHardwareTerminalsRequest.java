// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHardwareTerminalsRequest} extends {@link RequestModel}
 *
 * <p>DescribeHardwareTerminalsRequest</p>
 */
public class DescribeHardwareTerminalsRequest extends Request {
    @Query
    @NameInMap("HardwareType")
    private String hardwareType;

    @Query
    @NameInMap("HardwareVersion")
    private String hardwareVersion;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DescribeHardwareTerminalsRequest(Builder builder) {
        super(builder);
        this.hardwareType = builder.hardwareType;
        this.hardwareVersion = builder.hardwareVersion;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHardwareTerminalsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hardwareType
     */
    public String getHardwareType() {
        return this.hardwareType;
    }

    /**
     * @return hardwareVersion
     */
    public String getHardwareVersion() {
        return this.hardwareVersion;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeHardwareTerminalsRequest, Builder> {
        private String hardwareType; 
        private String hardwareVersion; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHardwareTerminalsRequest response) {
            super(response);
            this.hardwareType = response.hardwareType;
            this.hardwareVersion = response.hardwareVersion;
            this.regionId = response.regionId;
        } 

        /**
         * HardwareType.
         */
        public Builder hardwareType(String hardwareType) {
            this.putQueryParameter("HardwareType", hardwareType);
            this.hardwareType = hardwareType;
            return this;
        }

        /**
         * HardwareVersion.
         */
        public Builder hardwareVersion(String hardwareVersion) {
            this.putQueryParameter("HardwareVersion", hardwareVersion);
            this.hardwareVersion = hardwareVersion;
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
        public DescribeHardwareTerminalsRequest build() {
            return new DescribeHardwareTerminalsRequest(this);
        } 

    } 

}
