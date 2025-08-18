// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link DescribeAppInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppInstanceAttributeResponseBody</p>
 */
public class DescribeAppInstanceAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.NameInMap("InstanceClass")
    private String instanceClass;

    @com.aliyun.core.annotation.NameInMap("InstanceMinorVersion")
    private String instanceMinorVersion;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("PublicConnectionString")
    private String publicConnectionString;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("VpcConnectionString")
    private String vpcConnectionString;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeAppInstanceAttributeResponseBody(Builder builder) {
        this.appName = builder.appName;
        this.appType = builder.appType;
        this.DBInstanceName = builder.DBInstanceName;
        this.instanceClass = builder.instanceClass;
        this.instanceMinorVersion = builder.instanceMinorVersion;
        this.instanceName = builder.instanceName;
        this.publicConnectionString = builder.publicConnectionString;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.vSwitchId = builder.vSwitchId;
        this.vpcConnectionString = builder.vpcConnectionString;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppInstanceAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return instanceClass
     */
    public String getInstanceClass() {
        return this.instanceClass;
    }

    /**
     * @return instanceMinorVersion
     */
    public String getInstanceMinorVersion() {
        return this.instanceMinorVersion;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return publicConnectionString
     */
    public String getPublicConnectionString() {
        return this.publicConnectionString;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcConnectionString
     */
    public String getVpcConnectionString() {
        return this.vpcConnectionString;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private String appName; 
        private String appType; 
        private String DBInstanceName; 
        private String instanceClass; 
        private String instanceMinorVersion; 
        private String instanceName; 
        private String publicConnectionString; 
        private String regionId; 
        private String requestId; 
        private String status; 
        private String vSwitchId; 
        private String vpcConnectionString; 
        private String zoneId; 

        private Builder() {
        } 

        private Builder(DescribeAppInstanceAttributeResponseBody model) {
            this.appName = model.appName;
            this.appType = model.appType;
            this.DBInstanceName = model.DBInstanceName;
            this.instanceClass = model.instanceClass;
            this.instanceMinorVersion = model.instanceMinorVersion;
            this.instanceName = model.instanceName;
            this.publicConnectionString = model.publicConnectionString;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.status = model.status;
            this.vSwitchId = model.vSwitchId;
            this.vpcConnectionString = model.vpcConnectionString;
            this.zoneId = model.zoneId;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * AppType.
         */
        public Builder appType(String appType) {
            this.appType = appType;
            return this;
        }

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * InstanceClass.
         */
        public Builder instanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * InstanceMinorVersion.
         */
        public Builder instanceMinorVersion(String instanceMinorVersion) {
            this.instanceMinorVersion = instanceMinorVersion;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * PublicConnectionString.
         */
        public Builder publicConnectionString(String publicConnectionString) {
            this.publicConnectionString = publicConnectionString;
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

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VpcConnectionString.
         */
        public Builder vpcConnectionString(String vpcConnectionString) {
            this.vpcConnectionString = vpcConnectionString;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribeAppInstanceAttributeResponseBody build() {
            return new DescribeAppInstanceAttributeResponseBody(this);
        } 

    } 

}
