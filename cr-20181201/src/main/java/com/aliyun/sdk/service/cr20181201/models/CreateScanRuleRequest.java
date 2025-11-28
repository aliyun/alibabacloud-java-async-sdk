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
 * {@link CreateScanRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateScanRuleRequest</p>
 */
public class CreateScanRuleRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ScanScope")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scanScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanType")
    private String scanType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String triggerType;

    private CreateScanRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.namespaces = builder.namespaces;
        this.repoNames = builder.repoNames;
        this.repoTagFilterPattern = builder.repoTagFilterPattern;
        this.ruleName = builder.ruleName;
        this.scanScope = builder.scanScope;
        this.scanType = builder.scanType;
        this.triggerType = builder.triggerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScanRuleRequest create() {
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
     * @return scanScope
     */
    public String getScanScope() {
        return this.scanScope;
    }

    /**
     * @return scanType
     */
    public String getScanType() {
        return this.scanType;
    }

    /**
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    public static final class Builder extends Request.Builder<CreateScanRuleRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private java.util.List<String> namespaces; 
        private java.util.List<String> repoNames; 
        private String repoTagFilterPattern; 
        private String ruleName; 
        private String scanScope; 
        private String scanType; 
        private String triggerType; 

        private Builder() {
            super();
        } 

        private Builder(CreateScanRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.namespaces = request.namespaces;
            this.repoNames = request.repoNames;
            this.repoTagFilterPattern = request.repoTagFilterPattern;
            this.ruleName = request.ruleName;
            this.scanScope = request.scanScope;
            this.scanType = request.scanType;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-dqwc**********</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Namespaces.
         */
        public Builder namespaces(java.util.List<String> namespaces) {
            String namespacesShrink = shrink(namespaces, "Namespaces", "json");
            this.putQueryParameter("Namespaces", namespacesShrink);
            this.namespaces = namespaces;
            return this;
        }

        /**
         * RepoNames.
         */
        public Builder repoNames(java.util.List<String> repoNames) {
            String repoNamesShrink = shrink(repoNames, "RepoNames", "json");
            this.putQueryParameter("RepoNames", repoNamesShrink);
            this.repoNames = repoNames;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>.*</p>
         */
        public Builder repoTagFilterPattern(String repoTagFilterPattern) {
            this.putQueryParameter("RepoTagFilterPattern", repoTagFilterPattern);
            this.repoTagFilterPattern = repoTagFilterPattern;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NAMESPACE</p>
         */
        public Builder scanScope(String scanScope) {
            this.putQueryParameter("ScanScope", scanScope);
            this.scanScope = scanScope;
            return this;
        }

        /**
         * ScanType.
         */
        public Builder scanType(String scanType) {
            this.putQueryParameter("ScanType", scanType);
            this.scanType = scanType;
            return this;
        }

        /**
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
        public CreateScanRuleRequest build() {
            return new CreateScanRuleRequest(this);
        } 

    } 

}
