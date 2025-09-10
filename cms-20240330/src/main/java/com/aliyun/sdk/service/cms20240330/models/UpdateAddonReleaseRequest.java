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
 * {@link UpdateAddonReleaseRequest} extends {@link RequestModel}
 *
 * <p>UpdateAddonReleaseRequest</p>
 */
public class UpdateAddonReleaseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("releaseName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String releaseName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("policyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("addonVersion")
    private String addonVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("entityRules")
    private EntityDiscoverRule entityRules;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("values")
    private String values;

    private UpdateAddonReleaseRequest(Builder builder) {
        super(builder);
        this.releaseName = builder.releaseName;
        this.policyId = builder.policyId;
        this.addonVersion = builder.addonVersion;
        this.dryRun = builder.dryRun;
        this.entityRules = builder.entityRules;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAddonReleaseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return releaseName
     */
    public String getReleaseName() {
        return this.releaseName;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return addonVersion
     */
    public String getAddonVersion() {
        return this.addonVersion;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return entityRules
     */
    public EntityDiscoverRule getEntityRules() {
        return this.entityRules;
    }

    /**
     * @return values
     */
    public String getValues() {
        return this.values;
    }

    public static final class Builder extends Request.Builder<UpdateAddonReleaseRequest, Builder> {
        private String releaseName; 
        private String policyId; 
        private String addonVersion; 
        private Boolean dryRun; 
        private EntityDiscoverRule entityRules; 
        private String values; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAddonReleaseRequest request) {
            super(request);
            this.releaseName = request.releaseName;
            this.policyId = request.policyId;
            this.addonVersion = request.addonVersion;
            this.dryRun = request.dryRun;
            this.entityRules = request.entityRules;
            this.values = request.values;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-gpu-integration-name</p>
         */
        public Builder releaseName(String releaseName) {
            this.putPathParameter("releaseName", releaseName);
            this.releaseName = releaseName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-xxxxxxxxxxxx</p>
         */
        public Builder policyId(String policyId) {
            this.putPathParameter("policyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * addonVersion.
         */
        public Builder addonVersion(String addonVersion) {
            this.putBodyParameter("addonVersion", addonVersion);
            this.addonVersion = addonVersion;
            return this;
        }

        /**
         * dryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * entityRules.
         */
        public Builder entityRules(EntityDiscoverRule entityRules) {
            this.putBodyParameter("entityRules", entityRules);
            this.entityRules = entityRules;
            return this;
        }

        /**
         * values.
         */
        public Builder values(String values) {
            this.putBodyParameter("values", values);
            this.values = values;
            return this;
        }

        @Override
        public UpdateAddonReleaseRequest build() {
            return new UpdateAddonReleaseRequest(this);
        } 

    } 

}
