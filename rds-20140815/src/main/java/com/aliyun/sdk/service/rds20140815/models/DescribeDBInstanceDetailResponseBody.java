// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceDetailResponseBody</p>
 */
public class DescribeDBInstanceDetailResponseBody extends TeaModel {
    @NameInMap("ActivationState")
    private String activationState;

    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("LicenseType")
    private String licenseType;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceDetailResponseBody(Builder builder) {
        this.activationState = builder.activationState;
        this.DBInstanceId = builder.DBInstanceId;
        this.licenseType = builder.licenseType;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return activationState
     */
    public String getActivationState() {
        return this.activationState;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return licenseType
     */
    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String activationState; 
        private String DBInstanceId; 
        private String licenseType; 
        private String regionId; 
        private String requestId; 

        /**
         * ActivationState.
         */
        public Builder activationState(String activationState) {
            this.activationState = activationState;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * LicenseType.
         */
        public Builder licenseType(String licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceDetailResponseBody build() {
            return new DescribeDBInstanceDetailResponseBody(this);
        } 

    } 

}
