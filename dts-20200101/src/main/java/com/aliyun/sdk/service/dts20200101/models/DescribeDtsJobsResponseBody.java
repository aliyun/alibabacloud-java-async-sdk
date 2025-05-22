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
 * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDtsJobsResponseBody</p>
 */
public class DescribeDtsJobsResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("EtlDemoList")
    private java.util.List<EtlDemoList> etlDemoList;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeDtsJobsResponseBody(Builder builder) {
        this.dtsJobList = builder.dtsJobList;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.etlDemoList = builder.etlDemoList;
        this.httpStatusCode = builder.httpStatusCode;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDtsJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return etlDemoList
     */
    public java.util.List<EtlDemoList> getEtlDemoList() {
        return this.etlDemoList;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<DtsJobList> dtsJobList; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private java.util.List<EtlDemoList> etlDemoList; 
        private Integer httpStatusCode; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Boolean success; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeDtsJobsResponseBody model) {
            this.dtsJobList = model.dtsJobList;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.etlDemoList = model.etlDemoList;
            this.httpStatusCode = model.httpStatusCode;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The Data Transmission Service (DTS) tasks and the details of each task.</p>
         */
        public Builder dtsJobList(java.util.List<DtsJobList> dtsJobList) {
            this.dtsJobList = dtsJobList;
            return this;
        }

        /**
         * <p>The dynamic error code. This parameter will be removed in the future.</p>
         * 
         * <strong>example:</strong>
         * <p>403</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic part in the error message. The value of this parameter is used to replace the <strong>%s</strong> variable in the value of the <strong>ErrMessage</strong> parameter.</p>
         * <blockquote>
         * <p> For example, if the value of the <strong>ErrMessage</strong> parameter is <strong>The Value of Input Parameter %s is not valid</strong> and the value of the <strong>DynamicMessage</strong> parameter is <strong>Type</strong>, the specified <strong>Type</strong> parameter is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Type</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error code returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The Value of Input Parameter %s is not valid.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The DTS tasks and the details of each task.</p>
         */
        public Builder etlDemoList(java.util.List<EtlDemoList> etlDemoList) {
            this.etlDemoList = etlDemoList;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>621BB4F8-3016-4FAA-8D5A-5D3163CC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of DTS tasks that meet the query condition.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeDtsJobsResponseBody build() {
            return new DescribeDtsJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>framework: DTS-31009: In process of processing data ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the instance needs to be upgraded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong> </li>
             * <li><strong>false</strong></li>
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
             * <p>The progress of the task. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>85</p>
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
             * <p>The state of the task. For more information about the valid values, see the description of the request parameter <strong>Status</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Migrating</p>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>The task has failed for a long time and cannot be recovered.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of the ETL task.</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of records that have been processed by the ETL task.</p>
             * 
             * <strong>example:</strong>
             * <p>0/0</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of the ETL task. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Migrating</strong>: The task is in progress.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * <li><strong>Catched</strong>: The task is not delayed.</li>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
             * <p>The error message returned if full data synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.NumberFormatException: For input string: &quot;&quot;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of full data synchronization. This is expressed as a percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of records that have been synchronized during full data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>44755</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of full data synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Migrating</strong>: The task is in progress.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * </ul>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
             * <p>The error message returned if incremental data migration or synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>The task has failed for a long time and cannot be recovered.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the instance needs to be upgraded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * <blockquote>
             * <p> To upgrade a DTS instance, call the <a href="https://help.aliyun.com/document_detail/281093.html">TransferInstanceClass</a> operation.</p>
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
             * <p>The progress of incremental data migration or synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of records that have been migrated or synchronized during incremental data migration or synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>0/0</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of incremental data migration or synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Migrating</strong>: The task is in progress.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * <li><strong>Catched</strong>: The task is not delayed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Catched</p>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
             * <p>The name of the database to which the migration object in the destination instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database type of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The ID of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1imrtn6fq7h****</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The type of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The endpoint of the destination instance.</p>
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
             * <p> This parameter is returned only if the <strong>EngineName</strong> parameter of the destination instance is set to <strong>Oracle</strong> and the Oracle database is deployed in a non-RAC architecture.</p>
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
             * <p>The database service port of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the region in which the destination instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
             * <ul>
             * <li><strong>DISABLE</strong>: SSL encryption is disabled.</li>
             * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL encryption is enabled, and the CA certificate is uploaded.</li>
             * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL encryption is enabled for the connection to an AWS MongoDB Altas database.</li>
             * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to encrypt the connection to a Kafka cluster.</li>
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
             * <p>The database account of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest</p>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
             * <p>The error code returned.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-31009</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The URL of the documentation.</p>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class FullDataCheckStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanSwitch")
        private Boolean canSwitch;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private FullDataCheckStatus(Builder builder) {
            this.canSwitch = builder.canSwitch;
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
         * @return canSwitch
         */
        public Boolean getCanSwitch() {
            return this.canSwitch;
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
            private Boolean canSwitch; 
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            private Builder() {
            } 

            private Builder(FullDataCheckStatus model) {
                this.canSwitch = model.canSwitch;
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * CanSwitch.
             */
            public Builder canSwitch(Boolean canSwitch) {
                this.canSwitch = canSwitch;
                return this;
            }

            /**
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.NumberFormatException: For input string: &quot;&quot;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of the full data verification task. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The progress of the full data verification task.</p>
             * 
             * <strong>example:</strong>
             * <p>1 rows/s (row: 5/5, table: 1/1)</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of the full data verification task. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The verification is not started. </li>
             * <li><strong>Checking</strong>: The verification is in progress. </li>
             * <li><strong>Failed</strong>: The verification failed. </li>
             * <li><strong>Finished</strong>: The verification is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Checking</p>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.NumberFormatException: For input string: &quot;&quot;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of the incremental data verification task. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The progress of the incremental data verification task.</p>
             * 
             * <strong>example:</strong>
             * <p>1 rows/s (row: 5/5, table: 1/1)</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of the incremental data verification task. Valid values:</p>
             * <ul>
             * <li><strong>Catched</strong>: The verification is delayed. </li>
             * <li><strong>NotStarted</strong>: The verification is not started. </li>
             * <li><strong>Checking</strong>: The verification is in progress. </li>
             * <li><strong>Failed</strong>: The verification failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Checking</p>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("StructureDataCheck")
        private Boolean structureDataCheck;

        @com.aliyun.core.annotation.NameInMap("StructureInitialization")
        private Boolean structureInitialization;

        private MigrationMode(Builder builder) {
            this.dataInitialization = builder.dataInitialization;
            this.dataSynchronization = builder.dataSynchronization;
            this.fullDataCheck = builder.fullDataCheck;
            this.incDataCheck = builder.incDataCheck;
            this.structureDataCheck = builder.structureDataCheck;
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
         * @return structureDataCheck
         */
        public Boolean getStructureDataCheck() {
            return this.structureDataCheck;
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
            private Boolean structureDataCheck; 
            private Boolean structureInitialization; 

            private Builder() {
            } 

            private Builder(MigrationMode model) {
                this.dataInitialization = model.dataInitialization;
                this.dataSynchronization = model.dataSynchronization;
                this.fullDataCheck = model.fullDataCheck;
                this.incDataCheck = model.incDataCheck;
                this.structureDataCheck = model.structureDataCheck;
                this.structureInitialization = model.structureInitialization;
            } 

            /**
             * <p>Indicates whether full data migration or synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
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
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
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
             * <p>Indicates whether full data verification is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
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
             * <p>Indicates whether incremental data verification is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
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
             * StructureDataCheck.
             */
            public Builder structureDataCheck(Boolean structureDataCheck) {
                this.structureDataCheck = structureDataCheck;
                return this;
            }

            /**
             * <p>Indicates whether schema migration or schema synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
             * <p>The size of data that is migrated or synchronized per second. Unit: MB/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * <p>The number of times that SQL statements are migrated or synchronized per second, including BEGIN, COMMIT, DML, and DDL statements. DML statements include INSERT, DELETE, and UPDATE.</p>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
             * <p>The name of the precheck item.</p>
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
             * <li><strong>Success</strong></li>
             * <li><strong>Failed</strong></li>
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
             * <p>The error message returned if the task failed to pass the precheck.</p>
             * <blockquote>
             * <p> This parameter is returned only if the value of the <strong>CheckResult</strong> parameter is <strong>Failed</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Original error: Access denied for user &quot;dtstest&quot;@&quot;100.104.***.**&quot; (using password: YES)</p>
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * <p>The method to fix the precheck failure.</p>
             * <blockquote>
             * <p> This parameter is returned only if the value of the <strong>CheckResult</strong> parameter is <strong>Failed</strong>.</p>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
             * <p>The result of each precheck item.</p>
             */
            public Builder detail(java.util.List<Detail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The cause of the precheck failure.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK__ERROR_SAME_OBJ.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The precheck progress. This is expressed as a percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The precheck status. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong></li>
             * <li><strong>Suspending</strong>:</li>
             * <li><strong>Checking</strong></li>
             * <li><strong>Failed</strong></li>
             * <li><strong>Finished</strong></li>
             * </ul>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
             * <p>The error message returned if these retries failed.</p>
             * 
             * <strong>example:</strong>
             * <p>Unexpected error</p>
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
             * <p>The maximum duration of a retry. Unit: seconds.</p>
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
             * <p>The ID of the error code-related documentation.</p>
             * 
             * <strong>example:</strong>
             * <p>462133</p>
             */
            public Builder migrationErrHelpDocId(String migrationErrHelpDocId) {
                this.migrationErrHelpDocId = migrationErrHelpDocId;
                return this;
            }

            /**
             * <p>The key of the error code-related documentation.</p>
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
             * <p>The solution to the error.</p>
             * 
             * <strong>example:</strong>
             * <p>dts.retry.err.0046.workaround</p>
             */
            public Builder migrationErrWorkaround(String migrationErrWorkaround) {
                this.migrationErrWorkaround = migrationErrWorkaround;
                return this;
            }

            /**
             * <p>The progress of the instance when DTS retries.</p>
             * 
             * <strong>example:</strong>
             * <p>03</p>
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * <p>The number of retries that have been performed.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder retryCount(Integer retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * <p>The object on which these retries are performed. Valid values:</p>
             * <ul>
             * <li><strong>srcDB</strong>: the source database </li>
             * <li><strong>destDB</strong>: the destination database </li>
             * <li><strong>inner_module</strong>: an internal module of DTS</li>
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
             * <p>The time that has elapsed from the time when the first retry starts. Unit: seconds.</p>
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
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
             * <p>The error message returned if initial full data synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.NumberFormatException: For input string: &quot;&quot;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of initial full data synchronization. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of entries that have been synchronized during initial full data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>43071</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of initial full data synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started. </li>
             * <li><strong>Migrating</strong>: The task is in progress. </li>
             * <li><strong>Failed</strong>: The task failed. </li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * </ul>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
             * <p>The error message returned if incremental data synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>The task has failed for a long time and cannot be recovered.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the instance needs to be upgraded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p>To upgrade a DTS instance, call the <a href="https://help.aliyun.com/document_detail/281093.html">TransferInstanceClass</a> operation.</p>
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
             * <p>The progress of incremental data synchronization. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of entries that have been migrated or synchronized during incremental data migration or synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>20001</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of incremental data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>Migrating</p>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
             * <p>The name of the database that contains the synchronized objects in the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database engine of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The ID of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1162kryivb8****</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The type of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The endpoint of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.88.***</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The SID of the Oracle database. </p>
             * <blockquote>
             * <p>This parameter is returned only if the returned value of <strong>EngineName</strong> of the destination instance is <strong>Oracle</strong> and the Oracle database is deployed in a non-RAC architecture.</p>
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
             * <p>The port number of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the region in which the destination instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
             * <ul>
             * <li><strong>DISABLE</strong>: SSL encryption is disabled. </li>
             * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL encryption is enabled and the CA certificate is uploaded. </li>
             * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL encryption is enabled for the connection with an AWS MongoDB Altas database. </li>
             * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to encrypt the connection with a Kafka cluster.</li>
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
             * <p>The database account of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest</p>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
             * <p>The error code returned.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-31009</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The URL of the documentation.</p>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class ReverseJobFullDataCheckStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanSwitch")
        private Boolean canSwitch;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ReverseJobFullDataCheckStatus(Builder builder) {
            this.canSwitch = builder.canSwitch;
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
         * @return canSwitch
         */
        public Boolean getCanSwitch() {
            return this.canSwitch;
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
            private Boolean canSwitch; 
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            private Builder() {
            } 

            private Builder(ReverseJobFullDataCheckStatus model) {
                this.canSwitch = model.canSwitch;
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * CanSwitch.
             */
            public Builder canSwitch(Boolean canSwitch) {
                this.canSwitch = canSwitch;
                return this;
            }

            /**
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.NumberFormatException: For input string: &quot;&quot;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of the full data verification task. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The progress of the full data verification task.</p>
             * 
             * <strong>example:</strong>
             * <p>1 rows/s (row: 5/5, table: 1/1)</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of the full data verification task. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The verification is not started. </li>
             * <li><strong>Checking</strong>: The verification is in progress. </li>
             * <li><strong>Failed</strong>: The verification failed. </li>
             * <li><strong>Finished</strong>: The verification is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Checking</p>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.NumberFormatException: For input string: &quot;&quot;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of the incremental data verification task. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The progress of the incremental data verification task.</p>
             * 
             * <strong>example:</strong>
             * <p>1 rows/s (row: 5/5, table: 1/1)</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of the incremental data verification task. Valid values:</p>
             * <ul>
             * <li><strong>Catched</strong>: The verification is delayed. </li>
             * <li><strong>NotStarted</strong>: The verification is not started. </li>
             * <li><strong>Checking</strong>: The verification is in progress. </li>
             * <li><strong>Failed</strong>: The verification failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Checking</p>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("StructureDataCheck")
        private Boolean structureDataCheck;

        @com.aliyun.core.annotation.NameInMap("StructureInitialization")
        private Boolean structureInitialization;

        private ReverseJobMigrationMode(Builder builder) {
            this.dataInitialization = builder.dataInitialization;
            this.dataSynchronization = builder.dataSynchronization;
            this.fullDataCheck = builder.fullDataCheck;
            this.incDataCheck = builder.incDataCheck;
            this.structureDataCheck = builder.structureDataCheck;
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
         * @return structureDataCheck
         */
        public Boolean getStructureDataCheck() {
            return this.structureDataCheck;
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
            private Boolean structureDataCheck; 
            private Boolean structureInitialization; 

            private Builder() {
            } 

            private Builder(ReverseJobMigrationMode model) {
                this.dataInitialization = model.dataInitialization;
                this.dataSynchronization = model.dataSynchronization;
                this.fullDataCheck = model.fullDataCheck;
                this.incDataCheck = model.incDataCheck;
                this.structureDataCheck = model.structureDataCheck;
                this.structureInitialization = model.structureInitialization;
            } 

            /**
             * <p>Indicates whether initial full data synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>Indicates whether incremental data synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>Indicates whether full data verification is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
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
             * <p>Indicates whether incremental data verification is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
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
             * StructureDataCheck.
             */
            public Builder structureDataCheck(Boolean structureDataCheck) {
                this.structureDataCheck = structureDataCheck;
                return this;
            }

            /**
             * <p>Indicates whether initial schema synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
             * <p>The size of data that is synchronized per second. Unit: MB/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * <p>The number of times that SQL statements are synchronized per second, including BEGIN, COMMIT, DML, and DDL statements. DML statements include INSERT, DELETE, and UPDATE.</p>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
             * <p>The name of the precheck item.</p>
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
             * <li><strong>Success</strong></li>
             * <li><strong>Failed</strong></li>
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
             * <p>The error message returned if the task failed to pass the precheck.</p>
             * 
             * <strong>example:</strong>
             * <p>Original error: Access denied for user &quot;dtstest&quot;@&quot;100.104.***.**&quot; (using password: YES)</p>
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * <p>The method to fix a precheck failure.</p>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
             * <p>The result of each precheck item.</p>
             */
            public Builder detail(java.util.List<PrecheckStatusDetail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The error message returned if the precheck failed.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK__ERROR_SAME_OBJ.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The precheck progress. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The precheck state. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The precheck is not started. </li>
             * <li><strong>Suspending</strong>: The precheck is paused. </li>
             * <li><strong>Checking</strong>: The precheck is in progress. </li>
             * <li><strong>Failed</strong>: The precheck failed. </li>
             * <li><strong>Finished</strong>: The precheck is complete.</li>
             * </ul>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
             * <p>The name of the database that contains the objects to be migrated from the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database engine of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The ID of the source instance.</p>
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
             * <p>The SID of the Oracle database. </p>
             * <blockquote>
             * <p>This parameter is returned only if the returned value of <strong>EngineName</strong> of the source instance is <strong>Oracle</strong> and the Oracle database is deployed in a non-RAC architecture.</p>
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
             * <p>The port number of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the region in which the source instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
             * <ul>
             * <li><strong>DISABLE</strong>: SSL encryption is disabled. </li>
             * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL encryption is enabled and the CA certificate is uploaded. </li>
             * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL encryption is enabled for the connection with an AWS MongoDB Altas database. </li>
             * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to encrypt the connection with a Kafka cluster.</li>
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
             * <p>The database account of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest</p>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class StructureDataCheckStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private StructureDataCheckStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StructureDataCheckStatus create() {
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

            private Builder(StructureDataCheckStatus model) {
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if the precheck failed.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK__ERROR_SAME_OBJ.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The precheck progress. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The progress of the incremental data verification task.</p>
             * 
             * <strong>example:</strong>
             * <p>1 rows/s (row: 5/5, table: 1/1)</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The precheck state. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The precheck is not started. </li>
             * <li><strong>Suspending</strong>: The precheck is paused. </li>
             * <li><strong>Checking</strong>: The precheck is in progress. </li>
             * <li><strong>Failed</strong>: The precheck failed. </li>
             * <li><strong>Finished</strong>: The precheck is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public StructureDataCheckStatus build() {
                return new StructureDataCheckStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
             * <p>The error message returned if initial schema synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-1020042 Execute sql error sql: ERROR: type &quot;geometry&quot; does not exist;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of initial schema synchronization. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of tables that have been synchronized during initial schema synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of initial schema synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started. </li>
             * <li><strong>Migrating</strong>: The task is in progress. </li>
             * <li><strong>Failed</strong>: The task failed. </li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * </ul>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("StructureDataCheckStatus")
        private StructureDataCheckStatus structureDataCheckStatus;

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
            this.structureDataCheckStatus = builder.structureDataCheckStatus;
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
         * @return structureDataCheckStatus
         */
        public StructureDataCheckStatus getStructureDataCheckStatus() {
            return this.structureDataCheckStatus;
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
            private StructureDataCheckStatus structureDataCheckStatus; 
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
                this.structureDataCheckStatus = model.structureDataCheckStatus;
                this.structureInitializationStatus = model.structureInitializationStatus;
            } 

            /**
             * <p>The start offset of incremental data synchronization. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1616980369</p>
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * <p>The CPU utilization of the instance. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder cpuUsage(String cpuUsage) {
                this.cpuUsage = cpuUsage;
                return this;
            }

            /**
             * <p>The time when the task was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-16T08:01:19Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The state of initial full data synchronization.</p>
             */
            public Builder dataInitializationStatus(ReverseJobDataInitializationStatus dataInitializationStatus) {
                this.dataInitializationStatus = dataInitializationStatus;
                return this;
            }

            /**
             * <p>The state of incremental data synchronization.</p>
             */
            public Builder dataSynchronizationStatus(ReverseJobDataSynchronizationStatus dataSynchronizationStatus) {
                this.dataSynchronizationStatus = dataSynchronizationStatus;
                return this;
            }

            /**
             * <p>The schema of the objects that you want to synchronize. The value is a JSON string and can contain regular expressions. For more information, see Objects of DTS tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;dtstestdata&quot;: { &quot;name&quot;: &quot;dtstestdata&quot;, &quot;all&quot;: true }}</p>
             */
            public Builder dbObject(String dbObject) {
                this.dbObject = dbObject;
                return this;
            }

            /**
             * <p>The ID of the DTS dedicated cluster on which a DTS task runs.</p>
             * 
             * <strong>example:</strong>
             * <p>dtscluster_dpwl3**********</p>
             */
            public Builder dedicatedClusterId(String dedicatedClusterId) {
                this.dedicatedClusterId = dedicatedClusterId;
                return this;
            }

            /**
             * <p>The latency of incremental data synchronization. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>The connection settings of the destination instance.</p>
             */
            public Builder destinationEndpoint(ReverseJobDestinationEndpoint destinationEndpoint) {
                this.destinationEndpoint = destinationEndpoint;
                return this;
            }

            /**
             * <p>The ID of the data synchronization instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtsi03e3zty16i****</p>
             */
            public Builder dtsInstanceID(String dtsInstanceID) {
                this.dtsInstanceID = dtsInstanceID;
                return this;
            }

            /**
             * <p>The instance class. </p>
             * <blockquote>
             * <p>For more information about the test performance of each instance class, see <a href="https://help.aliyun.com/document_detail/26605.html">Specifications of data synchronization instances</a>.</p>
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
             * <p>The synchronization direction. <strong>Reverse</strong> is returned.</p>
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
             * <p>The name of the data synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS_TO_RDS_MIGRATION</p>
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * <p>The number of DUs that have been used.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder duUsage(Long duUsage) {
                this.duUsage = duUsage;
                return this;
            }

            /**
             * <p>The error message returned.</p>
             */
            public Builder errorDetails(java.util.List<ReverseJobErrorDetails> errorDetails) {
                this.errorDetails = errorDetails;
                return this;
            }

            /**
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by [com.mysql.jdbc.exceptions.jdbc4.MySQLNonTransientConnectionException:Could not create connection to database server. Attempted reconnect 3 times. Giving up.][com.mysql.jdbc.exceptions.jdbc4.CommunicationsException:Communications link failure\n\nThe last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.][java.net.ConnectException:Connection timed out (Connection timed out)] About more information in [<a href="https://yq.aliyun.com/articles/499178%5D">https://yq.aliyun.com/articles/499178]</a>.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The checkpoint of the ETL task.</p>
             * 
             * <strong>example:</strong>
             * <p>1610540493</p>
             */
            public Builder etlSafeCheckpoint(String etlSafeCheckpoint) {
                this.etlSafeCheckpoint = etlSafeCheckpoint;
                return this;
            }

            /**
             * <p>The time when the instance expires. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC. </p>
             * <blockquote>
             * <p>This parameter is returned only if the returned value of <strong>PayType</strong> is <strong>PrePaid</strong>.</p>
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
             * <p>The state information about the full data verification task.</p>
             */
            public Builder fullDataCheckStatus(ReverseJobFullDataCheckStatus fullDataCheckStatus) {
                this.fullDataCheckStatus = fullDataCheckStatus;
                return this;
            }

            /**
             * <p>The state information about the incremental data verification task.</p>
             */
            public Builder incDataCheckStatus(ReverseJobIncDataCheckStatus incDataCheckStatus) {
                this.incDataCheckStatus = incDataCheckStatus;
                return this;
            }

            /**
             * <p>Upper limit of DU.</p>
             * <blockquote>
             * <p>Only supported by Serverless instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder maxDu(Double maxDu) {
                this.maxDu = maxDu;
                return this;
            }

            /**
             * <p>The memory that has been used. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder memUsage(String memUsage) {
                this.memUsage = memUsage;
                return this;
            }

            /**
             * <p>The initial synchronization types.</p>
             */
            public Builder migrationMode(ReverseJobMigrationMode migrationMode) {
                this.migrationMode = migrationMode;
                return this;
            }

            /**
             * <p>Lower limit of DU.</p>
             * <blockquote>
             * <p>Only supported by Serverless instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minDu(Double minDu) {
                this.minDu = minDu;
                return this;
            }

            /**
             * <p>The billing method of the DTS instance. Valid values:</p>
             * <ul>
             * <li><strong>PrePaid</strong>: subscription</li>
             * <li><strong>PostPaid</strong>: pay-as-you-go</li>
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
             * <p>The performance of the data synchronization instance.</p>
             */
            public Builder performance(ReverseJobPerformance performance) {
                this.performance = performance;
                return this;
            }

            /**
             * <p>The precheck state.</p>
             */
            public Builder precheckStatus(ReverseJobPrecheckStatus precheckStatus) {
                this.precheckStatus = precheckStatus;
                return this;
            }

            /**
             * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, for example, whether to automatically start a precheck. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;srcHostPorts&quot;:&quot;&quot;,&quot;whitelist.dms.online.ddl.enable&quot;:false,&quot;filterDDL&quot;:false,&quot;sqlparser.dms.original.ddl&quot;:true,&quot;srcOracleType&quot;:&quot;sid&quot;,&quot;maxRetryTime&quot;:43200,&quot;destSSL&quot;:&quot;0&quot;,&quot;destOracleType&quot;:&quot;sid&quot;,&quot;srcSSL&quot;:&quot;0&quot;,&quot;dbListCaseChangeMode&quot;:&quot;default&quot;,&quot;SourceEngineVersion&quot;:&quot;8.0.18&quot;,&quot;srcNetType&quot;:&quot;VPC&quot;,&quot;destNetType&quot;:&quot;VPC&quot;,&quot;srcVpcNetMappingInst&quot;:&quot;172.16.1**.<strong>:10803&quot;,&quot;destVpcNetMappingInst&quot;:&quot;172.16.1</strong>.**:11077&quot;,&quot;useJobTask&quot;:&quot;1&quot;}</p>
             */
            public Builder reserved(String reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * <p>The connection settings of the source instance.</p>
             */
            public Builder sourceEndpoint(SourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
                return this;
            }

            /**
             * <p>The state of the DTS instance. For more information about the valid values, see the description of the request parameter <strong>Status</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Synchronizing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StructureDataCheckStatus.
             */
            public Builder structureDataCheckStatus(StructureDataCheckStatus structureDataCheckStatus) {
                this.structureDataCheckStatus = structureDataCheckStatus;
                return this;
            }

            /**
             * <p>The state of initial schema synchronization.</p>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
             * <p>The name of the database that contains the objects to be migrated from the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database engine of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The ID of the source instance.</p>
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
             * <p>The SID of the Oracle database. </p>
             * <blockquote>
             * <p>This parameter is returned only if the returned value of <strong>EngineName</strong> of the source instance is <strong>Oracle</strong> and the Oracle database is deployed in a non-RAC architecture.</p>
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
             * <p>The port number of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the region in which the source instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
             * <ul>
             * <li><strong>DISABLE</strong>: SSL encryption is disabled. </li>
             * <li><strong>ENABLE_WITH_CERTIFICAT</strong>E: SSL encryption is enabled and the CA certificate is uploaded. </li>
             * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL encryption is enabled for the connection with an AWS MongoDB Altas database. </li>
             * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to encrypt the connection with a Kafka cluster.</li>
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
             * <p>The database account of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest</p>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class DtsJobListStructureDataCheckStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DtsJobListStructureDataCheckStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DtsJobListStructureDataCheckStatus create() {
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

            private Builder(DtsJobListStructureDataCheckStatus model) {
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by [com.mysql.jdbc.exceptions.jdbc4.MySQLNonTransientConnectionException:Could not create connection to database server. Attempted reconnect 3 times. Giving up.][com.mysql.jdbc.exceptions.jdbc4.CommunicationsException:Communications link failure\n\nThe last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.][java.net.ConnectException:Connection timed out (Connection timed out)] About more information in [<a href="https://yq.aliyun.com/articles/499178%5D">https://yq.aliyun.com/articles/499178]</a>.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of initial schema synchronization. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of tables that have been synchronized during initial schema synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of the DTS instance. For more information about the valid values, see the description of the request parameter <strong>Status</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Synchronizing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DtsJobListStructureDataCheckStatus build() {
                return new DtsJobListStructureDataCheckStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
             * <p>The error message returned if schema migration or initial schema synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-1020042 Execute sql error sql: ERROR: type &quot;geometry&quot; does not exist;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of schema migration or initial schema synchronization. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of tables that have been migrated or synchronized during schema migration or initial schema synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of schema migration or initial schema synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started. </li>
             * <li><strong>Migrating</strong>: The task is in progress. </li>
             * <li><strong>Failed</strong>: The task failed. </li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * </ul>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("DuRealUsage")
        private String duRealUsage;

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

        @com.aliyun.core.annotation.NameInMap("StructureDataCheckStatus")
        private DtsJobListStructureDataCheckStatus structureDataCheckStatus;

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
            this.duRealUsage = builder.duRealUsage;
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
            this.structureDataCheckStatus = builder.structureDataCheckStatus;
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
         * @return duRealUsage
         */
        public String getDuRealUsage() {
            return this.duRealUsage;
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
         * @return structureDataCheckStatus
         */
        public DtsJobListStructureDataCheckStatus getStructureDataCheckStatus() {
            return this.structureDataCheckStatus;
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
            private String duRealUsage; 
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
            private DtsJobListStructureDataCheckStatus structureDataCheckStatus; 
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
                this.duRealUsage = model.duRealUsage;
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
                this.structureDataCheckStatus = model.structureDataCheckStatus;
                this.structureInitializationStatus = model.structureInitializationStatus;
                this.tagList = model.tagList;
            } 

            /**
             * <p>Indicates whether the <strong>new</strong> change tracking feature is used.</p>
             * <blockquote>
             * <p> This parameter is returned only for change tracking instances of the new version.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>new</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The start of the time range for change tracking. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-15T08:25:34Z</p>
             */
            public Builder beginTimestamp(String beginTimestamp) {
                this.beginTimestamp = beginTimestamp;
                return this;
            }

            /**
             * <p>The start offset of incremental data synchronization. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1616899019</p>
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * <p>The consumption checkpoint of the change tracking instance. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-23T07:30:31Z</p>
             */
            public Builder consumptionCheckpoint(String consumptionCheckpoint) {
                this.consumptionCheckpoint = consumptionCheckpoint;
                return this;
            }

            /**
             * <p>The downstream client information, in the following format: &lt;IP address of the downstream client&gt;:&lt;Random ID generated by DTS&gt;.</p>
             * 
             * <strong>example:</strong>
             * <p>114...:dts******</p>
             */
            public Builder consumptionClient(String consumptionClient) {
                this.consumptionClient = consumptionClient;
                return this;
            }

            /**
             * <p>The CPU utilization of the instance. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpuUsage(String cpuUsage) {
                this.cpuUsage = cpuUsage;
                return this;
            }

            /**
             * <p>The point in time when the task was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-16T08:01:19Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The state of the physical gateway-based migration task.</p>
             */
            public Builder dataCloudStatus(DataCloudStatus dataCloudStatus) {
                this.dataCloudStatus = dataCloudStatus;
                return this;
            }

            /**
             * <p>The state of the extract, transform, and load (ETL) task. Valid values:</p>
             * <blockquote>
             * <p> This parameter collection is returned only if an ETL task is configured.</p>
             * </blockquote>
             */
            public Builder dataEtlStatus(DataEtlStatus dataEtlStatus) {
                this.dataEtlStatus = dataEtlStatus;
                return this;
            }

            /**
             * <p>The state of full data synchronization.</p>
             */
            public Builder dataInitializationStatus(DataInitializationStatus dataInitializationStatus) {
                this.dataInitializationStatus = dataInitializationStatus;
                return this;
            }

            /**
             * <p>The state of incremental data migration or synchronization.</p>
             */
            public Builder dataSynchronizationStatus(DataSynchronizationStatus dataSynchronizationStatus) {
                this.dataSynchronizationStatus = dataSynchronizationStatus;
                return this;
            }

            /**
             * <p>The objects that you want to synchronize. The value is a JSON string and can contain regular expressions. For more information, see &quot;Objects of DTS tasks&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;dtstestdata&quot;: { &quot;name&quot;: &quot;dtstestdata&quot;, &quot;all&quot;: true }}</p>
             */
            public Builder dbObject(String dbObject) {
                this.dbObject = dbObject;
                return this;
            }

            /**
             * <p>The ID of the DTS dedicated cluster on which a DTS task runs.</p>
             * 
             * <strong>example:</strong>
             * <p>dtscluster_ft7y3**********</p>
             */
            public Builder dedicatedClusterId(String dedicatedClusterId) {
                this.dedicatedClusterId = dedicatedClusterId;
                return this;
            }

            /**
             * <p>The latency of incremental data synchronization. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>The connection settings of the destination instance.</p>
             */
            public Builder destinationEndpoint(DestinationEndpoint destinationEndpoint) {
                this.destinationEndpoint = destinationEndpoint;
                return this;
            }

            /**
             * <p>The environment tag of the DTS instance. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong></li>
             * <li><strong>online</strong></li>
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
             * <p>The ID of the data synchronization instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtsi03e3zty16i****</p>
             */
            public Builder dtsInstanceID(String dtsInstanceID) {
                this.dtsInstanceID = dtsInstanceID;
                return this;
            }

            /**
             * <p>The instance class.</p>
             * <blockquote>
             * <p> For more information about the test performance of each instance class, see <a href="https://help.aliyun.com/document_detail/26605.html">Specifications of data synchronization instances</a>.</p>
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
             * <p>The synchronization direction. The value is <strong>Reverse</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Forward</p>
             */
            public Builder dtsJobDirection(String dtsJobDirection) {
                this.dtsJobDirection = dtsJobDirection;
                return this;
            }

            /**
             * <p>The ID of the data synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>i03e3zty16i****</p>
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * <p>The name of the data synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS_TO_RDS_MIGRATION</p>
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * <p>The DTS Units (DUs) usage of a task in a DTS dedicated cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>12.0%</p>
             */
            public Builder duRealUsage(String duRealUsage) {
                this.duRealUsage = duRealUsage;
                return this;
            }

            /**
             * <p>The number of DUs that have been used.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder duUsage(Long duUsage) {
                this.duUsage = duUsage;
                return this;
            }

            /**
             * <p>The end of the time range for change tracking. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-26T14:03:21Z</p>
             */
            public Builder endTimestamp(String endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * <p>The error message returned.</p>
             */
            public Builder errorDetails(java.util.List<ErrorDetails> errorDetails) {
                this.errorDetails = errorDetails;
                return this;
            }

            /**
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by [com.mysql.jdbc.exceptions.jdbc4.MySQLNonTransientConnectionException:Could not create connection to database server. Attempted reconnect 3 times. Giving up.][com.mysql.jdbc.exceptions.jdbc4.CommunicationsException:Communications link failure\n\nThe last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.][java.net.ConnectException:Connection timed out (Connection timed out)] About more information in [<a href="https://yq.aliyun.com/articles/499178%5D">https://yq.aliyun.com/articles/499178]</a>.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The checkpoint of the ETL task.</p>
             * 
             * <strong>example:</strong>
             * <p>1610540493</p>
             */
            public Builder etlSafeCheckpoint(String etlSafeCheckpoint) {
                this.etlSafeCheckpoint = etlSafeCheckpoint;
                return this;
            }

            /**
             * <p>The point in time when the instance expires. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * <blockquote>
             * <p> This parameter is returned only if the value of the <strong>PayType</strong> parameter is <strong>PrePaid</strong>.</p>
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
             * <p>The state information about the full data verification task.</p>
             */
            public Builder fullDataCheckStatus(FullDataCheckStatus fullDataCheckStatus) {
                this.fullDataCheckStatus = fullDataCheckStatus;
                return this;
            }

            /**
             * <p>The state information about the incremental data verification task.</p>
             */
            public Builder incDataCheckStatus(IncDataCheckStatus incDataCheckStatus) {
                this.incDataCheckStatus = incDataCheckStatus;
                return this;
            }

            /**
             * <p>The type of the DTS task. Valid values:</p>
             * <ul>
             * <li><strong>MIGRATION</strong>: data migration task </li>
             * <li><strong>SYNC</strong>: data synchronization task </li>
             * <li><strong>SUBSCRIBE</strong>: change tracking task</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MIGRATION</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>Upper limit of DU.</p>
             * <blockquote>
             * <p>Only supported by Serverless instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder maxDu(Double maxDu) {
                this.maxDu = maxDu;
                return this;
            }

            /**
             * <p>The memory that has been used. Unit: MB.</p>
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
             * <p>The ID of the error code-related documentation.</p>
             * 
             * <strong>example:</strong>
             * <p>462133</p>
             */
            public Builder migrationErrHelpDocId(String migrationErrHelpDocId) {
                this.migrationErrHelpDocId = migrationErrHelpDocId;
                return this;
            }

            /**
             * <p>The key of the error code-related documentation.</p>
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
             * <p>The solution to the error.</p>
             * 
             * <strong>example:</strong>
             * <p>dts.retry.err.0046.workaround</p>
             */
            public Builder migrationErrWorkaround(String migrationErrWorkaround) {
                this.migrationErrWorkaround = migrationErrWorkaround;
                return this;
            }

            /**
             * <p>The migration or synchronization modes.</p>
             */
            public Builder migrationMode(MigrationMode migrationMode) {
                this.migrationMode = migrationMode;
                return this;
            }

            /**
             * <p>Lower limit of DU.</p>
             * <blockquote>
             * <p>Only supported by Serverless instances.</p>
             * </blockquote>
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
             * <li><strong>PTS</strong></li>
             * <li><strong>DMS</strong></li>
             * <li><strong>DTS</strong></li>
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
             * <p>The billing method of the DTS instance. Valid values:</p>
             * <ul>
             * <li><strong>PrePaid</strong>: subscription</li>
             * <li><strong>PostPaid</strong>: pay-as-you-go</li>
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
             * <p>The performance of the data migration or synchronization instance.</p>
             */
            public Builder performance(Performance performance) {
                this.performance = performance;
                return this;
            }

            /**
             * <p>The precheck state.</p>
             */
            public Builder precheckStatus(PrecheckStatus precheckStatus) {
                this.precheckStatus = precheckStatus;
                return this;
            }

            /**
             * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, for example, whether to automatically start a precheck. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;srcHostPorts&quot;:&quot;&quot;,&quot;whitelist.dms.online.ddl.enable&quot;:false,&quot;filterDDL&quot;:false,&quot;sqlparser.dms.original.ddl&quot;:true,&quot;srcOracleType&quot;:&quot;sid&quot;,&quot;maxRetryTime&quot;:43200,&quot;destSSL&quot;:&quot;0&quot;,&quot;destOracleType&quot;:&quot;sid&quot;,&quot;srcSSL&quot;:&quot;0&quot;,&quot;dbListCaseChangeMode&quot;:&quot;default&quot;,&quot;SourceEngineVersion&quot;:&quot;8.0.18&quot;,&quot;srcNetType&quot;:&quot;VPC&quot;,&quot;destNetType&quot;:&quot;VPC&quot;,&quot;srcVpcNetMappingInst&quot;:&quot;172.16.1**.<strong>:10803&quot;,&quot;destVpcNetMappingInst&quot;:&quot;172.16.1</strong>.**:11077&quot;,&quot;useJobTask&quot;:&quot;1&quot;}</p>
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
             * <p>The information about the retries performed by DTS due to an exception.</p>
             */
            public Builder retryState(RetryState retryState) {
                this.retryState = retryState;
                return this;
            }

            /**
             * <p>The details of the data synchronization task in the reverse direction. </p>
             * <blockquote>
             * <p>This parameter is returned only for two-way data synchronization tasks.</p>
             * </blockquote>
             */
            public Builder reverseJob(ReverseJob reverseJob) {
                this.reverseJob = reverseJob;
                return this;
            }

            /**
             * <p>The connection settings of the source instance.</p>
             */
            public Builder sourceEndpoint(DtsJobListSourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
                return this;
            }

            /**
             * <p>The state of the DTS instance. For more information about the valid values, see the description of the request parameter <strong>Status</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Migrating</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StructureDataCheckStatus.
             */
            public Builder structureDataCheckStatus(DtsJobListStructureDataCheckStatus structureDataCheckStatus) {
                this.structureDataCheckStatus = structureDataCheckStatus;
                return this;
            }

            /**
             * <p>The state of schema migration or initial schema synchronization.</p>
             */
            public Builder structureInitializationStatus(DtsJobListStructureInitializationStatus structureInitializationStatus) {
                this.structureInitializationStatus = structureInitializationStatus;
                return this;
            }

            /**
             * <p>The tags of the task.</p>
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
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class EtlDemoListDataEtlStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private EtlDemoListDataEtlStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListDataEtlStatus create() {
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

            private Builder(EtlDemoListDataEtlStatus model) {
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if the ETL task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>The task has failed for a long time and cannot be recovered.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of the ETL task. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of entries that have been processed by the ETL task.</p>
             * 
             * <strong>example:</strong>
             * <p>0/0</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of the ETL task. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started. </li>
             * <li><strong>Migrating</strong>: The task is in progress. </li>
             * <li><strong>Failed</strong>: The task failed. </li>
             * <li><strong>Finished</strong>: The task is complete. </li>
             * <li><strong>Catched</strong>: The task is not delayed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EtlDemoListDataEtlStatus build() {
                return new EtlDemoListDataEtlStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class EtlDemoListDataInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private EtlDemoListDataInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListDataInitializationStatus create() {
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

            private Builder(EtlDemoListDataInitializationStatus model) {
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if full data migration or initial full data synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.NumberFormatException: For input string: &quot;&quot;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of full data migration or initial full data synchronization. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of entries that have been migrated or synchronized during full data migration or initial full data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>44755</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of full data migration or initial full data synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started. </li>
             * <li><strong>Migrating</strong>: The task is in progress. </li>
             * <li><strong>Failed</strong>: The task failed. </li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EtlDemoListDataInitializationStatus build() {
                return new EtlDemoListDataInitializationStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class EtlDemoListDataSynchronizationStatus extends TeaModel {
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

        private EtlDemoListDataSynchronizationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListDataSynchronizationStatus create() {
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

            private Builder(EtlDemoListDataSynchronizationStatus model) {
                this.errorMessage = model.errorMessage;
                this.needUpgrade = model.needUpgrade;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if incremental data migration or synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>The task has failed for a long time and cannot be recovered.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the instance needs to be upgraded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p>To upgrade a DTS instance, call the <a href="https://help.aliyun.com/document_detail/281093.html">TransferInstanceClass</a> operation.</p>
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
             * <p>The progress of incremental data migration or synchronization. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of entries that have been migrated or synchronized during incremental data migration or synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>0/0</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of incremental data migration or synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started. </li>
             * <li><strong>Migrating</strong>: The task is in progress. </li>
             * <li><strong>Failed</strong>: The task failed. </li>
             * <li><strong>Finished</strong>: The task is complete. </li>
             * <li><strong>Catched</strong>: The task is not delayed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Catched</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EtlDemoListDataSynchronizationStatus build() {
                return new EtlDemoListDataSynchronizationStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class EtlDemoListDestinationEndpoint extends TeaModel {
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

        private EtlDemoListDestinationEndpoint(Builder builder) {
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

        public static EtlDemoListDestinationEndpoint create() {
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

            private Builder(EtlDemoListDestinationEndpoint model) {
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
             * <p>The name of the database that contains the migrated objects in the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database engine of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The ID of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1imrtn6fq7h****</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The type of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The endpoint of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.88.***</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The SID of the Oracle database. </p>
             * <blockquote>
             * <p>This parameter is returned only if the returned value of <strong>EngineName</strong> of the destination instance is <strong>Oracle</strong> and the Oracle database is deployed in a non-RAC architecture.</p>
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
             * <p>The port number of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the region in which the destination instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
             * <ul>
             * <li><strong>DISABLE</strong>: SSL encryption is disabled. </li>
             * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL encryption is enabled and the CA certificate is uploaded. </li>
             * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL encryption is enabled for the connection with an AWS MongoDB Altas database. </li>
             * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to encrypt the connection with a Kafka cluster.</li>
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
             * <p>The database account of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public EtlDemoListDestinationEndpoint build() {
                return new EtlDemoListDestinationEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class EtlDemoListMigrationMode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataInitialization")
        private Boolean dataInitialization;

        @com.aliyun.core.annotation.NameInMap("DataSynchronization")
        private Boolean dataSynchronization;

        @com.aliyun.core.annotation.NameInMap("StructureInitialization")
        private Boolean structureInitialization;

        private EtlDemoListMigrationMode(Builder builder) {
            this.dataInitialization = builder.dataInitialization;
            this.dataSynchronization = builder.dataSynchronization;
            this.structureInitialization = builder.structureInitialization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListMigrationMode create() {
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
         * @return structureInitialization
         */
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

        public static final class Builder {
            private Boolean dataInitialization; 
            private Boolean dataSynchronization; 
            private Boolean structureInitialization; 

            private Builder() {
            } 

            private Builder(EtlDemoListMigrationMode model) {
                this.dataInitialization = model.dataInitialization;
                this.dataSynchronization = model.dataSynchronization;
                this.structureInitialization = model.structureInitialization;
            } 

            /**
             * <p>Indicates whether full data migration or initial full data synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>Indicates whether schema migration or initial schema synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder structureInitialization(Boolean structureInitialization) {
                this.structureInitialization = structureInitialization;
                return this;
            }

            public EtlDemoListMigrationMode build() {
                return new EtlDemoListMigrationMode(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class EtlDemoListPerformance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Flow")
        private String flow;

        @com.aliyun.core.annotation.NameInMap("Rps")
        private String rps;

        private EtlDemoListPerformance(Builder builder) {
            this.flow = builder.flow;
            this.rps = builder.rps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListPerformance create() {
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

            private Builder(EtlDemoListPerformance model) {
                this.flow = model.flow;
                this.rps = model.rps;
            } 

            /**
             * <p>The size of data that is migrated or synchronized per second. Unit: MB/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * <p>The number of times that SQL statements are migrated or synchronized per second, including BEGIN, COMMIT, DML, and DDL statements. DML statements include INSERT, DELETE, and UPDATE.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder rps(String rps) {
                this.rps = rps;
                return this;
            }

            public EtlDemoListPerformance build() {
                return new EtlDemoListPerformance(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class EtlDemoListPrecheckStatusDetail extends TeaModel {
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

        private EtlDemoListPrecheckStatusDetail(Builder builder) {
            this.checkItem = builder.checkItem;
            this.checkItemDescription = builder.checkItemDescription;
            this.checkResult = builder.checkResult;
            this.failedReason = builder.failedReason;
            this.repairMethod = builder.repairMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListPrecheckStatusDetail create() {
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

            private Builder(EtlDemoListPrecheckStatusDetail model) {
                this.checkItem = model.checkItem;
                this.checkItemDescription = model.checkItemDescription;
                this.checkResult = model.checkResult;
                this.failedReason = model.failedReason;
                this.repairMethod = model.repairMethod;
            } 

            /**
             * <p>The name of the precheck item.</p>
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
             * <li><strong>Success</strong></li>
             * <li><strong>Failed</strong></li>
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
             * <p>The error message returned if the task failed to pass the precheck. </p>
             * <blockquote>
             * <p>This parameter is returned only if the returned value of <strong>CheckResult</strong> is <strong>Failed</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Original error: Access denied for user &quot;dtstest&quot;@&quot;100.104.***.**&quot; (using password: YES)</p>
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * <p>The method to fix a precheck failure. </p>
             * <blockquote>
             * <p>This parameter is returned only if the returned value of <strong>CheckResult</strong> is <strong>Failed</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>CHECK_ERROR_DEST_CONN_REPAIR2</p>
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            public EtlDemoListPrecheckStatusDetail build() {
                return new EtlDemoListPrecheckStatusDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class EtlDemoListPrecheckStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.List<EtlDemoListPrecheckStatusDetail> detail;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private EtlDemoListPrecheckStatus(Builder builder) {
            this.detail = builder.detail;
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListPrecheckStatus create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List<EtlDemoListPrecheckStatusDetail> getDetail() {
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
            private java.util.List<EtlDemoListPrecheckStatusDetail> detail; 
            private String errorMessage; 
            private String percent; 
            private String status; 

            private Builder() {
            } 

            private Builder(EtlDemoListPrecheckStatus model) {
                this.detail = model.detail;
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.status = model.status;
            } 

            /**
             * <p>The result of each precheck item.</p>
             */
            public Builder detail(java.util.List<EtlDemoListPrecheckStatusDetail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The error message returned if the precheck failed.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK__ERROR_SAME_OBJ.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The precheck progress. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The precheck state. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The precheck is not started. </li>
             * <li><strong>Suspending</strong>: The precheck is paused. </li>
             * <li><strong>Checking</strong>: The precheck is in progress. </li>
             * <li><strong>Failed</strong>: The precheck failed. </li>
             * <li><strong>Finished</strong>: The precheck is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EtlDemoListPrecheckStatus build() {
                return new EtlDemoListPrecheckStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class EtlDemoListRetryState extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrMessage")
        private String errMessage;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MaxRetryTime")
        private Integer maxRetryTime;

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

        private EtlDemoListRetryState(Builder builder) {
            this.errMessage = builder.errMessage;
            this.jobId = builder.jobId;
            this.maxRetryTime = builder.maxRetryTime;
            this.module = builder.module;
            this.retryCount = builder.retryCount;
            this.retryTarget = builder.retryTarget;
            this.retryTime = builder.retryTime;
            this.retrying = builder.retrying;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListRetryState create() {
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
            private String module; 
            private Integer retryCount; 
            private String retryTarget; 
            private Integer retryTime; 
            private Boolean retrying; 

            private Builder() {
            } 

            private Builder(EtlDemoListRetryState model) {
                this.errMessage = model.errMessage;
                this.jobId = model.jobId;
                this.maxRetryTime = model.maxRetryTime;
                this.module = model.module;
                this.retryCount = model.retryCount;
                this.retryTarget = model.retryTarget;
                this.retryTime = model.retryTime;
                this.retrying = model.retrying;
            } 

            /**
             * <p>The error message returned if these retries failed.</p>
             * 
             * <strong>example:</strong>
             * <p>Unexpected error</p>
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
             * <p>The maximum duration of a retry. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>7200</p>
             */
            public Builder maxRetryTime(Integer maxRetryTime) {
                this.maxRetryTime = maxRetryTime;
                return this;
            }

            /**
             * <p>The progress of the instance when DTS retries.</p>
             * 
             * <strong>example:</strong>
             * <p>03</p>
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * <p>The number of retries that have been performed.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder retryCount(Integer retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * <p>The object on which these retries are performed. Valid values:</p>
             * <ul>
             * <li><strong>srcDB</strong>: the source database </li>
             * <li><strong>destDB</strong>: the destination database </li>
             * <li><strong>inner_module</strong>: an internal module of DTS</li>
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
             * <p>The time that has elapsed from the time when the first retry starts. Unit: seconds.</p>
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
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder retrying(Boolean retrying) {
                this.retrying = retrying;
                return this;
            }

            public EtlDemoListRetryState build() {
                return new EtlDemoListRetryState(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class EtlDemoListReverseJobDataInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private EtlDemoListReverseJobDataInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListReverseJobDataInitializationStatus create() {
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

            private Builder(EtlDemoListReverseJobDataInitializationStatus model) {
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if initial full data synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.NumberFormatException: For input string: &quot;&quot;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of initial full data synchronization. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of entries that have been synchronized during initial full data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>43071</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of initial full data synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started. </li>
             * <li><strong>Migrating</strong>: The task is in progress. </li>
             * <li><strong>Failed</strong>: The task failed. </li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EtlDemoListReverseJobDataInitializationStatus build() {
                return new EtlDemoListReverseJobDataInitializationStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class EtlDemoListReverseJobDataSynchronizationStatus extends TeaModel {
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

        private EtlDemoListReverseJobDataSynchronizationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListReverseJobDataSynchronizationStatus create() {
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

            private Builder(EtlDemoListReverseJobDataSynchronizationStatus model) {
                this.errorMessage = model.errorMessage;
                this.needUpgrade = model.needUpgrade;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if incremental data synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>The task has failed for a long time and cannot be recovered.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the instance needs to be upgraded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p>To upgrade a DTS instance, call the <a href="https://help.aliyun.com/document_detail/281093.html">TransferInstanceClass</a> operation.</p>
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
             * <p>The progress of incremental data synchronization. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of entries that have been migrated or synchronized during incremental data migration or synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>20001</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of incremental data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>Migrating</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EtlDemoListReverseJobDataSynchronizationStatus build() {
                return new EtlDemoListReverseJobDataSynchronizationStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class EtlDemoListReverseJobDestinationEndpoint extends TeaModel {
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

        private EtlDemoListReverseJobDestinationEndpoint(Builder builder) {
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

        public static EtlDemoListReverseJobDestinationEndpoint create() {
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

            private Builder(EtlDemoListReverseJobDestinationEndpoint model) {
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
             * <p>The name of the database that contains the synchronized objects in the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database engine of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The ID of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1162kryivb8****</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The type of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The endpoint of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.88.***</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The SID of the Oracle database. </p>
             * <blockquote>
             * <p>This parameter is returned only if the returned value of <strong>EngineName</strong> of the destination instance is <strong>Oracle</strong> and the Oracle database is deployed in a non-RAC architecture.</p>
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
             * <p>The port number of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the region in which the destination instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
             * <ul>
             * <li><strong>DISABLE</strong>: SSL encryption is disabled. </li>
             * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL encryption is enabled and the CA certificate is uploaded. </li>
             * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL encryption is enabled for the connection with an AWS MongoDB Altas database. </li>
             * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to encrypt the connection with a Kafka cluster.</li>
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
             * <p>The database account of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public EtlDemoListReverseJobDestinationEndpoint build() {
                return new EtlDemoListReverseJobDestinationEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class EtlDemoListReverseJobMigrationMode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataInitialization")
        private Boolean dataInitialization;

        @com.aliyun.core.annotation.NameInMap("DataSynchronization")
        private Boolean dataSynchronization;

        @com.aliyun.core.annotation.NameInMap("StructureInitialization")
        private Boolean structureInitialization;

        private EtlDemoListReverseJobMigrationMode(Builder builder) {
            this.dataInitialization = builder.dataInitialization;
            this.dataSynchronization = builder.dataSynchronization;
            this.structureInitialization = builder.structureInitialization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListReverseJobMigrationMode create() {
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
         * @return structureInitialization
         */
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

        public static final class Builder {
            private Boolean dataInitialization; 
            private Boolean dataSynchronization; 
            private Boolean structureInitialization; 

            private Builder() {
            } 

            private Builder(EtlDemoListReverseJobMigrationMode model) {
                this.dataInitialization = model.dataInitialization;
                this.dataSynchronization = model.dataSynchronization;
                this.structureInitialization = model.structureInitialization;
            } 

            /**
             * <p>Indicates whether full data migration or initial full data synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>Indicates whether schema migration or initial schema synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder structureInitialization(Boolean structureInitialization) {
                this.structureInitialization = structureInitialization;
                return this;
            }

            public EtlDemoListReverseJobMigrationMode build() {
                return new EtlDemoListReverseJobMigrationMode(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class EtlDemoListReverseJobPerformance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Flow")
        private String flow;

        @com.aliyun.core.annotation.NameInMap("Rps")
        private String rps;

        private EtlDemoListReverseJobPerformance(Builder builder) {
            this.flow = builder.flow;
            this.rps = builder.rps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListReverseJobPerformance create() {
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

            private Builder(EtlDemoListReverseJobPerformance model) {
                this.flow = model.flow;
                this.rps = model.rps;
            } 

            /**
             * <p>The size of data that is migrated or synchronized per second. Unit: MB/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * <p>The number of times that SQL statements are migrated or synchronized per second, including BEGIN, COMMIT, DML, and DDL statements. DML statements include INSERT, DELETE, and UPDATE.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder rps(String rps) {
                this.rps = rps;
                return this;
            }

            public EtlDemoListReverseJobPerformance build() {
                return new EtlDemoListReverseJobPerformance(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class ReverseJobPrecheckStatusDetail extends TeaModel {
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

        private ReverseJobPrecheckStatusDetail(Builder builder) {
            this.checkItem = builder.checkItem;
            this.checkItemDescription = builder.checkItemDescription;
            this.checkResult = builder.checkResult;
            this.failedReason = builder.failedReason;
            this.repairMethod = builder.repairMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobPrecheckStatusDetail create() {
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

            private Builder(ReverseJobPrecheckStatusDetail model) {
                this.checkItem = model.checkItem;
                this.checkItemDescription = model.checkItemDescription;
                this.checkResult = model.checkResult;
                this.failedReason = model.failedReason;
                this.repairMethod = model.repairMethod;
            } 

            /**
             * <p>The name of the precheck item.</p>
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
             * <li><strong>Success</strong></li>
             * <li><strong>Failed</strong></li>
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
             * <p>The error message returned if the task failed to pass the precheck. </p>
             * <blockquote>
             * <p>This parameter is returned only if the returned value of <strong>CheckResult</strong> is <strong>Failed</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Original error: Access denied for user &quot;dtstest&quot;@&quot;100.104.***.**&quot; (using password: YES)</p>
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * <p>The method to fix a precheck failure. </p>
             * <blockquote>
             * <p>This parameter is returned only if the returned value of <strong>CheckResult</strong> is <strong>Failed</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>CHECK_ERROR_DEST_CONN_REPAIR2</p>
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            public ReverseJobPrecheckStatusDetail build() {
                return new ReverseJobPrecheckStatusDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class EtlDemoListReverseJobPrecheckStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.List<ReverseJobPrecheckStatusDetail> detail;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private EtlDemoListReverseJobPrecheckStatus(Builder builder) {
            this.detail = builder.detail;
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListReverseJobPrecheckStatus create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List<ReverseJobPrecheckStatusDetail> getDetail() {
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
            private java.util.List<ReverseJobPrecheckStatusDetail> detail; 
            private String errorMessage; 
            private String percent; 
            private String status; 

            private Builder() {
            } 

            private Builder(EtlDemoListReverseJobPrecheckStatus model) {
                this.detail = model.detail;
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.status = model.status;
            } 

            /**
             * <p>The result of each precheck item.</p>
             */
            public Builder detail(java.util.List<ReverseJobPrecheckStatusDetail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The error message returned if the precheck failed.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK__ERROR_SAME_OBJ</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The precheck progress. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The precheck state. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The precheck is not started. </li>
             * <li><strong>Suspending</strong>: The precheck is paused. </li>
             * <li><strong>Checking</strong>: The precheck is in progress. </li>
             * <li><strong>Failed</strong>: The precheck failed. </li>
             * <li><strong>Finished</strong>: The precheck is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EtlDemoListReverseJobPrecheckStatus build() {
                return new EtlDemoListReverseJobPrecheckStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class ReverseJobSourceEndpoint extends TeaModel {
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

        private ReverseJobSourceEndpoint(Builder builder) {
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

        public static ReverseJobSourceEndpoint create() {
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

            private Builder(ReverseJobSourceEndpoint model) {
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
             * <p>The name of the database that contains the objects to be migrated from the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database engine of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The ID of the source instance.</p>
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
             * <p>The SID of the Oracle database. </p>
             * <blockquote>
             * <p>This parameter is returned only if the returned value of <strong>EngineName</strong> of the source instance is <strong>Oracle</strong> and the Oracle database is deployed in a non-RAC architecture.</p>
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
             * <p>The port number of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the region in which the source instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
             * <ul>
             * <li><strong>DISABLE</strong>: SSL encryption is disabled. </li>
             * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL encryption is enabled and the CA certificate is uploaded. </li>
             * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL encryption is enabled for the connection with an AWS MongoDB Altas database. </li>
             * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to encrypt the connection with a Kafka cluster.</li>
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
             * <p>The database account of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public ReverseJobSourceEndpoint build() {
                return new ReverseJobSourceEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class ReverseJobStructureInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ReverseJobStructureInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobStructureInitializationStatus create() {
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

            private Builder(ReverseJobStructureInitializationStatus model) {
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if initial schema synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-1020042 Execute sql error sql: ERROR: type &quot;geometry&quot; does not exist;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of initial schema synchronization. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of tables that have been synchronized during initial schema synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of initial schema synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started. </li>
             * <li><strong>Migrating</strong>: The task is in progress. </li>
             * <li><strong>Failed</strong>: The task failed. </li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ReverseJobStructureInitializationStatus build() {
                return new ReverseJobStructureInitializationStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class EtlDemoListReverseJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Checkpoint")
        private String checkpoint;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DataInitializationStatus")
        private EtlDemoListReverseJobDataInitializationStatus dataInitializationStatus;

        @com.aliyun.core.annotation.NameInMap("DataSynchronizationStatus")
        private EtlDemoListReverseJobDataSynchronizationStatus dataSynchronizationStatus;

        @com.aliyun.core.annotation.NameInMap("DbObject")
        private String dbObject;

        @com.aliyun.core.annotation.NameInMap("Delay")
        private Long delay;

        @com.aliyun.core.annotation.NameInMap("DestinationEndpoint")
        private EtlDemoListReverseJobDestinationEndpoint destinationEndpoint;

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

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("EtlSafeCheckpoint")
        private String etlSafeCheckpoint;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("MigrationMode")
        private EtlDemoListReverseJobMigrationMode migrationMode;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Performance")
        private EtlDemoListReverseJobPerformance performance;

        @com.aliyun.core.annotation.NameInMap("PrecheckStatus")
        private EtlDemoListReverseJobPrecheckStatus precheckStatus;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private String reserved;

        @com.aliyun.core.annotation.NameInMap("SourceEndpoint")
        private ReverseJobSourceEndpoint sourceEndpoint;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StructureInitializationStatus")
        private ReverseJobStructureInitializationStatus structureInitializationStatus;

        private EtlDemoListReverseJob(Builder builder) {
            this.checkpoint = builder.checkpoint;
            this.createTime = builder.createTime;
            this.dataInitializationStatus = builder.dataInitializationStatus;
            this.dataSynchronizationStatus = builder.dataSynchronizationStatus;
            this.dbObject = builder.dbObject;
            this.delay = builder.delay;
            this.destinationEndpoint = builder.destinationEndpoint;
            this.dtsInstanceID = builder.dtsInstanceID;
            this.dtsJobClass = builder.dtsJobClass;
            this.dtsJobDirection = builder.dtsJobDirection;
            this.dtsJobId = builder.dtsJobId;
            this.dtsJobName = builder.dtsJobName;
            this.errorMessage = builder.errorMessage;
            this.etlSafeCheckpoint = builder.etlSafeCheckpoint;
            this.expireTime = builder.expireTime;
            this.migrationMode = builder.migrationMode;
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

        public static EtlDemoListReverseJob create() {
            return builder().build();
        }

        /**
         * @return checkpoint
         */
        public String getCheckpoint() {
            return this.checkpoint;
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
        public EtlDemoListReverseJobDataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        /**
         * @return dataSynchronizationStatus
         */
        public EtlDemoListReverseJobDataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        /**
         * @return dbObject
         */
        public String getDbObject() {
            return this.dbObject;
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
        public EtlDemoListReverseJobDestinationEndpoint getDestinationEndpoint() {
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
         * @return migrationMode
         */
        public EtlDemoListReverseJobMigrationMode getMigrationMode() {
            return this.migrationMode;
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
        public EtlDemoListReverseJobPerformance getPerformance() {
            return this.performance;
        }

        /**
         * @return precheckStatus
         */
        public EtlDemoListReverseJobPrecheckStatus getPrecheckStatus() {
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
        public ReverseJobSourceEndpoint getSourceEndpoint() {
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
        public ReverseJobStructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

        public static final class Builder {
            private String checkpoint; 
            private String createTime; 
            private EtlDemoListReverseJobDataInitializationStatus dataInitializationStatus; 
            private EtlDemoListReverseJobDataSynchronizationStatus dataSynchronizationStatus; 
            private String dbObject; 
            private Long delay; 
            private EtlDemoListReverseJobDestinationEndpoint destinationEndpoint; 
            private String dtsInstanceID; 
            private String dtsJobClass; 
            private String dtsJobDirection; 
            private String dtsJobId; 
            private String dtsJobName; 
            private String errorMessage; 
            private String etlSafeCheckpoint; 
            private String expireTime; 
            private EtlDemoListReverseJobMigrationMode migrationMode; 
            private String payType; 
            private EtlDemoListReverseJobPerformance performance; 
            private EtlDemoListReverseJobPrecheckStatus precheckStatus; 
            private String reserved; 
            private ReverseJobSourceEndpoint sourceEndpoint; 
            private String status; 
            private ReverseJobStructureInitializationStatus structureInitializationStatus; 

            private Builder() {
            } 

            private Builder(EtlDemoListReverseJob model) {
                this.checkpoint = model.checkpoint;
                this.createTime = model.createTime;
                this.dataInitializationStatus = model.dataInitializationStatus;
                this.dataSynchronizationStatus = model.dataSynchronizationStatus;
                this.dbObject = model.dbObject;
                this.delay = model.delay;
                this.destinationEndpoint = model.destinationEndpoint;
                this.dtsInstanceID = model.dtsInstanceID;
                this.dtsJobClass = model.dtsJobClass;
                this.dtsJobDirection = model.dtsJobDirection;
                this.dtsJobId = model.dtsJobId;
                this.dtsJobName = model.dtsJobName;
                this.errorMessage = model.errorMessage;
                this.etlSafeCheckpoint = model.etlSafeCheckpoint;
                this.expireTime = model.expireTime;
                this.migrationMode = model.migrationMode;
                this.payType = model.payType;
                this.performance = model.performance;
                this.precheckStatus = model.precheckStatus;
                this.reserved = model.reserved;
                this.sourceEndpoint = model.sourceEndpoint;
                this.status = model.status;
                this.structureInitializationStatus = model.structureInitializationStatus;
            } 

            /**
             * <p>The start offset of incremental data synchronization. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1616980369</p>
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * <p>The time when the task was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-16T08:01:19Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The state of initial full data synchronization.</p>
             */
            public Builder dataInitializationStatus(EtlDemoListReverseJobDataInitializationStatus dataInitializationStatus) {
                this.dataInitializationStatus = dataInitializationStatus;
                return this;
            }

            /**
             * <p>The state of incremental data synchronization.</p>
             */
            public Builder dataSynchronizationStatus(EtlDemoListReverseJobDataSynchronizationStatus dataSynchronizationStatus) {
                this.dataSynchronizationStatus = dataSynchronizationStatus;
                return this;
            }

            /**
             * <p>The schema of the objects that you want to synchronize. The value is a JSON string and can contain regular expressions. For more information, see Objects of DTS tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;dtstestdata&quot;: { &quot;name&quot;: &quot;dtstestdata&quot;, &quot;all&quot;: true }}</p>
             */
            public Builder dbObject(String dbObject) {
                this.dbObject = dbObject;
                return this;
            }

            /**
             * <p>The latency of incremental data synchronization. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>The connection settings of the destination instance.</p>
             */
            public Builder destinationEndpoint(EtlDemoListReverseJobDestinationEndpoint destinationEndpoint) {
                this.destinationEndpoint = destinationEndpoint;
                return this;
            }

            /**
             * <p>The ID of the data synchronization instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtsi03e3zty16i****</p>
             */
            public Builder dtsInstanceID(String dtsInstanceID) {
                this.dtsInstanceID = dtsInstanceID;
                return this;
            }

            /**
             * <p>The instance class. </p>
             * <blockquote>
             * <p>For more information about the test performance of each instance class, see <a href="https://help.aliyun.com/document_detail/26605.html">Specifications of data synchronization instances</a>.</p>
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
             * <p>The synchronization direction. <strong>Reverse</strong> is returned.</p>
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
             * <p>The name of the data synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS_TO_RDS_MIGRATION</p>
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by [com.mysql.jdbc.exceptions.jdbc4.MySQLNonTransientConnectionException:Could not create connection to database server. Attempted reconnect 3 times. Giving up.][com.mysql.jdbc.exceptions.jdbc4.CommunicationsException:Communications link failure\n\nThe last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.][java.net.ConnectException:Connection timed out (Connection timed out)] About more information in [<a href="https://yq.aliyun.com/articles/499178%5D">https://yq.aliyun.com/articles/499178]</a>.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The checkpoint of the ETL task.</p>
             * 
             * <strong>example:</strong>
             * <p>1610540493</p>
             */
            public Builder etlSafeCheckpoint(String etlSafeCheckpoint) {
                this.etlSafeCheckpoint = etlSafeCheckpoint;
                return this;
            }

            /**
             * <p>The time when the instance expires. The time follows the ISO 8601 standard in the* yyyy-MM-dd<em>T</em>HH:mm:ss*Z format. The time is displayed in UTC. </p>
             * <blockquote>
             * <p>This parameter is returned only if the returned value of <strong>PayType</strong> is <strong>PrePaid</strong>.</p>
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
             * <p>The migration types or initial synchronization types.</p>
             */
            public Builder migrationMode(EtlDemoListReverseJobMigrationMode migrationMode) {
                this.migrationMode = migrationMode;
                return this;
            }

            /**
             * <p>The billing method of the DTS instance. Valid values:</p>
             * <ul>
             * <li><strong>PrePaid</strong>: subscription</li>
             * <li><strong>PostPaid</strong>: pay-as-you-go</li>
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
             * <p>The performance of the data migration or synchronization instance.</p>
             */
            public Builder performance(EtlDemoListReverseJobPerformance performance) {
                this.performance = performance;
                return this;
            }

            /**
             * <p>The precheck state.</p>
             */
            public Builder precheckStatus(EtlDemoListReverseJobPrecheckStatus precheckStatus) {
                this.precheckStatus = precheckStatus;
                return this;
            }

            /**
             * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, for example, whether to automatically start a precheck. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;srcHostPorts&quot;:&quot;&quot;,&quot;whitelist.dms.online.ddl.enable&quot;:false,&quot;filterDDL&quot;:false,&quot;sqlparser.dms.original.ddl&quot;:true,&quot;srcOracleType&quot;:&quot;sid&quot;,&quot;maxRetryTime&quot;:43200,&quot;destSSL&quot;:&quot;0&quot;,&quot;destOracleType&quot;:&quot;sid&quot;,&quot;srcSSL&quot;:&quot;0&quot;,&quot;dbListCaseChangeMode&quot;:&quot;default&quot;,&quot;SourceEngineVersion&quot;:&quot;8.0.18&quot;,&quot;srcNetType&quot;:&quot;VPC&quot;,&quot;destNetType&quot;:&quot;VPC&quot;,&quot;srcVpcNetMappingInst&quot;:&quot;172.16.1**.<strong>:10803&quot;,&quot;destVpcNetMappingInst&quot;:&quot;172.16.1</strong>.**:11077&quot;,&quot;useJobTask&quot;:&quot;1&quot;}</p>
             */
            public Builder reserved(String reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * <p>The connection settings of the source instance.</p>
             */
            public Builder sourceEndpoint(ReverseJobSourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
                return this;
            }

            /**
             * <p>The state of the DTS instance. For more information about the valid values, see the description of the request parameter <strong>Status</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Synchronizing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The state of initial schema synchronization.</p>
             */
            public Builder structureInitializationStatus(ReverseJobStructureInitializationStatus structureInitializationStatus) {
                this.structureInitializationStatus = structureInitializationStatus;
                return this;
            }

            public EtlDemoListReverseJob build() {
                return new EtlDemoListReverseJob(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class EtlDemoListSourceEndpoint extends TeaModel {
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

        private EtlDemoListSourceEndpoint(Builder builder) {
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

        public static EtlDemoListSourceEndpoint create() {
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

            private Builder(EtlDemoListSourceEndpoint model) {
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
             * <p>The name of the database that contains the objects to be migrated from the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database engine of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The ID of the source instance.</p>
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
             * <p>The SID of the Oracle database. </p>
             * <blockquote>
             * <p>This parameter is returned only if the returned value of <strong>EngineName</strong> of the source instance is <strong>Oracle</strong> and the Oracle database is deployed in a non-RAC architecture.</p>
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
             * <p>The port number of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the region in which the source instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
             * <ul>
             * <li><strong>DISABLE</strong>: SSL encryption is disabled. </li>
             * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL encryption is enabled and the CA certificate is uploaded. </li>
             * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL encryption is enabled for the connection with an AWS MongoDB Altas database. </li>
             * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to encrypt the connection with a Kafka cluster.</li>
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
             * <p>The database account of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public EtlDemoListSourceEndpoint build() {
                return new EtlDemoListSourceEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class EtlDemoListStructureInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private EtlDemoListStructureInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListStructureInitializationStatus create() {
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

            private Builder(EtlDemoListStructureInitializationStatus model) {
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if schema migration or initial schema synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-1020042 Execute sql error sql: ERROR: type &quot;geometry&quot; does not exist;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of schema migration or initial schema synchronization. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of tables that have been migrated or synchronized during schema migration or initial schema synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of schema migration or initial schema synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started. </li>
             * <li><strong>Migrating</strong>: The task is in progress. </li>
             * <li><strong>Failed</strong>: The task failed. </li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EtlDemoListStructureInitializationStatus build() {
                return new EtlDemoListStructureInitializationStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class EtlDemoListTagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private EtlDemoListTagList(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListTagList create() {
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

            private Builder(EtlDemoListTagList model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>testkey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>testvalue</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public EtlDemoListTagList build() {
                return new EtlDemoListTagList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobsResponseBody</p>
     */
    public static class EtlDemoList extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DataEtlStatus")
        private EtlDemoListDataEtlStatus dataEtlStatus;

        @com.aliyun.core.annotation.NameInMap("DataInitializationStatus")
        private EtlDemoListDataInitializationStatus dataInitializationStatus;

        @com.aliyun.core.annotation.NameInMap("DataSynchronizationStatus")
        private EtlDemoListDataSynchronizationStatus dataSynchronizationStatus;

        @com.aliyun.core.annotation.NameInMap("DbObject")
        private String dbObject;

        @com.aliyun.core.annotation.NameInMap("Delay")
        private Long delay;

        @com.aliyun.core.annotation.NameInMap("DestinationEndpoint")
        private EtlDemoListDestinationEndpoint destinationEndpoint;

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

        @com.aliyun.core.annotation.NameInMap("EndTimestamp")
        private String endTimestamp;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("EtlSafeCheckpoint")
        private String etlSafeCheckpoint;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("MigrationMode")
        private EtlDemoListMigrationMode migrationMode;

        @com.aliyun.core.annotation.NameInMap("OriginType")
        private String originType;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Performance")
        private EtlDemoListPerformance performance;

        @com.aliyun.core.annotation.NameInMap("PrecheckStatus")
        private EtlDemoListPrecheckStatus precheckStatus;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private String reserved;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupDisplayName")
        private String resourceGroupDisplayName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RetryState")
        private EtlDemoListRetryState retryState;

        @com.aliyun.core.annotation.NameInMap("ReverseJob")
        private EtlDemoListReverseJob reverseJob;

        @com.aliyun.core.annotation.NameInMap("SourceEndpoint")
        private EtlDemoListSourceEndpoint sourceEndpoint;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StructureInitializationStatus")
        private EtlDemoListStructureInitializationStatus structureInitializationStatus;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List<EtlDemoListTagList> tagList;

        private EtlDemoList(Builder builder) {
            this.appName = builder.appName;
            this.beginTimestamp = builder.beginTimestamp;
            this.checkpoint = builder.checkpoint;
            this.consumptionCheckpoint = builder.consumptionCheckpoint;
            this.consumptionClient = builder.consumptionClient;
            this.createTime = builder.createTime;
            this.dataEtlStatus = builder.dataEtlStatus;
            this.dataInitializationStatus = builder.dataInitializationStatus;
            this.dataSynchronizationStatus = builder.dataSynchronizationStatus;
            this.dbObject = builder.dbObject;
            this.delay = builder.delay;
            this.destinationEndpoint = builder.destinationEndpoint;
            this.dtsInstanceID = builder.dtsInstanceID;
            this.dtsJobClass = builder.dtsJobClass;
            this.dtsJobDirection = builder.dtsJobDirection;
            this.dtsJobId = builder.dtsJobId;
            this.dtsJobName = builder.dtsJobName;
            this.endTimestamp = builder.endTimestamp;
            this.errorMessage = builder.errorMessage;
            this.etlSafeCheckpoint = builder.etlSafeCheckpoint;
            this.expireTime = builder.expireTime;
            this.jobType = builder.jobType;
            this.migrationMode = builder.migrationMode;
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

        public static EtlDemoList create() {
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataEtlStatus
         */
        public EtlDemoListDataEtlStatus getDataEtlStatus() {
            return this.dataEtlStatus;
        }

        /**
         * @return dataInitializationStatus
         */
        public EtlDemoListDataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        /**
         * @return dataSynchronizationStatus
         */
        public EtlDemoListDataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        /**
         * @return dbObject
         */
        public String getDbObject() {
            return this.dbObject;
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
        public EtlDemoListDestinationEndpoint getDestinationEndpoint() {
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
         * @return endTimestamp
         */
        public String getEndTimestamp() {
            return this.endTimestamp;
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
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return migrationMode
         */
        public EtlDemoListMigrationMode getMigrationMode() {
            return this.migrationMode;
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
        public EtlDemoListPerformance getPerformance() {
            return this.performance;
        }

        /**
         * @return precheckStatus
         */
        public EtlDemoListPrecheckStatus getPrecheckStatus() {
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
        public EtlDemoListRetryState getRetryState() {
            return this.retryState;
        }

        /**
         * @return reverseJob
         */
        public EtlDemoListReverseJob getReverseJob() {
            return this.reverseJob;
        }

        /**
         * @return sourceEndpoint
         */
        public EtlDemoListSourceEndpoint getSourceEndpoint() {
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
        public EtlDemoListStructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

        /**
         * @return tagList
         */
        public java.util.List<EtlDemoListTagList> getTagList() {
            return this.tagList;
        }

        public static final class Builder {
            private String appName; 
            private String beginTimestamp; 
            private String checkpoint; 
            private String consumptionCheckpoint; 
            private String consumptionClient; 
            private String createTime; 
            private EtlDemoListDataEtlStatus dataEtlStatus; 
            private EtlDemoListDataInitializationStatus dataInitializationStatus; 
            private EtlDemoListDataSynchronizationStatus dataSynchronizationStatus; 
            private String dbObject; 
            private Long delay; 
            private EtlDemoListDestinationEndpoint destinationEndpoint; 
            private String dtsInstanceID; 
            private String dtsJobClass; 
            private String dtsJobDirection; 
            private String dtsJobId; 
            private String dtsJobName; 
            private String endTimestamp; 
            private String errorMessage; 
            private String etlSafeCheckpoint; 
            private String expireTime; 
            private String jobType; 
            private EtlDemoListMigrationMode migrationMode; 
            private String originType; 
            private String payType; 
            private EtlDemoListPerformance performance; 
            private EtlDemoListPrecheckStatus precheckStatus; 
            private String reserved; 
            private String resourceGroupDisplayName; 
            private String resourceGroupId; 
            private EtlDemoListRetryState retryState; 
            private EtlDemoListReverseJob reverseJob; 
            private EtlDemoListSourceEndpoint sourceEndpoint; 
            private String status; 
            private EtlDemoListStructureInitializationStatus structureInitializationStatus; 
            private java.util.List<EtlDemoListTagList> tagList; 

            private Builder() {
            } 

            private Builder(EtlDemoList model) {
                this.appName = model.appName;
                this.beginTimestamp = model.beginTimestamp;
                this.checkpoint = model.checkpoint;
                this.consumptionCheckpoint = model.consumptionCheckpoint;
                this.consumptionClient = model.consumptionClient;
                this.createTime = model.createTime;
                this.dataEtlStatus = model.dataEtlStatus;
                this.dataInitializationStatus = model.dataInitializationStatus;
                this.dataSynchronizationStatus = model.dataSynchronizationStatus;
                this.dbObject = model.dbObject;
                this.delay = model.delay;
                this.destinationEndpoint = model.destinationEndpoint;
                this.dtsInstanceID = model.dtsInstanceID;
                this.dtsJobClass = model.dtsJobClass;
                this.dtsJobDirection = model.dtsJobDirection;
                this.dtsJobId = model.dtsJobId;
                this.dtsJobName = model.dtsJobName;
                this.endTimestamp = model.endTimestamp;
                this.errorMessage = model.errorMessage;
                this.etlSafeCheckpoint = model.etlSafeCheckpoint;
                this.expireTime = model.expireTime;
                this.jobType = model.jobType;
                this.migrationMode = model.migrationMode;
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
             * <p>Indicates whether the <strong>new</strong> change tracking feature is used. </p>
             * <blockquote>
             * <p>This parameter is returned only for change tracking instances of the new version.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>new</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The start of the time range for change tracking. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-15T08:25:34Z</p>
             */
            public Builder beginTimestamp(String beginTimestamp) {
                this.beginTimestamp = beginTimestamp;
                return this;
            }

            /**
             * <p>The start offset of incremental data migration or data synchronization. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1616899019</p>
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * <p>The consumption checkpoint of the change tracking instance. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-23T07:30:31Z</p>
             */
            public Builder consumptionCheckpoint(String consumptionCheckpoint) {
                this.consumptionCheckpoint = consumptionCheckpoint;
                return this;
            }

            /**
             * <p>The downstream client information in the following format: <IP address of the downstream client>:<Random ID generated by DTS>.</p>
             * 
             * <strong>example:</strong>
             * <p>114...:dts******</p>
             */
            public Builder consumptionClient(String consumptionClient) {
                this.consumptionClient = consumptionClient;
                return this;
            }

            /**
             * <p>The time when the task was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:s</em>sZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-16T08:01:19Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The state of the ETL task. </p>
             * <blockquote>
             * <p>This parameter collection is returned only if an ETL task is configured.</p>
             * </blockquote>
             */
            public Builder dataEtlStatus(EtlDemoListDataEtlStatus dataEtlStatus) {
                this.dataEtlStatus = dataEtlStatus;
                return this;
            }

            /**
             * <p>The state of full data migration or initial full data synchronization.</p>
             */
            public Builder dataInitializationStatus(EtlDemoListDataInitializationStatus dataInitializationStatus) {
                this.dataInitializationStatus = dataInitializationStatus;
                return this;
            }

            /**
             * <p>The state of incremental data migration or synchronization.</p>
             */
            public Builder dataSynchronizationStatus(EtlDemoListDataSynchronizationStatus dataSynchronizationStatus) {
                this.dataSynchronizationStatus = dataSynchronizationStatus;
                return this;
            }

            /**
             * <p>The objects of the data migration, data synchronization, or change tracking task. For more information, see <a href="https://help.aliyun.com/document_detail/209545.html">Objects of DTS tasks</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;dtstestdata&quot;: { &quot;name&quot;: &quot;dtstestdata&quot;, &quot;all&quot;: true }}</p>
             */
            public Builder dbObject(String dbObject) {
                this.dbObject = dbObject;
                return this;
            }

            /**
             * <p>The latency of incremental data migration or synchronization. </p>
             * <blockquote>
             * <p>If you query data migration tasks, the unit of this parameter is milliseconds. If you query data synchronization tasks, the unit of this parameter is seconds.</p>
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
             * <p>The connection settings of the destination instance.</p>
             */
            public Builder destinationEndpoint(EtlDemoListDestinationEndpoint destinationEndpoint) {
                this.destinationEndpoint = destinationEndpoint;
                return this;
            }

            /**
             * <p>The ID of the data migration, data synchronization, or change tracking instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtsi03e3zty16i****</p>
             */
            public Builder dtsInstanceID(String dtsInstanceID) {
                this.dtsInstanceID = dtsInstanceID;
                return this;
            }

            /**
             * <p>The instance class. </p>
             * <blockquote>
             * <p>For more information about the test performance of each instance class, see <a href="https://help.aliyun.com/document_detail/26606.html">Specifications of data migration instances</a> and <a href="https://help.aliyun.com/document_detail/26605.html">Specifications of data synchronization instances</a>.</p>
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
             * <li><strong>Forward</strong></li>
             * <li><strong>Reverse</strong></li>
             * </ul>
             * <blockquote>
             * <p>This parameter is returned only if the topology of the data synchronization instance is two-way synchronization.</p>
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
             * <p>The name of the data migration, data synchronization, or change tracking task.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS_TO_RDS_MIGRATION</p>
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * <p>The end of the time range for change tracking. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-26T14:03:21Z</p>
             */
            public Builder endTimestamp(String endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by [com.mysql.jdbc.exceptions.jdbc4.MySQLNonTransientConnectionException:Could not create connection to database server. Attempted reconnect 3 times. Giving up.][com.mysql.jdbc.exceptions.jdbc4.CommunicationsException:Communications link failure\n\nThe last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.][java.net.ConnectException:Connection timed out (Connection timed out)] About more information in [<a href="https://yq.aliyun.com/articles/499178%5D">https://yq.aliyun.com/articles/499178]</a>.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The checkpoint of the ETL task.</p>
             * 
             * <strong>example:</strong>
             * <p>1610540493</p>
             */
            public Builder etlSafeCheckpoint(String etlSafeCheckpoint) {
                this.etlSafeCheckpoint = etlSafeCheckpoint;
                return this;
            }

            /**
             * <p>The time when the instance expires. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * <blockquote>
             * <p>This parameter is returned only if the returned value of <strong>PayType</strong> is <strong>PrePaid</strong>.</p>
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
             * <p>The type of the DTS task. Valid values:</p>
             * <ul>
             * <li><strong>MIGRATION</strong>: data migration task </li>
             * <li><strong>SYNC</strong>: data synchronization task </li>
             * <li><strong>SUBSCRIBE</strong>: change tracking task</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MIGRATION</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The migration types or initial synchronization types.</p>
             */
            public Builder migrationMode(EtlDemoListMigrationMode migrationMode) {
                this.migrationMode = migrationMode;
                return this;
            }

            /**
             * <p>The source of the task.</p>
             * <ul>
             * <li><strong>PTS</strong></li>
             * <li><strong>DMS</strong></li>
             * <li><strong>DTS</strong></li>
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
             * <p>The billing method of the DTS instance. Valid values:</p>
             * <ul>
             * <li><strong>PrePaid</strong>: subscription </li>
             * <li><strong>PostPaid</strong>: pay-as-you-go</li>
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
             * <p>The performance of the data migration or synchronization instance.</p>
             */
            public Builder performance(EtlDemoListPerformance performance) {
                this.performance = performance;
                return this;
            }

            /**
             * <p>The precheck state.</p>
             */
            public Builder precheckStatus(EtlDemoListPrecheckStatus precheckStatus) {
                this.precheckStatus = precheckStatus;
                return this;
            }

            /**
             * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, for example, whether to automatically start a precheck. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;srcHostPorts&quot;:&quot;&quot;,&quot;whitelist.dms.online.ddl.enable&quot;:false,&quot;filterDDL&quot;:false,&quot;sqlparser.dms.original.ddl&quot;:true,&quot;srcOracleType&quot;:&quot;sid&quot;,&quot;maxRetryTime&quot;:43200,&quot;destSSL&quot;:&quot;0&quot;,&quot;destOracleType&quot;:&quot;sid&quot;,&quot;srcSSL&quot;:&quot;0&quot;,&quot;dbListCaseChangeMode&quot;:&quot;default&quot;,&quot;SourceEngineVersion&quot;:&quot;8.0.18&quot;,&quot;srcNetType&quot;:&quot;VPC&quot;,&quot;destNetType&quot;:&quot;VPC&quot;,&quot;srcVpcNetMappingInst&quot;:&quot;172.16.1**.<strong>:10803&quot;,&quot;destVpcNetMappingInst&quot;:&quot;172.16.1</strong>.**:11077&quot;,&quot;useJobTask&quot;:&quot;1&quot;}</p>
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
             * <p>The information about the retries performed by DTS due to an exception.</p>
             */
            public Builder retryState(EtlDemoListRetryState retryState) {
                this.retryState = retryState;
                return this;
            }

            /**
             * <p>The details of the data synchronization task in the reverse direction. </p>
             * <blockquote>
             * <p>This parameter is returned only for two-way data synchronization tasks.</p>
             * </blockquote>
             */
            public Builder reverseJob(EtlDemoListReverseJob reverseJob) {
                this.reverseJob = reverseJob;
                return this;
            }

            /**
             * <p>The connection settings of the source instance.</p>
             */
            public Builder sourceEndpoint(EtlDemoListSourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
                return this;
            }

            /**
             * <p>The state of the DTS instance. For more information about the valid values, see the description of the request parameter <strong>Status</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Migrating</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The state of schema migration or initial schema synchronization.</p>
             */
            public Builder structureInitializationStatus(EtlDemoListStructureInitializationStatus structureInitializationStatus) {
                this.structureInitializationStatus = structureInitializationStatus;
                return this;
            }

            /**
             * <p>The tags of the task.</p>
             */
            public Builder tagList(java.util.List<EtlDemoListTagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            public EtlDemoList build() {
                return new EtlDemoList(this);
            } 

        } 

    }
}
