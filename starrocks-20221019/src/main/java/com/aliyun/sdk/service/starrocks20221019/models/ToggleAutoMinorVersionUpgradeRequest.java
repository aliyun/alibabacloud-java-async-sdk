// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link ToggleAutoMinorVersionUpgradeRequest} extends {@link RequestModel}
 *
 * <p>ToggleAutoMinorVersionUpgradeRequest</p>
 */
public class ToggleAutoMinorVersionUpgradeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoUpgrade")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean autoUpgrade;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private ToggleAutoMinorVersionUpgradeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoUpgrade = builder.autoUpgrade;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ToggleAutoMinorVersionUpgradeRequest create() {
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
     * @return autoUpgrade
     */
    public Boolean getAutoUpgrade() {
        return this.autoUpgrade;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ToggleAutoMinorVersionUpgradeRequest, Builder> {
        private String regionId; 
        private Boolean autoUpgrade; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ToggleAutoMinorVersionUpgradeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoUpgrade = request.autoUpgrade;
            this.instanceId = request.instanceId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoUpgrade(Boolean autoUpgrade) {
            this.putQueryParameter("AutoUpgrade", autoUpgrade);
            this.autoUpgrade = autoUpgrade;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b25e21e24388****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ToggleAutoMinorVersionUpgradeRequest build() {
            return new ToggleAutoMinorVersionUpgradeRequest(this);
        } 

    } 

}
