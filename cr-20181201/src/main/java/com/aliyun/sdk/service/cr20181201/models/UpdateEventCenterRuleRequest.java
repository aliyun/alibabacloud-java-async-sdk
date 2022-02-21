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
    private String instanceId;

    @Query
    @NameInMap("Namespaces")
    private java.util.List < String > namespaces;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RepoNames")
    private java.util.List < String > repoNames;

    @Query
    @NameInMap("RepoTagFilterPattern")
    private String repoTagFilterPattern;

    @Query
    @NameInMap("RuleId")
    private String ruleId;

    @Query
    @NameInMap("RuleName")
    private String ruleName;

    private UpdateEventCenterRuleRequest(Builder builder) {
        super(builder);
        this.eventChannel = builder.eventChannel;
        this.eventConfig = builder.eventConfig;
        this.eventScope = builder.eventScope;
        this.eventType = builder.eventType;
        this.instanceId = builder.instanceId;
        this.namespaces = builder.namespaces;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String eventChannel; 
        private String eventConfig; 
        private String eventScope; 
        private String eventType; 
        private String instanceId; 
        private java.util.List < String > namespaces; 
        private String regionId; 
        private java.util.List < String > repoNames; 
        private String repoTagFilterPattern; 
        private String ruleId; 
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEventCenterRuleRequest response) {
            super(response);
            this.eventChannel = response.eventChannel;
            this.eventConfig = response.eventConfig;
            this.eventScope = response.eventScope;
            this.eventType = response.eventType;
            this.instanceId = response.instanceId;
            this.namespaces = response.namespaces;
            this.regionId = response.regionId;
            this.repoNames = response.repoNames;
            this.repoTagFilterPattern = response.repoTagFilterPattern;
            this.ruleId = response.ruleId;
            this.ruleName = response.ruleName;
        } 

        /**
         * EventChannel.
         */
        public Builder eventChannel(String eventChannel) {
            this.putQueryParameter("EventChannel", eventChannel);
            this.eventChannel = eventChannel;
            return this;
        }

        /**
         * EventConfig.
         */
        public Builder eventConfig(String eventConfig) {
            this.putQueryParameter("EventConfig", eventConfig);
            this.eventConfig = eventConfig;
            return this;
        }

        /**
         * EventScope.
         */
        public Builder eventScope(String eventScope) {
            this.putQueryParameter("EventScope", eventScope);
            this.eventScope = eventScope;
            return this;
        }

        /**
         * EventType.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Namespaces.
         */
        public Builder namespaces(java.util.List < String > namespaces) {
            this.putQueryParameter("Namespaces", namespaces);
            this.namespaces = namespaces;
            return this;
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
         * RepoNames.
         */
        public Builder repoNames(java.util.List < String > repoNames) {
            this.putQueryParameter("RepoNames", repoNames);
            this.repoNames = repoNames;
            return this;
        }

        /**
         * RepoTagFilterPattern.
         */
        public Builder repoTagFilterPattern(String repoTagFilterPattern) {
            this.putQueryParameter("RepoTagFilterPattern", repoTagFilterPattern);
            this.repoTagFilterPattern = repoTagFilterPattern;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * RuleName.
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
