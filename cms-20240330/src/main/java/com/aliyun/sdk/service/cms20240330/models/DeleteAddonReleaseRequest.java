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
 * {@link DeleteAddonReleaseRequest} extends {@link RequestModel}
 *
 * <p>DeleteAddonReleaseRequest</p>
 */
public class DeleteAddonReleaseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("policyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("addonName")
    private String addonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("releaseName")
    private String releaseName;

    private DeleteAddonReleaseRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.addonName = builder.addonName;
        this.force = builder.force;
        this.releaseName = builder.releaseName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAddonReleaseRequest create() {
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
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return releaseName
     */
    public String getReleaseName() {
        return this.releaseName;
    }

    public static final class Builder extends Request.Builder<DeleteAddonReleaseRequest, Builder> {
        private String policyId; 
        private String addonName; 
        private Boolean force; 
        private String releaseName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAddonReleaseRequest request) {
            super(request);
            this.policyId = request.policyId;
            this.addonName = request.addonName;
            this.force = request.force;
            this.releaseName = request.releaseName;
        } 

        /**
         * <p>Environment ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-xxxxxxxxxxxxx</p>
         */
        public Builder policyId(String policyId) {
            this.putPathParameter("policyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>Addon name. When AddonName is provided, it will ignore the ReleaseName parameter and batch uninstall all AddonReleases belonging to the same Addon.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-gpu</p>
         */
        public Builder addonName(String addonName) {
            this.putQueryParameter("addonName", addonName);
            this.addonName = addonName;
            return this;
        }

        /**
         * <p>Whether to force deletion, default is false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("force", force);
            this.force = force;
            return this;
        }

        /**
         * <p>The name of the AddonRelease.</p>
         * 
         * <strong>example:</strong>
         * <p>test-gpu-integration-name</p>
         */
        public Builder releaseName(String releaseName) {
            this.putQueryParameter("releaseName", releaseName);
            this.releaseName = releaseName;
            return this;
        }

        @Override
        public DeleteAddonReleaseRequest build() {
            return new DeleteAddonReleaseRequest(this);
        } 

    } 

}
