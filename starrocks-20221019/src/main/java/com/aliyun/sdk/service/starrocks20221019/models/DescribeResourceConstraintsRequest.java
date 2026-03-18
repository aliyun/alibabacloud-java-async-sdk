// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link DescribeResourceConstraintsRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourceConstraintsRequest</p>
 */
public class DescribeResourceConstraintsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Architecture")
    private String architecture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageType")
    private String packageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunMode")
    private String runMode;

    private DescribeResourceConstraintsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.architecture = builder.architecture;
        this.packageType = builder.packageType;
        this.runMode = builder.runMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceConstraintsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return architecture
     */
    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * @return packageType
     */
    public String getPackageType() {
        return this.packageType;
    }

    /**
     * @return runMode
     */
    public String getRunMode() {
        return this.runMode;
    }

    public static final class Builder extends Request.Builder<DescribeResourceConstraintsRequest, Builder> {
        private String regionId; 
        private String architecture; 
        private String packageType; 
        private String runMode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourceConstraintsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.architecture = request.architecture;
            this.packageType = request.packageType;
            this.runMode = request.runMode;
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
         * Architecture.
         */
        public Builder architecture(String architecture) {
            this.putQueryParameter("Architecture", architecture);
            this.architecture = architecture;
            return this;
        }

        /**
         * PackageType.
         */
        public Builder packageType(String packageType) {
            this.putQueryParameter("PackageType", packageType);
            this.packageType = packageType;
            return this;
        }

        /**
         * RunMode.
         */
        public Builder runMode(String runMode) {
            this.putQueryParameter("RunMode", runMode);
            this.runMode = runMode;
            return this;
        }

        @Override
        public DescribeResourceConstraintsRequest build() {
            return new DescribeResourceConstraintsRequest(this);
        } 

    } 

}
