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
 * {@link DescribeImageInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageInstancesResponseBody</p>
 */
public class DescribeImageInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageInstanceList")
    private java.util.List<ImageInstanceList> imageInstanceList;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageInstanceList
     */
    public java.util.List<ImageInstanceList> getImageInstanceList() {
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
        private java.util.List<ImageInstanceList> imageInstanceList; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeImageInstancesResponseBody model) {
            this.imageInstanceList = model.imageInstanceList;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the images.</p>
         */
        public Builder imageInstanceList(java.util.List<ImageInstanceList> imageInstanceList) {
            this.imageInstanceList = imageInstanceList;
            return this;
        }

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
         * <p>BE120DAB-F4E7-4C53-ADC3-A97578ABF384</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageInstancesResponseBody build() {
            return new DescribeImageInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageInstancesResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("LastScanTime")
        private Long lastScanTime;

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
            this.lastScanTime = builder.lastScanTime;
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
         * @return lastScanTime
         */
        public Long getLastScanTime() {
            return this.lastScanTime;
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
            private Long lastScanTime; 
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

            private Builder() {
            } 

            private Builder(ImageInstanceList model) {
                this.alarmCount = model.alarmCount;
                this.alarmStatus = model.alarmStatus;
                this.deployed = model.deployed;
                this.digest = model.digest;
                this.endpoints = model.endpoints;
                this.hcCount = model.hcCount;
                this.hcStatus = model.hcStatus;
                this.imageCreate = model.imageCreate;
                this.imageId = model.imageId;
                this.imageSize = model.imageSize;
                this.imageUpdate = model.imageUpdate;
                this.instanceId = model.instanceId;
                this.lastScanTime = model.lastScanTime;
                this.regionId = model.regionId;
                this.registryType = model.registryType;
                this.repoId = model.repoId;
                this.repoName = model.repoName;
                this.repoNamespace = model.repoNamespace;
                this.repoType = model.repoType;
                this.riskStatus = model.riskStatus;
                this.scaProgress = model.scaProgress;
                this.scaResult = model.scaResult;
                this.scaStatus = model.scaStatus;
                this.status = model.status;
                this.tag = model.tag;
                this.uuid = model.uuid;
                this.vulCount = model.vulCount;
                this.vulStatus = model.vulStatus;
            } 

            /**
             * <p>The number of alerts that are generated for the image.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder alarmCount(Integer alarmCount) {
                this.alarmCount = alarmCount;
                return this;
            }

            /**
             * <p>Indicates whether alerts are generated for the image. Valid values:</p>
             * <ul>
             * <li><strong>YES</strong></li>
             * <li><strong>NO</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NO</p>
             */
            public Builder alarmStatus(String alarmStatus) {
                this.alarmStatus = alarmStatus;
                return this;
            }

            /**
             * <p>Indicates whether the image was deployed. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The image was not deployed.</li>
             * <li><strong>1</strong>: The image was deployed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder deployed(Integer deployed) {
                this.deployed = deployed;
                return this;
            }

            /**
             * <p>The digest value of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>a5ccdd9b166b67e02954aa9b618fe19b7968bd56a15463d2ad7f2643ba5b****</p>
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * <p>The address of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder endpoints(String endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * <p>The number of baseline risks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder hcCount(Integer hcCount) {
                this.hcCount = hcCount;
                return this;
            }

            /**
             * <p>Indicates whether baseline risks exist. Valid values:</p>
             * <ul>
             * <li><strong>NO</strong></li>
             * <li><strong>YES</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NO</p>
             */
            public Builder hcStatus(String hcStatus) {
                this.hcStatus = hcStatus;
                return this;
            }

            /**
             * <p>The timestamp generated when the image was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1600069948849</p>
             */
            public Builder imageCreate(String imageCreate) {
                this.imageCreate = imageCreate;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>c20987f18b130f9d144c9828df630417e2a9523148930dc3963e9d0dab30****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The size of the image. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>1604487690</p>
             */
            public Builder imageSize(String imageSize) {
                this.imageSize = imageSize;
                return this;
            }

            /**
             * <p>The timestamp generated when the image was updated. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1600069948849</p>
             */
            public Builder imageUpdate(String imageUpdate) {
                this.imageUpdate = imageUpdate;
                return this;
            }

            /**
             * <p>The instance ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>39010****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The timestamp when the last scan was performed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1721363159000</p>
             */
            public Builder lastScanTime(Long lastScanTime) {
                this.lastScanTime = lastScanTime;
                return this;
            }

            /**
             * <p>The region ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The type of the image. Valid values:</p>
             * <ul>
             * <li><strong>acr</strong></li>
             * <li><strong>harbor</strong></li>
             * <li><strong>quay</strong></li>
             * <li><strong>CI/CD</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>acr</p>
             */
            public Builder registryType(String registryType) {
                this.registryType = registryType;
                return this;
            }

            /**
             * <p>The ID of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>f2b86d20bf0855af6aa268ce90fd****</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>The name of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>sas-script-test</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The namespace to which the image repository belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * <p>The type of the repository. Valid values:</p>
             * <ul>
             * <li><strong>private</strong></li>
             * <li><strong>public</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>private</p>
             */
            public Builder repoType(String repoType) {
                this.repoType = repoType;
                return this;
            }

            /**
             * <p>Indicates whether risks exist. Valid values:</p>
             * <ul>
             * <li><strong>NO</strong></li>
             * <li><strong>YES</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NO</p>
             */
            public Builder riskStatus(String riskStatus) {
                this.riskStatus = riskStatus;
                return this;
            }

            /**
             * <p>The scan progress of the image. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder scaProgress(Integer scaProgress) {
                this.scaProgress = scaProgress;
                return this;
            }

            /**
             * <p>The error code of the image scan result. Valid values:</p>
             * <ul>
             * <li><strong>TASK_NOT_EXISTS</strong>: The image scan task does not exist.</li>
             * <li><strong>TASK_NOT_SUPPORT_REGION</strong>: The image scan task cannot be performed in the current region.</li>
             * <li><strong>forbid_create_repeat_task</strong>: The image scan task already exists.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TASK_NOT_SUPPORT_REGION</p>
             */
            public Builder scaResult(String scaResult) {
                this.scaResult = scaResult;
                return this;
            }

            /**
             * <p>The scan status of the image. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The image scan task is pending startup.</li>
             * <li><strong>START</strong>: The image scan task is started.</li>
             * <li><strong>MESSAGE_SEND</strong>: The message about the image scan task is sent.</li>
             * <li><strong>START_RUN</strong>: The image analysis task is started.</li>
             * <li><strong>DOWNLOAD</strong>: The image scan result is downloaded.</li>
             * <li><strong>PRE_ANALYZER</strong>: The image pre-analysis is started.</li>
             * <li><strong>WEB_SHELL_ANALYZER</strong>: The WebShell analysis of the image is complete.</li>
             * <li><strong>CVE_ANALYZER</strong>: The Common Vulnerabilities and Exposures (CVE) analysis of the image is complete.</li>
             * <li><strong>BIN_ANALYZER</strong>: The binary analysis of the image is complete.</li>
             * <li><strong>OTHER_ANALYZER</strong>: The extended analysis of the image is complete.</li>
             * <li><strong>SUCCESS</strong>: The image scan task is complete.</li>
             * <li><strong>PRE_ANALYZER_SUCCESS</strong>: The image pre-analysis is complete.</li>
             * <li><strong>FAIL</strong>: The image scan task failed.</li>
             * <li><strong>TIMEOUT</strong>: The image scan task timed out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder scaStatus(String scaStatus) {
                this.scaStatus = scaStatus;
                return this;
            }

            /**
             * <p>The status of the image. Valid values:</p>
             * <ul>
             * <li><strong>NORMAL</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql_5.7</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>12f80307-60aa-4efa-863a-56d72fb****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The number of vulnerabilities in the image.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder vulCount(Integer vulCount) {
                this.vulCount = vulCount;
                return this;
            }

            /**
             * <p>Indicates whether vulnerabilities exist in the image. Valid values:</p>
             * <ul>
             * <li><strong>YES</strong></li>
             * <li><strong>NO</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NO</p>
             */
            public Builder vulStatus(String vulStatus) {
                this.vulStatus = vulStatus;
                return this;
            }

            public ImageInstanceList build() {
                return new ImageInstanceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImageInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageInstancesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of images returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of returned entries.</p>
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
}
