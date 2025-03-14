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
 * {@link DescribeImageInfoListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageInfoListResponseBody</p>
 */
public class DescribeImageInfoListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageInfos")
    private java.util.List<ImageInfos> imageInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageInfos
     */
    public java.util.List<ImageInfos> getImageInfos() {
        return this.imageInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ImageInfos> imageInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeImageInfoListResponseBody model) {
            this.imageInfos = model.imageInfos;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array that consists of the information about images.</p>
         */
        public Builder imageInfos(java.util.List<ImageInfos> imageInfos) {
            this.imageInfos = imageInfos;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>BC3B0DAE-CC0E-59E9-9383-6F060F22****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageInfoListResponseBody build() {
            return new DescribeImageInfoListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageInfoListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageInfoListResponseBody</p>
     */
    public static class ImageInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmCount")
        private Integer alarmCount;

        @com.aliyun.core.annotation.NameInMap("AlarmStatus")
        private String alarmStatus;

        @com.aliyun.core.annotation.NameInMap("Digest")
        private String digest;

        @com.aliyun.core.annotation.NameInMap("Endpoints")
        private String endpoints;

        @com.aliyun.core.annotation.NameInMap("ImageCreate")
        private Long imageCreate;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageSize")
        private Long imageSize;

        @com.aliyun.core.annotation.NameInMap("ImageUpdate")
        private Long imageUpdate;

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

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("TagImmutable")
        private Integer tagImmutable;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("VulCount")
        private Integer vulCount;

        @com.aliyun.core.annotation.NameInMap("VulStatus")
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

            private Builder() {
            } 

            private Builder(ImageInfos model) {
                this.alarmCount = model.alarmCount;
                this.alarmStatus = model.alarmStatus;
                this.digest = model.digest;
                this.endpoints = model.endpoints;
                this.imageCreate = model.imageCreate;
                this.imageId = model.imageId;
                this.imageSize = model.imageSize;
                this.imageUpdate = model.imageUpdate;
                this.instanceId = model.instanceId;
                this.regionId = model.regionId;
                this.registryType = model.registryType;
                this.repoId = model.repoId;
                this.repoName = model.repoName;
                this.repoNamespace = model.repoNamespace;
                this.repoType = model.repoType;
                this.riskStatus = model.riskStatus;
                this.status = model.status;
                this.tag = model.tag;
                this.tagImmutable = model.tagImmutable;
                this.uuid = model.uuid;
                this.vulCount = model.vulCount;
                this.vulStatus = model.vulStatus;
            } 

            /**
             * <p>The number of alerts that are generated on the current pod, application, namespace, or cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder alarmCount(Integer alarmCount) {
                this.alarmCount = alarmCount;
                return this;
            }

            /**
             * <p>Indicates whether alerts are generated on the asset. Valid values:</p>
             * <ul>
             * <li><strong>YES</strong></li>
             * <li><strong>NO</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>YES</p>
             */
            public Builder alarmStatus(String alarmStatus) {
                this.alarmStatus = alarmStatus;
                return this;
            }

            /**
             * <p>The digest value of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>a3521b04dfdd1361a24be6263f2983cf12ba910989f4d9f7324da7e1e89f****</p>
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * <p>The endpoint of Container Registry.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-x7</p>
             */
            public Builder endpoints(String endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * <p>The time when the image was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1636962328000</p>
             */
            public Builder imageCreate(Long imageCreate) {
                this.imageCreate = imageCreate;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>bb0175afea16138815a8900adeeb0315d88a83a2376eeffa14db1d693a15****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The size of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>157408623</p>
             */
            public Builder imageSize(Long imageSize) {
                this.imageSize = imageSize;
                return this;
            }

            /**
             * <p>The time when the image was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1636974116000</p>
             */
            public Builder imageUpdate(Long imageUpdate) {
                this.imageUpdate = imageUpdate;
                return this;
            }

            /**
             * <p>The ID of the image instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-wz95abw6pa7y79ve****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region ID of the image instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The type of the registration.</p>
             * 
             * <strong>example:</strong>
             * <p>harbor</p>
             */
            public Builder registryType(String registryType) {
                this.registryType = registryType;
                return this;
            }

            /**
             * <p>The ID of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>crr-5qk9v2rdt0s****</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>The name of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>opa-test</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The namespace to which the image repository belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>libssh2</p>
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * <p>The type of the image repository. Valid values:</p>
             * <ul>
             * <li><code>PUBLIC</code></li>
             * <li><code>PRIVATE</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PUBLIC</p>
             */
            public Builder repoType(String repoType) {
                this.repoType = repoType;
                return this;
            }

            /**
             * <p>Indicates whether the image is at risk. Valid values:</p>
             * <ul>
             * <li><strong>YES</strong></li>
             * <li><strong>NO</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>YES</p>
             */
            public Builder riskStatus(String riskStatus) {
                this.riskStatus = riskStatus;
                return this;
            }

            /**
             * <p>The status of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag that is added to the image.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The tag immutability.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder tagImmutable(Integer tagImmutable) {
                this.tagImmutable = tagImmutable;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>ff9ca084-7faa-4ab2-8728-69024755****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The total number of vulnerabilities in your assets.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder vulCount(Integer vulCount) {
                this.vulCount = vulCount;
                return this;
            }

            /**
             * <p>Indicates whether vulnerabilities are detected on the asset. Valid values:</p>
             * <ul>
             * <li><strong>YES</strong></li>
             * <li><strong>NO</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>YES</p>
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
