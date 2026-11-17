// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link StartTaskForCreateImageRequest} extends {@link RequestModel}
 *
 * <p>StartTaskForCreateImageRequest</p>
 */
public class StartTaskForCreateImageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageCreateMode")
    private String imageCreateMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JumpStep")
    private String jumpStep;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PerformanceType")
    private String performanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceList")
    private java.util.List<ResourceList> resourceList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RetryType")
    private String retryType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RunMode")
    private String runMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceRegion")
    private String sourceRegion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubInstanceId")
    private String subInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
    private Integer systemDiskSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    private StartTaskForCreateImageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.imageCreateMode = builder.imageCreateMode;
        this.imageId = builder.imageId;
        this.instanceId = builder.instanceId;
        this.jumpStep = builder.jumpStep;
        this.performanceType = builder.performanceType;
        this.productType = builder.productType;
        this.resourceList = builder.resourceList;
        this.retryType = builder.retryType;
        this.runMode = builder.runMode;
        this.sourceRegion = builder.sourceRegion;
        this.subInstanceId = builder.subInstanceId;
        this.systemDiskSize = builder.systemDiskSize;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartTaskForCreateImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return imageCreateMode
     */
    public String getImageCreateMode() {
        return this.imageCreateMode;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jumpStep
     */
    public String getJumpStep() {
        return this.jumpStep;
    }

    /**
     * @return performanceType
     */
    public String getPerformanceType() {
        return this.performanceType;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return resourceList
     */
    public java.util.List<ResourceList> getResourceList() {
        return this.resourceList;
    }

    /**
     * @return retryType
     */
    public String getRetryType() {
        return this.retryType;
    }

    /**
     * @return runMode
     */
    public String getRunMode() {
        return this.runMode;
    }

    /**
     * @return sourceRegion
     */
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * @return subInstanceId
     */
    public String getSubInstanceId() {
        return this.subInstanceId;
    }

    /**
     * @return systemDiskSize
     */
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<StartTaskForCreateImageRequest, Builder> {
        private String regionId; 
        private String imageCreateMode; 
        private String imageId; 
        private String instanceId; 
        private String jumpStep; 
        private String performanceType; 
        private String productType; 
        private java.util.List<ResourceList> resourceList; 
        private String retryType; 
        private String runMode; 
        private String sourceRegion; 
        private String subInstanceId; 
        private Integer systemDiskSize; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(StartTaskForCreateImageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.imageCreateMode = request.imageCreateMode;
            this.imageId = request.imageId;
            this.instanceId = request.instanceId;
            this.jumpStep = request.jumpStep;
            this.performanceType = request.performanceType;
            this.productType = request.productType;
            this.resourceList = request.resourceList;
            this.retryType = request.retryType;
            this.runMode = request.runMode;
            this.sourceRegion = request.sourceRegion;
            this.subInstanceId = request.subInstanceId;
            this.systemDiskSize = request.systemDiskSize;
            this.versionId = request.versionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The image creation mode. Use the following mode:</p>
         * <ul>
         * <li><strong>BUILDER_MANUAL</strong>: Manually enter the creation environment to install applications and configure the image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BUILDER_MANUAL</p>
         */
        public Builder imageCreateMode(String imageCreateMode) {
            this.putBodyParameter("ImageCreateMode", imageCreateMode);
            this.imageCreateMode = imageCreateMode;
            return this;
        }

        /**
         * <p>The ID of the image. This parameter is not exposed by default.</p>
         * 
         * <strong>example:</strong>
         * <p>img-bp13mu****</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The WUYING instance ID. The instance can be a cloud desktop instance or a workstation instance. To ensure data consistency in the image, stop the instance before starting the image creation task.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-5u87dainamz54yk10</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The step to jump to.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE_VALIDATE_ENV</p>
         */
        public Builder jumpStep(String jumpStep) {
            this.putBodyParameter("JumpStep", jumpStep);
            this.jumpStep = jumpStep;
            return this;
        }

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        public Builder performanceType(String performanceType) {
            this.putBodyParameter("PerformanceType", performanceType);
            this.performanceType = performanceType;
            return this;
        }

        /**
         * <p>The product type. Set this parameter to the following value when you call this operation:</p>
         * <ul>
         * <li><code>CloudApp</code>: WUYING Cloud App.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The list of resources required for image creation, such as the download URLs of applications to be installed. You can specify up to 100 items. The ResourceType and Resource of each item must correspond to each other.</p>
         * 
         * <strong>example:</strong>
         * <p>List of Object</p>
         */
        public Builder resourceList(java.util.List<ResourceList> resourceList) {
            this.putBodyParameter("ResourceList", resourceList);
            this.resourceList = resourceList;
            return this;
        }

        /**
         * <p>The retry type.</p>
         * 
         * <strong>example:</strong>
         * <p>RETRY</p>
         */
        public Builder retryType(String retryType) {
            this.putBodyParameter("RetryType", retryType);
            this.retryType = retryType;
            return this;
        }

        /**
         * <p>The running mode of the image creation environment. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong>: Normal running mode.</li>
         * <li><strong>COMPATIBLE</strong>: Compatible running mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder runMode(String runMode) {
            this.putBodyParameter("RunMode", runMode);
            this.runMode = runMode;
            return this;
        }

        /**
         * <p>The source region where the image is created. If you do not specify this parameter, a region is randomly selected.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder sourceRegion(String sourceRegion) {
            this.putBodyParameter("SourceRegion", sourceRegion);
            this.sourceRegion = sourceRegion;
            return this;
        }

        /**
         * <p>The sub-instance ID. This parameter is not applicable to cloud desktop scenarios. In workstation scenarios, you must specify the persistent session ID to locate a specific instance.</p>
         * 
         * <strong>example:</strong>
         * <p>p-0cc7s3n1l*****</p>
         */
        public Builder subInstanceId(String subInstanceId) {
            this.putBodyParameter("SubInstanceId", subInstanceId);
            this.subInstanceId = subInstanceId;
            return this;
        }

        /**
         * <p>The size of the system cloud disk. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putBodyParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * <p>The ID of the image version. This parameter is not exposed.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-bp1example****</p>
         */
        public Builder versionId(String versionId) {
            this.putBodyParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public StartTaskForCreateImageRequest build() {
            return new StartTaskForCreateImageRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartTaskForCreateImageRequest} extends {@link TeaModel}
     *
     * <p>StartTaskForCreateImageRequest</p>
     */
    public static class ResourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private ResourceList(Builder builder) {
            this.resource = builder.resource;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceList create() {
            return builder().build();
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String resource; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(ResourceList model) {
                this.resource = model.resource;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The resource information.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/apps/business/setup.exe">https://example.com/apps/business/setup.exe</a></p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ResourceList build() {
                return new ResourceList(this);
            } 

        } 

    }
}
