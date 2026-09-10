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
 * {@link ListIntegrationPolicyCustomScrapeJobRulesRequest} extends {@link RequestModel}
 *
 * <p>ListIntegrationPolicyCustomScrapeJobRulesRequest</p>
 */
public class ListIntegrationPolicyCustomScrapeJobRulesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("policyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("addonReleaseName")
    private String addonReleaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("collectorReleaseName")
    private String collectorReleaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("encryptYaml")
    private Boolean encryptYaml;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    private ListIntegrationPolicyCustomScrapeJobRulesRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.addonReleaseName = builder.addonReleaseName;
        this.collectorReleaseName = builder.collectorReleaseName;
        this.encryptYaml = builder.encryptYaml;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntegrationPolicyCustomScrapeJobRulesRequest create() {
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
     * @return addonReleaseName
     */
    public String getAddonReleaseName() {
        return this.addonReleaseName;
    }

    /**
     * @return collectorReleaseName
     */
    public String getCollectorReleaseName() {
        return this.collectorReleaseName;
    }

    /**
     * @return encryptYaml
     */
    public Boolean getEncryptYaml() {
        return this.encryptYaml;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<ListIntegrationPolicyCustomScrapeJobRulesRequest, Builder> {
        private String policyId; 
        private String addonReleaseName; 
        private String collectorReleaseName; 
        private Boolean encryptYaml; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(ListIntegrationPolicyCustomScrapeJobRulesRequest request) {
            super(request);
            this.policyId = request.policyId;
            this.addonReleaseName = request.addonReleaseName;
            this.collectorReleaseName = request.collectorReleaseName;
            this.encryptYaml = request.encryptYaml;
            this.namespace = request.namespace;
        } 

        /**
         * <p>The ID of the Provisioning policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-d95435164593aece55f9999ce45c</p>
         */
        public Builder policyId(String policyId) {
            this.putPathParameter("policyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The name of the addon release.</p>
         * 
         * <strong>example:</strong>
         * <p>release12345678</p>
         */
        public Builder addonReleaseName(String addonReleaseName) {
            this.putQueryParameter("addonReleaseName", addonReleaseName);
            this.addonReleaseName = addonReleaseName;
            return this;
        }

        /**
         * <p>The probe identifier. If a release exists, pass the release name. If no release exists, pass the component name.</p>
         * 
         * <strong>example:</strong>
         * <p>collector:metric-agent:policy:policy-bfd3d455fd6f4bc8</p>
         */
        public Builder collectorReleaseName(String collectorReleaseName) {
            this.putQueryParameter("collectorReleaseName", collectorReleaseName);
            this.collectorReleaseName = collectorReleaseName;
            return this;
        }

        /**
         * <p>Specifies whether to encrypt the YAML content.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder encryptYaml(Boolean encryptYaml) {
            this.putQueryParameter("encryptYaml", encryptYaml);
            this.encryptYaml = encryptYaml;
            return this;
        }

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>arms-prom</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public ListIntegrationPolicyCustomScrapeJobRulesRequest build() {
            return new ListIntegrationPolicyCustomScrapeJobRulesRequest(this);
        } 

    } 

}
