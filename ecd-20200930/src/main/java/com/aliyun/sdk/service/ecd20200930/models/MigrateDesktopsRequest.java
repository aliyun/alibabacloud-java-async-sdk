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
 * {@link MigrateDesktopsRequest} extends {@link RequestModel}
 *
 * <p>MigrateDesktopsRequest</p>
 */
public class MigrateDesktopsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetMemberIp")
    private String targetMemberIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetOfficeSiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetOfficeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetSubnetId")
    private String targetSubnetId;

    private MigrateDesktopsRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.regionId = builder.regionId;
        this.targetMemberIp = builder.targetMemberIp;
        this.targetOfficeSiteId = builder.targetOfficeSiteId;
        this.targetSubnetId = builder.targetSubnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateDesktopsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return targetMemberIp
     */
    public String getTargetMemberIp() {
        return this.targetMemberIp;
    }

    /**
     * @return targetOfficeSiteId
     */
    public String getTargetOfficeSiteId() {
        return this.targetOfficeSiteId;
    }

    /**
     * @return targetSubnetId
     */
    public String getTargetSubnetId() {
        return this.targetSubnetId;
    }

    public static final class Builder extends Request.Builder<MigrateDesktopsRequest, Builder> {
        private java.util.List<String> desktopId; 
        private String regionId; 
        private String targetMemberIp; 
        private String targetOfficeSiteId; 
        private String targetSubnetId; 

        private Builder() {
            super();
        } 

        private Builder(MigrateDesktopsRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.regionId = request.regionId;
            this.targetMemberIp = request.targetMemberIp;
            this.targetOfficeSiteId = request.targetOfficeSiteId;
            this.targetSubnetId = request.targetSubnetId;
        } 

        /**
         * <p>The IDs of the cloud computers. You can specify 1 to 100 IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder desktopId(java.util.List<String> desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
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
         * TargetMemberIp.
         */
        public Builder targetMemberIp(String targetMemberIp) {
            this.putQueryParameter("TargetMemberIp", targetMemberIp);
            this.targetMemberIp = targetMemberIp;
            return this;
        }

        /**
         * <p>The ID of the destination office network.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen+dir-388505****</p>
         */
        public Builder targetOfficeSiteId(String targetOfficeSiteId) {
            this.putQueryParameter("TargetOfficeSiteId", targetOfficeSiteId);
            this.targetOfficeSiteId = targetOfficeSiteId;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is for internal use only.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder targetSubnetId(String targetSubnetId) {
            this.putQueryParameter("TargetSubnetId", targetSubnetId);
            this.targetSubnetId = targetSubnetId;
            return this;
        }

        @Override
        public MigrateDesktopsRequest build() {
            return new MigrateDesktopsRequest(this);
        } 

    } 

}
