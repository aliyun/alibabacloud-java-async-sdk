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
 * {@link ResetSnapshotRequest} extends {@link RequestModel}
 *
 * <p>ResetSnapshotRequest</p>
 */
public class ResetSnapshotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String snapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StopDesktop")
    private Boolean stopDesktop;

    private ResetSnapshotRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.snapshotId = builder.snapshotId;
        this.stopDesktop = builder.stopDesktop;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetSnapshotRequest create() {
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
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return stopDesktop
     */
    public Boolean getStopDesktop() {
        return this.stopDesktop;
    }

    public static final class Builder extends Request.Builder<ResetSnapshotRequest, Builder> {
        private String regionId; 
        private String snapshotId; 
        private Boolean stopDesktop; 

        private Builder() {
            super();
        } 

        private Builder(ResetSnapshotRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.snapshotId = request.snapshotId;
            this.stopDesktop = request.stopDesktop;
        } 

        /**
         * <p>The ID of the region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hzngahou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the snapshot.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>s-2zeipxmnhej803x7****</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * StopDesktop.
         */
        public Builder stopDesktop(Boolean stopDesktop) {
            this.putQueryParameter("StopDesktop", stopDesktop);
            this.stopDesktop = stopDesktop;
            return this;
        }

        @Override
        public ResetSnapshotRequest build() {
            return new ResetSnapshotRequest(this);
        } 

    } 

}
