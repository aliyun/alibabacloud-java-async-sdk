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
 * {@link CreateAddonReleaseRequest} extends {@link RequestModel}
 *
 * <p>CreateAddonReleaseRequest</p>
 */
public class CreateAddonReleaseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("policyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("addonName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addonName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("aliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("entityRules")
    private EntityDiscoverRule entityRules;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("envType")
    private String envType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parentAddonReleaseId")
    private String parentAddonReleaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("releaseName")
    private String releaseName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("values")
    private String values;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    @com.aliyun.core.annotation.Validation(required = true)
    private String version;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private CreateAddonReleaseRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.addonName = builder.addonName;
        this.aliyunLang = builder.aliyunLang;
        this.dryRun = builder.dryRun;
        this.entityRules = builder.entityRules;
        this.envType = builder.envType;
        this.parentAddonReleaseId = builder.parentAddonReleaseId;
        this.releaseName = builder.releaseName;
        this.values = builder.values;
        this.version = builder.version;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAddonReleaseRequest create() {
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
     * @return aliyunLang
     */
    public String getAliyunLang() {
        return this.aliyunLang;
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
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return parentAddonReleaseId
     */
    public String getParentAddonReleaseId() {
        return this.parentAddonReleaseId;
    }

    /**
     * @return releaseName
     */
    public String getReleaseName() {
        return this.releaseName;
    }

    /**
     * @return values
     */
    public String getValues() {
        return this.values;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<CreateAddonReleaseRequest, Builder> {
        private String policyId; 
        private String addonName; 
        private String aliyunLang; 
        private Boolean dryRun; 
        private EntityDiscoverRule entityRules; 
        private String envType; 
        private String parentAddonReleaseId; 
        private String releaseName; 
        private String values; 
        private String version; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(CreateAddonReleaseRequest request) {
            super(request);
            this.policyId = request.policyId;
            this.addonName = request.addonName;
            this.aliyunLang = request.aliyunLang;
            this.dryRun = request.dryRun;
            this.entityRules = request.entityRules;
            this.envType = request.envType;
            this.parentAddonReleaseId = request.parentAddonReleaseId;
            this.releaseName = request.releaseName;
            this.values = request.values;
            this.version = request.version;
            this.workspace = request.workspace;
        } 

        /**
         * <p>Environment policy ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-yyyyyyyyyy</p>
         */
        public Builder policyId(String policyId) {
            this.putPathParameter("policyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The Addon name of the component that needs to be monitored.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-gpu</p>
         */
        public Builder addonName(String addonName) {
            this.putBodyParameter("addonName", addonName);
            this.addonName = addonName;
            return this;
        }

        /**
         * <p>The language type of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putBodyParameter("aliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * <p>Whether it is a dry run, default is false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Field rules</p>
         */
        public Builder entityRules(EntityDiscoverRule entityRules) {
            this.putBodyParameter("entityRules", entityRules);
            this.entityRules = entityRules;
            return this;
        }

        /**
         * <p>Environment type. If the Policy type is CS and ECS, use accordingly; otherwise, it is unified as Cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>CS</p>
         */
        public Builder envType(String envType) {
            this.putBodyParameter("envType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * <p>Parent AddonReleaseId.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-xxxxxxxxxxx</p>
         */
        public Builder parentAddonReleaseId(String parentAddonReleaseId) {
            this.putBodyParameter("parentAddonReleaseId", parentAddonReleaseId);
            this.parentAddonReleaseId = parentAddonReleaseId;
            return this;
        }

        /**
         * <p>The plugin name after access. If not specified, a default rule name will be generated.</p>
         * 
         * <strong>example:</strong>
         * <p>test-gpu-integration-name</p>
         */
        public Builder releaseName(String releaseName) {
            this.putBodyParameter("releaseName", releaseName);
            this.releaseName = releaseName;
            return this;
        }

        /**
         * <p>Input metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;install&quot;:{&quot;mode&quot;:&quot;auto-install&quot;,&quot;listenPort&quot;:&quot;9400&quot;},&quot;discoverMode&quot;:&quot;instances&quot;,&quot;discover&quot;:{&quot;instances&quot;:&quot;worker-k8s-for-cs-c126d87c76218487e83ab322017f11b44&quot;},&quot;scrapeInterval&quot;:&quot;15&quot;,&quot;enableSecuritecs-nodeyGroupInjection&quot;:&quot;true&quot;,&quot;metricTags&quot;:&quot;&quot;}</p>
         */
        public Builder values(String values) {
            this.putBodyParameter("values", values);
            this.values = values;
            return this;
        }

        /**
         * <p>The version of the Addon component that needs to be monitored.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.2</p>
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        /**
         * <p>The workspace name for installing the component resources.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder workspace(String workspace) {
            this.putBodyParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public CreateAddonReleaseRequest build() {
            return new CreateAddonReleaseRequest(this);
        } 

    } 

}
