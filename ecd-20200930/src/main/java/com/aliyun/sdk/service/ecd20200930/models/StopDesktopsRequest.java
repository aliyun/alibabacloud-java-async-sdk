// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link StopDesktopsRequest} extends {@link RequestModel}
 *
 * <p>StopDesktopsRequest</p>
 */
public class StopDesktopsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateSnapshot")
    private String createSnapshot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsUpdate")
    private Boolean osUpdate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PatchId")
    private String patchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StoppedMode")
    private String stoppedMode;

    private StopDesktopsRequest(Builder builder) {
        super(builder);
        this.createSnapshot = builder.createSnapshot;
        this.desktopId = builder.desktopId;
        this.osUpdate = builder.osUpdate;
        this.patchId = builder.patchId;
        this.regionId = builder.regionId;
        this.stoppedMode = builder.stoppedMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopDesktopsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createSnapshot
     */
    public String getCreateSnapshot() {
        return this.createSnapshot;
    }

    /**
     * @return desktopId
     */
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return osUpdate
     */
    public Boolean getOsUpdate() {
        return this.osUpdate;
    }

    /**
     * @return patchId
     */
    public String getPatchId() {
        return this.patchId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stoppedMode
     */
    public String getStoppedMode() {
        return this.stoppedMode;
    }

    public static final class Builder extends Request.Builder<StopDesktopsRequest, Builder> {
        private String createSnapshot; 
        private java.util.List<String> desktopId; 
        private Boolean osUpdate; 
        private String patchId; 
        private String regionId; 
        private String stoppedMode; 

        private Builder() {
            super();
        } 

        private Builder(StopDesktopsRequest request) {
            super(request);
            this.createSnapshot = request.createSnapshot;
            this.desktopId = request.desktopId;
            this.osUpdate = request.osUpdate;
            this.patchId = request.patchId;
            this.regionId = request.regionId;
            this.stoppedMode = request.stoppedMode;
        } 

        /**
         * <p>Specifies whether to create a snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder createSnapshot(String createSnapshot) {
            this.putQueryParameter("CreateSnapshot", createSnapshot);
            this.createSnapshot = createSnapshot;
            return this;
        }

        /**
         * <p>The cloud computer IDs. You can specify 1 to 100 IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-7w78ozhjcwa3u****</p>
         */
        public Builder desktopId(java.util.List<String> desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>Specifies whether to perform a patch update when an update is ready. A value of true indicates that the patch update is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder osUpdate(Boolean osUpdate) {
            this.putQueryParameter("OsUpdate", osUpdate);
            this.osUpdate = osUpdate;
            return this;
        }

        /**
         * <p>The patch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>KB5082063</p>
         */
        public Builder patchId(String patchId) {
            this.putQueryParameter("PatchId", patchId);
            this.patchId = patchId;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The billing mode after the cloud computers are stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>StopCharging</p>
         */
        public Builder stoppedMode(String stoppedMode) {
            this.putQueryParameter("StoppedMode", stoppedMode);
            this.stoppedMode = stoppedMode;
            return this;
        }

        @Override
        public StopDesktopsRequest build() {
            return new StopDesktopsRequest(this);
        } 

    } 

}
