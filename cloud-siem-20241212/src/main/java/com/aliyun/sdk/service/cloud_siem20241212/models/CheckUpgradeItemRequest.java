// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link CheckUpgradeItemRequest} extends {@link RequestModel}
 *
 * <p>CheckUpgradeItemRequest</p>
 */
public class CheckUpgradeItemRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private String roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpgradeItemId")
    private String upgradeItemId;

    private CheckUpgradeItemRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.upgradeItemId = builder.upgradeItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckUpgradeItemRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public String getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return upgradeItemId
     */
    public String getUpgradeItemId() {
        return this.upgradeItemId;
    }

    public static final class Builder extends Request.Builder<CheckUpgradeItemRequest, Builder> {
        private String lang; 
        private String regionId; 
        private String roleFor; 
        private String upgradeItemId; 

        private Builder() {
            super();
        } 

        private Builder(CheckUpgradeItemRequest request) {
            super(request);
            this.lang = request.lang;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.upgradeItemId = request.upgradeItemId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(String roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * UpgradeItemId.
         */
        public Builder upgradeItemId(String upgradeItemId) {
            this.putBodyParameter("UpgradeItemId", upgradeItemId);
            this.upgradeItemId = upgradeItemId;
            return this;
        }

        @Override
        public CheckUpgradeItemRequest build() {
            return new CheckUpgradeItemRequest(this);
        } 

    } 

}
