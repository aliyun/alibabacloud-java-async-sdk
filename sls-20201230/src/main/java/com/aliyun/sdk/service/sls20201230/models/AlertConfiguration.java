// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link AlertConfiguration} extends {@link TeaModel}
 *
 * <p>AlertConfiguration</p>
 */
public class AlertConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("annotations")
    private java.util.List<AlertTag> annotations;

    @com.aliyun.core.annotation.NameInMap("autoAnnotation")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean autoAnnotation;

    @com.aliyun.core.annotation.NameInMap("conditionConfiguration")
    private ConditionConfiguration conditionConfiguration;

    @com.aliyun.core.annotation.NameInMap("dashboard")
    private String dashboard;

    @com.aliyun.core.annotation.NameInMap("groupConfiguration")
    @com.aliyun.core.annotation.Validation(required = true)
    private GroupConfiguration groupConfiguration;

    @com.aliyun.core.annotation.NameInMap("joinConfigurations")
    private java.util.List<JoinConfiguration> joinConfigurations;

    @com.aliyun.core.annotation.NameInMap("labels")
    private java.util.List<AlertTag> labels;

    @com.aliyun.core.annotation.NameInMap("muteUntil")
    private Long muteUntil;

    @com.aliyun.core.annotation.NameInMap("noDataFire")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean noDataFire;

    @com.aliyun.core.annotation.NameInMap("noDataSeverity")
    private Integer noDataSeverity;

    @com.aliyun.core.annotation.NameInMap("policyConfiguration")
    private PolicyConfiguration policyConfiguration;

    @com.aliyun.core.annotation.NameInMap("queryList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<AlertQuery> queryList;

    @com.aliyun.core.annotation.NameInMap("sendResolved")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean sendResolved;

    @com.aliyun.core.annotation.NameInMap("severityConfigurations")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<SeverityConfiguration> severityConfigurations;

    @com.aliyun.core.annotation.NameInMap("sinkAlerthub")
    private SinkAlerthubConfiguration sinkAlerthub;

    @com.aliyun.core.annotation.NameInMap("sinkCms")
    private SinkCmsConfiguration sinkCms;

    @com.aliyun.core.annotation.NameInMap("sinkEventStore")
    private SinkEventStoreConfiguration sinkEventStore;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<String> tags;

    @com.aliyun.core.annotation.NameInMap("templateConfiguration")
    private TemplateConfiguration templateConfiguration;

    @com.aliyun.core.annotation.NameInMap("threshold")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer threshold;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("version")
    @com.aliyun.core.annotation.Validation(required = true)
    private String version;

    private AlertConfiguration(Builder builder) {
        this.annotations = builder.annotations;
        this.autoAnnotation = builder.autoAnnotation;
        this.conditionConfiguration = builder.conditionConfiguration;
        this.dashboard = builder.dashboard;
        this.groupConfiguration = builder.groupConfiguration;
        this.joinConfigurations = builder.joinConfigurations;
        this.labels = builder.labels;
        this.muteUntil = builder.muteUntil;
        this.noDataFire = builder.noDataFire;
        this.noDataSeverity = builder.noDataSeverity;
        this.policyConfiguration = builder.policyConfiguration;
        this.queryList = builder.queryList;
        this.sendResolved = builder.sendResolved;
        this.severityConfigurations = builder.severityConfigurations;
        this.sinkAlerthub = builder.sinkAlerthub;
        this.sinkCms = builder.sinkCms;
        this.sinkEventStore = builder.sinkEventStore;
        this.tags = builder.tags;
        this.templateConfiguration = builder.templateConfiguration;
        this.threshold = builder.threshold;
        this.type = builder.type;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertConfiguration create() {
        return builder().build();
    }

    /**
     * @return annotations
     */
    public java.util.List<AlertTag> getAnnotations() {
        return this.annotations;
    }

    /**
     * @return autoAnnotation
     */
    public Boolean getAutoAnnotation() {
        return this.autoAnnotation;
    }

    /**
     * @return conditionConfiguration
     */
    public ConditionConfiguration getConditionConfiguration() {
        return this.conditionConfiguration;
    }

    /**
     * @return dashboard
     */
    public String getDashboard() {
        return this.dashboard;
    }

    /**
     * @return groupConfiguration
     */
    public GroupConfiguration getGroupConfiguration() {
        return this.groupConfiguration;
    }

    /**
     * @return joinConfigurations
     */
    public java.util.List<JoinConfiguration> getJoinConfigurations() {
        return this.joinConfigurations;
    }

    /**
     * @return labels
     */
    public java.util.List<AlertTag> getLabels() {
        return this.labels;
    }

    /**
     * @return muteUntil
     */
    public Long getMuteUntil() {
        return this.muteUntil;
    }

    /**
     * @return noDataFire
     */
    public Boolean getNoDataFire() {
        return this.noDataFire;
    }

    /**
     * @return noDataSeverity
     */
    public Integer getNoDataSeverity() {
        return this.noDataSeverity;
    }

    /**
     * @return policyConfiguration
     */
    public PolicyConfiguration getPolicyConfiguration() {
        return this.policyConfiguration;
    }

    /**
     * @return queryList
     */
    public java.util.List<AlertQuery> getQueryList() {
        return this.queryList;
    }

    /**
     * @return sendResolved
     */
    public Boolean getSendResolved() {
        return this.sendResolved;
    }

    /**
     * @return severityConfigurations
     */
    public java.util.List<SeverityConfiguration> getSeverityConfigurations() {
        return this.severityConfigurations;
    }

    /**
     * @return sinkAlerthub
     */
    public SinkAlerthubConfiguration getSinkAlerthub() {
        return this.sinkAlerthub;
    }

    /**
     * @return sinkCms
     */
    public SinkCmsConfiguration getSinkCms() {
        return this.sinkCms;
    }

    /**
     * @return sinkEventStore
     */
    public SinkEventStoreConfiguration getSinkEventStore() {
        return this.sinkEventStore;
    }

    /**
     * @return tags
     */
    public java.util.List<String> getTags() {
        return this.tags;
    }

    /**
     * @return templateConfiguration
     */
    public TemplateConfiguration getTemplateConfiguration() {
        return this.templateConfiguration;
    }

    /**
     * @return threshold
     */
    public Integer getThreshold() {
        return this.threshold;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private java.util.List<AlertTag> annotations; 
        private Boolean autoAnnotation; 
        private ConditionConfiguration conditionConfiguration; 
        private String dashboard; 
        private GroupConfiguration groupConfiguration; 
        private java.util.List<JoinConfiguration> joinConfigurations; 
        private java.util.List<AlertTag> labels; 
        private Long muteUntil; 
        private Boolean noDataFire; 
        private Integer noDataSeverity; 
        private PolicyConfiguration policyConfiguration; 
        private java.util.List<AlertQuery> queryList; 
        private Boolean sendResolved; 
        private java.util.List<SeverityConfiguration> severityConfigurations; 
        private SinkAlerthubConfiguration sinkAlerthub; 
        private SinkCmsConfiguration sinkCms; 
        private SinkEventStoreConfiguration sinkEventStore; 
        private java.util.List<String> tags; 
        private TemplateConfiguration templateConfiguration; 
        private Integer threshold; 
        private String type; 
        private String version; 

        /**
         * annotations.
         */
        public Builder annotations(java.util.List<AlertTag> annotations) {
            this.annotations = annotations;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoAnnotation(Boolean autoAnnotation) {
            this.autoAnnotation = autoAnnotation;
            return this;
        }

        /**
         * conditionConfiguration.
         */
        public Builder conditionConfiguration(ConditionConfiguration conditionConfiguration) {
            this.conditionConfiguration = conditionConfiguration;
            return this;
        }

        /**
         * dashboard.
         */
        public Builder dashboard(String dashboard) {
            this.dashboard = dashboard;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder groupConfiguration(GroupConfiguration groupConfiguration) {
            this.groupConfiguration = groupConfiguration;
            return this;
        }

        /**
         * joinConfigurations.
         */
        public Builder joinConfigurations(java.util.List<JoinConfiguration> joinConfigurations) {
            this.joinConfigurations = joinConfigurations;
            return this;
        }

        /**
         * labels.
         */
        public Builder labels(java.util.List<AlertTag> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * muteUntil.
         */
        public Builder muteUntil(Long muteUntil) {
            this.muteUntil = muteUntil;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder noDataFire(Boolean noDataFire) {
            this.noDataFire = noDataFire;
            return this;
        }

        /**
         * noDataSeverity.
         */
        public Builder noDataSeverity(Integer noDataSeverity) {
            this.noDataSeverity = noDataSeverity;
            return this;
        }

        /**
         * policyConfiguration.
         */
        public Builder policyConfiguration(PolicyConfiguration policyConfiguration) {
            this.policyConfiguration = policyConfiguration;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder queryList(java.util.List<AlertQuery> queryList) {
            this.queryList = queryList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder sendResolved(Boolean sendResolved) {
            this.sendResolved = sendResolved;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder severityConfigurations(java.util.List<SeverityConfiguration> severityConfigurations) {
            this.severityConfigurations = severityConfigurations;
            return this;
        }

        /**
         * sinkAlerthub.
         */
        public Builder sinkAlerthub(SinkAlerthubConfiguration sinkAlerthub) {
            this.sinkAlerthub = sinkAlerthub;
            return this;
        }

        /**
         * sinkCms.
         */
        public Builder sinkCms(SinkCmsConfiguration sinkCms) {
            this.sinkCms = sinkCms;
            return this;
        }

        /**
         * sinkEventStore.
         */
        public Builder sinkEventStore(SinkEventStoreConfiguration sinkEventStore) {
            this.sinkEventStore = sinkEventStore;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * templateConfiguration.
         */
        public Builder templateConfiguration(TemplateConfiguration templateConfiguration) {
            this.templateConfiguration = templateConfiguration;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder threshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public AlertConfiguration build() {
            return new AlertConfiguration(this);
        } 

    } 

}
