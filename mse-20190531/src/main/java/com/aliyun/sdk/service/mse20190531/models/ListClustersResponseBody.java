// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link ListClustersResponseBody} extends {@link TeaModel}
 *
 * <p>ListClustersResponseBody</p>
 */
public class ListClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private String httpCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListClustersResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return httpCode
     */
    public String getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errorCode; 
        private String httpCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * <p>The details of the data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-100-000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>202</p>
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request was successfully processed.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>69AD2AA7-DB47-449B-941B-B14409DF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of returned instances.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListClustersResponseBody build() {
            return new ListClustersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
     */
    public static class MaintenancePeriod extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private MaintenancePeriod(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MaintenancePeriod create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public MaintenancePeriod build() {
                return new MaintenancePeriod(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("CanUpdate")
        private Boolean canUpdate;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("ClusterAliasName")
        private String clusterAliasName;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("InitStatus")
        private String initStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Long instanceCount;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InternetAddress")
        private String internetAddress;

        @com.aliyun.core.annotation.NameInMap("InternetDomain")
        private String internetDomain;

        @com.aliyun.core.annotation.NameInMap("IntranetAddress")
        private String intranetAddress;

        @com.aliyun.core.annotation.NameInMap("IntranetDomain")
        private String intranetDomain;

        @com.aliyun.core.annotation.NameInMap("MaintenancePeriod")
        private MaintenancePeriod maintenancePeriod;

        @com.aliyun.core.annotation.NameInMap("MseVersion")
        private String mseVersion;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.Map<String, ?> tags;

        @com.aliyun.core.annotation.NameInMap("VersionCode")
        private String versionCode;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Data(Builder builder) {
            this.appVersion = builder.appVersion;
            this.canUpdate = builder.canUpdate;
            this.chargeType = builder.chargeType;
            this.clusterAliasName = builder.clusterAliasName;
            this.clusterName = builder.clusterName;
            this.clusterType = builder.clusterType;
            this.createTime = builder.createTime;
            this.endDate = builder.endDate;
            this.initStatus = builder.initStatus;
            this.instanceCount = builder.instanceCount;
            this.instanceId = builder.instanceId;
            this.internetAddress = builder.internetAddress;
            this.internetDomain = builder.internetDomain;
            this.intranetAddress = builder.intranetAddress;
            this.intranetDomain = builder.intranetDomain;
            this.maintenancePeriod = builder.maintenancePeriod;
            this.mseVersion = builder.mseVersion;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
            this.versionCode = builder.versionCode;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return canUpdate
         */
        public Boolean getCanUpdate() {
            return this.canUpdate;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return clusterAliasName
         */
        public String getClusterAliasName() {
            return this.clusterAliasName;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return initStatus
         */
        public String getInitStatus() {
            return this.initStatus;
        }

        /**
         * @return instanceCount
         */
        public Long getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return internetAddress
         */
        public String getInternetAddress() {
            return this.internetAddress;
        }

        /**
         * @return internetDomain
         */
        public String getInternetDomain() {
            return this.internetDomain;
        }

        /**
         * @return intranetAddress
         */
        public String getIntranetAddress() {
            return this.intranetAddress;
        }

        /**
         * @return intranetDomain
         */
        public String getIntranetDomain() {
            return this.intranetDomain;
        }

        /**
         * @return maintenancePeriod
         */
        public MaintenancePeriod getMaintenancePeriod() {
            return this.maintenancePeriod;
        }

        /**
         * @return mseVersion
         */
        public String getMseVersion() {
            return this.mseVersion;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tags
         */
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        /**
         * @return versionCode
         */
        public String getVersionCode() {
            return this.versionCode;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String appVersion; 
            private Boolean canUpdate; 
            private String chargeType; 
            private String clusterAliasName; 
            private String clusterName; 
            private String clusterType; 
            private String createTime; 
            private String endDate; 
            private String initStatus; 
            private Long instanceCount; 
            private String instanceId; 
            private String internetAddress; 
            private String internetDomain; 
            private String intranetAddress; 
            private String intranetDomain; 
            private MaintenancePeriod maintenancePeriod; 
            private String mseVersion; 
            private String resourceGroupId; 
            private java.util.Map<String, ?> tags; 
            private String versionCode; 
            private String vpcId; 

            /**
             * <p>The application version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.9.3</p>
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * <p>Indicates whether the instance can be upgraded.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canUpdate(Boolean canUpdate) {
                this.canUpdate = canUpdate;
                return this;
            }

            /**
             * <p>The billing method, such as subscription or pay-as-you-go.</p>
             * 
             * <strong>example:</strong>
             * <p>Pay-as-you-go</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The alias of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-7413****</p>
             */
            public Builder clusterAliasName(String clusterAliasName) {
                this.clusterAliasName = clusterAliasName;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-cn-st21ri2****</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The type of the cluster. Valid values: ZooKeeper, Nacos-Ans, and Eureka.</p>
             * 
             * <strong>example:</strong>
             * <p>Eureka</p>
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The time when the cluster was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-07-31 11:36:08</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the cluster expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-01 00:00:00</p>
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>The initialization status of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RESTART_SUCCESS</p>
             */
            public Builder initStatus(String initStatus) {
                this.initStatus = initStatus;
                return this;
            }

            /**
             * <p>The number of clusters.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder instanceCount(Long instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-cn-st21ri2****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>47.98.XX.XX</p>
             */
            public Builder internetAddress(String internetAddress) {
                this.internetAddress = internetAddress;
                return this;
            }

            /**
             * <p>The public endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-7413****-p.eureka.mse.aliyuncs.com</p>
             */
            public Builder internetDomain(String internetDomain) {
                this.internetDomain = internetDomain;
                return this;
            }

            /**
             * <p>The internal IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder intranetAddress(String intranetAddress) {
                this.intranetAddress = intranetAddress;
                return this;
            }

            /**
             * <p>The internal endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-7413****-eureka.mse.aliyuncs.com</p>
             */
            public Builder intranetDomain(String intranetDomain) {
                this.intranetDomain = intranetDomain;
                return this;
            }

            /**
             * MaintenancePeriod.
             */
            public Builder maintenancePeriod(MaintenancePeriod maintenancePeriod) {
                this.maintenancePeriod = maintenancePeriod;
                return this;
            }

            /**
             * <p>The edition of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>mse_pro</p>
             */
            public Builder mseVersion(String mseVersion) {
                this.mseVersion = mseVersion;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmv7jiavm4uxa</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The tags that are attached to the instance.</p>
             */
            public Builder tags(java.util.Map<String, ?> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The version information.</p>
             * 
             * <strong>example:</strong>
             * <p>EUREKA_1_9_3</p>
             */
            public Builder versionCode(String versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
