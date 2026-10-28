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
 * {@link DescribeGadInstanceDbMembersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGadInstanceDbMembersResponseBody</p>
 */
public class DescribeGadInstanceDbMembersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("DbEngineType")
    private String dbEngineType;

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

    @com.aliyun.core.annotation.NameInMap("MasterDbInstanceId")
    private String masterDbInstanceId;

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

    private DescribeGadInstanceDbMembersResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.dbEngineType = builder.dbEngineType;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.masterDbInstanceId = builder.masterDbInstanceId;
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

    public static DescribeGadInstanceDbMembersResponseBody create() {
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
     * @return masterDbInstanceId
     */
    public String getMasterDbInstanceId() {
        return this.masterDbInstanceId;
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
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private String httpStatusCode; 
        private String instanceId; 
        private String instanceName; 
        private String masterDbInstanceId; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private SlaveDbInstances slaveDbInstances; 
        private String status; 
        private String success; 

        private Builder() {
        } 

        private Builder(DescribeGadInstanceDbMembersResponseBody model) {
            this.createTime = model.createTime;
            this.dbEngineType = model.dbEngineType;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.instanceId = model.instanceId;
            this.instanceName = model.instanceName;
            this.masterDbInstanceId = model.masterDbInstanceId;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.slaveDbInstances = model.slaveDbInstances;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>The timestamp when the instance was created.</p>
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
         * <p>SQLServer</p>
         */
        public Builder dbEngineType(String dbEngineType) {
            this.dbEngineType = dbEngineType;
            return this;
        }

        /**
         * <p>The dynamic error code associated with the request.</p>
         * 
         * <strong>example:</strong>
         * <p>403</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message, which is used to replace the <strong>%s</strong> placeholder in the <strong>ErrMessage</strong> error message.</p>
         * <blockquote>
         * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>Type</strong>, it indicates that the <strong>Type</strong> request parameter is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DtsJobId</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error code returned if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
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
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gad-pfx10jt8b8m***</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>gad-sqlserver-**-set4</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The instance ID of the primary role.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-j6c685****1kb05</p>
         */
        public Builder masterDbInstanceId(String masterDbInstanceId) {
            this.masterDbInstanceId = masterDbInstanceId;
            return this;
        }

        /**
         * <p>The region where the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
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
         * <p>FC3BAAF2-74E3-4471-8EB5-96202D6A****</p>
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
         * <p>The status of the active geo-redundancy instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeGadInstanceDbMembersResponseBody build() {
            return new DescribeGadInstanceDbMembersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGadInstanceDbMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDbMembersResponseBody</p>
     */
    public static class SlaveDbInstancesSlaveDbInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DbInstanceId")
        private String dbInstanceId;

        @com.aliyun.core.annotation.NameInMap("DtsInstanceId")
        private String dtsInstanceId;

        @com.aliyun.core.annotation.NameInMap("SyncArchitecture")
        private String syncArchitecture;

        private SlaveDbInstancesSlaveDbInstances(Builder builder) {
            this.createTime = builder.createTime;
            this.dbInstanceId = builder.dbInstanceId;
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
            private String dtsInstanceId; 
            private String syncArchitecture; 

            private Builder() {
            } 

            private Builder(SlaveDbInstancesSlaveDbInstances model) {
                this.createTime = model.createTime;
                this.dbInstanceId = model.dbInstanceId;
                this.dtsInstanceId = model.dtsInstanceId;
                this.syncArchitecture = model.syncArchitecture;
            } 

            /**
             * <p>The timestamp when the instance was created.</p>
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
     * {@link DescribeGadInstanceDbMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDbMembersResponseBody</p>
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
