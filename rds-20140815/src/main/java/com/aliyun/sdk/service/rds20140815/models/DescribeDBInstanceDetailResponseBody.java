// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBInstanceDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceDetailResponseBody</p>
 */
public class DescribeDBInstanceDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActivationState")
    private String activationState;

    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("LicenseType")
    private String licenseType;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>Indicates whether the instance is in the active state.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid</p>
         */
        public Builder activationState(String activationState) {
            this.activationState = activationState;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp6wjk5xxxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The type of the license.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder licenseType(String licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>06B220E2-EAC5-4DBE-A1FC-1B62DB6A****</p>
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
