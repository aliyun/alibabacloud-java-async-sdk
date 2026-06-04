// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link RollbackAppCodeSnapshotRequest} extends {@link RequestModel}
 *
 * <p>RollbackAppCodeSnapshotRequest</p>
 */
public class RollbackAppCodeSnapshotRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private String siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetLogicalNumber")
    private Integer targetLogicalNumber;

    private RollbackAppCodeSnapshotRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.siteId = builder.siteId;
        this.targetLogicalNumber = builder.targetLogicalNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackAppCodeSnapshotRequest create() {
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
     * @return siteId
     */
    public String getSiteId() {
        return this.siteId;
    }

    /**
     * @return targetLogicalNumber
     */
    public Integer getTargetLogicalNumber() {
        return this.targetLogicalNumber;
    }

    public static final class Builder extends Request.Builder<RollbackAppCodeSnapshotRequest, Builder> {
        private String regionId; 
        private String siteId; 
        private Integer targetLogicalNumber; 

        private Builder() {
            super();
        } 

        private Builder(RollbackAppCodeSnapshotRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.siteId = request.siteId;
            this.targetLogicalNumber = request.targetLogicalNumber;
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
         * SiteId.
         */
        public Builder siteId(String siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * TargetLogicalNumber.
         */
        public Builder targetLogicalNumber(Integer targetLogicalNumber) {
            this.putQueryParameter("TargetLogicalNumber", targetLogicalNumber);
            this.targetLogicalNumber = targetLogicalNumber;
            return this;
        }

        @Override
        public RollbackAppCodeSnapshotRequest build() {
            return new RollbackAppCodeSnapshotRequest(this);
        } 

    } 

}
