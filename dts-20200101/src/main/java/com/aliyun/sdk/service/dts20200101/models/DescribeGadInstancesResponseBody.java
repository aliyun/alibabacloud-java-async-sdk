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
 * {@link DescribeGadInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGadInstancesResponseBody</p>
 */
public class DescribeGadInstancesResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("Instances")
    private Instances instances;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeGadInstancesResponseBody(Builder builder) {
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.instances = builder.instances;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGadInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return instances
     */
    public Instances getInstances() {
        return this.instances;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private String httpStatusCode; 
        private Instances instances; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private String success; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeGadInstancesResponseBody model) {
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.instances = model.instances;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Instances.
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeGadInstancesResponseBody build() {
            return new DescribeGadInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGadInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstancesResponseBody</p>
     */
    public static class InstancesInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DbEngineType")
        private String dbEngineType;

        @com.aliyun.core.annotation.NameInMap("DbInstanceCount")
        private Integer dbInstanceCount;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceRegion")
        private String instanceRegion;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("MasterDbInstanceId")
        private String masterDbInstanceId;

        @com.aliyun.core.annotation.NameInMap("MasterDbInstanceName")
        private String masterDbInstanceName;

        @com.aliyun.core.annotation.NameInMap("MasterDbInstanceRegion")
        private String masterDbInstanceRegion;

        @com.aliyun.core.annotation.NameInMap("MasterDbInstanceZoneId")
        private String masterDbInstanceZoneId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private InstancesInstances(Builder builder) {
            this.createTime = builder.createTime;
            this.dbEngineType = builder.dbEngineType;
            this.dbInstanceCount = builder.dbInstanceCount;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceRegion = builder.instanceRegion;
            this.instanceType = builder.instanceType;
            this.masterDbInstanceId = builder.masterDbInstanceId;
            this.masterDbInstanceName = builder.masterDbInstanceName;
            this.masterDbInstanceRegion = builder.masterDbInstanceRegion;
            this.masterDbInstanceZoneId = builder.masterDbInstanceZoneId;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstancesInstances create() {
            return builder().build();
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
         * @return dbInstanceCount
         */
        public Integer getDbInstanceCount() {
            return this.dbInstanceCount;
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
         * @return instanceRegion
         */
        public String getInstanceRegion() {
            return this.instanceRegion;
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
         * @return masterDbInstanceName
         */
        public String getMasterDbInstanceName() {
            return this.masterDbInstanceName;
        }

        /**
         * @return masterDbInstanceRegion
         */
        public String getMasterDbInstanceRegion() {
            return this.masterDbInstanceRegion;
        }

        /**
         * @return masterDbInstanceZoneId
         */
        public String getMasterDbInstanceZoneId() {
            return this.masterDbInstanceZoneId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long createTime; 
            private String dbEngineType; 
            private Integer dbInstanceCount; 
            private String instanceId; 
            private String instanceName; 
            private String instanceRegion; 
            private String instanceType; 
            private String masterDbInstanceId; 
            private String masterDbInstanceName; 
            private String masterDbInstanceRegion; 
            private String masterDbInstanceZoneId; 
            private String resourceGroupId; 
            private String status; 

            private Builder() {
            } 

            private Builder(InstancesInstances model) {
                this.createTime = model.createTime;
                this.dbEngineType = model.dbEngineType;
                this.dbInstanceCount = model.dbInstanceCount;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.instanceRegion = model.instanceRegion;
                this.instanceType = model.instanceType;
                this.masterDbInstanceId = model.masterDbInstanceId;
                this.masterDbInstanceName = model.masterDbInstanceName;
                this.masterDbInstanceRegion = model.masterDbInstanceRegion;
                this.masterDbInstanceZoneId = model.masterDbInstanceZoneId;
                this.resourceGroupId = model.resourceGroupId;
                this.status = model.status;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DbEngineType.
             */
            public Builder dbEngineType(String dbEngineType) {
                this.dbEngineType = dbEngineType;
                return this;
            }

            /**
             * DbInstanceCount.
             */
            public Builder dbInstanceCount(Integer dbInstanceCount) {
                this.dbInstanceCount = dbInstanceCount;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * InstanceRegion.
             */
            public Builder instanceRegion(String instanceRegion) {
                this.instanceRegion = instanceRegion;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * MasterDbInstanceId.
             */
            public Builder masterDbInstanceId(String masterDbInstanceId) {
                this.masterDbInstanceId = masterDbInstanceId;
                return this;
            }

            /**
             * MasterDbInstanceName.
             */
            public Builder masterDbInstanceName(String masterDbInstanceName) {
                this.masterDbInstanceName = masterDbInstanceName;
                return this;
            }

            /**
             * MasterDbInstanceRegion.
             */
            public Builder masterDbInstanceRegion(String masterDbInstanceRegion) {
                this.masterDbInstanceRegion = masterDbInstanceRegion;
                return this;
            }

            /**
             * MasterDbInstanceZoneId.
             */
            public Builder masterDbInstanceZoneId(String masterDbInstanceZoneId) {
                this.masterDbInstanceZoneId = masterDbInstanceZoneId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public InstancesInstances build() {
                return new InstancesInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instances")
        private java.util.List<InstancesInstances> instances;

        private Instances(Builder builder) {
            this.instances = builder.instances;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instances
         */
        public java.util.List<InstancesInstances> getInstances() {
            return this.instances;
        }

        public static final class Builder {
            private java.util.List<InstancesInstances> instances; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.instances = model.instances;
            } 

            /**
             * Instances.
             */
            public Builder instances(java.util.List<InstancesInstances> instances) {
                this.instances = instances;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
