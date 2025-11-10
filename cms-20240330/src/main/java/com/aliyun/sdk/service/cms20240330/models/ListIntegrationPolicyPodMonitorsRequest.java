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
 * {@link ListIntegrationPolicyPodMonitorsRequest} extends {@link RequestModel}
 *
 * <p>ListIntegrationPolicyPodMonitorsRequest</p>
 */
public class ListIntegrationPolicyPodMonitorsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("policyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("addonReleaseName")
    private String addonReleaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("encryptYaml")
    private Boolean encryptYaml;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    private ListIntegrationPolicyPodMonitorsRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.addonReleaseName = builder.addonReleaseName;
        this.encryptYaml = builder.encryptYaml;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntegrationPolicyPodMonitorsRequest create() {
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

    public static final class Builder extends Request.Builder<ListIntegrationPolicyPodMonitorsRequest, Builder> {
        private String policyId; 
        private String addonReleaseName; 
        private Boolean encryptYaml; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(ListIntegrationPolicyPodMonitorsRequest request) {
            super(request);
            this.policyId = request.policyId;
            this.addonReleaseName = request.addonReleaseName;
            this.encryptYaml = request.encryptYaml;
            this.namespace = request.namespace;
        } 

        /**
         * <p>Access center policy ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-1d4634924c8ba599822c601fcee3</p>
         */
        public Builder policyId(String policyId) {
            this.putPathParameter("policyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>Addon Release name.</p>
         * 
         * <strong>example:</strong>
         * <p>release-123456789</p>
         */
        public Builder addonReleaseName(String addonReleaseName) {
            this.putQueryParameter("addonReleaseName", addonReleaseName);
            this.addonReleaseName = addonReleaseName;
            return this;
        }

        /**
         * <p>Whether to encrypt Yaml.</p>
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
         * <p>Namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public ListIntegrationPolicyPodMonitorsRequest build() {
            return new ListIntegrationPolicyPodMonitorsRequest(this);
        } 

    } 

}
