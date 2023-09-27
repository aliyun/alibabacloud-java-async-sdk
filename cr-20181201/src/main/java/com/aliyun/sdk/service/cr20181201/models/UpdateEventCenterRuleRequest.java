// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEventCenterRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateEventCenterRuleRequest</p>
 */
public class UpdateEventCenterRuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("EventChannel")
    private String eventChannel;

    @Query
    @NameInMap("EventConfig")
    private String eventConfig;

    @Query
    @NameInMap("EventScope")
    private String eventScope;

    @Query
    @NameInMap("EventType")
    private String eventType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Namespaces")
    private java.util.List < String > namespaces;

    @Query
    @NameInMap("RepoNames")
    private java.util.List < String > repoNames;

    @Query
    @NameInMap("RepoTagFilterPattern")
    private String repoTagFilterPattern;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private String ruleId;

    @Query
    @NameInMap("RuleName")
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
    public java.util.List < String > getNamespaces() {
        return this.namespaces;
    }

    /**
     * @return repoNames
     */
    public java.util.List < String > getRepoNames() {
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
        private java.util.List < String > namespaces; 
        private java.util.List < String > repoNames; 
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
         * The event notification channel.
         */
        public Builder eventChannel(String eventChannel) {
            this.putQueryParameter("EventChannel", eventChannel);
            this.eventChannel = eventChannel;
            return this;
        }

        /**
         * The event configuration.
         */
        public Builder eventConfig(String eventConfig) {
            this.putQueryParameter("EventConfig", eventConfig);
            this.eventConfig = eventConfig;
            return this;
        }

        /**
         * The event scope. Valid values:
         * <p>
         * 
         * *   `INSTANCE`
         * *   `NAMESPACE`
         * *   `REPO`
         * 
         * Default value: `INSTANCE`
         */
        public Builder eventScope(String eventScope) {
            this.putQueryParameter("EventScope", eventScope);
            this.eventScope = eventScope;
            return this;
        }

        /**
         * The type of the event. Valid values:
         * <p>
         * 
         * *   `cr:Artifact:DeliveryChainCompleted`: The delivery chain is processed.
         * *   `cr:Artifact:SynchronizationCompleted`: The image is replicated.
         * *   `cr:Artifact:BuildCompleted`: The image is built.
         * *   `cr:Artifact:ScanCompleted`: The image is scanned.
         * *   `cr:Artifact:SigningCompleted`: The image is signed.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The namespaces to which the event notification rule applies.
         */
        public Builder namespaces(java.util.List < String > namespaces) {
            String namespacesShrink = shrink(namespaces, "Namespaces", "json");
            this.putQueryParameter("Namespaces", namespacesShrink);
            this.namespaces = namespaces;
            return this;
        }

        /**
         * The names of the repositories to which the event notification rule applies.
         */
        public Builder repoNames(java.util.List < String > repoNames) {
            String repoNamesShrink = shrink(repoNames, "RepoNames", "json");
            this.putQueryParameter("RepoNames", repoNamesShrink);
            this.repoNames = repoNames;
            return this;
        }

        /**
         * The regular expression for image tags.
         */
        public Builder repoTagFilterPattern(String repoTagFilterPattern) {
            this.putQueryParameter("RepoTagFilterPattern", repoTagFilterPattern);
            this.repoTagFilterPattern = repoTagFilterPattern;
            return this;
        }

        /**
         * The ID of the event notification rule.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * The name of the event notification rule.
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
