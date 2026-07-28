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
 * {@link UpgradeApplicationVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeApplicationVersionRequest</p>
 */
public class UpgradeApplicationVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradePolicy")
    private String upgradePolicy;

    private UpgradeApplicationVersionRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.upgradePolicy = builder.upgradePolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeApplicationVersionRequest create() {
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
     * @return upgradePolicy
     */
    public String getUpgradePolicy() {
        return this.upgradePolicy;
    }

    public static final class Builder extends Request.Builder<UpgradeApplicationVersionRequest, Builder> {
        private String applicationId; 
        private String upgradePolicy; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeApplicationVersionRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.upgradePolicy = request.upgradePolicy;
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
         * UpgradePolicy.
         */
        public Builder upgradePolicy(String upgradePolicy) {
            this.putQueryParameter("UpgradePolicy", upgradePolicy);
            this.upgradePolicy = upgradePolicy;
            return this;
        }

        @Override
        public UpgradeApplicationVersionRequest build() {
            return new UpgradeApplicationVersionRequest(this);
        } 

    } 

}
