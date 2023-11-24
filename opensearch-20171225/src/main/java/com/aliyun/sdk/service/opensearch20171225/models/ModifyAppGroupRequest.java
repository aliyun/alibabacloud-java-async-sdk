// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAppGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyAppGroupRequest</p>
 */
public class ModifyAppGroupRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Body
    @NameInMap("currentVersion")
    private String currentVersion;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("domain")
    private String domain;

    @Body
    @NameInMap("resourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("dryRun")
    private Boolean dryRun;

    private ModifyAppGroupRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.currentVersion = builder.currentVersion;
        this.description = builder.description;
        this.domain = builder.domain;
        this.resourceGroupId = builder.resourceGroupId;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAppGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return currentVersion
     */
    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<ModifyAppGroupRequest, Builder> {
        private String appGroupIdentity; 
        private String currentVersion; 
        private String description; 
        private String domain; 
        private String resourceGroupId; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAppGroupRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.currentVersion = request.currentVersion;
            this.description = request.description;
            this.domain = request.domain;
            this.resourceGroupId = request.resourceGroupId;
            this.dryRun = request.dryRun;
        } 

        /**
         * The name of the application.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * The online version of the application.
         */
        public Builder currentVersion(String currentVersion) {
            this.putBodyParameter("currentVersion", currentVersion);
            this.currentVersion = currentVersion;
            return this;
        }

        /**
         * The description of the application.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * The type of the industry. Valid values:
         * <p>
         * 
         * *   general: general.
         * *   ecommerce: e-commerce.
         * *   education: education.
         * *   esports: electronic sports.
         * *   community: content community.
         */
        public Builder domain(String domain) {
            this.putBodyParameter("domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Specifies whether to verify the application before modification. Valid values: true and false.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public ModifyAppGroupRequest build() {
            return new ModifyAppGroupRequest(this);
        } 

    } 

}
