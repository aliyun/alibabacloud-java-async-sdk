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
 * {@link UpdateEventCenterRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateEventCenterRuleRequest</p>
 */
public class UpdateEventCenterRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventChannel")
    private String eventChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventConfig")
    private String eventConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventScope")
    private String eventScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventType")
    private String eventType;

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
    private String repoTagFilterPattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    private UpdateEventCenterRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.eventChannel = builder.eventChannel;
        this.eventConfig = builder.eventConfig;
        this.eventScope = builder.eventScope;
        this.eventType = builder.eventType;
        this.instanceId = builder.instanceId;
        this.namespaces = builder.namespaces;
        this.repoNames = builder.repoNames;
        this.repoTagFilterPattern = builder.repoTagFilterPattern;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEventCenterRuleRequest create() {
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
     * @return eventChannel
     */
    public String getEventChannel() {
        return this.eventChannel;
    }

    /**
     * @return eventConfig
     */
    public String getEventConfig() {
        return this.eventConfig;
    }

    /**
     * @return eventScope
     */
    public String getEventScope() {
        return this.eventScope;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
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
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder extends Request.Builder<UpdateEventCenterRuleRequest, Builder> {
        private String regionId; 
        private String eventChannel; 
        private String eventConfig; 
        private String eventScope; 
        private String eventType; 
        private String instanceId; 
        private java.util.List<String> namespaces; 
        private java.util.List<String> repoNames; 
        private String repoTagFilterPattern; 
        private String ruleId; 
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEventCenterRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.eventChannel = request.eventChannel;
            this.eventConfig = request.eventConfig;
            this.eventScope = request.eventScope;
            this.eventType = request.eventType;
            this.instanceId = request.instanceId;
            this.namespaces = request.namespaces;
            this.repoNames = request.repoNames;
            this.repoTagFilterPattern = request.repoTagFilterPattern;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
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
         * <p>The event notification channel.</p>
         * 
         * <strong>example:</strong>
         * <p>EVENT_BRIDGE</p>
         */
        public Builder eventChannel(String eventChannel) {
            this.putQueryParameter("EventChannel", eventChannel);
            this.eventChannel = eventChannel;
            return this;
        }

        /**
         * <p>The event configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *         &quot;notifyMethod&quot;:&quot;http&quot;,
         *         &quot;notifyConfig&quot;:{
         *             &quot;Url&quot;:&quot;<a href="http://www.aliyundoc.com">http://www.aliyundoc.com</a>&quot;,
         *             &quot;id&quot;:&quot;MaAV3HgTkO5Fh8l1V********&quot;,
         *         },
         *         &quot;notifyFilter&quot;:{}
         *     }</p>
         */
        public Builder eventConfig(String eventConfig) {
            this.putQueryParameter("EventConfig", eventConfig);
            this.eventConfig = eventConfig;
            return this;
        }

        /**
         * <p>The event scope. Valid values:</p>
         * <ul>
         * <li><code>INSTANCE</code></li>
         * <li><code>NAMESPACE</code></li>
         * <li><code>REPO</code></li>
         * </ul>
         * <p>Default value: <code>INSTANCE</code></p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        public Builder eventScope(String eventScope) {
            this.putQueryParameter("EventScope", eventScope);
            this.eventScope = eventScope;
            return this;
        }

        /**
         * <p>The type of the event. Valid values:</p>
         * <ul>
         * <li><code>cr:Artifact:DeliveryChainCompleted</code>: The delivery chain is processed.</li>
         * <li><code>cr:Artifact:SynchronizationCompleted</code>: The image is replicated.</li>
         * <li><code>cr:Artifact:BuildCompleted</code>: The image is built.</li>
         * <li><code>cr:Artifact:ScanCompleted</code>: The image is scanned.</li>
         * <li><code>cr:Artifact:SigningCompleted</code>: The image is signed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cr:Artifact:DeliveryChainCompleted</p>
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-kmsiwlxxdcva****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The namespaces to which the event notification rule applies.</p>
         * 
         * <strong>example:</strong>
         * <p>ns</p>
         */
        public Builder namespaces(java.util.List<String> namespaces) {
            String namespacesShrink = shrink(namespaces, "Namespaces", "json");
            this.putQueryParameter("Namespaces", namespacesShrink);
            this.namespaces = namespaces;
            return this;
        }

        /**
         * <p>The names of the repositories to which the event notification rule applies.</p>
         * 
         * <strong>example:</strong>
         * <p>reponame</p>
         */
        public Builder repoNames(java.util.List<String> repoNames) {
            String repoNamesShrink = shrink(repoNames, "RepoNames", "json");
            this.putQueryParameter("RepoNames", repoNamesShrink);
            this.repoNames = repoNames;
            return this;
        }

        /**
         * <p>The regular expression for image tags.</p>
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
         * <p>The ID of the event notification rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crecr-n6pbhgjxt*****</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The name of the event notification rule.</p>
         * 
         * <strong>example:</strong>
         * <p>chain-demo</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        @Override
        public UpdateEventCenterRuleRequest build() {
            return new UpdateEventCenterRuleRequest(this);
        } 

    } 

}
