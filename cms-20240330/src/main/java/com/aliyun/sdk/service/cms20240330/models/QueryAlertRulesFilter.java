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
 * {@link QueryAlertRulesFilter} extends {@link TeaModel}
 *
 * <p>QueryAlertRulesFilter</p>
 */
public class QueryAlertRulesFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("datasourceType")
    private DatasourceTypeFilter datasourceType;

    @com.aliyun.core.annotation.NameInMap("displayName")
    private DisplayNameFilter displayName;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private EnabledFilter enabled;

    @com.aliyun.core.annotation.NameInMap("labels")
    private LabelsFilter labels;

    @com.aliyun.core.annotation.NameInMap("notifyStrategyId")
    private NotifyStrategyIdFilter notifyStrategyId;

    @com.aliyun.core.annotation.NameInMap("observeResourceGlobalScope")
    private ObserveResourceGlobalScopeFilter observeResourceGlobalScope;

    @com.aliyun.core.annotation.NameInMap("observeResourceInstanceId")
    @Deprecated
    private String observeResourceInstanceId;

    @com.aliyun.core.annotation.NameInMap("observeResourceList")
    private ObserveResourceListFilter observeResourceList;

    @com.aliyun.core.annotation.NameInMap("observeResourceType")
    private ObserveResourceTypeFilter observeResourceType;

    @com.aliyun.core.annotation.NameInMap("partitionKey")
    private PartitionKeyFilter partitionKey;

    @com.aliyun.core.annotation.NameInMap("severityLevels")
    private SeverityLevelsFilter severityLevels;

    @com.aliyun.core.annotation.NameInMap("status")
    private StatusFilter status;

    @com.aliyun.core.annotation.NameInMap("uuid")
    private UuidFilter uuid;

    private QueryAlertRulesFilter(Builder builder) {
        this.datasourceType = builder.datasourceType;
        this.displayName = builder.displayName;
        this.enabled = builder.enabled;
        this.labels = builder.labels;
        this.notifyStrategyId = builder.notifyStrategyId;
        this.observeResourceGlobalScope = builder.observeResourceGlobalScope;
        this.observeResourceInstanceId = builder.observeResourceInstanceId;
        this.observeResourceList = builder.observeResourceList;
        this.observeResourceType = builder.observeResourceType;
        this.partitionKey = builder.partitionKey;
        this.severityLevels = builder.severityLevels;
        this.status = builder.status;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAlertRulesFilter create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasourceType
     */
    public DatasourceTypeFilter getDatasourceType() {
        return this.datasourceType;
    }

    /**
     * @return displayName
     */
    public DisplayNameFilter getDisplayName() {
        return this.displayName;
    }

    /**
     * @return enabled
     */
    public EnabledFilter getEnabled() {
        return this.enabled;
    }

    /**
     * @return labels
     */
    public LabelsFilter getLabels() {
        return this.labels;
    }

    /**
     * @return notifyStrategyId
     */
    public NotifyStrategyIdFilter getNotifyStrategyId() {
        return this.notifyStrategyId;
    }

    /**
     * @return observeResourceGlobalScope
     */
    public ObserveResourceGlobalScopeFilter getObserveResourceGlobalScope() {
        return this.observeResourceGlobalScope;
    }

    /**
     * @return observeResourceInstanceId
     */
    public String getObserveResourceInstanceId() {
        return this.observeResourceInstanceId;
    }

    /**
     * @return observeResourceList
     */
    public ObserveResourceListFilter getObserveResourceList() {
        return this.observeResourceList;
    }

    /**
     * @return observeResourceType
     */
    public ObserveResourceTypeFilter getObserveResourceType() {
        return this.observeResourceType;
    }

    /**
     * @return partitionKey
     */
    public PartitionKeyFilter getPartitionKey() {
        return this.partitionKey;
    }

    /**
     * @return severityLevels
     */
    public SeverityLevelsFilter getSeverityLevels() {
        return this.severityLevels;
    }

    /**
     * @return status
     */
    public StatusFilter getStatus() {
        return this.status;
    }

    /**
     * @return uuid
     */
    public UuidFilter getUuid() {
        return this.uuid;
    }

    public static final class Builder {
        private DatasourceTypeFilter datasourceType; 
        private DisplayNameFilter displayName; 
        private EnabledFilter enabled; 
        private LabelsFilter labels; 
        private NotifyStrategyIdFilter notifyStrategyId; 
        private ObserveResourceGlobalScopeFilter observeResourceGlobalScope; 
        private String observeResourceInstanceId; 
        private ObserveResourceListFilter observeResourceList; 
        private ObserveResourceTypeFilter observeResourceType; 
        private PartitionKeyFilter partitionKey; 
        private SeverityLevelsFilter severityLevels; 
        private StatusFilter status; 
        private UuidFilter uuid; 

        private Builder() {
        } 

        private Builder(QueryAlertRulesFilter model) {
            this.datasourceType = model.datasourceType;
            this.displayName = model.displayName;
            this.enabled = model.enabled;
            this.labels = model.labels;
            this.notifyStrategyId = model.notifyStrategyId;
            this.observeResourceGlobalScope = model.observeResourceGlobalScope;
            this.observeResourceInstanceId = model.observeResourceInstanceId;
            this.observeResourceList = model.observeResourceList;
            this.observeResourceType = model.observeResourceType;
            this.partitionKey = model.partitionKey;
            this.severityLevels = model.severityLevels;
            this.status = model.status;
            this.uuid = model.uuid;
        } 

        /**
         * datasourceType.
         */
        public Builder datasourceType(DatasourceTypeFilter datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }

        /**
         * displayName.
         */
        public Builder displayName(DisplayNameFilter displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * enabled.
         */
        public Builder enabled(EnabledFilter enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * labels.
         */
        public Builder labels(LabelsFilter labels) {
            this.labels = labels;
            return this;
        }

        /**
         * notifyStrategyId.
         */
        public Builder notifyStrategyId(NotifyStrategyIdFilter notifyStrategyId) {
            this.notifyStrategyId = notifyStrategyId;
            return this;
        }

        /**
         * observeResourceGlobalScope.
         */
        public Builder observeResourceGlobalScope(ObserveResourceGlobalScopeFilter observeResourceGlobalScope) {
            this.observeResourceGlobalScope = observeResourceGlobalScope;
            return this;
        }

        /**
         * observeResourceInstanceId.
         */
        public Builder observeResourceInstanceId(String observeResourceInstanceId) {
            this.observeResourceInstanceId = observeResourceInstanceId;
            return this;
        }

        /**
         * observeResourceList.
         */
        public Builder observeResourceList(ObserveResourceListFilter observeResourceList) {
            this.observeResourceList = observeResourceList;
            return this;
        }

        /**
         * observeResourceType.
         */
        public Builder observeResourceType(ObserveResourceTypeFilter observeResourceType) {
            this.observeResourceType = observeResourceType;
            return this;
        }

        /**
         * partitionKey.
         */
        public Builder partitionKey(PartitionKeyFilter partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }

        /**
         * severityLevels.
         */
        public Builder severityLevels(SeverityLevelsFilter severityLevels) {
            this.severityLevels = severityLevels;
            return this;
        }

        /**
         * status.
         */
        public Builder status(StatusFilter status) {
            this.status = status;
            return this;
        }

        /**
         * uuid.
         */
        public Builder uuid(UuidFilter uuid) {
            this.uuid = uuid;
            return this;
        }

        public QueryAlertRulesFilter build() {
            return new QueryAlertRulesFilter(this);
        } 

    } 

}
