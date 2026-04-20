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
 * {@link RebootDesktopsRequest} extends {@link RequestModel}
 *
 * <p>RebootDesktopsRequest</p>
 */
public class RebootDesktopsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateSnapshot")
    private Boolean createSnapshot;

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

    private RebootDesktopsRequest(Builder builder) {
        super(builder);
        this.createSnapshot = builder.createSnapshot;
        this.desktopId = builder.desktopId;
        this.osUpdate = builder.osUpdate;
        this.patchId = builder.patchId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebootDesktopsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createSnapshot
     */
    public Boolean getCreateSnapshot() {
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

    public static final class Builder extends Request.Builder<RebootDesktopsRequest, Builder> {
        private Boolean createSnapshot; 
        private java.util.List<String> desktopId; 
        private Boolean osUpdate; 
        private String patchId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RebootDesktopsRequest request) {
            super(request);
            this.createSnapshot = request.createSnapshot;
            this.desktopId = request.desktopId;
            this.osUpdate = request.osUpdate;
            this.patchId = request.patchId;
            this.regionId = request.regionId;
        } 

        /**
         * CreateSnapshot.
         */
        public Builder createSnapshot(Boolean createSnapshot) {
            this.putQueryParameter("CreateSnapshot", createSnapshot);
            this.createSnapshot = createSnapshot;
            return this;
        }

        /**
         * <p>The IDs of the cloud computers. You can specify 1 to 100 IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-gx2x1dhsmucyy****</p>
         */
        public Builder desktopId(java.util.List<String> desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * OsUpdate.
         */
        public Builder osUpdate(Boolean osUpdate) {
            this.putQueryParameter("OsUpdate", osUpdate);
            this.osUpdate = osUpdate;
            return this;
        }

        /**
         * PatchId.
         */
        public Builder patchId(String patchId) {
            this.putQueryParameter("PatchId", patchId);
            this.patchId = patchId;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

        @Override
        public RebootDesktopsRequest build() {
            return new RebootDesktopsRequest(this);
        } 

    } 

}
