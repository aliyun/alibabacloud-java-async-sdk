// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link UpdateScanRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateScanRuleRequest</p>
 */
public class UpdateScanRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespaces")
    private java.util.List<String> namespaces;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoNames")
    private java.util.List<String> repoNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoTagFilterPattern")
    @com.aliyun.core.annotation.Validation(required = true)
    private String repoTagFilterPattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scanRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanScope")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scanScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String triggerType;

    private UpdateScanRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.namespaces = builder.namespaces;
        this.repoNames = builder.repoNames;
        this.repoTagFilterPattern = builder.repoTagFilterPattern;
        this.ruleName = builder.ruleName;
        this.scanRuleId = builder.scanRuleId;
        this.scanScope = builder.scanScope;
        this.triggerType = builder.triggerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateScanRuleRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return namespaces
     */
    public java.util.List<String> getNamespaces() {
        return this.namespaces;
    }

    /**
     * @return repoNames
     */
    public java.util.List<String> getRepoNames() {
        return this.repoNames;
    }

    /**
     * @return repoTagFilterPattern
     */
    public String getRepoTagFilterPattern() {
        return this.repoTagFilterPattern;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return scanRuleId
     */
    public String getScanRuleId() {
        return this.scanRuleId;
    }

    /**
     * @return scanScope
     */
    public String getScanScope() {
        return this.scanScope;
    }

    /**
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    public static final class Builder extends Request.Builder<UpdateScanRuleRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private java.util.List<String> namespaces; 
        private java.util.List<String> repoNames; 
        private String repoTagFilterPattern; 
        private String ruleName; 
        private String scanRuleId; 
        private String scanScope; 
        private String triggerType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateScanRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.namespaces = request.namespaces;
            this.repoNames = request.repoNames;
            this.repoTagFilterPattern = request.repoTagFilterPattern;
            this.ruleName = request.ruleName;
            this.scanRuleId = request.scanRuleId;
            this.scanScope = request.scanScope;
            this.triggerType = request.triggerType;
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
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-4abntrj42twd****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The list of namespaces.</p>
         * <ul>
         * <li>When the scan scope is NAMESPACE, this parameter cannot be empty.</li>
         * <li>If the scan scope is REPO, you must specify a unique Namespace for this parameter.</li>
         * </ul>
         */
        public Builder namespaces(java.util.List<String> namespaces) {
            String namespacesShrink = shrink(namespaces, "Namespaces", "json");
            this.putQueryParameter("Namespaces", namespacesShrink);
            this.namespaces = namespaces;
            return this;
        }

        /**
         * <p>The list of repositories.</p>
         * <ul>
         * <li>When the scan scope is NAMESPACE, this parameter must be empty.</li>
         * <li>When the scan scope is REPO, this parameter cannot be empty.</li>
         * </ul>
         */
        public Builder repoNames(java.util.List<String> repoNames) {
            String repoNamesShrink = shrink(repoNames, "RepoNames", "json");
            this.putQueryParameter("RepoNames", repoNamesShrink);
            this.repoNames = repoNames;
            return this;
        }

        /**
         * <p>The tag filtering rules.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-.*</p>
         */
        public Builder repoTagFilterPattern(String repoTagFilterPattern) {
            this.putQueryParameter("RepoTagFilterPattern", repoTagFilterPattern);
            this.repoTagFilterPattern = repoTagFilterPattern;
            return this;
        }

        /**
         * <p>The rule name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>scan-test</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The rule ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crscnr-3qmkeiuggfpjkfrq</p>
         */
        public Builder scanRuleId(String scanRuleId) {
            this.putQueryParameter("ScanRuleId", scanRuleId);
            this.scanRuleId = scanRuleId;
            return this;
        }

        /**
         * <p>The scan scope.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>NAMESPACE: namespace.</li>
         * <li>REPO: repository.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>REPO</p>
         */
        public Builder scanScope(String scanScope) {
            this.putQueryParameter("ScanScope", scanScope);
            this.scanScope = scanScope;
            return this;
        }

        /**
         * <p>The trigger type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AUTO: automatically triggers.</li>
         * <li>MANUAL: manually triggers.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTO</p>
         */
        public Builder triggerType(String triggerType) {
            this.putQueryParameter("TriggerType", triggerType);
            this.triggerType = triggerType;
            return this;
        }

        @Override
        public UpdateScanRuleRequest build() {
            return new UpdateScanRuleRequest(this);
        } 

    } 

}
