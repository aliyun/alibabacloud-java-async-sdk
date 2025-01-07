// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeRestoreJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRestoreJobsResponseBody</p>
 */
public class DescribeRestoreJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RestoreJobs")
    private java.util.List<RestoreJobs> restoreJobs;

    private DescribeRestoreJobsResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.restoreJobs = builder.restoreJobs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRestoreJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return restoreJobs
     */
    public java.util.List<RestoreJobs> getRestoreJobs() {
        return this.restoreJobs;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List<RestoreJobs> restoreJobs; 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED92280-4363-57D3-A4D3-4D3FBC99B29F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details about the restoration tasks.</p>
         */
        public Builder restoreJobs(java.util.List<RestoreJobs> restoreJobs) {
            this.restoreJobs = restoreJobs;
            return this;
        }

        public DescribeRestoreJobsResponseBody build() {
            return new DescribeRestoreJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRestoreJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestoreJobsResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The number of restoration tasks returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page. Default value: <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of restoration tasks returned.</p>
             * 
             * <strong>example:</strong>
             * <p>69</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRestoreJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestoreJobsResponseBody</p>
     */
    public static class RestoreJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualBytes")
        private Long actualBytes;

        @com.aliyun.core.annotation.NameInMap("BytesDone")
        private Long bytesDone;

        @com.aliyun.core.annotation.NameInMap("BytesTotal")
        private Long bytesTotal;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private Long completeTime;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("ErrorCount")
        private Long errorCount;

        @com.aliyun.core.annotation.NameInMap("ErrorFile")
        private String errorFile;

        @com.aliyun.core.annotation.NameInMap("ErrorFileUrl")
        private String errorFileUrl;

        @com.aliyun.core.annotation.NameInMap("ErrorType")
        private String errorType;

        @com.aliyun.core.annotation.NameInMap("Eta")
        private Long eta;

        @com.aliyun.core.annotation.NameInMap("Excludes")
        private String excludes;

        @com.aliyun.core.annotation.NameInMap("ExitCode")
        private String exitCode;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Includes")
        private String includes;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("ItemsDone")
        private Long itemsDone;

        @com.aliyun.core.annotation.NameInMap("ItemsTotal")
        private Long itemsTotal;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Percentage")
        private Integer percentage;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("RestoreId")
        private String restoreId;

        @com.aliyun.core.annotation.NameInMap("RestoreName")
        private String restoreName;

        @com.aliyun.core.annotation.NameInMap("RestoreType")
        private String restoreType;

        @com.aliyun.core.annotation.NameInMap("SnapshotHash")
        private String snapshotHash;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        @com.aliyun.core.annotation.NameInMap("SnapshotVersion")
        private String snapshotVersion;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourceClientId")
        private String sourceClientId;

        @com.aliyun.core.annotation.NameInMap("Speed")
        private Long speed;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("VaultId")
        private String vaultId;

        @com.aliyun.core.annotation.NameInMap("VaultRegionId")
        private String vaultRegionId;

        private RestoreJobs(Builder builder) {
            this.actualBytes = builder.actualBytes;
            this.bytesDone = builder.bytesDone;
            this.bytesTotal = builder.bytesTotal;
            this.clientId = builder.clientId;
            this.completeTime = builder.completeTime;
            this.createdTime = builder.createdTime;
            this.duration = builder.duration;
            this.errorCount = builder.errorCount;
            this.errorFile = builder.errorFile;
            this.errorFileUrl = builder.errorFileUrl;
            this.errorType = builder.errorType;
            this.eta = builder.eta;
            this.excludes = builder.excludes;
            this.exitCode = builder.exitCode;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.includes = builder.includes;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.itemsDone = builder.itemsDone;
            this.itemsTotal = builder.itemsTotal;
            this.message = builder.message;
            this.percentage = builder.percentage;
            this.requestId = builder.requestId;
            this.restoreId = builder.restoreId;
            this.restoreName = builder.restoreName;
            this.restoreType = builder.restoreType;
            this.snapshotHash = builder.snapshotHash;
            this.snapshotId = builder.snapshotId;
            this.snapshotVersion = builder.snapshotVersion;
            this.source = builder.source;
            this.sourceClientId = builder.sourceClientId;
            this.speed = builder.speed;
            this.status = builder.status;
            this.target = builder.target;
            this.updatedTime = builder.updatedTime;
            this.uuid = builder.uuid;
            this.vaultId = builder.vaultId;
            this.vaultRegionId = builder.vaultRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreJobs create() {
            return builder().build();
        }

        /**
         * @return actualBytes
         */
        public Long getActualBytes() {
            return this.actualBytes;
        }

        /**
         * @return bytesDone
         */
        public Long getBytesDone() {
            return this.bytesDone;
        }

        /**
         * @return bytesTotal
         */
        public Long getBytesTotal() {
            return this.bytesTotal;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return completeTime
         */
        public Long getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return errorCount
         */
        public Long getErrorCount() {
            return this.errorCount;
        }

        /**
         * @return errorFile
         */
        public String getErrorFile() {
            return this.errorFile;
        }

        /**
         * @return errorFileUrl
         */
        public String getErrorFileUrl() {
            return this.errorFileUrl;
        }

        /**
         * @return errorType
         */
        public String getErrorType() {
            return this.errorType;
        }

        /**
         * @return eta
         */
        public Long getEta() {
            return this.eta;
        }

        /**
         * @return excludes
         */
        public String getExcludes() {
            return this.excludes;
        }

        /**
         * @return exitCode
         */
        public String getExitCode() {
            return this.exitCode;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return includes
         */
        public String getIncludes() {
            return this.includes;
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
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return itemsDone
         */
        public Long getItemsDone() {
            return this.itemsDone;
        }

        /**
         * @return itemsTotal
         */
        public Long getItemsTotal() {
            return this.itemsTotal;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return percentage
         */
        public Integer getPercentage() {
            return this.percentage;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return restoreId
         */
        public String getRestoreId() {
            return this.restoreId;
        }

        /**
         * @return restoreName
         */
        public String getRestoreName() {
            return this.restoreName;
        }

        /**
         * @return restoreType
         */
        public String getRestoreType() {
            return this.restoreType;
        }

        /**
         * @return snapshotHash
         */
        public String getSnapshotHash() {
            return this.snapshotHash;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        /**
         * @return snapshotVersion
         */
        public String getSnapshotVersion() {
            return this.snapshotVersion;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceClientId
         */
        public String getSourceClientId() {
            return this.sourceClientId;
        }

        /**
         * @return speed
         */
        public Long getSpeed() {
            return this.speed;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return vaultId
         */
        public String getVaultId() {
            return this.vaultId;
        }

        /**
         * @return vaultRegionId
         */
        public String getVaultRegionId() {
            return this.vaultRegionId;
        }

        public static final class Builder {
            private Long actualBytes; 
            private Long bytesDone; 
            private Long bytesTotal; 
            private String clientId; 
            private Long completeTime; 
            private Long createdTime; 
            private Long duration; 
            private Long errorCount; 
            private String errorFile; 
            private String errorFileUrl; 
            private String errorType; 
            private Long eta; 
            private String excludes; 
            private String exitCode; 
            private String gmtCreate; 
            private String gmtModified; 
            private String includes; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private Long itemsDone; 
            private Long itemsTotal; 
            private String message; 
            private Integer percentage; 
            private String requestId; 
            private String restoreId; 
            private String restoreName; 
            private String restoreType; 
            private String snapshotHash; 
            private String snapshotId; 
            private String snapshotVersion; 
            private String source; 
            private String sourceClientId; 
            private Long speed; 
            private String status; 
            private String target; 
            private Long updatedTime; 
            private String uuid; 
            private String vaultId; 
            private String vaultRegionId; 

            /**
             * <p>The size of backup data. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder actualBytes(Long actualBytes) {
                this.actualBytes = actualBytes;
                return this;
            }

            /**
             * <p>The total size of data that is restored. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder bytesDone(Long bytesDone) {
                this.bytesDone = bytesDone;
                return this;
            }

            /**
             * <p>The total size of data that you want to restore. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder bytesTotal(Long bytesTotal) {
                this.bytesTotal = bytesTotal;
                return this;
            }

            /**
             * <p>The ID of the anti-ransomware agent that is used to perform the restoration task.</p>
             * 
             * <strong>example:</strong>
             * <p>c-000frxwusjauhp9ajpu6</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The timestamp when the restoration task is complete. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1583289054000</p>
             */
            public Builder completeTime(Long completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The timestamp when the restoration task is created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1583289052000</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The duration of the restoration task. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The number of the restoration tasks on which errors occur.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder errorCount(Long errorCount) {
                this.errorCount = errorCount;
                return this;
            }

            /**
             * <p>The name of the CSV file. The CSV file contains the files that fail to be restored.</p>
             * 
             * <strong>example:</strong>
             * <p>s-000f4wxm8f7gur6g2otm.csv</p>
             */
            public Builder errorFile(String errorFile) {
                this.errorFile = errorFile;
                return this;
            }

            /**
             * <p>The URL to download the CSV file. The CSV file contains the files that fail to be restored.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;/home/user&quot;]</p>
             */
            public Builder errorFileUrl(String errorFileUrl) {
                this.errorFileUrl = errorFileUrl;
                return this;
            }

            /**
             * <p>The error code that is returned for the restoration task.</p>
             * 
             * <strong>example:</strong>
             * <p>NONE</p>
             */
            public Builder errorType(String errorType) {
                this.errorType = errorType;
                return this;
            }

            /**
             * <p>The timestamp when the in-progress restoration task is expected to be complete. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1583299054</p>
             */
            public Builder eta(Long eta) {
                this.eta = eta;
                return this;
            }

            /**
             * <p>The directory excluded from the anti-ransomware policy. The value is the directory that you specify to skip protection when you create the anti-ransomware policy.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;/home/user&quot;]</p>
             */
            public Builder excludes(String excludes) {
                this.excludes = excludes;
                return this;
            }

            /**
             * <p>The return value of the restoration task.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder exitCode(String exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * <p>The time when the restoration task is created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-25T19:11Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the restoration task is updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-25T19:11Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The directory in which the restored file is stored. The value is the directory that you specify for protection when you create the anti-ransomware policy</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;/root/disk-uuid-test&quot;,&quot;/root/install.sh&quot;]</p>
             */
            public Builder includes(String includes) {
                this.includes = includes;
                return this;
            }

            /**
             * <p>The ID of the server whose data you want to restore.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp12xnvdax6307gw****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the server whose data you want to restore.</p>
             * 
             * <strong>example:</strong>
             * <p>win2012-01</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the server whose data you want to restore.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The internal IP address of the server whose data you want to restore.</p>
             * 
             * <strong>example:</strong>
             * <p>2.1.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The number of files that are restored.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder itemsDone(Long itemsDone) {
                this.itemsDone = itemsDone;
                return this;
            }

            /**
             * <p>The total number of files that need to be restored.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder itemsTotal(Long itemsTotal) {
                this.itemsTotal = itemsTotal;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>successful</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The progress of the restoration task in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percentage(Integer percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0ED92280-4363-57D3-A4D3-4D3FBC99B29F</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The ID of the restoration task.</p>
             * 
             * <strong>example:</strong>
             * <p>r-000gmcypy5dyf9ey3uv7</p>
             */
            public Builder restoreId(String restoreId) {
                this.restoreId = restoreId;
                return this;
            }

            /**
             * <p>The name of the restoration task.</p>
             * 
             * <strong>example:</strong>
             * <p>Restore</p>
             */
            public Builder restoreName(String restoreName) {
                this.restoreName = restoreName;
                return this;
            }

            /**
             * <p>The type of the file that is restored. Valid values:</p>
             * <ul>
             * <li><strong>ECS_FILE</strong>: files on Elastic Compute Service (ECS) instances</li>
             * <li><strong>FILE</strong>: files on servers in data centers</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS_FILE</p>
             */
            public Builder restoreType(String restoreType) {
                this.restoreType = restoreType;
                return this;
            }

            /**
             * <p>The hash value of the snapshot that stores backup data when the data is backed up.</p>
             * 
             * <strong>example:</strong>
             * <p>a3992de83f529b844135fe795d949181735a7d20e0ac8539485c61b7983e618f</p>
             */
            public Builder snapshotHash(String snapshotHash) {
                this.snapshotHash = snapshotHash;
                return this;
            }

            /**
             * <p>The hash value ID of the snapshot that stores backup data when the data is backed up.</p>
             * 
             * <strong>example:</strong>
             * <p>s-000gmcypy5dy54e39yny</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * <p>The version of the backup data.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-03-03 18:00</p>
             */
            public Builder snapshotVersion(String snapshotVersion) {
                this.snapshotVersion = snapshotVersion;
                return this;
            }

            /**
             * <p>The restored content.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;/home/admin&quot;,&quot;\\servername\sharename&quot;]</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The ID of the anti-ransomware agent that is used to back up data.</p>
             * 
             * <strong>example:</strong>
             * <p>c-000gmcypy5dyf9ey3uv7</p>
             */
            public Builder sourceClientId(String sourceClientId) {
                this.sourceClientId = sourceClientId;
                return this;
            }

            /**
             * <p>The speed at which data is restored. Unit: byte/s.</p>
             * 
             * <strong>example:</strong>
             * <p>25766558</p>
             */
            public Builder speed(Long speed) {
                this.speed = speed;
                return this;
            }

            /**
             * <p>The status of the restoration task. Valid values:</p>
             * <ul>
             * <li><strong>RUNNING</strong>: The task is running.</li>
             * <li><strong>COMPLETE</strong>: The task is complete.</li>
             * <li><strong>FAILED</strong>: The task fails.</li>
             * <li><strong>CANCELING</strong>: The task is being canceled.</li>
             * <li><strong>CANCELED</strong>: The task is canceled.</li>
             * <li><strong>PARTIAL_COMPLETE</strong>: The task is partially successful.</li>
             * <li><strong>CREATED</strong>: The task was created but is not run.</li>
             * <li><strong>EXPIRED</strong>: The task is not updated.</li>
             * <li><strong>QUEUED</strong>: The task is waiting to be run.</li>
             * <li><strong>CLIENT_DELETED</strong>: The task fails because the anti-ransomware agent is uninstalled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The folder to which the backup data is restored. After you create the restoration task, the backup data is restored to the specified folder.</p>
             * 
             * <strong>example:</strong>
             * <p>/home</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The timestamp when the restoration task was last updated. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1583289054000</p>
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * <p>The UUID of the server whose data you want to restore.</p>
             * 
             * <strong>example:</strong>
             * <p>6E3DABB6-3F6A-40DB-9492-2C8B59C****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The ID of the backup vault in which the backup data is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>v-000b0v0jqzmse2yz06zw</p>
             */
            public Builder vaultId(String vaultId) {
                this.vaultId = vaultId;
                return this;
            }

            /**
             * <p>The ID of the region where the backup vault resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder vaultRegionId(String vaultRegionId) {
                this.vaultRegionId = vaultRegionId;
                return this;
            }

            public RestoreJobs build() {
                return new RestoreJobs(this);
            } 

        } 

    }
}
