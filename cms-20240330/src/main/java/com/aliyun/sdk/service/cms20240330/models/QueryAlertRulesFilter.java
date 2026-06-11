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
    private String datasourceType;

    @com.aliyun.core.annotation.NameInMap("displayName")
    private DisplayNameFilter displayName;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private EnabledFilter enabled;

    @com.aliyun.core.annotation.NameInMap("labels")
    private LabelsFilter labels;

    @com.aliyun.core.annotation.NameInMap("observeResourceGlobalScope")
    private Boolean observeResourceGlobalScope;

    @com.aliyun.core.annotation.NameInMap("observeResourceInstanceId")
    private String observeResourceInstanceId;

    @com.aliyun.core.annotation.NameInMap("observeResourceType")
    private String observeResourceType;

    @com.aliyun.core.annotation.NameInMap("severityLevels")
    private String severityLevels;

    @com.aliyun.core.annotation.NameInMap("status")
    private StatusFilter status;

    @com.aliyun.core.annotation.NameInMap("uuid")
    private UuidFilter uuid;

    private QueryAlertRulesFilter(Builder builder) {
        this.datasourceType = builder.datasourceType;
        this.displayName = builder.displayName;
        this.enabled = builder.enabled;
        this.labels = builder.labels;
        this.observeResourceGlobalScope = builder.observeResourceGlobalScope;
        this.observeResourceInstanceId = builder.observeResourceInstanceId;
        this.observeResourceType = builder.observeResourceType;
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
    public String getDatasourceType() {
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
     * @return observeResourceGlobalScope
     */
    public Boolean getObserveResourceGlobalScope() {
        return this.observeResourceGlobalScope;
    }

    /**
     * @return observeResourceInstanceId
     */
    public String getObserveResourceInstanceId() {
        return this.observeResourceInstanceId;
    }

    /**
     * @return observeResourceType
     */
    public String getObserveResourceType() {
        return this.observeResourceType;
    }

    /**
     * @return severityLevels
     */
    public String getSeverityLevels() {
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
        private String datasourceType; 
        private DisplayNameFilter displayName; 
        private EnabledFilter enabled; 
        private LabelsFilter labels; 
        private Boolean observeResourceGlobalScope; 
        private String observeResourceInstanceId; 
        private String observeResourceType; 
        private String severityLevels; 
        private StatusFilter status; 
        private UuidFilter uuid; 

        private Builder() {
        } 

        private Builder(QueryAlertRulesFilter model) {
            this.datasourceType = model.datasourceType;
            this.displayName = model.displayName;
            this.enabled = model.enabled;
            this.labels = model.labels;
            this.observeResourceGlobalScope = model.observeResourceGlobalScope;
            this.observeResourceInstanceId = model.observeResourceInstanceId;
            this.observeResourceType = model.observeResourceType;
            this.severityLevels = model.severityLevels;
            this.status = model.status;
            this.uuid = model.uuid;
        } 

        /**
         * datasourceType.
         */
        public Builder datasourceType(String datasourceType) {
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
         * observeResourceGlobalScope.
         */
        public Builder observeResourceGlobalScope(Boolean observeResourceGlobalScope) {
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
         * observeResourceType.
         */
        public Builder observeResourceType(String observeResourceType) {
            this.observeResourceType = observeResourceType;
            return this;
        }

        /**
         * severityLevels.
         */
        public Builder severityLevels(String severityLevels) {
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
