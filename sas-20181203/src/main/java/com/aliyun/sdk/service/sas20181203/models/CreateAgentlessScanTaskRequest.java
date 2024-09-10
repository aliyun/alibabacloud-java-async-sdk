// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    @com.aliyun.core.annotation.NameInMap("ReleaseAfterScan")
    private Boolean releaseAfterScan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanDataDisk")
    private Boolean scanDataDisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
    private java.util.List < String > uuidList;

    private CreateAgentlessScanTaskRequest(Builder builder) {
        super(builder);
        this.assetSelectionType = builder.assetSelectionType;
        this.autoDeleteDays = builder.autoDeleteDays;
        this.releaseAfterScan = builder.releaseAfterScan;
        this.scanDataDisk = builder.scanDataDisk;
        this.targetType = builder.targetType;
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
     * @return releaseAfterScan
     */
    public Boolean getReleaseAfterScan() {
        return this.releaseAfterScan;
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
     * @return uuidList
     */
    public java.util.List < String > getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<CreateAgentlessScanTaskRequest, Builder> {
        private String assetSelectionType; 
        private Integer autoDeleteDays; 
        private Boolean releaseAfterScan; 
        private Boolean scanDataDisk; 
        private Integer targetType; 
        private java.util.List < String > uuidList; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgentlessScanTaskRequest request) {
            super(request);
            this.assetSelectionType = request.assetSelectionType;
            this.autoDeleteDays = request.autoDeleteDays;
            this.releaseAfterScan = request.releaseAfterScan;
            this.scanDataDisk = request.scanDataDisk;
            this.targetType = request.targetType;
            this.uuidList = request.uuidList;
        } 

        /**
         * Identification of asset selection.
         */
        public Builder assetSelectionType(String assetSelectionType) {
            this.putQueryParameter("AssetSelectionType", assetSelectionType);
            this.assetSelectionType = assetSelectionType;
            return this;
        }

        /**
         * The retention period of images. Unit: days.
         */
        public Builder autoDeleteDays(Integer autoDeleteDays) {
            this.putQueryParameter("AutoDeleteDays", autoDeleteDays);
            this.autoDeleteDays = autoDeleteDays;
            return this;
        }

        /**
         * Specifies whether to enable the cost-saving mode. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder releaseAfterScan(Boolean releaseAfterScan) {
            this.putQueryParameter("ReleaseAfterScan", releaseAfterScan);
            this.releaseAfterScan = releaseAfterScan;
            return this;
        }

        /**
         * Specifies whether to check data disks. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder scanDataDisk(Boolean scanDataDisk) {
            this.putQueryParameter("ScanDataDisk", scanDataDisk);
            this.scanDataDisk = scanDataDisk;
            return this;
        }

        /**
         * The type of the detection object. Valid values:
         * <p>
         * 
         * *   **2**: image
         */
        public Builder targetType(Integer targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * The UUIDs of the assets on which you want to run the detection task.
         * <p>
         * 
         * >  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
         */
        public Builder uuidList(java.util.List < String > uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public CreateAgentlessScanTaskRequest build() {
            return new CreateAgentlessScanTaskRequest(this);
        } 

    } 

}
