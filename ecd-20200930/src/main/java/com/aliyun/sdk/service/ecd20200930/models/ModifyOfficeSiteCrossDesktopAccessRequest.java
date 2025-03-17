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
 * {@link ModifyOfficeSiteCrossDesktopAccessRequest} extends {@link RequestModel}
 *
 * <p>ModifyOfficeSiteCrossDesktopAccessRequest</p>
 */
public class ModifyOfficeSiteCrossDesktopAccessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableCrossDesktopAccess")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableCrossDesktopAccess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyOfficeSiteCrossDesktopAccessRequest(Builder builder) {
        super(builder);
        this.enableCrossDesktopAccess = builder.enableCrossDesktopAccess;
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOfficeSiteCrossDesktopAccessRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableCrossDesktopAccess
     */
    public Boolean getEnableCrossDesktopAccess() {
        return this.enableCrossDesktopAccess;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyOfficeSiteCrossDesktopAccessRequest, Builder> {
        private Boolean enableCrossDesktopAccess; 
        private String officeSiteId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOfficeSiteCrossDesktopAccessRequest request) {
            super(request);
            this.enableCrossDesktopAccess = request.enableCrossDesktopAccess;
            this.officeSiteId = request.officeSiteId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Specifies whether to enable the communication between cloud computers in an office network. If you enable the communication between cloud computers in an office network, the cloud computers can access each other.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableCrossDesktopAccess(Boolean enableCrossDesktopAccess) {
            this.putQueryParameter("EnableCrossDesktopAccess", enableCrossDesktopAccess);
            this.enableCrossDesktopAccess = enableCrossDesktopAccess;
            return this;
        }

        /**
         * <p>The office network ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-068266****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
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
        public ModifyOfficeSiteCrossDesktopAccessRequest build() {
            return new ModifyOfficeSiteCrossDesktopAccessRequest(this);
        } 

    } 

}
