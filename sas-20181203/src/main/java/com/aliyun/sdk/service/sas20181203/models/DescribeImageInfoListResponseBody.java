// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageInfoListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageInfoListResponseBody</p>
 */
public class DescribeImageInfoListResponseBody extends TeaModel {
    @NameInMap("ImageInfos")
    private java.util.List < ImageInfos> imageInfos;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeImageInfoListResponseBody(Builder builder) {
        this.imageInfos = builder.imageInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageInfoListResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageInfos
     */
    public java.util.List < ImageInfos> getImageInfos() {
        return this.imageInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ImageInfos> imageInfos; 
        private String requestId; 

        /**
         * An array that consists of the information about images.
         */
        public Builder imageInfos(java.util.List < ImageInfos> imageInfos) {
            this.imageInfos = imageInfos;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageInfoListResponseBody build() {
            return new DescribeImageInfoListResponseBody(this);
        } 

    } 

    public static class ImageInfos extends TeaModel {
        @NameInMap("AlarmCount")
        private Integer alarmCount;

        @NameInMap("AlarmStatus")
        private String alarmStatus;

        @NameInMap("Digest")
        private String digest;

        @NameInMap("Endpoints")
        private String endpoints;

        @NameInMap("ImageCreate")
        private Long imageCreate;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageSize")
        private Long imageSize;

        @NameInMap("ImageUpdate")
        private Long imageUpdate;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegistryType")
        private String registryType;

        @NameInMap("RepoId")
        private String repoId;

        @NameInMap("RepoName")
        private String repoName;

        @NameInMap("RepoNamespace")
        private String repoNamespace;

        @NameInMap("RepoType")
        private String repoType;

        @NameInMap("RiskStatus")
        private String riskStatus;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("TagImmutable")
        private Integer tagImmutable;

        @NameInMap("Uuid")
        private String uuid;

        @NameInMap("VulCount")
        private Integer vulCount;

        @NameInMap("VulStatus")
        private String vulStatus;

        private ImageInfos(Builder builder) {
            this.alarmCount = builder.alarmCount;
            this.alarmStatus = builder.alarmStatus;
            this.digest = builder.digest;
            this.endpoints = builder.endpoints;
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
            this.status = builder.status;
            this.tag = builder.tag;
            this.tagImmutable = builder.tagImmutable;
            this.uuid = builder.uuid;
            this.vulCount = builder.vulCount;
            this.vulStatus = builder.vulStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageInfos create() {
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
         * @return imageCreate
         */
        public Long getImageCreate() {
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
        public Long getImageSize() {
            return this.imageSize;
        }

        /**
         * @return imageUpdate
         */
        public Long getImageUpdate() {
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
         * @return tagImmutable
         */
        public Integer getTagImmutable() {
            return this.tagImmutable;
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
            private String digest; 
            private String endpoints; 
            private Long imageCreate; 
            private String imageId; 
            private Long imageSize; 
            private Long imageUpdate; 
            private String instanceId; 
            private String regionId; 
            private String registryType; 
            private String repoId; 
            private String repoName; 
            private String repoNamespace; 
            private String repoType; 
            private String riskStatus; 
            private String status; 
            private String tag; 
            private Integer tagImmutable; 
            private String uuid; 
            private Integer vulCount; 
            private String vulStatus; 

            /**
             * The number of alerts that are generated on the current pod, application, namespace, or cluster.
             */
            public Builder alarmCount(Integer alarmCount) {
                this.alarmCount = alarmCount;
                return this;
            }

            /**
             * Indicates whether alerts are generated on the asset. Valid values:
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
             * The digest value of the image.
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * The endpoint of Container Registry.
             */
            public Builder endpoints(String endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * The time when the image was created.
             */
            public Builder imageCreate(Long imageCreate) {
                this.imageCreate = imageCreate;
                return this;
            }

            /**
             * The ID of the image.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The size of the image.
             */
            public Builder imageSize(Long imageSize) {
                this.imageSize = imageSize;
                return this;
            }

            /**
             * The time when the image was updated.
             */
            public Builder imageUpdate(Long imageUpdate) {
                this.imageUpdate = imageUpdate;
                return this;
            }

            /**
             * The ID of the image instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The region ID of the image instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The type of the registration.
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
             * The type of the image repository. Valid values:
             * <p>
             * 
             * *   `PUBLIC`
             * *   `PRIVATE`
             */
            public Builder repoType(String repoType) {
                this.repoType = repoType;
                return this;
            }

            /**
             * Indicates whether the image is at risk. Valid values:
             * <p>
             * 
             * *   **YES**
             * *   **NO**
             */
            public Builder riskStatus(String riskStatus) {
                this.riskStatus = riskStatus;
                return this;
            }

            /**
             * The status of the image.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tag that is added to the image.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The tag immutability.
             */
            public Builder tagImmutable(Integer tagImmutable) {
                this.tagImmutable = tagImmutable;
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
             * The total number of vulnerabilities in your assets.
             */
            public Builder vulCount(Integer vulCount) {
                this.vulCount = vulCount;
                return this;
            }

            /**
             * Indicates whether vulnerabilities are detected on the asset. Valid values:
             * <p>
             * 
             * *   **YES**
             * *   **NO**
             */
            public Builder vulStatus(String vulStatus) {
                this.vulStatus = vulStatus;
                return this;
            }

            public ImageInfos build() {
                return new ImageInfos(this);
            } 

        } 

    }
}
