// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeGadInstanceDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGadInstanceDetailResponseBody</p>
 */
public class DescribeGadInstanceDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("DbEngineType")
    private String dbEngineType;

    @com.aliyun.core.annotation.NameInMap("DbListMode")
    private Integer dbListMode;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("MasterDbInstanceId")
    private String masterDbInstanceId;

    @com.aliyun.core.annotation.NameInMap("MasterDbInstanceRegion")
    private String masterDbInstanceRegion;

    @com.aliyun.core.annotation.NameInMap("MasterDblnstanceZoneld")
    private String masterDblnstanceZoneld;

    @com.aliyun.core.annotation.NameInMap("MasterEngineArchType")
    private Integer masterEngineArchType;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("SlaveDbInstances")
    private SlaveDbInstances slaveDbInstances;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeGadInstanceDetailResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.dbEngineType = builder.dbEngineType;
        this.dbListMode = builder.dbListMode;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.instanceType = builder.instanceType;
        this.masterDbInstanceId = builder.masterDbInstanceId;
        this.masterDbInstanceRegion = builder.masterDbInstanceRegion;
        this.masterDblnstanceZoneld = builder.masterDblnstanceZoneld;
        this.masterEngineArchType = builder.masterEngineArchType;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.slaveDbInstances = builder.slaveDbInstances;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGadInstanceDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return dbEngineType
     */
    public String getDbEngineType() {
        return this.dbEngineType;
    }

    /**
     * @return dbListMode
     */
    public Integer getDbListMode() {
        return this.dbListMode;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return masterDbInstanceId
     */
    public String getMasterDbInstanceId() {
        return this.masterDbInstanceId;
    }

    /**
     * @return masterDbInstanceRegion
     */
    public String getMasterDbInstanceRegion() {
        return this.masterDbInstanceRegion;
    }

    /**
     * @return masterDblnstanceZoneld
     */
    public String getMasterDblnstanceZoneld() {
        return this.masterDblnstanceZoneld;
    }

    /**
     * @return masterEngineArchType
     */
    public Integer getMasterEngineArchType() {
        return this.masterEngineArchType;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return slaveDbInstances
     */
    public SlaveDbInstances getSlaveDbInstances() {
        return this.slaveDbInstances;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long createTime; 
        private String dbEngineType; 
        private Integer dbListMode; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private String httpStatusCode; 
        private String instanceId; 
        private String instanceName; 
        private String instanceType; 
        private String masterDbInstanceId; 
        private String masterDbInstanceRegion; 
        private String masterDblnstanceZoneld; 
        private Integer masterEngineArchType; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private SlaveDbInstances slaveDbInstances; 
        private String status; 
        private String success; 

        private Builder() {
        } 

        private Builder(DescribeGadInstanceDetailResponseBody model) {
            this.createTime = model.createTime;
            this.dbEngineType = model.dbEngineType;
            this.dbListMode = model.dbListMode;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.instanceId = model.instanceId;
            this.instanceName = model.instanceName;
            this.instanceType = model.instanceType;
            this.masterDbInstanceId = model.masterDbInstanceId;
            this.masterDbInstanceRegion = model.masterDbInstanceRegion;
            this.masterDblnstanceZoneld = model.masterDblnstanceZoneld;
            this.masterEngineArchType = model.masterEngineArchType;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.slaveDbInstances = model.slaveDbInstances;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>The creation timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1770393523000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder dbEngineType(String dbEngineType) {
            this.dbEngineType = dbEngineType;
            return this;
        }

        /**
         * <p>The database list mode in disaster recovery scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dbListMode(Integer dbListMode) {
            this.dbListMode = dbListMode;
            return this;
        }

        /**
         * <p>The dynamic error code. This parameter will be deprecated soon.</p>
         * 
         * <strong>example:</strong>
         * <p>403</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message related to the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DtsJobId</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error code returned when an error occurs during the call.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned when an error occurs during the call.</p>
         * 
         * <strong>example:</strong>
         * <p>The request processing has failed due to some unknown error.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The ID of the global active instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp162d4tp0500****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the global active instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The GAD instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The instance ID of the primary instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp162d4tp0500**</p>
         */
        public Builder masterDbInstanceId(String masterDbInstanceId) {
            this.masterDbInstanceId = masterDbInstanceId;
            return this;
        }

        /**
         * <p>The region of the primary instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder masterDbInstanceRegion(String masterDbInstanceRegion) {
            this.masterDbInstanceRegion = masterDbInstanceRegion;
            return this;
        }

        /**
         * <p>The zone of the primary instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder masterDblnstanceZoneld(String masterDblnstanceZoneld) {
            this.masterDblnstanceZoneld = masterDblnstanceZoneld;
            return this;
        }

        /**
         * <p>The architecture type of the primary MongoDB instance. This parameter is specific to MongoDB. Valid values:</p>
         * <ul>
         * <li>1: replica set</li>
         * <li>2: sharded cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder masterEngineArchType(Integer masterEngineArchType) {
            this.masterEngineArchType = masterEngineArchType;
            return this;
        }

        /**
         * <p>The region ID. You can specify this parameter to indicate the region where the instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C166D79D-436B-45F0-B5A5-25E1959F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * SlaveDbInstances.
         */
        public Builder slaveDbInstances(SlaveDbInstances slaveDbInstances) {
            this.slaveDbInstances = slaveDbInstances;
            return this;
        }

        /**
         * <p>The status of the global active instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeGadInstanceDetailResponseBody build() {
            return new DescribeGadInstanceDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGadInstanceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDetailResponseBody</p>
     */
    public static class SlaveDbInstancesSlaveDbInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DbInstanceId")
        private String dbInstanceId;

        @com.aliyun.core.annotation.NameInMap("DbInstanceRegion")
        private String dbInstanceRegion;

        @com.aliyun.core.annotation.NameInMap("DtsInstanceId")
        private String dtsInstanceId;

        @com.aliyun.core.annotation.NameInMap("SyncArchitecture")
        private String syncArchitecture;

        private SlaveDbInstancesSlaveDbInstances(Builder builder) {
            this.createTime = builder.createTime;
            this.dbInstanceId = builder.dbInstanceId;
            this.dbInstanceRegion = builder.dbInstanceRegion;
            this.dtsInstanceId = builder.dtsInstanceId;
            this.syncArchitecture = builder.syncArchitecture;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlaveDbInstancesSlaveDbInstances create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dbInstanceId
         */
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        /**
         * @return dbInstanceRegion
         */
        public String getDbInstanceRegion() {
            return this.dbInstanceRegion;
        }

        /**
         * @return dtsInstanceId
         */
        public String getDtsInstanceId() {
            return this.dtsInstanceId;
        }

        /**
         * @return syncArchitecture
         */
        public String getSyncArchitecture() {
            return this.syncArchitecture;
        }

        public static final class Builder {
            private Long createTime; 
            private String dbInstanceId; 
            private String dbInstanceRegion; 
            private String dtsInstanceId; 
            private String syncArchitecture; 

            private Builder() {
            } 

            private Builder(SlaveDbInstancesSlaveDbInstances model) {
                this.createTime = model.createTime;
                this.dbInstanceId = model.dbInstanceId;
                this.dbInstanceRegion = model.dbInstanceRegion;
                this.dtsInstanceId = model.dtsInstanceId;
                this.syncArchitecture = model.syncArchitecture;
            } 

            /**
             * <p>The creation timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1770393523000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DbInstanceId.
             */
            public Builder dbInstanceId(String dbInstanceId) {
                this.dbInstanceId = dbInstanceId;
                return this;
            }

            /**
             * DbInstanceRegion.
             */
            public Builder dbInstanceRegion(String dbInstanceRegion) {
                this.dbInstanceRegion = dbInstanceRegion;
                return this;
            }

            /**
             * DtsInstanceId.
             */
            public Builder dtsInstanceId(String dtsInstanceId) {
                this.dtsInstanceId = dtsInstanceId;
                return this;
            }

            /**
             * SyncArchitecture.
             */
            public Builder syncArchitecture(String syncArchitecture) {
                this.syncArchitecture = syncArchitecture;
                return this;
            }

            public SlaveDbInstancesSlaveDbInstances build() {
                return new SlaveDbInstancesSlaveDbInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDetailResponseBody</p>
     */
    public static class SlaveDbInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SlaveDbInstances")
        private java.util.List<SlaveDbInstancesSlaveDbInstances> slaveDbInstances;

        private SlaveDbInstances(Builder builder) {
            this.slaveDbInstances = builder.slaveDbInstances;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlaveDbInstances create() {
            return builder().build();
        }

        /**
         * @return slaveDbInstances
         */
        public java.util.List<SlaveDbInstancesSlaveDbInstances> getSlaveDbInstances() {
            return this.slaveDbInstances;
        }

        public static final class Builder {
            private java.util.List<SlaveDbInstancesSlaveDbInstances> slaveDbInstances; 

            private Builder() {
            } 

            private Builder(SlaveDbInstances model) {
                this.slaveDbInstances = model.slaveDbInstances;
            } 

            /**
             * SlaveDbInstances.
             */
            public Builder slaveDbInstances(java.util.List<SlaveDbInstancesSlaveDbInstances> slaveDbInstances) {
                this.slaveDbInstances = slaveDbInstances;
                return this;
            }

            public SlaveDbInstances build() {
                return new SlaveDbInstances(this);
            } 

        } 

    }
}
