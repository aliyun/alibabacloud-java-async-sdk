// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link UpgradePolarClawSkillsRequest} extends {@link RequestModel}
 *
 * <p>UpgradePolarClawSkillsRequest</p>
 */
public class UpgradePolarClawSkillsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationType")
    private String applicationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeMethod")
    private String upgradeMethod;

    private UpgradePolarClawSkillsRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.applicationType = builder.applicationType;
        this.regionId = builder.regionId;
        this.upgradeMethod = builder.upgradeMethod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradePolarClawSkillsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return applicationType
     */
    public String getApplicationType() {
        return this.applicationType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return upgradeMethod
     */
    public String getUpgradeMethod() {
        return this.upgradeMethod;
    }

    public static final class Builder extends Request.Builder<UpgradePolarClawSkillsRequest, Builder> {
        private String applicationId; 
        private String applicationType; 
        private String regionId; 
        private String upgradeMethod; 

        private Builder() {
            super();
        } 

        private Builder(UpgradePolarClawSkillsRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.applicationType = request.applicationType;
            this.regionId = request.regionId;
            this.upgradeMethod = request.upgradeMethod;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * ApplicationType.
         */
        public Builder applicationType(String applicationType) {
            this.putQueryParameter("ApplicationType", applicationType);
            this.applicationType = applicationType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * UpgradeMethod.
         */
        public Builder upgradeMethod(String upgradeMethod) {
            this.putQueryParameter("UpgradeMethod", upgradeMethod);
            this.upgradeMethod = upgradeMethod;
            return this;
        }

        @Override
        public UpgradePolarClawSkillsRequest build() {
            return new UpgradePolarClawSkillsRequest(this);
        } 

    } 

}
