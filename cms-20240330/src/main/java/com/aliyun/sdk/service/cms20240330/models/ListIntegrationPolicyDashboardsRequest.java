// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListIntegrationPolicyDashboardsRequest} extends {@link RequestModel}
 *
 * <p>ListIntegrationPolicyDashboardsRequest</p>
 */
public class ListIntegrationPolicyDashboardsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("policyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("addonName")
    private String addonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scene")
    private String scene;

    private ListIntegrationPolicyDashboardsRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.addonName = builder.addonName;
        this.scene = builder.scene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntegrationPolicyDashboardsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return addonName
     */
    public String getAddonName() {
        return this.addonName;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    public static final class Builder extends Request.Builder<ListIntegrationPolicyDashboardsRequest, Builder> {
        private String policyId; 
        private String addonName; 
        private String scene; 

        private Builder() {
            super();
        } 

        private Builder(ListIntegrationPolicyDashboardsRequest request) {
            super(request);
            this.policyId = request.policyId;
            this.addonName = request.addonName;
            this.scene = request.scene;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-ac38a7cb02d14ff48bc9f97d0a75063e</p>
         */
        public Builder policyId(String policyId) {
            this.putPathParameter("policyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * addonName.
         */
        public Builder addonName(String addonName) {
            this.putQueryParameter("addonName", addonName);
            this.addonName = addonName;
            return this;
        }

        /**
         * scene.
         */
        public Builder scene(String scene) {
            this.putQueryParameter("scene", scene);
            this.scene = scene;
            return this;
        }

        @Override
        public ListIntegrationPolicyDashboardsRequest build() {
            return new ListIntegrationPolicyDashboardsRequest(this);
        } 

    } 

}
