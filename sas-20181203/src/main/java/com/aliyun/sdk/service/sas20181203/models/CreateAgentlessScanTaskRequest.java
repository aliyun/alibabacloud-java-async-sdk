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
    private java.util.List<String> uuidList;

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
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<CreateAgentlessScanTaskRequest, Builder> {
        private String assetSelectionType; 
        private Integer autoDeleteDays; 
        private Boolean releaseAfterScan; 
        private Boolean scanDataDisk; 
        private Integer targetType; 
        private java.util.List<String> uuidList; 

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
         * <p>Identification of asset selection.</p>
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
         * <p>The retention period of images. Unit: days.</p>
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
         * <p>Specifies whether to enable the cost-saving mode. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>Specifies whether to check data disks. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>The type of the detection object. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: image</li>
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
         * <p>The UUIDs of the assets on which you want to run the detection task.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
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

}
