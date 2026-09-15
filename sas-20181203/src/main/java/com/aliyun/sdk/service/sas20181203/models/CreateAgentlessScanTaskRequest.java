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
 * {@link CreateAgentlessScanTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateAgentlessScanTaskRequest</p>
 */
public class CreateAgentlessScanTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetSelectionType")
    private String assetSelectionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoDeleteDays")
    private Integer autoDeleteDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReleaseAfterScan")
    private Boolean releaseAfterScan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
    private String resourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanDataDisk")
    private Boolean scanDataDisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Targets")
    private java.util.List<Targets> targets;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
    private java.util.List<String> uuidList;

    private CreateAgentlessScanTaskRequest(Builder builder) {
        super(builder);
        this.assetSelectionType = builder.assetSelectionType;
        this.autoDeleteDays = builder.autoDeleteDays;
        this.clientToken = builder.clientToken;
        this.from = builder.from;
        this.regionId = builder.regionId;
        this.releaseAfterScan = builder.releaseAfterScan;
        this.resourceRegionId = builder.resourceRegionId;
        this.scanDataDisk = builder.scanDataDisk;
        this.targetType = builder.targetType;
        this.targets = builder.targets;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentlessScanTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetSelectionType
     */
    public String getAssetSelectionType() {
        return this.assetSelectionType;
    }

    /**
     * @return autoDeleteDays
     */
    public Integer getAutoDeleteDays() {
        return this.autoDeleteDays;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return releaseAfterScan
     */
    public Boolean getReleaseAfterScan() {
        return this.releaseAfterScan;
    }

    /**
     * @return resourceRegionId
     */
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    /**
     * @return scanDataDisk
     */
    public Boolean getScanDataDisk() {
        return this.scanDataDisk;
    }

    /**
     * @return targetType
     */
    public Integer getTargetType() {
        return this.targetType;
    }

    /**
     * @return targets
     */
    public java.util.List<Targets> getTargets() {
        return this.targets;
    }

    /**
     * @return uuidList
     */
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<CreateAgentlessScanTaskRequest, Builder> {
        private String assetSelectionType; 
        private Integer autoDeleteDays; 
        private String clientToken; 
        private String from; 
        private String regionId; 
        private Boolean releaseAfterScan; 
        private String resourceRegionId; 
        private Boolean scanDataDisk; 
        private Integer targetType; 
        private java.util.List<Targets> targets; 
        private java.util.List<String> uuidList; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgentlessScanTaskRequest request) {
            super(request);
            this.assetSelectionType = request.assetSelectionType;
            this.autoDeleteDays = request.autoDeleteDays;
            this.clientToken = request.clientToken;
            this.from = request.from;
            this.regionId = request.regionId;
            this.releaseAfterScan = request.releaseAfterScan;
            this.resourceRegionId = request.resourceRegionId;
            this.scanDataDisk = request.scanDataDisk;
            this.targetType = request.targetType;
            this.targets = request.targets;
            this.uuidList = request.uuidList;
        } 

        /**
         * <p>The asset selection identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENTLESS_SCAN_ONCE_TASK_1720145******</p>
         */
        public Builder assetSelectionType(String assetSelectionType) {
            this.putQueryParameter("AssetSelectionType", assetSelectionType);
            this.assetSelectionType = assetSelectionType;
            return this;
        }

        /**
         * <p>The image retention period, in days. This parameter takes effect only for host detection. It does not take effect for user snapshot detection or user custom image detection.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoDeleteDays(Integer autoDeleteDays) {
            this.putQueryParameter("AutoDeleteDays", autoDeleteDays);
            this.autoDeleteDays = autoDeleteDays;
            return this;
        }

        /**
         * <p>The idempotency key.</p>
         * 
         * <strong>example:</strong>
         * <p>66a9c708-d4a4-4fe</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The source of the API call, which is used to collect statistics on scan task volume and scan data volume by source. If this parameter is not specified, the value is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>image-console</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The region ID, which is usually automatically populated by the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the cost-saving mode. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder releaseAfterScan(Boolean releaseAfterScan) {
            this.putQueryParameter("ReleaseAfterScan", releaseAfterScan);
            this.releaseAfterScan = releaseAfterScan;
            return this;
        }

        /**
         * <p>The region ID of the resource to be detected, such as cn-hangzhou.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder resourceRegionId(String resourceRegionId) {
            this.putQueryParameter("ResourceRegionId", resourceRegionId);
            this.resourceRegionId = resourceRegionId;
            return this;
        }

        /**
         * <p>Specifies whether to detect data cloud disks. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Detected.</li>
         * <li><strong>false</strong>: Not detected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder scanDataDisk(Boolean scanDataDisk) {
            this.putQueryParameter("ScanDataDisk", scanDataDisk);
            this.scanDataDisk = scanDataDisk;
            return this;
        }

        /**
         * <p>The target type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Host detection - detection by snapshot.</li>
         * <li><strong>2</strong>: Host detection - detection by image.</li>
         * <li><strong>3</strong>: User snapshot detection.</li>
         * <li><strong>2</strong>: User custom image detection.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder targetType(Integer targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The list of targets for image security remediation. Each target specifies the source image, the region, the name of the remediated image, and the vulnerability identifiers to be fixed.</p>
         */
        public Builder targets(java.util.List<Targets> targets) {
            this.putQueryParameter("Targets", targets);
            this.targets = targets;
            return this;
        }

        /**
         * <p>The UUIDs of the assets to be detected.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain the UUIDs of servers.</p>
         * </blockquote>
         */
        public Builder uuidList(java.util.List<String> uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public CreateAgentlessScanTaskRequest build() {
            return new CreateAgentlessScanTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAgentlessScanTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentlessScanTaskRequest</p>
     */
    public static class Targets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("OriginImageName")
        private String originImageName;

        @com.aliyun.core.annotation.NameInMap("OutputImageName")
        private String outputImageName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("VulnerabilityIds")
        private java.util.List<String> vulnerabilityIds;

        private Targets(Builder builder) {
            this.imageId = builder.imageId;
            this.originImageName = builder.originImageName;
            this.outputImageName = builder.outputImageName;
            this.regionId = builder.regionId;
            this.vulnerabilityIds = builder.vulnerabilityIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Targets create() {
            return builder().build();
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return originImageName
         */
        public String getOriginImageName() {
            return this.originImageName;
        }

        /**
         * @return outputImageName
         */
        public String getOutputImageName() {
            return this.outputImageName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vulnerabilityIds
         */
        public java.util.List<String> getVulnerabilityIds() {
            return this.vulnerabilityIds;
        }

        public static final class Builder {
            private String imageId; 
            private String originImageName; 
            private String outputImageName; 
            private String regionId; 
            private java.util.List<String> vulnerabilityIds; 

            private Builder() {
            } 

            private Builder(Targets model) {
                this.imageId = model.imageId;
                this.originImageName = model.originImageName;
                this.outputImageName = model.outputImageName;
                this.regionId = model.regionId;
                this.vulnerabilityIds = model.vulnerabilityIds;
            } 

            /**
             * <p>The ID of the source ECS custom image to be remediated. The image must be located in the region specified by RegionId of this target.</p>
             * 
             * <strong>example:</strong>
             * <p>m-bp1example123456789</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The name of the source ECS custom image to be remediated.</p>
             * 
             * <strong>example:</strong>
             * <p>source-image</p>
             */
            public Builder originImageName(String originImageName) {
                this.originImageName = originImageName;
                return this;
            }

            /**
             * <p>The name of the ECS image generated after remediation.</p>
             * 
             * <strong>example:</strong>
             * <p>patched-image-20260909</p>
             */
            public Builder outputImageName(String outputImageName) {
                this.outputImageName = outputImageName;
                return this;
            }

            /**
             * <p>The region ID of the source image to be remediated, such as cn-hangzhou.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The list of vulnerability identifiers to be fixed. At least one vulnerability identifier must be specified, and each identifier must be unique and non-empty.</p>
             */
            public Builder vulnerabilityIds(java.util.List<String> vulnerabilityIds) {
                this.vulnerabilityIds = vulnerabilityIds;
                return this;
            }

            public Targets build() {
                return new Targets(this);
            } 

        } 

    }
}
