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

    @com.aliyun.core.annotation.NameInMap("EipId")
    private String eipId;

    @com.aliyun.core.annotation.NameInMap("EipStatus")
    private String eipStatus;

    @com.aliyun.core.annotation.NameInMap("InstanceClass")
    private String instanceClass;

    @com.aliyun.core.annotation.NameInMap("InstanceMinorVersion")
    private String instanceMinorVersion;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("NatCreatedBy")
    private String natCreatedBy;

    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.NameInMap("NatStatus")
    private String natStatus;

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
        this.eipId = builder.eipId;
        this.eipStatus = builder.eipStatus;
        this.instanceClass = builder.instanceClass;
        this.instanceMinorVersion = builder.instanceMinorVersion;
        this.instanceName = builder.instanceName;
        this.natCreatedBy = builder.natCreatedBy;
        this.natGatewayId = builder.natGatewayId;
        this.natStatus = builder.natStatus;
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
     * @return eipId
     */
    public String getEipId() {
        return this.eipId;
    }

    /**
     * @return eipStatus
     */
    public String getEipStatus() {
        return this.eipStatus;
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
     * @return natCreatedBy
     */
    public String getNatCreatedBy() {
        return this.natCreatedBy;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return natStatus
     */
    public String getNatStatus() {
        return this.natStatus;
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
        private String eipId; 
        private String eipStatus; 
        private String instanceClass; 
        private String instanceMinorVersion; 
        private String instanceName; 
        private String natCreatedBy; 
        private String natGatewayId; 
        private String natStatus; 
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
            this.eipId = model.eipId;
            this.eipStatus = model.eipStatus;
            this.instanceClass = model.instanceClass;
            this.instanceMinorVersion = model.instanceMinorVersion;
            this.instanceName = model.instanceName;
            this.natCreatedBy = model.natCreatedBy;
            this.natGatewayId = model.natGatewayId;
            this.natStatus = model.natStatus;
            this.publicConnectionString = model.publicConnectionString;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.status = model.status;
            this.vSwitchId = model.vSwitchId;
            this.vpcConnectionString = model.vpcConnectionString;
            this.zoneId = model.zoneId;
        } 

        /**
         * <p>The name of the AI application.</p>
         * 
         * <strong>example:</strong>
         * <p>test-supabase</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>The application type. Only <strong>supabase</strong> is supported. For more information, see <a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>supabase</p>
         */
        public Builder appType(String appType) {
            this.appType = appType;
            return this;
        }

        /**
         * <p>The ID of the RDS for PostgreSQL instance with which the RDS Supabase instances are associated.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-2ze49qv594vi****</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * EipId.
         */
        public Builder eipId(String eipId) {
            this.eipId = eipId;
            return this;
        }

        /**
         * EipStatus.
         */
        public Builder eipStatus(String eipStatus) {
            this.eipStatus = eipStatus;
            return this;
        }

        /**
         * <p>The instance type of the RDS Supabase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rdsai.supabase.basic</p>
         */
        public Builder instanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * <p>The minor version number of RDS Supabase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>20241231</p>
         */
        public Builder instanceMinorVersion(String instanceMinorVersion) {
            this.instanceMinorVersion = instanceMinorVersion;
            return this;
        }

        /**
         * <p>The ID of the RDS Supabase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ra-supabase-8moov5lxba****</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * NatCreatedBy.
         */
        public Builder natCreatedBy(String natCreatedBy) {
            this.natCreatedBy = natCreatedBy;
            return this;
        }

        /**
         * NatGatewayId.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * NatStatus.
         */
        public Builder natStatus(String natStatus) {
            this.natStatus = natStatus;
            return this;
        }

        /**
         * <p>The public endpoint of the AI application.</p>
         * 
         * <strong>example:</strong>
         * <p>8.152. XXX.XXX:8000</p>
         */
        public Builder publicConnectionString(String publicConnectionString) {
            this.publicConnectionString = publicConnectionString;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/2623972.html">Instance state table</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zeaepb8k4ku05ov2****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The internal endpoint of the AI application.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XXX.XXX:8000</p>
         */
        public Builder vpcConnectionString(String vpcConnectionString) {
            this.vpcConnectionString = vpcConnectionString;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-i</p>
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
