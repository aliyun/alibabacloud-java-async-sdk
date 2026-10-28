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
 * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGadInstanceDtsMembersResponseBody</p>
 */
public class DescribeGadInstanceDtsMembersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("DbEngineType")
    private String dbEngineType;

    @com.aliyun.core.annotation.NameInMap("DtsJobList")
    private java.util.List<DtsJobList> dtsJobList;

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

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeGadInstanceDtsMembersResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.dbEngineType = builder.dbEngineType;
        this.dtsJobList = builder.dtsJobList;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.success = builder.success;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGadInstanceDtsMembersResponseBody create() {
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
     * @return dtsJobList
     */
    public java.util.List<DtsJobList> getDtsJobList() {
        return this.dtsJobList;
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

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private Long createTime; 
        private String dbEngineType; 
        private java.util.List<DtsJobList> dtsJobList; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private String httpStatusCode; 
        private String instanceId; 
        private String instanceName; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private String status; 
        private String success; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeGadInstanceDtsMembersResponseBody model) {
            this.createTime = model.createTime;
            this.dbEngineType = model.dbEngineType;
            this.dtsJobList = model.dtsJobList;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.instanceId = model.instanceId;
            this.instanceName = model.instanceName;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.status = model.status;
            this.success = model.success;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-28 17:34:53.0</p>
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
         * <p>The list of tasks and the execution details of each task.</p>
         */
        public Builder dtsJobList(java.util.List<DtsJobList> dtsJobList) {
            this.dtsJobList = dtsJobList;
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
         * <p>The dynamic error message, which is used to replace the <strong>%s</strong> in the <strong>ErrMessage</strong> response parameter.</p>
         * <blockquote>
         * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the specified request parameter <strong>DtsJobId</strong> is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>present environment is not support,so skip.</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error code returned when the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned when a call error occurs.</p>
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
         * <p>The ID of the active-active instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1i99e8l7913****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the active-active instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The page number.</p>
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
         * <p>30</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The region ID of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
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
         * <p>The status of the active geo-redundancy instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is successful.</li>
         * <li><strong>false</strong>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeGadInstanceDtsMembersResponseBody build() {
            return new DescribeGadInstanceDtsMembersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class DataCloudStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DataCloudStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataCloudStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            private Builder() {
            } 

            private Builder(DataCloudStatus model) {
                this.errorMessage = model.errorMessage;
                this.needUpgrade = model.needUpgrade;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message for a failed task.</p>
             * 
             * <strong>example:</strong>
             * <p>The specified product does not exist.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the instance specifications need to be upgraded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * <p>The task progress. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of tables that have been migrated.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The status of the physical migration to the cloud task.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataCloudStatus build() {
                return new DataCloudStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class DataEtlStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DataEtlStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataEtlStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            private Builder() {
            } 

            private Builder(DataEtlStatus model) {
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message for a failed ETL task.</p>
             * 
             * <strong>example:</strong>
             * <p>The specified product does not exist.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The ETL task progress. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of records for which the ETL task is completed.</p>
             * 
             * <strong>example:</strong>
             * <p>75</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The log level of the log information. Multiple statuses are separated by commas (,). Valid values:</p>
             * <ul>
             * <li><strong>NORMAL</strong>: Normal.</li>
             * <li><strong>WARN</strong>: Warning.</li>
             * <li><strong>ERROR</strong>: Error.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataEtlStatus build() {
                return new DataEtlStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class DataInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DataInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            private Builder() {
            } 

            private Builder(DataInitializationStatus model) {
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message for failed full data migration or initial data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>The deviceName is empty.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of full data migration or initial data synchronization. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of records for which full data migration or initial data synchronization is completed.</p>
             * 
             * <strong>example:</strong>
             * <p>35</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The status of full data migration or initial data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataInitializationStatus build() {
                return new DataInitializationStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class DataSynchronizationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DataSynchronizationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSynchronizationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            private Builder() {
            } 

            private Builder(DataSynchronizationStatus model) {
                this.errorMessage = model.errorMessage;
                this.needUpgrade = model.needUpgrade;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message for failed incremental data migration or synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>The deviceName format is incorrect.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the instance specifications need to be upgraded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * <blockquote>
             * <p>To upgrade the instance specifications, call the <a href="https://help.aliyun.com/document_detail/281093.html">TransferInstanceClass</a> operation.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * <p>The progress of incremental data migration or synchronization. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of records for which incremental data migration or synchronization is completed.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The log level of the log information. Multiple statuses are separated by commas (,). Valid values:</p>
             * <ul>
             * <li><strong>NORMAL</strong>: Normal.</li>
             * <li><strong>WARN</strong>: Warning.</li>
             * <li><strong>ERROR</strong>: Error.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataSynchronizationStatus build() {
                return new DataSynchronizationStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class DestinationEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("OracleSID")
        private String oracleSID;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private DestinationEndpoint(Builder builder) {
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.ip = builder.ip;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.region = builder.region;
            this.sslSolutionEnum = builder.sslSolutionEnum;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationEndpoint create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return sslSolutionEnum
         */
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String databaseName; 
            private String engineName; 
            private String instanceID; 
            private String instanceType; 
            private String ip; 
            private String oracleSID; 
            private String port; 
            private String region; 
            private String sslSolutionEnum; 
            private String userName; 

            private Builder() {
            } 

            private Builder(DestinationEndpoint model) {
                this.databaseName = model.databaseName;
                this.engineName = model.engineName;
                this.instanceID = model.instanceID;
                this.instanceType = model.instanceType;
                this.ip = model.ip;
                this.oracleSID = model.oracleSID;
                this.port = model.port;
                this.region = model.region;
                this.sslSolutionEnum = model.sslSolutionEnum;
                this.userName = model.userName;
            } 

            /**
             * <p>The name of the database to which the migration objects in the instance belong.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database engine type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1imrtn6fq7h****</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The endpoint of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.88.***</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The SID of the Oracle database.</p>
             * <blockquote>
             * <p>This parameter is returned only when the <strong>EngineName</strong> parameter of the destination instance is set to <strong>Oracle</strong> and the Oracle database is a non-RAC instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testsid</p>
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * <p>The database service port of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The region where the instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>Indicates whether an SSL-secured connection is used. Valid values:</p>
             * <ul>
             * <li><strong>DISABLE</strong>: SSL-secured connections are not used.</li>
             * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL-secured connections are used, and a CA certificate is uploaded.</li>
             * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL-secured connections to AWS MongoDB Atlas are used.</li>
             * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to connect to Kafka.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DISABLE</p>
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>dts</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public DestinationEndpoint build() {
                return new DestinationEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class ErrorDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("HelpUrl")
        private String helpUrl;

        private ErrorDetails(Builder builder) {
            this.errorCode = builder.errorCode;
            this.helpUrl = builder.helpUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorDetails create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return helpUrl
         */
        public String getHelpUrl() {
            return this.helpUrl;
        }

        public static final class Builder {
            private String errorCode; 
            private String helpUrl; 

            private Builder() {
            } 

            private Builder(ErrorDetails model) {
                this.errorCode = model.errorCode;
                this.helpUrl = model.helpUrl;
            } 

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The URL of the help document.</p>
             * 
             * <strong>example:</strong>
             * <p>https://<strong>.ali</strong>.com/**</p>
             */
            public Builder helpUrl(String helpUrl) {
                this.helpUrl = helpUrl;
                return this;
            }

            public ErrorDetails build() {
                return new ErrorDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class FullDataCheckStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private FullDataCheckStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullDataCheckStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            private Builder() {
            } 

            private Builder(FullDataCheckStatus model) {
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message for a failed task.</p>
             * 
             * <strong>example:</strong>
             * <p>device status is offline</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of the full data verification task. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The completion progress of the full data verification task.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The status information of full data verification.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public FullDataCheckStatus build() {
                return new FullDataCheckStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class IncDataCheckStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private IncDataCheckStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IncDataCheckStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            private Builder() {
            } 

            private Builder(IncDataCheckStatus model) {
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message for a failed task.</p>
             * 
             * <strong>example:</strong>
             * <p>voice intercom existed</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of the incremental data verification task. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The completion progress of the incremental data verification task.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The status information of incremental data verification.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public IncDataCheckStatus build() {
                return new IncDataCheckStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class MigrationMode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataInitialization")
        private Boolean dataInitialization;

        @com.aliyun.core.annotation.NameInMap("DataSynchronization")
        private Boolean dataSynchronization;

        @com.aliyun.core.annotation.NameInMap("FullDataCheck")
        private Boolean fullDataCheck;

        @com.aliyun.core.annotation.NameInMap("IncDataCheck")
        private Boolean incDataCheck;

        @com.aliyun.core.annotation.NameInMap("StructureInitialization")
        private Boolean structureInitialization;

        private MigrationMode(Builder builder) {
            this.dataInitialization = builder.dataInitialization;
            this.dataSynchronization = builder.dataSynchronization;
            this.fullDataCheck = builder.fullDataCheck;
            this.incDataCheck = builder.incDataCheck;
            this.structureInitialization = builder.structureInitialization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrationMode create() {
            return builder().build();
        }

        /**
         * @return dataInitialization
         */
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        /**
         * @return dataSynchronization
         */
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        /**
         * @return fullDataCheck
         */
        public Boolean getFullDataCheck() {
            return this.fullDataCheck;
        }

        /**
         * @return incDataCheck
         */
        public Boolean getIncDataCheck() {
            return this.incDataCheck;
        }

        /**
         * @return structureInitialization
         */
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

        public static final class Builder {
            private Boolean dataInitialization; 
            private Boolean dataSynchronization; 
            private Boolean fullDataCheck; 
            private Boolean incDataCheck; 
            private Boolean structureInitialization; 

            private Builder() {
            } 

            private Builder(MigrationMode model) {
                this.dataInitialization = model.dataInitialization;
                this.dataSynchronization = model.dataSynchronization;
                this.fullDataCheck = model.fullDataCheck;
                this.incDataCheck = model.incDataCheck;
                this.structureInitialization = model.structureInitialization;
            } 

            /**
             * <p>Indicates whether full data migration or initial full data synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dataInitialization(Boolean dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * <p>Indicates whether incremental data migration or synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dataSynchronization(Boolean dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * <p>Indicates whether full data validation is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder fullDataCheck(Boolean fullDataCheck) {
                this.fullDataCheck = fullDataCheck;
                return this;
            }

            /**
             * <p>Indicates whether incremental data validation is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder incDataCheck(Boolean incDataCheck) {
                this.incDataCheck = incDataCheck;
                return this;
            }

            /**
             * <p>Indicates whether schema migration or initial schema synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder structureInitialization(Boolean structureInitialization) {
                this.structureInitialization = structureInitialization;
                return this;
            }

            public MigrationMode build() {
                return new MigrationMode(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class Performance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Flow")
        private String flow;

        @com.aliyun.core.annotation.NameInMap("Rps")
        private String rps;

        private Performance(Builder builder) {
            this.flow = builder.flow;
            this.rps = builder.rps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Performance create() {
            return builder().build();
        }

        /**
         * @return flow
         */
        public String getFlow() {
            return this.flow;
        }

        /**
         * @return rps
         */
        public String getRps() {
            return this.rps;
        }

        public static final class Builder {
            private String flow; 
            private String rps; 

            private Builder() {
            } 

            private Builder(Performance model) {
                this.flow = model.flow;
                this.rps = model.rps;
            } 

            /**
             * <p>The data migration or synchronization traffic per second, in MB/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * <p>The number of SQL statements migrated or synchronized per second, including BEGIN, COMMIT, DML statements (INSERT, DELETE, and UPDATE), and DDL statements.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder rps(String rps) {
                this.rps = rps;
                return this;
            }

            public Performance build() {
                return new Performance(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckItem")
        private String checkItem;

        @com.aliyun.core.annotation.NameInMap("CheckItemDescription")
        private String checkItemDescription;

        @com.aliyun.core.annotation.NameInMap("CheckResult")
        private String checkResult;

        @com.aliyun.core.annotation.NameInMap("FailedReason")
        private String failedReason;

        @com.aliyun.core.annotation.NameInMap("RepairMethod")
        private String repairMethod;

        private Detail(Builder builder) {
            this.checkItem = builder.checkItem;
            this.checkItemDescription = builder.checkItemDescription;
            this.checkResult = builder.checkResult;
            this.failedReason = builder.failedReason;
            this.repairMethod = builder.repairMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return checkItem
         */
        public String getCheckItem() {
            return this.checkItem;
        }

        /**
         * @return checkItemDescription
         */
        public String getCheckItemDescription() {
            return this.checkItemDescription;
        }

        /**
         * @return checkResult
         */
        public String getCheckResult() {
            return this.checkResult;
        }

        /**
         * @return failedReason
         */
        public String getFailedReason() {
            return this.failedReason;
        }

        /**
         * @return repairMethod
         */
        public String getRepairMethod() {
            return this.repairMethod;
        }

        public static final class Builder {
            private String checkItem; 
            private String checkItemDescription; 
            private String checkResult; 
            private String failedReason; 
            private String repairMethod; 

            private Builder() {
            } 

            private Builder(Detail model) {
                this.checkItem = model.checkItem;
                this.checkItemDescription = model.checkItemDescription;
                this.checkResult = model.checkResult;
                this.failedReason = model.failedReason;
                this.repairMethod = model.repairMethod;
            } 

            /**
             * <p>The precheck item.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_CONN_SRC</p>
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * <p>The description of the precheck item.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_CONN_SRC_DETAIL</p>
             */
            public Builder checkItemDescription(String checkItemDescription) {
                this.checkItemDescription = checkItemDescription;
                return this;
            }

            /**
             * <p>The check result. Valid values:</p>
             * <ul>
             * <li><strong>Success</strong>: The item passed the check.</li>
             * <li><strong>Failed</strong>: The item failed the check.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder checkResult(String checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * <p>The error message for the failed precheck.</p>
             * <blockquote>
             * <p>This parameter is returned only when the <strong>CheckResult</strong> parameter is set to <strong>Failed</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Original error: Access denied for user \&quot;dtstest\&quot;@\&quot;100.104.***.**\&quot; (using password: YES)</p>
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * <p>The solution for the failed precheck.</p>
             * <blockquote>
             * <p>This parameter is returned only when the <strong>CheckResult</strong> parameter is set to <strong>Failed</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>CHECK_ERROR_DEST_CONN_REPAIR2</p>
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class PrecheckStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.List<Detail> detail;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private PrecheckStatus(Builder builder) {
            this.detail = builder.detail;
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrecheckStatus create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List<Detail> getDetail() {
            return this.detail;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<Detail> detail; 
            private String errorMessage; 
            private String percent; 
            private String status; 

            private Builder() {
            } 

            private Builder(PrecheckStatus model) {
                this.detail = model.detail;
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.status = model.status;
            } 

            /**
             * <p>The execution status of each precheck item.</p>
             */
            public Builder detail(java.util.List<Detail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The error message for the precheck failure.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK__ERROR_SAME_OBJ.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The overall progress of the precheck, in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The precheck status.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PrecheckStatus build() {
                return new PrecheckStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class RetryState extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrMessage")
        private String errMessage;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MaxRetryTime")
        private Integer maxRetryTime;

        @com.aliyun.core.annotation.NameInMap("MigrationErrCode")
        private String migrationErrCode;

        @com.aliyun.core.annotation.NameInMap("MigrationErrHelpDocId")
        private String migrationErrHelpDocId;

        @com.aliyun.core.annotation.NameInMap("MigrationErrHelpDocKey")
        private String migrationErrHelpDocKey;

        @com.aliyun.core.annotation.NameInMap("MigrationErrMsg")
        private String migrationErrMsg;

        @com.aliyun.core.annotation.NameInMap("MigrationErrType")
        private String migrationErrType;

        @com.aliyun.core.annotation.NameInMap("MigrationErrWorkaround")
        private String migrationErrWorkaround;

        @com.aliyun.core.annotation.NameInMap("Module")
        private String module;

        @com.aliyun.core.annotation.NameInMap("RetryCount")
        private Integer retryCount;

        @com.aliyun.core.annotation.NameInMap("RetryTarget")
        private String retryTarget;

        @com.aliyun.core.annotation.NameInMap("RetryTime")
        private Integer retryTime;

        @com.aliyun.core.annotation.NameInMap("Retrying")
        private Boolean retrying;

        private RetryState(Builder builder) {
            this.errMessage = builder.errMessage;
            this.jobId = builder.jobId;
            this.maxRetryTime = builder.maxRetryTime;
            this.migrationErrCode = builder.migrationErrCode;
            this.migrationErrHelpDocId = builder.migrationErrHelpDocId;
            this.migrationErrHelpDocKey = builder.migrationErrHelpDocKey;
            this.migrationErrMsg = builder.migrationErrMsg;
            this.migrationErrType = builder.migrationErrType;
            this.migrationErrWorkaround = builder.migrationErrWorkaround;
            this.module = builder.module;
            this.retryCount = builder.retryCount;
            this.retryTarget = builder.retryTarget;
            this.retryTime = builder.retryTime;
            this.retrying = builder.retrying;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetryState create() {
            return builder().build();
        }

        /**
         * @return errMessage
         */
        public String getErrMessage() {
            return this.errMessage;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return maxRetryTime
         */
        public Integer getMaxRetryTime() {
            return this.maxRetryTime;
        }

        /**
         * @return migrationErrCode
         */
        public String getMigrationErrCode() {
            return this.migrationErrCode;
        }

        /**
         * @return migrationErrHelpDocId
         */
        public String getMigrationErrHelpDocId() {
            return this.migrationErrHelpDocId;
        }

        /**
         * @return migrationErrHelpDocKey
         */
        public String getMigrationErrHelpDocKey() {
            return this.migrationErrHelpDocKey;
        }

        /**
         * @return migrationErrMsg
         */
        public String getMigrationErrMsg() {
            return this.migrationErrMsg;
        }

        /**
         * @return migrationErrType
         */
        public String getMigrationErrType() {
            return this.migrationErrType;
        }

        /**
         * @return migrationErrWorkaround
         */
        public String getMigrationErrWorkaround() {
            return this.migrationErrWorkaround;
        }

        /**
         * @return module
         */
        public String getModule() {
            return this.module;
        }

        /**
         * @return retryCount
         */
        public Integer getRetryCount() {
            return this.retryCount;
        }

        /**
         * @return retryTarget
         */
        public String getRetryTarget() {
            return this.retryTarget;
        }

        /**
         * @return retryTime
         */
        public Integer getRetryTime() {
            return this.retryTime;
        }

        /**
         * @return retrying
         */
        public Boolean getRetrying() {
            return this.retrying;
        }

        public static final class Builder {
            private String errMessage; 
            private String jobId; 
            private Integer maxRetryTime; 
            private String migrationErrCode; 
            private String migrationErrHelpDocId; 
            private String migrationErrHelpDocKey; 
            private String migrationErrMsg; 
            private String migrationErrType; 
            private String migrationErrWorkaround; 
            private String module; 
            private Integer retryCount; 
            private String retryTarget; 
            private Integer retryTime; 
            private Boolean retrying; 

            private Builder() {
            } 

            private Builder(RetryState model) {
                this.errMessage = model.errMessage;
                this.jobId = model.jobId;
                this.maxRetryTime = model.maxRetryTime;
                this.migrationErrCode = model.migrationErrCode;
                this.migrationErrHelpDocId = model.migrationErrHelpDocId;
                this.migrationErrHelpDocKey = model.migrationErrHelpDocKey;
                this.migrationErrMsg = model.migrationErrMsg;
                this.migrationErrType = model.migrationErrType;
                this.migrationErrWorkaround = model.migrationErrWorkaround;
                this.module = model.module;
                this.retryCount = model.retryCount;
                this.retryTarget = model.retryTarget;
                this.retryTime = model.retryTime;
                this.retrying = model.retrying;
            } 

            /**
             * <p>The error message returned when a call error occurs.</p>
             * 
             * <strong>example:</strong>
             * <p>The request processing has failed due to some unknown error.</p>
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>bi6e22ay243****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The maximum retry time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>7200</p>
             */
            public Builder maxRetryTime(Integer maxRetryTime) {
                this.maxRetryTime = maxRetryTime;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>dts.retry.err.0046</p>
             */
            public Builder migrationErrCode(String migrationErrCode) {
                this.migrationErrCode = migrationErrCode;
                return this;
            }

            /**
             * <p>The ID of the help document for the error code.</p>
             * 
             * <strong>example:</strong>
             * <p>462133</p>
             */
            public Builder migrationErrHelpDocId(String migrationErrHelpDocId) {
                this.migrationErrHelpDocId = migrationErrHelpDocId;
                return this;
            }

            /**
             * <p>The key of the help document for the error code.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-RETRY-ERR-0046</p>
             */
            public Builder migrationErrHelpDocKey(String migrationErrHelpDocKey) {
                this.migrationErrHelpDocKey = migrationErrHelpDocKey;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>dts.retry.err.0046.msg</p>
             */
            public Builder migrationErrMsg(String migrationErrMsg) {
                this.migrationErrMsg = migrationErrMsg;
                return this;
            }

            /**
             * <p>The type of the error code.</p>
             * 
             * <strong>example:</strong>
             * <p>ForeignKey</p>
             */
            public Builder migrationErrType(String migrationErrType) {
                this.migrationErrType = migrationErrType;
                return this;
            }

            /**
             * <p>The error workaround.</p>
             * 
             * <strong>example:</strong>
             * <p>dts.retry.err.0046.workaround</p>
             */
            public Builder migrationErrWorkaround(String migrationErrWorkaround) {
                this.migrationErrWorkaround = migrationErrWorkaround;
                return this;
            }

            /**
             * <p>The instance progress.</p>
             * 
             * <strong>example:</strong>
             * <p>03</p>
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * <p>The number of retries.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder retryCount(Integer retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * <p>The retry target. Valid values:</p>
             * <ul>
             * <li><strong>srcDB</strong>: The source database.</li>
             * <li><strong>destDB</strong>: The destination database.</li>
             * <li><strong>inner_module</strong>: The internal module of DTS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>srcDB</p>
             */
            public Builder retryTarget(String retryTarget) {
                this.retryTarget = retryTarget;
                return this;
            }

            /**
             * <p>The elapsed retry time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder retryTime(Integer retryTime) {
                this.retryTime = retryTime;
                return this;
            }

            /**
             * <p>Indicates whether the task is being retried. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder retrying(Boolean retrying) {
                this.retrying = retrying;
                return this;
            }

            public RetryState build() {
                return new RetryState(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class ReverseJobDataInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ReverseJobDataInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobDataInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            private Builder() {
            } 

            private Builder(ReverseJobDataInitializationStatus model) {
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message for the initial full data synchronization failure.</p>
             * 
             * <strong>example:</strong>
             * <p>The deviceName format is incorrect.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of initial full data synchronization, in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of records for which initial full data synchronization is completed.</p>
             * 
             * <strong>example:</strong>
             * <p>43071</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The status of initial full data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ReverseJobDataInitializationStatus build() {
                return new ReverseJobDataInitializationStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class ReverseJobDataSynchronizationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ReverseJobDataSynchronizationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobDataSynchronizationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            private Builder() {
            } 

            private Builder(ReverseJobDataSynchronizationStatus model) {
                this.errorMessage = model.errorMessage;
                this.needUpgrade = model.needUpgrade;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message for the incremental data synchronization failure.</p>
             * 
             * <strong>example:</strong>
             * <p>Instance not found.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the instance specifications need to be upgraded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * <blockquote>
             * <p>To upgrade the instance specifications, call the <a href="https://help.aliyun.com/document_detail/281093.html">TransferInstanceClass</a> operation.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * <p>The progress of incremental data synchronization, in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of records for which incremental data migration or synchronization is completed.</p>
             * 
             * <strong>example:</strong>
             * <p>31</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The status of incremental data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ReverseJobDataSynchronizationStatus build() {
                return new ReverseJobDataSynchronizationStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class ReverseJobDestinationEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("OracleSID")
        private String oracleSID;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private ReverseJobDestinationEndpoint(Builder builder) {
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.ip = builder.ip;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.region = builder.region;
            this.sslSolutionEnum = builder.sslSolutionEnum;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobDestinationEndpoint create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return sslSolutionEnum
         */
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String databaseName; 
            private String engineName; 
            private String instanceID; 
            private String instanceType; 
            private String ip; 
            private String oracleSID; 
            private String port; 
            private String region; 
            private String sslSolutionEnum; 
            private String userName; 

            private Builder() {
            } 

            private Builder(ReverseJobDestinationEndpoint model) {
                this.databaseName = model.databaseName;
                this.engineName = model.engineName;
                this.instanceID = model.instanceID;
                this.instanceType = model.instanceType;
                this.ip = model.ip;
                this.oracleSID = model.oracleSID;
                this.port = model.port;
                this.region = model.region;
                this.sslSolutionEnum = model.sslSolutionEnum;
                this.userName = model.userName;
            } 

            /**
             * <p>The name of the database to which the synchronized objects belong in the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database engine type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1162kryivb8****</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The endpoint of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.88.***</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The SID of the Oracle database.</p>
             * <blockquote>
             * <p>This parameter is returned only when the <strong>EngineName</strong> parameter of the destination instance is set to <strong>Oracle</strong> and the Oracle database is a non-RAC instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testsid</p>
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * <p>The database service port of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The region where the instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>Indicates whether an SSL-secured connection is used. Valid values:</p>
             * <ul>
             * <li><strong>DISABLE</strong>: SSL-secured connections are not used.</li>
             * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL-secured connections are used, and a CA certificate is uploaded.</li>
             * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL-secured connections to AWS MongoDB Atlas are used.</li>
             * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to connect to Kafka.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DISABLE</p>
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>dts</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public ReverseJobDestinationEndpoint build() {
                return new ReverseJobDestinationEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class ReverseJobErrorDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("HelpUrl")
        private String helpUrl;

        private ReverseJobErrorDetails(Builder builder) {
            this.errorCode = builder.errorCode;
            this.helpUrl = builder.helpUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobErrorDetails create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return helpUrl
         */
        public String getHelpUrl() {
            return this.helpUrl;
        }

        public static final class Builder {
            private String errorCode; 
            private String helpUrl; 

            private Builder() {
            } 

            private Builder(ReverseJobErrorDetails model) {
                this.errorCode = model.errorCode;
                this.helpUrl = model.helpUrl;
            } 

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-31009</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The URL of the help document.</p>
             * 
             * <strong>example:</strong>
             * <p>https://<strong>.ali</strong>.com/**</p>
             */
            public Builder helpUrl(String helpUrl) {
                this.helpUrl = helpUrl;
                return this;
            }

            public ReverseJobErrorDetails build() {
                return new ReverseJobErrorDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class ReverseJobFullDataCheckStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ReverseJobFullDataCheckStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobFullDataCheckStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            private Builder() {
            } 

            private Builder(ReverseJobFullDataCheckStatus model) {
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message for a failed task.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.NumberFormatException: For input string: &quot;&quot;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of the full data verification task. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The completion progress of the full data verification task.</p>
             * 
             * <strong>example:</strong>
             * <p>35</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The status information of full data verification.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ReverseJobFullDataCheckStatus build() {
                return new ReverseJobFullDataCheckStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class ReverseJobIncDataCheckStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ReverseJobIncDataCheckStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobIncDataCheckStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            private Builder() {
            } 

            private Builder(ReverseJobIncDataCheckStatus model) {
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message for a failed task.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.NumberFormatException: For input string: &quot;&quot;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of the incremental data verification task. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The completion progress of the incremental data verification task.</p>
             * 
             * <strong>example:</strong>
             * <p>35</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The status information of incremental data verification.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ReverseJobIncDataCheckStatus build() {
                return new ReverseJobIncDataCheckStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class ReverseJobMigrationMode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataInitialization")
        private Boolean dataInitialization;

        @com.aliyun.core.annotation.NameInMap("DataSynchronization")
        private Boolean dataSynchronization;

        @com.aliyun.core.annotation.NameInMap("FullDataCheck")
        private Boolean fullDataCheck;

        @com.aliyun.core.annotation.NameInMap("IncDataCheck")
        private Boolean incDataCheck;

        @com.aliyun.core.annotation.NameInMap("StructureInitialization")
        private Boolean structureInitialization;

        private ReverseJobMigrationMode(Builder builder) {
            this.dataInitialization = builder.dataInitialization;
            this.dataSynchronization = builder.dataSynchronization;
            this.fullDataCheck = builder.fullDataCheck;
            this.incDataCheck = builder.incDataCheck;
            this.structureInitialization = builder.structureInitialization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobMigrationMode create() {
            return builder().build();
        }

        /**
         * @return dataInitialization
         */
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        /**
         * @return dataSynchronization
         */
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        /**
         * @return fullDataCheck
         */
        public Boolean getFullDataCheck() {
            return this.fullDataCheck;
        }

        /**
         * @return incDataCheck
         */
        public Boolean getIncDataCheck() {
            return this.incDataCheck;
        }

        /**
         * @return structureInitialization
         */
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

        public static final class Builder {
            private Boolean dataInitialization; 
            private Boolean dataSynchronization; 
            private Boolean fullDataCheck; 
            private Boolean incDataCheck; 
            private Boolean structureInitialization; 

            private Builder() {
            } 

            private Builder(ReverseJobMigrationMode model) {
                this.dataInitialization = model.dataInitialization;
                this.dataSynchronization = model.dataSynchronization;
                this.fullDataCheck = model.fullDataCheck;
                this.incDataCheck = model.incDataCheck;
                this.structureInitialization = model.structureInitialization;
            } 

            /**
             * <p>Specifies whether to perform initial full data synchronization. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dataInitialization(Boolean dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * <p>Specifies whether to perform incremental data synchronization. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dataSynchronization(Boolean dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * <p>Indicates whether full data validation is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder fullDataCheck(Boolean fullDataCheck) {
                this.fullDataCheck = fullDataCheck;
                return this;
            }

            /**
             * <p>Indicates whether incremental data validation is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder incDataCheck(Boolean incDataCheck) {
                this.incDataCheck = incDataCheck;
                return this;
            }

            /**
             * <p>Specifies whether to perform initial schema synchronization. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder structureInitialization(Boolean structureInitialization) {
                this.structureInitialization = structureInitialization;
                return this;
            }

            public ReverseJobMigrationMode build() {
                return new ReverseJobMigrationMode(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class ReverseJobPerformance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Flow")
        private String flow;

        @com.aliyun.core.annotation.NameInMap("Rps")
        private String rps;

        private ReverseJobPerformance(Builder builder) {
            this.flow = builder.flow;
            this.rps = builder.rps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobPerformance create() {
            return builder().build();
        }

        /**
         * @return flow
         */
        public String getFlow() {
            return this.flow;
        }

        /**
         * @return rps
         */
        public String getRps() {
            return this.rps;
        }

        public static final class Builder {
            private String flow; 
            private String rps; 

            private Builder() {
            } 

            private Builder(ReverseJobPerformance model) {
                this.flow = model.flow;
                this.rps = model.rps;
            } 

            /**
             * <p>The data synchronization traffic per second, in MB/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * <p>The number of SQL statements synchronized per second, including BEGIN, COMMIT, DML statements (INSERT, DELETE, and UPDATE), and DDL statements.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder rps(String rps) {
                this.rps = rps;
                return this;
            }

            public ReverseJobPerformance build() {
                return new ReverseJobPerformance(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class PrecheckStatusDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckItem")
        private String checkItem;

        @com.aliyun.core.annotation.NameInMap("CheckItemDescription")
        private String checkItemDescription;

        @com.aliyun.core.annotation.NameInMap("CheckResult")
        private String checkResult;

        @com.aliyun.core.annotation.NameInMap("FailedReason")
        private String failedReason;

        @com.aliyun.core.annotation.NameInMap("RepairMethod")
        private String repairMethod;

        private PrecheckStatusDetail(Builder builder) {
            this.checkItem = builder.checkItem;
            this.checkItemDescription = builder.checkItemDescription;
            this.checkResult = builder.checkResult;
            this.failedReason = builder.failedReason;
            this.repairMethod = builder.repairMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrecheckStatusDetail create() {
            return builder().build();
        }

        /**
         * @return checkItem
         */
        public String getCheckItem() {
            return this.checkItem;
        }

        /**
         * @return checkItemDescription
         */
        public String getCheckItemDescription() {
            return this.checkItemDescription;
        }

        /**
         * @return checkResult
         */
        public String getCheckResult() {
            return this.checkResult;
        }

        /**
         * @return failedReason
         */
        public String getFailedReason() {
            return this.failedReason;
        }

        /**
         * @return repairMethod
         */
        public String getRepairMethod() {
            return this.repairMethod;
        }

        public static final class Builder {
            private String checkItem; 
            private String checkItemDescription; 
            private String checkResult; 
            private String failedReason; 
            private String repairMethod; 

            private Builder() {
            } 

            private Builder(PrecheckStatusDetail model) {
                this.checkItem = model.checkItem;
                this.checkItemDescription = model.checkItemDescription;
                this.checkResult = model.checkResult;
                this.failedReason = model.failedReason;
                this.repairMethod = model.repairMethod;
            } 

            /**
             * <p>The precheck item.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_CONN_SRC</p>
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * <p>The description of the precheck item.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_CONN_SRC_DETAIL</p>
             */
            public Builder checkItemDescription(String checkItemDescription) {
                this.checkItemDescription = checkItemDescription;
                return this;
            }

            /**
             * <p>The precheck result. Valid values:</p>
             * <ul>
             * <li><strong>Success</strong>: The item passed the precheck.</li>
             * <li><strong>Failed</strong>: The item failed the precheck.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder checkResult(String checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * <p>The error message returned when the precheck fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Original error: Access denied for user \&quot;dtstest\&quot;@\&quot;100.104.***.**\&quot; (using password: YES)</p>
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * <p>The solution provided when the precheck fails.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_ERROR_DEST_CONN_REPAIR2</p>
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            public PrecheckStatusDetail build() {
                return new PrecheckStatusDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class ReverseJobPrecheckStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.List<PrecheckStatusDetail> detail;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ReverseJobPrecheckStatus(Builder builder) {
            this.detail = builder.detail;
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobPrecheckStatus create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List<PrecheckStatusDetail> getDetail() {
            return this.detail;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<PrecheckStatusDetail> detail; 
            private String errorMessage; 
            private String percent; 
            private String status; 

            private Builder() {
            } 

            private Builder(ReverseJobPrecheckStatus model) {
                this.detail = model.detail;
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.status = model.status;
            } 

            /**
             * <p>The execution status of each precheck item.</p>
             */
            public Builder detail(java.util.List<PrecheckStatusDetail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The error message for the precheck failure.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK__ERROR_SAME_OBJ.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The overall progress of the precheck, in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The precheck status.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ReverseJobPrecheckStatus build() {
                return new ReverseJobPrecheckStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class SourceEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("OracleSID")
        private String oracleSID;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private SourceEndpoint(Builder builder) {
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.ip = builder.ip;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.region = builder.region;
            this.sslSolutionEnum = builder.sslSolutionEnum;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return sslSolutionEnum
         */
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String databaseName; 
            private String engineName; 
            private String instanceID; 
            private String instanceType; 
            private String ip; 
            private String oracleSID; 
            private String port; 
            private String region; 
            private String sslSolutionEnum; 
            private String userName; 

            private Builder() {
            } 

            private Builder(SourceEndpoint model) {
                this.databaseName = model.databaseName;
                this.engineName = model.engineName;
                this.instanceID = model.instanceID;
                this.instanceType = model.instanceType;
                this.ip = model.ip;
                this.oracleSID = model.oracleSID;
                this.port = model.port;
                this.region = model.region;
                this.sslSolutionEnum = model.sslSolutionEnum;
                this.userName = model.userName;
            } 

            /**
             * <p>The name of the database to which the migration objects in the instance belong.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database type of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The source instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1imrtn6fq7h****</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The type of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The endpoint of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.88.***</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The SID of the Oracle database.</p>
             * <blockquote>
             * <p>This parameter is returned only when the <strong>EngineName</strong> parameter of the source instance is set to <strong>Oracle</strong> and the Oracle database is a non-RAC instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testsid</p>
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * <p>The database service port of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The region where the instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>Indicates whether an SSL-secured connection is used. Valid values:</p>
             * <ul>
             * <li><strong>DISABLE</strong>: SSL-secured connections are not used.</li>
             * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL-secured connections are used, and a CA certificate is uploaded.</li>
             * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL-secured connections to AWS MongoDB Atlas are used.</li>
             * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to connect to Kafka.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DISABLE</p>
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>dts</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public SourceEndpoint build() {
                return new SourceEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class StructureInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private StructureInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StructureInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            private Builder() {
            } 

            private Builder(StructureInitializationStatus model) {
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned when initial schema synchronization fails.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-1020042 Execute sql error sql: ERROR: type &quot;geometry&quot; does not exist;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of initial schema synchronization, in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of tables for which initial schema synchronization is completed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The status of initial schema synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public StructureInitializationStatus build() {
                return new StructureInitializationStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class ReverseJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Checkpoint")
        private String checkpoint;

        @com.aliyun.core.annotation.NameInMap("CpuUsage")
        private String cpuUsage;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DataInitializationStatus")
        private ReverseJobDataInitializationStatus dataInitializationStatus;

        @com.aliyun.core.annotation.NameInMap("DataSynchronizationStatus")
        private ReverseJobDataSynchronizationStatus dataSynchronizationStatus;

        @com.aliyun.core.annotation.NameInMap("DbObject")
        private String dbObject;

        @com.aliyun.core.annotation.NameInMap("DedicatedClusterId")
        private String dedicatedClusterId;

        @com.aliyun.core.annotation.NameInMap("Delay")
        private Long delay;

        @com.aliyun.core.annotation.NameInMap("DestinationEndpoint")
        private ReverseJobDestinationEndpoint destinationEndpoint;

        @com.aliyun.core.annotation.NameInMap("DtsInstanceID")
        private String dtsInstanceID;

        @com.aliyun.core.annotation.NameInMap("DtsJobClass")
        private String dtsJobClass;

        @com.aliyun.core.annotation.NameInMap("DtsJobDirection")
        private String dtsJobDirection;

        @com.aliyun.core.annotation.NameInMap("DtsJobId")
        private String dtsJobId;

        @com.aliyun.core.annotation.NameInMap("DtsJobName")
        private String dtsJobName;

        @com.aliyun.core.annotation.NameInMap("DuUsage")
        private Long duUsage;

        @com.aliyun.core.annotation.NameInMap("ErrorDetails")
        private java.util.List<ReverseJobErrorDetails> errorDetails;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("EtlSafeCheckpoint")
        private String etlSafeCheckpoint;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("FullDataCheckStatus")
        private ReverseJobFullDataCheckStatus fullDataCheckStatus;

        @com.aliyun.core.annotation.NameInMap("IncDataCheckStatus")
        private ReverseJobIncDataCheckStatus incDataCheckStatus;

        @com.aliyun.core.annotation.NameInMap("MaxDu")
        private Double maxDu;

        @com.aliyun.core.annotation.NameInMap("MemUsage")
        private String memUsage;

        @com.aliyun.core.annotation.NameInMap("MigrationMode")
        private ReverseJobMigrationMode migrationMode;

        @com.aliyun.core.annotation.NameInMap("MinDu")
        private Double minDu;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Performance")
        private ReverseJobPerformance performance;

        @com.aliyun.core.annotation.NameInMap("PrecheckStatus")
        private ReverseJobPrecheckStatus precheckStatus;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private String reserved;

        @com.aliyun.core.annotation.NameInMap("SourceEndpoint")
        private SourceEndpoint sourceEndpoint;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StructureInitializationStatus")
        private StructureInitializationStatus structureInitializationStatus;

        private ReverseJob(Builder builder) {
            this.checkpoint = builder.checkpoint;
            this.cpuUsage = builder.cpuUsage;
            this.createTime = builder.createTime;
            this.dataInitializationStatus = builder.dataInitializationStatus;
            this.dataSynchronizationStatus = builder.dataSynchronizationStatus;
            this.dbObject = builder.dbObject;
            this.dedicatedClusterId = builder.dedicatedClusterId;
            this.delay = builder.delay;
            this.destinationEndpoint = builder.destinationEndpoint;
            this.dtsInstanceID = builder.dtsInstanceID;
            this.dtsJobClass = builder.dtsJobClass;
            this.dtsJobDirection = builder.dtsJobDirection;
            this.dtsJobId = builder.dtsJobId;
            this.dtsJobName = builder.dtsJobName;
            this.duUsage = builder.duUsage;
            this.errorDetails = builder.errorDetails;
            this.errorMessage = builder.errorMessage;
            this.etlSafeCheckpoint = builder.etlSafeCheckpoint;
            this.expireTime = builder.expireTime;
            this.fullDataCheckStatus = builder.fullDataCheckStatus;
            this.incDataCheckStatus = builder.incDataCheckStatus;
            this.maxDu = builder.maxDu;
            this.memUsage = builder.memUsage;
            this.migrationMode = builder.migrationMode;
            this.minDu = builder.minDu;
            this.payType = builder.payType;
            this.performance = builder.performance;
            this.precheckStatus = builder.precheckStatus;
            this.reserved = builder.reserved;
            this.sourceEndpoint = builder.sourceEndpoint;
            this.status = builder.status;
            this.structureInitializationStatus = builder.structureInitializationStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJob create() {
            return builder().build();
        }

        /**
         * @return checkpoint
         */
        public String getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return cpuUsage
         */
        public String getCpuUsage() {
            return this.cpuUsage;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataInitializationStatus
         */
        public ReverseJobDataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        /**
         * @return dataSynchronizationStatus
         */
        public ReverseJobDataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        /**
         * @return dbObject
         */
        public String getDbObject() {
            return this.dbObject;
        }

        /**
         * @return dedicatedClusterId
         */
        public String getDedicatedClusterId() {
            return this.dedicatedClusterId;
        }

        /**
         * @return delay
         */
        public Long getDelay() {
            return this.delay;
        }

        /**
         * @return destinationEndpoint
         */
        public ReverseJobDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        /**
         * @return dtsInstanceID
         */
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        /**
         * @return dtsJobClass
         */
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        /**
         * @return dtsJobDirection
         */
        public String getDtsJobDirection() {
            return this.dtsJobDirection;
        }

        /**
         * @return dtsJobId
         */
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        /**
         * @return dtsJobName
         */
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        /**
         * @return duUsage
         */
        public Long getDuUsage() {
            return this.duUsage;
        }

        /**
         * @return errorDetails
         */
        public java.util.List<ReverseJobErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return etlSafeCheckpoint
         */
        public String getEtlSafeCheckpoint() {
            return this.etlSafeCheckpoint;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return fullDataCheckStatus
         */
        public ReverseJobFullDataCheckStatus getFullDataCheckStatus() {
            return this.fullDataCheckStatus;
        }

        /**
         * @return incDataCheckStatus
         */
        public ReverseJobIncDataCheckStatus getIncDataCheckStatus() {
            return this.incDataCheckStatus;
        }

        /**
         * @return maxDu
         */
        public Double getMaxDu() {
            return this.maxDu;
        }

        /**
         * @return memUsage
         */
        public String getMemUsage() {
            return this.memUsage;
        }

        /**
         * @return migrationMode
         */
        public ReverseJobMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        /**
         * @return minDu
         */
        public Double getMinDu() {
            return this.minDu;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return performance
         */
        public ReverseJobPerformance getPerformance() {
            return this.performance;
        }

        /**
         * @return precheckStatus
         */
        public ReverseJobPrecheckStatus getPrecheckStatus() {
            return this.precheckStatus;
        }

        /**
         * @return reserved
         */
        public String getReserved() {
            return this.reserved;
        }

        /**
         * @return sourceEndpoint
         */
        public SourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return structureInitializationStatus
         */
        public StructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

        public static final class Builder {
            private String checkpoint; 
            private String cpuUsage; 
            private String createTime; 
            private ReverseJobDataInitializationStatus dataInitializationStatus; 
            private ReverseJobDataSynchronizationStatus dataSynchronizationStatus; 
            private String dbObject; 
            private String dedicatedClusterId; 
            private Long delay; 
            private ReverseJobDestinationEndpoint destinationEndpoint; 
            private String dtsInstanceID; 
            private String dtsJobClass; 
            private String dtsJobDirection; 
            private String dtsJobId; 
            private String dtsJobName; 
            private Long duUsage; 
            private java.util.List<ReverseJobErrorDetails> errorDetails; 
            private String errorMessage; 
            private String etlSafeCheckpoint; 
            private String expireTime; 
            private ReverseJobFullDataCheckStatus fullDataCheckStatus; 
            private ReverseJobIncDataCheckStatus incDataCheckStatus; 
            private Double maxDu; 
            private String memUsage; 
            private ReverseJobMigrationMode migrationMode; 
            private Double minDu; 
            private String payType; 
            private ReverseJobPerformance performance; 
            private ReverseJobPrecheckStatus precheckStatus; 
            private String reserved; 
            private SourceEndpoint sourceEndpoint; 
            private String status; 
            private StructureInitializationStatus structureInitializationStatus; 

            private Builder() {
            } 

            private Builder(ReverseJob model) {
                this.checkpoint = model.checkpoint;
                this.cpuUsage = model.cpuUsage;
                this.createTime = model.createTime;
                this.dataInitializationStatus = model.dataInitializationStatus;
                this.dataSynchronizationStatus = model.dataSynchronizationStatus;
                this.dbObject = model.dbObject;
                this.dedicatedClusterId = model.dedicatedClusterId;
                this.delay = model.delay;
                this.destinationEndpoint = model.destinationEndpoint;
                this.dtsInstanceID = model.dtsInstanceID;
                this.dtsJobClass = model.dtsJobClass;
                this.dtsJobDirection = model.dtsJobDirection;
                this.dtsJobId = model.dtsJobId;
                this.dtsJobName = model.dtsJobName;
                this.duUsage = model.duUsage;
                this.errorDetails = model.errorDetails;
                this.errorMessage = model.errorMessage;
                this.etlSafeCheckpoint = model.etlSafeCheckpoint;
                this.expireTime = model.expireTime;
                this.fullDataCheckStatus = model.fullDataCheckStatus;
                this.incDataCheckStatus = model.incDataCheckStatus;
                this.maxDu = model.maxDu;
                this.memUsage = model.memUsage;
                this.migrationMode = model.migrationMode;
                this.minDu = model.minDu;
                this.payType = model.payType;
                this.performance = model.performance;
                this.precheckStatus = model.precheckStatus;
                this.reserved = model.reserved;
                this.sourceEndpoint = model.sourceEndpoint;
                this.status = model.status;
                this.structureInitializationStatus = model.structureInitializationStatus;
            } 

            /**
             * <p>The checkpoint for incremental data synchronization. The value is a UNIX timestamp, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1616980369</p>
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * <p>The current CPU utilization of the instance. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder cpuUsage(String cpuUsage) {
                this.cpuUsage = cpuUsage;
                return this;
            }

            /**
             * <p>The task creation time, in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-28 17:34:53.0</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The status of initial full data synchronization.</p>
             */
            public Builder dataInitializationStatus(ReverseJobDataInitializationStatus dataInitializationStatus) {
                this.dataInitializationStatus = dataInitializationStatus;
                return this;
            }

            /**
             * <p>The status of incremental data synchronization.</p>
             */
            public Builder dataSynchronizationStatus(ReverseJobDataSynchronizationStatus dataSynchronizationStatus) {
                this.dataSynchronizationStatus = dataSynchronizationStatus;
                return this;
            }

            /**
             * <p>The schema definition of the synchronized objects. The value is a JSON string and supports specific regular expressions. For more information and examples, see the object configuration instructions for migration, synchronization, or change tracking.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;dtstestdata&quot;: { &quot;name&quot;: &quot;dtstestdata&quot;, &quot;all&quot;: true }}</p>
             */
            public Builder dbObject(String dbObject) {
                this.dbObject = dbObject;
                return this;
            }

            /**
             * <p>The ID of the dedicated DTS cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>dtscluster_dpwl3**********</p>
             */
            public Builder dedicatedClusterId(String dedicatedClusterId) {
                this.dedicatedClusterId = dedicatedClusterId;
                return this;
            }

            /**
             * <p>The latency, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>The connection information of the destination instance.</p>
             */
            public Builder destinationEndpoint(ReverseJobDestinationEndpoint destinationEndpoint) {
                this.destinationEndpoint = destinationEndpoint;
                return this;
            }

            /**
             * <p>The instance ID of the data synchronization instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtsi03e3zty16i****</p>
             */
            public Builder dtsInstanceID(String dtsInstanceID) {
                this.dtsInstanceID = dtsInstanceID;
                return this;
            }

            /**
             * <p>The specifications of the synchronization link.</p>
             * <blockquote>
             * <p>For more information about the specifications and performance test results of each link, see <a href="https://help.aliyun.com/document_detail/26605.html">Specifications of data synchronization links</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>large</p>
             */
            public Builder dtsJobClass(String dtsJobClass) {
                this.dtsJobClass = dtsJobClass;
                return this;
            }

            /**
             * <p>The description of the DTS task.</p>
             * 
             * <strong>example:</strong>
             * <p>Reverse</p>
             */
            public Builder dtsJobDirection(String dtsJobDirection) {
                this.dtsJobDirection = dtsJobDirection;
                return this;
            }

            /**
             * <p>The ID of the synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>i03e3zty16i****</p>
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * <p>The name of the DTS task.</p>
             * 
             * <strong>example:</strong>
             * <p>test2</p>
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * <p>The used resources of the dedicated DTS cluster. Unit: DU.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder duUsage(Long duUsage) {
                this.duUsage = duUsage;
                return this;
            }

            /**
             * <p>The error details.</p>
             */
            public Builder errorDetails(java.util.List<ReverseJobErrorDetails> errorDetails) {
                this.errorDetails = errorDetails;
                return this;
            }

            /**
             * <p>The error message for a failed task.</p>
             * 
             * <strong>example:</strong>
             * <p>Instance not found.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The safe checkpoint of the ETL task.</p>
             * 
             * <strong>example:</strong>
             * <p>1610540493</p>
             */
            public Builder etlSafeCheckpoint(String etlSafeCheckpoint) {
                this.etlSafeCheckpoint = etlSafeCheckpoint;
                return this;
            }

            /**
             * <p>The expiration time of the instance, in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is in UTC.</p>
             * <blockquote>
             * <p>This parameter is returned only when the <strong>PayType</strong> parameter is set to <strong>PrePaid</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2023-03-16T08:01:19Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The status information of full data verification.</p>
             */
            public Builder fullDataCheckStatus(ReverseJobFullDataCheckStatus fullDataCheckStatus) {
                this.fullDataCheckStatus = fullDataCheckStatus;
                return this;
            }

            /**
             * <p>The status information of incremental data verification.</p>
             */
            public Builder incDataCheckStatus(ReverseJobIncDataCheckStatus incDataCheckStatus) {
                this.incDataCheckStatus = incDataCheckStatus;
                return this;
            }

            /**
             * <p>The DU upper limit of the serverless instance.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder maxDu(Double maxDu) {
                this.maxDu = maxDu;
                return this;
            }

            /**
             * <p>The amount of used memory, in MB.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder memUsage(String memUsage) {
                this.memUsage = memUsage;
                return this;
            }

            /**
             * <p>The type of initial synchronization.</p>
             */
            public Builder migrationMode(ReverseJobMigrationMode migrationMode) {
                this.migrationMode = migrationMode;
                return this;
            }

            /**
             * <p>The minimum number of DUs for the serverless instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minDu(Double minDu) {
                this.minDu = minDu;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * <ul>
             * <li><strong>PrePaid</strong>: Subscription.</li>
             * <li><strong>PostPaid</strong>: Pay-as-you-go.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The performance information of the synchronization link.</p>
             */
            public Builder performance(ReverseJobPerformance performance) {
                this.performance = performance;
                return this;
            }

            /**
             * <p>The precheck status.</p>
             */
            public Builder precheckStatus(ReverseJobPrecheckStatus precheckStatus) {
                this.precheckStatus = precheckStatus;
                return this;
            }

            /**
             * <p>The reserved parameters of DTS. The value is a JSON string. You can specify this parameter to meet special requirements, such as specifying whether to automatically start the precheck. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved parameter description</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;srcHostPorts\&quot;:\&quot;\&quot;,\&quot;whitelist.dms.online.ddl.enable\&quot;:false,\&quot;filterDDL\&quot;:false,\&quot;sqlparser.dms.original.ddl\&quot;:true,\&quot;srcOracleType\&quot;:\&quot;sid\&quot;,\&quot;maxRetryTime\&quot;:43200,\&quot;destSSL\&quot;:\&quot;0\&quot;,\&quot;destOracleType\&quot;:\&quot;sid\&quot;,\&quot;srcSSL\&quot;:\&quot;0\&quot;,\&quot;dbListCaseChangeMode\&quot;:\&quot;default\&quot;,\&quot;SourceEngineVersion\&quot;:\&quot;8.0.18\&quot;,\&quot;srcNetType\&quot;:\&quot;VPC\&quot;,\&quot;destNetType\&quot;:\&quot;VPC\&quot;,\&quot;srcVpcNetMappingInst\&quot;:\&quot;172.16.1**.<strong>:10803\&quot;,\&quot;destVpcNetMappingInst\&quot;:\&quot;172.16.1</strong>.**:11077\&quot;,\&quot;useJobTask\&quot;:\&quot;1\&quot;}</p>
             */
            public Builder reserved(String reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * <p>The connection information of the source instance.</p>
             */
            public Builder sourceEndpoint(SourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
                return this;
            }

            /**
             * <p>The status of the reverse synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The status of initial schema synchronization.</p>
             */
            public Builder structureInitializationStatus(StructureInitializationStatus structureInitializationStatus) {
                this.structureInitializationStatus = structureInitializationStatus;
                return this;
            }

            public ReverseJob build() {
                return new ReverseJob(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class DtsJobListSourceEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("OracleSID")
        private String oracleSID;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private DtsJobListSourceEndpoint(Builder builder) {
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.ip = builder.ip;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.region = builder.region;
            this.sslSolutionEnum = builder.sslSolutionEnum;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DtsJobListSourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return sslSolutionEnum
         */
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String databaseName; 
            private String engineName; 
            private String instanceID; 
            private String instanceType; 
            private String ip; 
            private String oracleSID; 
            private String port; 
            private String region; 
            private String sslSolutionEnum; 
            private String userName; 

            private Builder() {
            } 

            private Builder(DtsJobListSourceEndpoint model) {
                this.databaseName = model.databaseName;
                this.engineName = model.engineName;
                this.instanceID = model.instanceID;
                this.instanceType = model.instanceType;
                this.ip = model.ip;
                this.oracleSID = model.oracleSID;
                this.port = model.port;
                this.region = model.region;
                this.sslSolutionEnum = model.sslSolutionEnum;
                this.userName = model.userName;
            } 

            /**
             * <p>The name of the database to which the migration objects in the source instance belong.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database type of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The source instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1162kryivb8****</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The type of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The endpoint of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.88.***</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The SID of the Oracle database.</p>
             * <blockquote>
             * <p>This parameter is returned only when the <strong>EngineName</strong> parameter of the source instance is set to <strong>Oracle</strong> and the Oracle database is a non-RAC instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testsid</p>
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * <p>The database service port of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The region where the source instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>Indicates whether an SSL-secured connection is used. Valid values:</p>
             * <ul>
             * <li><strong>DISABLE</strong>: SSL-secured connections are not used.</li>
             * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL-secured connections are used, and a CA certificate is uploaded.</li>
             * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL-secured connections to AWS MongoDB Atlas are used.</li>
             * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to connect to Kafka.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DISABLE</p>
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>dts</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public DtsJobListSourceEndpoint build() {
                return new DtsJobListSourceEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class DtsJobListStructureInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DtsJobListStructureInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DtsJobListStructureInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            private Builder() {
            } 

            private Builder(DtsJobListStructureInitializationStatus model) {
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned when schema migration or initial schema synchronization fails.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-1020042 Execute sql error sql: ERROR: type &quot;geometry&quot; does not exist;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of schema migration or initial schema synchronization, in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of tables for which schema migration or initial schema synchronization is completed.</p>
             * 
             * <strong>example:</strong>
             * <p>35</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The status of schema migration or initial schema synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DtsJobListStructureInitializationStatus build() {
                return new DtsJobListStructureInitializationStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class TagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private TagList(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagList create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(TagList model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>testkey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>testvalue</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public TagList build() {
                return new TagList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGadInstanceDtsMembersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGadInstanceDtsMembersResponseBody</p>
     */
    public static class DtsJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("BeginTimestamp")
        private String beginTimestamp;

        @com.aliyun.core.annotation.NameInMap("Checkpoint")
        private String checkpoint;

        @com.aliyun.core.annotation.NameInMap("ConsumptionCheckpoint")
        private String consumptionCheckpoint;

        @com.aliyun.core.annotation.NameInMap("ConsumptionClient")
        private String consumptionClient;

        @com.aliyun.core.annotation.NameInMap("CpuUsage")
        private String cpuUsage;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DataCloudStatus")
        private DataCloudStatus dataCloudStatus;

        @com.aliyun.core.annotation.NameInMap("DataEtlStatus")
        private DataEtlStatus dataEtlStatus;

        @com.aliyun.core.annotation.NameInMap("DataInitializationStatus")
        private DataInitializationStatus dataInitializationStatus;

        @com.aliyun.core.annotation.NameInMap("DataSynchronizationStatus")
        private DataSynchronizationStatus dataSynchronizationStatus;

        @com.aliyun.core.annotation.NameInMap("DbObject")
        private String dbObject;

        @com.aliyun.core.annotation.NameInMap("DedicatedClusterId")
        private String dedicatedClusterId;

        @com.aliyun.core.annotation.NameInMap("Delay")
        private Long delay;

        @com.aliyun.core.annotation.NameInMap("DestinationEndpoint")
        private DestinationEndpoint destinationEndpoint;

        @com.aliyun.core.annotation.NameInMap("DtsBisLabel")
        private String dtsBisLabel;

        @com.aliyun.core.annotation.NameInMap("DtsInstanceID")
        private String dtsInstanceID;

        @com.aliyun.core.annotation.NameInMap("DtsJobClass")
        private String dtsJobClass;

        @com.aliyun.core.annotation.NameInMap("DtsJobDirection")
        private String dtsJobDirection;

        @com.aliyun.core.annotation.NameInMap("DtsJobId")
        private String dtsJobId;

        @com.aliyun.core.annotation.NameInMap("DtsJobName")
        private String dtsJobName;

        @com.aliyun.core.annotation.NameInMap("DuUsage")
        private Long duUsage;

        @com.aliyun.core.annotation.NameInMap("EndTimestamp")
        private String endTimestamp;

        @com.aliyun.core.annotation.NameInMap("ErrorDetails")
        private java.util.List<ErrorDetails> errorDetails;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("EtlSafeCheckpoint")
        private String etlSafeCheckpoint;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("FullDataCheckStatus")
        private FullDataCheckStatus fullDataCheckStatus;

        @com.aliyun.core.annotation.NameInMap("IncDataCheckStatus")
        private IncDataCheckStatus incDataCheckStatus;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("MaxDu")
        private Double maxDu;

        @com.aliyun.core.annotation.NameInMap("MemUsage")
        private String memUsage;

        @com.aliyun.core.annotation.NameInMap("MigrationErrCode")
        private String migrationErrCode;

        @com.aliyun.core.annotation.NameInMap("MigrationErrHelpDocId")
        private String migrationErrHelpDocId;

        @com.aliyun.core.annotation.NameInMap("MigrationErrHelpDocKey")
        private String migrationErrHelpDocKey;

        @com.aliyun.core.annotation.NameInMap("MigrationErrMsg")
        private String migrationErrMsg;

        @com.aliyun.core.annotation.NameInMap("MigrationErrType")
        private String migrationErrType;

        @com.aliyun.core.annotation.NameInMap("MigrationErrWorkaround")
        private String migrationErrWorkaround;

        @com.aliyun.core.annotation.NameInMap("MigrationMode")
        private MigrationMode migrationMode;

        @com.aliyun.core.annotation.NameInMap("MinDu")
        private Double minDu;

        @com.aliyun.core.annotation.NameInMap("OriginType")
        private String originType;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Performance")
        private Performance performance;

        @com.aliyun.core.annotation.NameInMap("PrecheckStatus")
        private PrecheckStatus precheckStatus;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private String reserved;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupDisplayName")
        private String resourceGroupDisplayName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RetryState")
        private RetryState retryState;

        @com.aliyun.core.annotation.NameInMap("ReverseJob")
        private ReverseJob reverseJob;

        @com.aliyun.core.annotation.NameInMap("SourceEndpoint")
        private DtsJobListSourceEndpoint sourceEndpoint;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StructureInitializationStatus")
        private DtsJobListStructureInitializationStatus structureInitializationStatus;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List<TagList> tagList;

        private DtsJobList(Builder builder) {
            this.appName = builder.appName;
            this.beginTimestamp = builder.beginTimestamp;
            this.checkpoint = builder.checkpoint;
            this.consumptionCheckpoint = builder.consumptionCheckpoint;
            this.consumptionClient = builder.consumptionClient;
            this.cpuUsage = builder.cpuUsage;
            this.createTime = builder.createTime;
            this.dataCloudStatus = builder.dataCloudStatus;
            this.dataEtlStatus = builder.dataEtlStatus;
            this.dataInitializationStatus = builder.dataInitializationStatus;
            this.dataSynchronizationStatus = builder.dataSynchronizationStatus;
            this.dbObject = builder.dbObject;
            this.dedicatedClusterId = builder.dedicatedClusterId;
            this.delay = builder.delay;
            this.destinationEndpoint = builder.destinationEndpoint;
            this.dtsBisLabel = builder.dtsBisLabel;
            this.dtsInstanceID = builder.dtsInstanceID;
            this.dtsJobClass = builder.dtsJobClass;
            this.dtsJobDirection = builder.dtsJobDirection;
            this.dtsJobId = builder.dtsJobId;
            this.dtsJobName = builder.dtsJobName;
            this.duUsage = builder.duUsage;
            this.endTimestamp = builder.endTimestamp;
            this.errorDetails = builder.errorDetails;
            this.errorMessage = builder.errorMessage;
            this.etlSafeCheckpoint = builder.etlSafeCheckpoint;
            this.expireTime = builder.expireTime;
            this.fullDataCheckStatus = builder.fullDataCheckStatus;
            this.incDataCheckStatus = builder.incDataCheckStatus;
            this.jobType = builder.jobType;
            this.maxDu = builder.maxDu;
            this.memUsage = builder.memUsage;
            this.migrationErrCode = builder.migrationErrCode;
            this.migrationErrHelpDocId = builder.migrationErrHelpDocId;
            this.migrationErrHelpDocKey = builder.migrationErrHelpDocKey;
            this.migrationErrMsg = builder.migrationErrMsg;
            this.migrationErrType = builder.migrationErrType;
            this.migrationErrWorkaround = builder.migrationErrWorkaround;
            this.migrationMode = builder.migrationMode;
            this.minDu = builder.minDu;
            this.originType = builder.originType;
            this.payType = builder.payType;
            this.performance = builder.performance;
            this.precheckStatus = builder.precheckStatus;
            this.reserved = builder.reserved;
            this.resourceGroupDisplayName = builder.resourceGroupDisplayName;
            this.resourceGroupId = builder.resourceGroupId;
            this.retryState = builder.retryState;
            this.reverseJob = builder.reverseJob;
            this.sourceEndpoint = builder.sourceEndpoint;
            this.status = builder.status;
            this.structureInitializationStatus = builder.structureInitializationStatus;
            this.tagList = builder.tagList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DtsJobList create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return beginTimestamp
         */
        public String getBeginTimestamp() {
            return this.beginTimestamp;
        }

        /**
         * @return checkpoint
         */
        public String getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return consumptionCheckpoint
         */
        public String getConsumptionCheckpoint() {
            return this.consumptionCheckpoint;
        }

        /**
         * @return consumptionClient
         */
        public String getConsumptionClient() {
            return this.consumptionClient;
        }

        /**
         * @return cpuUsage
         */
        public String getCpuUsage() {
            return this.cpuUsage;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataCloudStatus
         */
        public DataCloudStatus getDataCloudStatus() {
            return this.dataCloudStatus;
        }

        /**
         * @return dataEtlStatus
         */
        public DataEtlStatus getDataEtlStatus() {
            return this.dataEtlStatus;
        }

        /**
         * @return dataInitializationStatus
         */
        public DataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        /**
         * @return dataSynchronizationStatus
         */
        public DataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        /**
         * @return dbObject
         */
        public String getDbObject() {
            return this.dbObject;
        }

        /**
         * @return dedicatedClusterId
         */
        public String getDedicatedClusterId() {
            return this.dedicatedClusterId;
        }

        /**
         * @return delay
         */
        public Long getDelay() {
            return this.delay;
        }

        /**
         * @return destinationEndpoint
         */
        public DestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        /**
         * @return dtsBisLabel
         */
        public String getDtsBisLabel() {
            return this.dtsBisLabel;
        }

        /**
         * @return dtsInstanceID
         */
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        /**
         * @return dtsJobClass
         */
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        /**
         * @return dtsJobDirection
         */
        public String getDtsJobDirection() {
            return this.dtsJobDirection;
        }

        /**
         * @return dtsJobId
         */
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        /**
         * @return dtsJobName
         */
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        /**
         * @return duUsage
         */
        public Long getDuUsage() {
            return this.duUsage;
        }

        /**
         * @return endTimestamp
         */
        public String getEndTimestamp() {
            return this.endTimestamp;
        }

        /**
         * @return errorDetails
         */
        public java.util.List<ErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return etlSafeCheckpoint
         */
        public String getEtlSafeCheckpoint() {
            return this.etlSafeCheckpoint;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return fullDataCheckStatus
         */
        public FullDataCheckStatus getFullDataCheckStatus() {
            return this.fullDataCheckStatus;
        }

        /**
         * @return incDataCheckStatus
         */
        public IncDataCheckStatus getIncDataCheckStatus() {
            return this.incDataCheckStatus;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return maxDu
         */
        public Double getMaxDu() {
            return this.maxDu;
        }

        /**
         * @return memUsage
         */
        public String getMemUsage() {
            return this.memUsage;
        }

        /**
         * @return migrationErrCode
         */
        public String getMigrationErrCode() {
            return this.migrationErrCode;
        }

        /**
         * @return migrationErrHelpDocId
         */
        public String getMigrationErrHelpDocId() {
            return this.migrationErrHelpDocId;
        }

        /**
         * @return migrationErrHelpDocKey
         */
        public String getMigrationErrHelpDocKey() {
            return this.migrationErrHelpDocKey;
        }

        /**
         * @return migrationErrMsg
         */
        public String getMigrationErrMsg() {
            return this.migrationErrMsg;
        }

        /**
         * @return migrationErrType
         */
        public String getMigrationErrType() {
            return this.migrationErrType;
        }

        /**
         * @return migrationErrWorkaround
         */
        public String getMigrationErrWorkaround() {
            return this.migrationErrWorkaround;
        }

        /**
         * @return migrationMode
         */
        public MigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        /**
         * @return minDu
         */
        public Double getMinDu() {
            return this.minDu;
        }

        /**
         * @return originType
         */
        public String getOriginType() {
            return this.originType;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return performance
         */
        public Performance getPerformance() {
            return this.performance;
        }

        /**
         * @return precheckStatus
         */
        public PrecheckStatus getPrecheckStatus() {
            return this.precheckStatus;
        }

        /**
         * @return reserved
         */
        public String getReserved() {
            return this.reserved;
        }

        /**
         * @return resourceGroupDisplayName
         */
        public String getResourceGroupDisplayName() {
            return this.resourceGroupDisplayName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return retryState
         */
        public RetryState getRetryState() {
            return this.retryState;
        }

        /**
         * @return reverseJob
         */
        public ReverseJob getReverseJob() {
            return this.reverseJob;
        }

        /**
         * @return sourceEndpoint
         */
        public DtsJobListSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return structureInitializationStatus
         */
        public DtsJobListStructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

        /**
         * @return tagList
         */
        public java.util.List<TagList> getTagList() {
            return this.tagList;
        }

        public static final class Builder {
            private String appName; 
            private String beginTimestamp; 
            private String checkpoint; 
            private String consumptionCheckpoint; 
            private String consumptionClient; 
            private String cpuUsage; 
            private String createTime; 
            private DataCloudStatus dataCloudStatus; 
            private DataEtlStatus dataEtlStatus; 
            private DataInitializationStatus dataInitializationStatus; 
            private DataSynchronizationStatus dataSynchronizationStatus; 
            private String dbObject; 
            private String dedicatedClusterId; 
            private Long delay; 
            private DestinationEndpoint destinationEndpoint; 
            private String dtsBisLabel; 
            private String dtsInstanceID; 
            private String dtsJobClass; 
            private String dtsJobDirection; 
            private String dtsJobId; 
            private String dtsJobName; 
            private Long duUsage; 
            private String endTimestamp; 
            private java.util.List<ErrorDetails> errorDetails; 
            private String errorMessage; 
            private String etlSafeCheckpoint; 
            private String expireTime; 
            private FullDataCheckStatus fullDataCheckStatus; 
            private IncDataCheckStatus incDataCheckStatus; 
            private String jobType; 
            private Double maxDu; 
            private String memUsage; 
            private String migrationErrCode; 
            private String migrationErrHelpDocId; 
            private String migrationErrHelpDocKey; 
            private String migrationErrMsg; 
            private String migrationErrType; 
            private String migrationErrWorkaround; 
            private MigrationMode migrationMode; 
            private Double minDu; 
            private String originType; 
            private String payType; 
            private Performance performance; 
            private PrecheckStatus precheckStatus; 
            private String reserved; 
            private String resourceGroupDisplayName; 
            private String resourceGroupId; 
            private RetryState retryState; 
            private ReverseJob reverseJob; 
            private DtsJobListSourceEndpoint sourceEndpoint; 
            private String status; 
            private DtsJobListStructureInitializationStatus structureInitializationStatus; 
            private java.util.List<TagList> tagList; 

            private Builder() {
            } 

            private Builder(DtsJobList model) {
                this.appName = model.appName;
                this.beginTimestamp = model.beginTimestamp;
                this.checkpoint = model.checkpoint;
                this.consumptionCheckpoint = model.consumptionCheckpoint;
                this.consumptionClient = model.consumptionClient;
                this.cpuUsage = model.cpuUsage;
                this.createTime = model.createTime;
                this.dataCloudStatus = model.dataCloudStatus;
                this.dataEtlStatus = model.dataEtlStatus;
                this.dataInitializationStatus = model.dataInitializationStatus;
                this.dataSynchronizationStatus = model.dataSynchronizationStatus;
                this.dbObject = model.dbObject;
                this.dedicatedClusterId = model.dedicatedClusterId;
                this.delay = model.delay;
                this.destinationEndpoint = model.destinationEndpoint;
                this.dtsBisLabel = model.dtsBisLabel;
                this.dtsInstanceID = model.dtsInstanceID;
                this.dtsJobClass = model.dtsJobClass;
                this.dtsJobDirection = model.dtsJobDirection;
                this.dtsJobId = model.dtsJobId;
                this.dtsJobName = model.dtsJobName;
                this.duUsage = model.duUsage;
                this.endTimestamp = model.endTimestamp;
                this.errorDetails = model.errorDetails;
                this.errorMessage = model.errorMessage;
                this.etlSafeCheckpoint = model.etlSafeCheckpoint;
                this.expireTime = model.expireTime;
                this.fullDataCheckStatus = model.fullDataCheckStatus;
                this.incDataCheckStatus = model.incDataCheckStatus;
                this.jobType = model.jobType;
                this.maxDu = model.maxDu;
                this.memUsage = model.memUsage;
                this.migrationErrCode = model.migrationErrCode;
                this.migrationErrHelpDocId = model.migrationErrHelpDocId;
                this.migrationErrHelpDocKey = model.migrationErrHelpDocKey;
                this.migrationErrMsg = model.migrationErrMsg;
                this.migrationErrType = model.migrationErrType;
                this.migrationErrWorkaround = model.migrationErrWorkaround;
                this.migrationMode = model.migrationMode;
                this.minDu = model.minDu;
                this.originType = model.originType;
                this.payType = model.payType;
                this.performance = model.performance;
                this.precheckStatus = model.precheckStatus;
                this.reserved = model.reserved;
                this.resourceGroupDisplayName = model.resourceGroupDisplayName;
                this.resourceGroupId = model.resourceGroupId;
                this.retryState = model.retryState;
                this.reverseJob = model.reverseJob;
                this.sourceEndpoint = model.sourceEndpoint;
                this.status = model.status;
                this.structureInitializationStatus = model.structureInitializationStatus;
                this.tagList = model.tagList;
            } 

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>new</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The start time of the timestamp range saved in the change tracking instance, in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-15T08:25:34Z</p>
             */
            public Builder beginTimestamp(String beginTimestamp) {
                this.beginTimestamp = beginTimestamp;
                return this;
            }

            /**
             * <p>The checkpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>1616899019</p>
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * <p>The downstream consumption checkpoint of the change tracking instance, in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-23T07:30:31Z</p>
             */
            public Builder consumptionCheckpoint(String consumptionCheckpoint) {
                this.consumptionCheckpoint = consumptionCheckpoint;
                return this;
            }

            /**
             * <p>The downstream consumption client information, which consists of the IP address and a random number generated by DTS.</p>
             * 
             * <strong>example:</strong>
             * <p>114...:dts******</p>
             */
            public Builder consumptionClient(String consumptionClient) {
                this.consumptionClient = consumptionClient;
                return this;
            }

            /**
             * <p>The current CPU utilization of the instance. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpuUsage(String cpuUsage) {
                this.cpuUsage = cpuUsage;
                return this;
            }

            /**
             * <p>The task creation time, in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-28 17:34:53.0</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The status of the physical migration to the cloud task.</p>
             */
            public Builder dataCloudStatus(DataCloudStatus dataCloudStatus) {
                this.dataCloudStatus = dataCloudStatus;
                return this;
            }

            /**
             * <p>The status of the ETL task.</p>
             * <blockquote>
             * <p>This parameter collection is returned only after an ETL task is configured.</p>
             * </blockquote>
             */
            public Builder dataEtlStatus(DataEtlStatus dataEtlStatus) {
                this.dataEtlStatus = dataEtlStatus;
                return this;
            }

            /**
             * <p>The status of full data migration or initial data synchronization.</p>
             */
            public Builder dataInitializationStatus(DataInitializationStatus dataInitializationStatus) {
                this.dataInitializationStatus = dataInitializationStatus;
                return this;
            }

            /**
             * <p>The status of incremental data migration or synchronization.</p>
             */
            public Builder dataSynchronizationStatus(DataSynchronizationStatus dataSynchronizationStatus) {
                this.dataSynchronizationStatus = dataSynchronizationStatus;
                return this;
            }

            /**
             * <p>The migration, synchronization, or change tracking objects. For more information about the definitions, see <a href="https://help.aliyun.com/document_detail/209545.html">Description of migration, synchronization, or change tracking objects</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;dtstestdata&quot;: { &quot;name&quot;: &quot;dtstestdata&quot;, &quot;all&quot;: true }}</p>
             */
            public Builder dbObject(String dbObject) {
                this.dbObject = dbObject;
                return this;
            }

            /**
             * <p>The ID of the dedicated DTS cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>dtscluster_ft7y3**********</p>
             */
            public Builder dedicatedClusterId(String dedicatedClusterId) {
                this.dedicatedClusterId = dedicatedClusterId;
                return this;
            }

            /**
             * <p>The latency of incremental data migration or synchronization.</p>
             * <blockquote>
             * <p>If you query a data migration task, the unit of this parameter is milliseconds. If you query a data synchronization task, the unit of this parameter is seconds.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>The connection information of the destination instance.</p>
             */
            public Builder destinationEndpoint(DestinationEndpoint destinationEndpoint) {
                this.destinationEndpoint = destinationEndpoint;
                return this;
            }

            /**
             * <p>The environment tag of the DTS instance. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: Normal.</li>
             * <li><strong>online</strong>: Online.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder dtsBisLabel(String dtsBisLabel) {
                this.dtsBisLabel = dtsBisLabel;
                return this;
            }

            /**
             * <p>The ID of the data migration, data synchronization, or subscribe instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtsi03e3zty16i****</p>
             */
            public Builder dtsInstanceID(String dtsInstanceID) {
                this.dtsInstanceID = dtsInstanceID;
                return this;
            }

            /**
             * <p>The link specifications.</p>
             * <blockquote>
             * <p>For more information about the specifications and performance tests of each link, see <a href="https://help.aliyun.com/document_detail/26606.html">Specifications for data migration links</a> and <a href="https://help.aliyun.com/document_detail/26605.html">Specifications for data synchronization links</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>large</p>
             */
            public Builder dtsJobClass(String dtsJobClass) {
                this.dtsJobClass = dtsJobClass;
                return this;
            }

            /**
             * <p>The synchronization direction. Valid values:</p>
             * <ul>
             * <li><strong>Forward</strong>: Forward.</li>
             * <li><strong>Reverse</strong>: Reverse.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is returned only when the topology of the data synchronization instance is two-way synchronization.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Forward</p>
             */
            public Builder dtsJobDirection(String dtsJobDirection) {
                this.dtsJobDirection = dtsJobDirection;
                return this;
            }

            /**
             * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
             * 
             * <strong>example:</strong>
             * <p>i03e3zty16i****</p>
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * <p>The name of the DTS task.</p>
             * 
             * <strong>example:</strong>
             * <p>TestNg_polardb_cn-beijing_cn-beijing_polardb</p>
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * <p>The used resources of the dedicated DTS cluster. Unit: DU.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder duUsage(Long duUsage) {
                this.duUsage = duUsage;
                return this;
            }

            /**
             * <p>The end backup timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-26T14:03:21Z</p>
             */
            public Builder endTimestamp(String endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * <p>The error details.</p>
             */
            public Builder errorDetails(java.util.List<ErrorDetails> errorDetails) {
                this.errorDetails = errorDetails;
                return this;
            }

            /**
             * <p>The error message for a failed task.</p>
             * 
             * <strong>example:</strong>
             * <p>The deviceName is empty.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The safe checkpoint of the ETL task.</p>
             * 
             * <strong>example:</strong>
             * <p>1610540493</p>
             */
            public Builder etlSafeCheckpoint(String etlSafeCheckpoint) {
                this.etlSafeCheckpoint = etlSafeCheckpoint;
                return this;
            }

            /**
             * <p>The expiration time of the instance, in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is in UTC.</p>
             * <blockquote>
             * <p>This parameter is returned only when the <strong>PayType</strong> parameter is set to <strong>PrePaid</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2022-03-16T08:01:19Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The status information of full data verification.</p>
             */
            public Builder fullDataCheckStatus(FullDataCheckStatus fullDataCheckStatus) {
                this.fullDataCheckStatus = fullDataCheckStatus;
                return this;
            }

            /**
             * <p>The status information of incremental data verification.</p>
             */
            public Builder incDataCheckStatus(IncDataCheckStatus incDataCheckStatus) {
                this.incDataCheckStatus = incDataCheckStatus;
                return this;
            }

            /**
             * <p>The DTS task type.</p>
             * 
             * <strong>example:</strong>
             * <p>SYNC</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The DU upper limit of the serverless instance.</p>
             * 
             * <strong>example:</strong>
             * <p>4.0</p>
             */
            public Builder maxDu(Double maxDu) {
                this.maxDu = maxDu;
                return this;
            }

            /**
             * <p>The used memory. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder memUsage(String memUsage) {
                this.memUsage = memUsage;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>dts.retry.err.0046</p>
             */
            public Builder migrationErrCode(String migrationErrCode) {
                this.migrationErrCode = migrationErrCode;
                return this;
            }

            /**
             * <p>The ID of the help document for the error code.</p>
             * 
             * <strong>example:</strong>
             * <p>462133</p>
             */
            public Builder migrationErrHelpDocId(String migrationErrHelpDocId) {
                this.migrationErrHelpDocId = migrationErrHelpDocId;
                return this;
            }

            /**
             * <p>The key of the help document for the error code.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-RETRY-ERR-0046</p>
             */
            public Builder migrationErrHelpDocKey(String migrationErrHelpDocKey) {
                this.migrationErrHelpDocKey = migrationErrHelpDocKey;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>dts.retry.err.0046.msg</p>
             */
            public Builder migrationErrMsg(String migrationErrMsg) {
                this.migrationErrMsg = migrationErrMsg;
                return this;
            }

            /**
             * <p>The type of the error code.</p>
             * 
             * <strong>example:</strong>
             * <p>ForeignKey</p>
             */
            public Builder migrationErrType(String migrationErrType) {
                this.migrationErrType = migrationErrType;
                return this;
            }

            /**
             * <p>The error workaround.</p>
             * 
             * <strong>example:</strong>
             * <p>dts.retry.err.0046.workaround</p>
             */
            public Builder migrationErrWorkaround(String migrationErrWorkaround) {
                this.migrationErrWorkaround = migrationErrWorkaround;
                return this;
            }

            /**
             * <p>The migration type or initial synchronization type.</p>
             */
            public Builder migrationMode(MigrationMode migrationMode) {
                this.migrationMode = migrationMode;
                return this;
            }

            /**
             * <p>The minimum number of DUs for the serverless instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minDu(Double minDu) {
                this.minDu = minDu;
                return this;
            }

            /**
             * <p>The source of the task. Valid values:</p>
             * <ul>
             * <li><strong>PTS task</strong></li>
             * <li><strong>DMS task</strong></li>
             * <li><strong>DTS task</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DTS</p>
             */
            public Builder originType(String originType) {
                this.originType = originType;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * <ul>
             * <li><strong>PrePaid</strong>: Subscription.</li>
             * <li><strong>PostPaid</strong>: Pay-as-you-go.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The performance information of the migration or synchronization link.</p>
             */
            public Builder performance(Performance performance) {
                this.performance = performance;
                return this;
            }

            /**
             * <p>The precheck status.</p>
             */
            public Builder precheckStatus(PrecheckStatus precheckStatus) {
                this.precheckStatus = precheckStatus;
                return this;
            }

            /**
             * <p>The reserved parameter for DTS. The value is a JSON string. You can specify this parameter to meet special requirements, such as whether to automatically start the precheck. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved parameter description</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;srcHostPorts\&quot;:\&quot;\&quot;,\&quot;whitelist.dms.online.ddl.enable\&quot;:false,\&quot;filterDDL\&quot;:false,\&quot;sqlparser.dms.original.ddl\&quot;:true,\&quot;srcOracleType\&quot;:\&quot;sid\&quot;,\&quot;maxRetryTime\&quot;:43200,\&quot;destSSL\&quot;:\&quot;0\&quot;,\&quot;destOracleType\&quot;:\&quot;sid\&quot;,\&quot;srcSSL\&quot;:\&quot;0\&quot;,\&quot;dbListCaseChangeMode\&quot;:\&quot;default\&quot;,\&quot;SourceEngineVersion\&quot;:\&quot;8.0.18\&quot;,\&quot;srcNetType\&quot;:\&quot;VPC\&quot;,\&quot;destNetType\&quot;:\&quot;VPC\&quot;,\&quot;srcVpcNetMappingInst\&quot;:\&quot;172.16.1**.<strong>:10803\&quot;,\&quot;destVpcNetMappingInst\&quot;:\&quot;172.16.1</strong>.**:11077\&quot;,\&quot;useJobTask\&quot;:\&quot;1\&quot;}</p>
             */
            public Builder reserved(String reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * <p>The name of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>default resource group</p>
             */
            public Builder resourceGroupDisplayName(String resourceGroupDisplayName) {
                this.resourceGroupDisplayName = resourceGroupDisplayName;
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
             * <p>The retry state of DTS due to a task exception.</p>
             */
            public Builder retryState(RetryState retryState) {
                this.retryState = retryState;
                return this;
            }

            /**
             * <p>The execution details of the reverse synchronization task.</p>
             * <blockquote>
             * <p>This parameter collection is returned only when the task is a data synchronization task and the topology type is two-way.</p>
             * </blockquote>
             */
            public Builder reverseJob(ReverseJob reverseJob) {
                this.reverseJob = reverseJob;
                return this;
            }

            /**
             * <p>The connection information of the source instance.</p>
             */
            public Builder sourceEndpoint(DtsJobListSourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
                return this;
            }

            /**
             * <p>The DTS instance status. Valid values:</p>
             * <p>Status of a data migration node:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The node is not started.</li>
             * <li><strong>Prechecking</strong>: The precheck is in progress.</li>
             * <li><strong>PrecheckFailed</strong>: The precheck failed.</li>
             * <li><strong>PreCheckPass</strong>: The precheck passed.</li>
             * <li><strong>NotConfigured</strong>: The node is not configured.</li>
             * <li><strong>Migrating</strong>: The migration is in progress.</li>
             * <li><strong>Suspending</strong>: The node is being paused.</li>
             * <li><strong>MigrationFailed</strong>: The migration failed.</li>
             * <li><strong>Finished</strong>: The node is completed.</li>
             * <li><strong>Retrying</strong>: The node is being retried.</li>
             * <li><strong>Upgrade</strong>: The node is being upgraded.</li>
             * <li><strong>Locked</strong>: The node is locked.</li>
             * <li><strong>Downgrade</strong>: The node is being downgraded.</li>
             * </ul>
             * <p>Status of a data synchronization node:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The node is not started.</li>
             * <li><strong>Prechecking</strong>: The precheck is in progress.</li>
             * <li><strong>PrecheckFailed</strong>: The precheck failed.</li>
             * <li><strong>PreCheckPass</strong>: The precheck passed.</li>
             * <li><strong>NotConfigured</strong>: The node is not configured.</li>
             * <li><strong>Initializing</strong>: Initial synchronization is in progress.</li>
             * <li><strong>InitializeFailed</strong>: Initial synchronization failed.</li>
             * <li><strong>Synchronizing</strong>: Data synchronization is in progress.</li>
             * <li><strong>Failed</strong>: The synchronization failed.</li>
             * <li><strong>Suspending</strong>: The node is being paused.</li>
             * <li><strong>Modifying</strong>: The synchronization objects are being modified.</li>
             * <li><strong>Finished</strong>: The node is completed.</li>
             * <li><strong>Retrying</strong>: The node is being retried.</li>
             * <li><strong>Upgrade</strong>: The node is being upgraded.</li>
             * <li><strong>Locked</strong>: The node is locked.</li>
             * <li><strong>Downgrade</strong>: The node is being downgraded.</li>
             * </ul>
             * <p>Status of a subscribe node:</p>
             * <ul>
             * <li><strong>NotConfigured</strong>: The node is not configured.</li>
             * <li><strong>NotStarted</strong>: The node is not started.</li>
             * <li><strong>Prechecking</strong>: The precheck is in progress.</li>
             * <li><strong>PrecheckFailed</strong>: The precheck failed.</li>
             * <li><strong>PreCheckPass</strong>: The precheck passed.</li>
             * <li><strong>Starting</strong>: The node is being started.</li>
             * <li><strong>Normal</strong>: The node is running normally.</li>
             * <li><strong>Retrying</strong>: The node is being retried.</li>
             * <li><strong>Abnormal</strong>: The node is abnormal.</li>
             * <li><strong>Upgrade</strong>: The node is being upgraded.</li>
             * <li><strong>Locked</strong>: The node is locked.</li>
             * <li><strong>Downgrade</strong>: The node is being downgraded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The status of schema migration or initial schema synchronization.</p>
             */
            public Builder structureInitializationStatus(DtsJobListStructureInitializationStatus structureInitializationStatus) {
                this.structureInitializationStatus = structureInitializationStatus;
                return this;
            }

            /**
             * <p>The list of tags.</p>
             */
            public Builder tagList(java.util.List<TagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            public DtsJobList build() {
                return new DtsJobList(this);
            } 

        } 

    }
}
