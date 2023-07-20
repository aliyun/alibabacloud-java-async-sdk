// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAgentlessScanTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateAgentlessScanTaskRequest</p>
 */
public class CreateAgentlessScanTaskRequest extends Request {
    @Query
    @NameInMap("AutoDeleteDays")
    private Integer autoDeleteDays;

    @Query
    @NameInMap("ReleaseAfterScan")
    private Boolean releaseAfterScan;

    @Query
    @NameInMap("ScanDataDisk")
    private Boolean scanDataDisk;

    @Query
    @NameInMap("TargetType")
    private Integer targetType;

    @Query
    @NameInMap("UuidList")
    @Validation(required = true)
    private java.util.List < String > uuidList;

    private CreateAgentlessScanTaskRequest(Builder builder) {
        super(builder);
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
            this.autoDeleteDays = request.autoDeleteDays;
            this.releaseAfterScan = request.releaseAfterScan;
            this.scanDataDisk = request.scanDataDisk;
            this.targetType = request.targetType;
            this.uuidList = request.uuidList;
        } 

        /**
         * AutoDeleteDays.
         */
        public Builder autoDeleteDays(Integer autoDeleteDays) {
            this.putQueryParameter("AutoDeleteDays", autoDeleteDays);
            this.autoDeleteDays = autoDeleteDays;
            return this;
        }

        /**
         * ReleaseAfterScan.
         */
        public Builder releaseAfterScan(Boolean releaseAfterScan) {
            this.putQueryParameter("ReleaseAfterScan", releaseAfterScan);
            this.releaseAfterScan = releaseAfterScan;
            return this;
        }

        /**
         * ScanDataDisk.
         */
        public Builder scanDataDisk(Boolean scanDataDisk) {
            this.putQueryParameter("ScanDataDisk", scanDataDisk);
            this.scanDataDisk = scanDataDisk;
            return this;
        }

        /**
         * TargetType.
         */
        public Builder targetType(Integer targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * UuidList.
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
