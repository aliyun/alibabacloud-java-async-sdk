// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageInstancesResponseBody</p>
 */
public class DescribeImageInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageInstanceList")
    private java.util.List < ImageInstanceList> imageInstanceList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeImageInstancesResponseBody(Builder builder) {
        this.imageInstanceList = builder.imageInstanceList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageInstanceList
     */
    public java.util.List < ImageInstanceList> getImageInstanceList() {
        return this.imageInstanceList;
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

    public static final class Builder {
        private java.util.List < ImageInstanceList> imageInstanceList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * An array that consists of the information about the image.
         */
        public Builder imageInstanceList(java.util.List < ImageInstanceList> imageInstanceList) {
            this.imageInstanceList = imageInstanceList;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageInstancesResponseBody build() {
            return new DescribeImageInstancesResponseBody(this);
        } 

    } 

    public static class ImageInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmCount")
        private Integer alarmCount;

        @com.aliyun.core.annotation.NameInMap("AlarmStatus")
        private String alarmStatus;

        @com.aliyun.core.annotation.NameInMap("Deployed")
        private Integer deployed;

        @com.aliyun.core.annotation.NameInMap("Digest")
        private String digest;

        @com.aliyun.core.annotation.NameInMap("Endpoints")
        private String endpoints;

        @com.aliyun.core.annotation.NameInMap("HcCount")
        private Integer hcCount;

        @com.aliyun.core.annotation.NameInMap("HcStatus")
        private String hcStatus;

        @com.aliyun.core.annotation.NameInMap("ImageCreate")
        private String imageCreate;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageSize")
        private String imageSize;

        @com.aliyun.core.annotation.NameInMap("ImageUpdate")
        private String imageUpdate;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegistryType")
        private String registryType;

        @com.aliyun.core.annotation.NameInMap("RepoId")
        private String repoId;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RepoNamespace")
        private String repoNamespace;

        @com.aliyun.core.annotation.NameInMap("RepoType")
        private String repoType;

        @com.aliyun.core.annotation.NameInMap("RiskStatus")
        private String riskStatus;

        @com.aliyun.core.annotation.NameInMap("ScaProgress")
        private Integer scaProgress;

        @com.aliyun.core.annotation.NameInMap("ScaResult")
        private String scaResult;

        @com.aliyun.core.annotation.NameInMap("ScaStatus")
        private String scaStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("VulCount")
        private Integer vulCount;

        @com.aliyun.core.annotation.NameInMap("VulStatus")
        private String vulStatus;

        @com.aliyun.core.annotation.NameInMap("lastScanTime")
        private Long lastScanTime;

        private ImageInstanceList(Builder builder) {
            this.alarmCount = builder.alarmCount;
            this.alarmStatus = builder.alarmStatus;
            this.deployed = builder.deployed;
            this.digest = builder.digest;
            this.endpoints = builder.endpoints;
            this.hcCount = builder.hcCount;
            this.hcStatus = builder.hcStatus;
            this.imageCreate = builder.imageCreate;
            this.imageId = builder.imageId;
            this.imageSize = builder.imageSize;
            this.imageUpdate = builder.imageUpdate;
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.registryType = builder.registryType;
            this.repoId = builder.repoId;
            this.repoName = builder.repoName;
            this.repoNamespace = builder.repoNamespace;
            this.repoType = builder.repoType;
            this.riskStatus = builder.riskStatus;
            this.scaProgress = builder.scaProgress;
            this.scaResult = builder.scaResult;
            this.scaStatus = builder.scaStatus;
            this.status = builder.status;
            this.tag = builder.tag;
            this.uuid = builder.uuid;
            this.vulCount = builder.vulCount;
            this.vulStatus = builder.vulStatus;
            this.lastScanTime = builder.lastScanTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageInstanceList create() {
            return builder().build();
        }

        /**
         * @return alarmCount
         */
        public Integer getAlarmCount() {
            return this.alarmCount;
        }

        /**
         * @return alarmStatus
         */
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        /**
         * @return deployed
         */
        public Integer getDeployed() {
            return this.deployed;
        }

        /**
         * @return digest
         */
        public String getDigest() {
            return this.digest;
        }

        /**
         * @return endpoints
         */
        public String getEndpoints() {
            return this.endpoints;
        }

        /**
         * @return hcCount
         */
        public Integer getHcCount() {
            return this.hcCount;
        }

        /**
         * @return hcStatus
         */
        public String getHcStatus() {
            return this.hcStatus;
        }

        /**
         * @return imageCreate
         */
        public String getImageCreate() {
            return this.imageCreate;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageSize
         */
        public String getImageSize() {
            return this.imageSize;
        }

        /**
         * @return imageUpdate
         */
        public String getImageUpdate() {
            return this.imageUpdate;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return registryType
         */
        public String getRegistryType() {
            return this.registryType;
        }

        /**
         * @return repoId
         */
        public String getRepoId() {
            return this.repoId;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoNamespace
         */
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        /**
         * @return repoType
         */
        public String getRepoType() {
            return this.repoType;
        }

        /**
         * @return riskStatus
         */
        public String getRiskStatus() {
            return this.riskStatus;
        }

        /**
         * @return scaProgress
         */
        public Integer getScaProgress() {
            return this.scaProgress;
        }

        /**
         * @return scaResult
         */
        public String getScaResult() {
            return this.scaResult;
        }

        /**
         * @return scaStatus
         */
        public String getScaStatus() {
            return this.scaStatus;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return vulCount
         */
        public Integer getVulCount() {
            return this.vulCount;
        }

        /**
         * @return vulStatus
         */
        public String getVulStatus() {
            return this.vulStatus;
        }

        /**
         * @return lastScanTime
         */
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        public static final class Builder {
            private Integer alarmCount; 
            private String alarmStatus; 
            private Integer deployed; 
            private String digest; 
            private String endpoints; 
            private Integer hcCount; 
            private String hcStatus; 
            private String imageCreate; 
            private String imageId; 
            private String imageSize; 
            private String imageUpdate; 
            private String instanceId; 
            private String regionId; 
            private String registryType; 
            private String repoId; 
            private String repoName; 
            private String repoNamespace; 
            private String repoType; 
            private String riskStatus; 
            private Integer scaProgress; 
            private String scaResult; 
            private String scaStatus; 
            private String status; 
            private String tag; 
            private String uuid; 
            private Integer vulCount; 
            private String vulStatus; 
            private Long lastScanTime; 

            /**
             * The number of alerts that are generated for the image.
             */
            public Builder alarmCount(Integer alarmCount) {
                this.alarmCount = alarmCount;
                return this;
            }

            /**
             * Indicates whether alerts are generated for the image. Valid values:
             * <p>
             * 
             * *   **YES**
             * *   **NO**
             */
            public Builder alarmStatus(String alarmStatus) {
                this.alarmStatus = alarmStatus;
                return this;
            }

            /**
             * Indicates whether the image was deployed. Valid values:
             * <p>
             * 
             * *   **0**: The image was not deployed.
             * *   **1**: The image was deployed.
             */
            public Builder deployed(Integer deployed) {
                this.deployed = deployed;
                return this;
            }

            /**
             * The digest value of the image.
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * The address of the image.
             */
            public Builder endpoints(String endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * The number of baseline risks.
             */
            public Builder hcCount(Integer hcCount) {
                this.hcCount = hcCount;
                return this;
            }

            /**
             * Indicates whether the baseline risks exist. Valid values:
             * <p>
             * 
             * *   **NO**
             * *   **YES**
             */
            public Builder hcStatus(String hcStatus) {
                this.hcStatus = hcStatus;
                return this;
            }

            /**
             * The timestamp generated when the image was created. Unit: milliseconds.
             */
            public Builder imageCreate(String imageCreate) {
                this.imageCreate = imageCreate;
                return this;
            }

            /**
             * The image ID.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The size of the image. Unit: MB.
             */
            public Builder imageSize(String imageSize) {
                this.imageSize = imageSize;
                return this;
            }

            /**
             * The timestamp generated when the image was updated. Unit: milliseconds.
             */
            public Builder imageUpdate(String imageUpdate) {
                this.imageUpdate = imageUpdate;
                return this;
            }

            /**
             * The ID of the image.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the region in which the image resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The type of the image. Valid values:
             * <p>
             * 
             * *   **acr**
             * *   **harbor**
             * *   **quay**
             * *   **CI/CD**
             */
            public Builder registryType(String registryType) {
                this.registryType = registryType;
                return this;
            }

            /**
             * The ID of the image repository.
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * The name of the image repository.
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * The namespace to which the image repository belongs.
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * The type of the repository. Valid values:
             * <p>
             * 
             * *   **private**
             * *   **public**
             */
            public Builder repoType(String repoType) {
                this.repoType = repoType;
                return this;
            }

            /**
             * Indicates whether risks exist. Valid values:
             * <p>
             * 
             * *   **NO**
             * *   **YES**
             */
            public Builder riskStatus(String riskStatus) {
                this.riskStatus = riskStatus;
                return this;
            }

            /**
             * The scan progress of the image. Valid values: 0 to 100.
             */
            public Builder scaProgress(Integer scaProgress) {
                this.scaProgress = scaProgress;
                return this;
            }

            /**
             * The error code of the image scan result. Valid values:
             * <p>
             * 
             * *   **TASK_NOT_EXISTS**: The image scan task does not exist.
             * *   **TASK_NOT_SUPPORT_REGION**: The image scan task cannot be performed in the current region.
             * *   **forbid_create_repeat_task**: The image scan task already exists.
             */
            public Builder scaResult(String scaResult) {
                this.scaResult = scaResult;
                return this;
            }

            /**
             * The scan status of the image. Valid values:
             * <p>
             * 
             * *   **INIT**: The image scan task is pending startup.
             * *   **START**: The image scan task is started.
             * *   **MESSAGE_SEND**: The message about the image scan task is sent.
             * *   **START_RUN**: The image analysis task is started.
             * *   **DOWNLOAD**: The image scan result is downloaded.
             * *   **PRE_ANALYZER**: The image pre-analysis is started.
             * *   **WEB_SHELL_ANALYZER**: The WebShell analysis is complete.
             * *   **CVE_ANALYZER**: The Common Vulnerabilities and Exposures (CVE) analysis is complete.
             * *   **BIN_ANALYZER**: The binary analysis of the image is complete.
             * *   **OTHER_ANALYZER**: The extended analysis of the image is complete.
             * *   **SUCCESS**: The image scan task is complete.
             * *   **PRE_ANALYZER_SUCCESS**: The image pre-analysis is complete.
             * *   **FAIL**: The image scan task failed.
             * *   **TIMEOUT**: The image scan task timed out.
             */
            public Builder scaStatus(String scaStatus) {
                this.scaStatus = scaStatus;
                return this;
            }

            /**
             * The status of the image. Valid value:
             * <p>
             * 
             * *   **NORMAL**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tag of the image.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The UUID of the server.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * The number of vulnerabilities in the image.
             */
            public Builder vulCount(Integer vulCount) {
                this.vulCount = vulCount;
                return this;
            }

            /**
             * Indicates whether vulnerabilities exist in the image. Valid values:
             * <p>
             * 
             * *   **YES**
             * *   **NO**
             */
            public Builder vulStatus(String vulStatus) {
                this.vulStatus = vulStatus;
                return this;
            }

            /**
             * lastScanTime.
             */
            public Builder lastScanTime(Long lastScanTime) {
                this.lastScanTime = lastScanTime;
                return this;
            }

            public ImageInstanceList build() {
                return new ImageInstanceList(this);
            } 

        } 

    }
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
             * The number of images returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of returned entries.
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
}
