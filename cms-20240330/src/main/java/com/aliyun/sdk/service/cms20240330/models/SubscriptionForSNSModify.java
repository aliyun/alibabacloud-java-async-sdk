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
 * {@link SubscriptionForSNSModify} extends {@link TeaModel}
 *
 * <p>SubscriptionForSNSModify</p>
 */
public class SubscriptionForSNSModify extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("filterSetting")
    private FilterSetting filterSetting;

    @com.aliyun.core.annotation.NameInMap("subscribeLegacyEvent")
    private Boolean subscribeLegacyEvent;

    @com.aliyun.core.annotation.NameInMap("workspaceFilterSetting")
    private WorkspaceFilterSetting workspaceFilterSetting;

    private SubscriptionForSNSModify(Builder builder) {
        this.filterSetting = builder.filterSetting;
        this.subscribeLegacyEvent = builder.subscribeLegacyEvent;
        this.workspaceFilterSetting = builder.workspaceFilterSetting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscriptionForSNSModify create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filterSetting
     */
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    /**
     * @return subscribeLegacyEvent
     */
    public Boolean getSubscribeLegacyEvent() {
        return this.subscribeLegacyEvent;
    }

    /**
     * @return workspaceFilterSetting
     */
    public WorkspaceFilterSetting getWorkspaceFilterSetting() {
        return this.workspaceFilterSetting;
    }

    public static final class Builder {
        private FilterSetting filterSetting; 
        private Boolean subscribeLegacyEvent; 
        private WorkspaceFilterSetting workspaceFilterSetting; 

        private Builder() {
        } 

        private Builder(SubscriptionForSNSModify model) {
            this.filterSetting = model.filterSetting;
            this.subscribeLegacyEvent = model.subscribeLegacyEvent;
            this.workspaceFilterSetting = model.workspaceFilterSetting;
        } 

        /**
         * <p>The event content filter that matches conditions based on event fields such as labels, source, and severity. If this parameter is not specified, no events are received.</p>
         */
        public Builder filterSetting(FilterSetting filterSetting) {
            this.filterSetting = filterSetting;
            return this;
        }

        /**
         * <p>Specifies whether to subscribe to legacy product events (CMS 1.0, ARMS, or SLS events where workspace is null). Valid values:</p>
         * <ul>
         * <li>true: Subscribe to legacy product events.</li>
         * <li>false or null: Do not subscribe to legacy product events.</li>
         * </ul>
         */
        public Builder subscribeLegacyEvent(Boolean subscribeLegacyEvent) {
            this.subscribeLegacyEvent = subscribeLegacyEvent;
            return this;
        }

        /**
         * <p>The global subscription configuration. If the subscription needs to receive events from other workspaces, specify the target workspace list by using workspaceUuids. If this parameter is not configured, only events from the current workspace are received.</p>
         */
        public Builder workspaceFilterSetting(WorkspaceFilterSetting workspaceFilterSetting) {
            this.workspaceFilterSetting = workspaceFilterSetting;
            return this;
        }

        public SubscriptionForSNSModify build() {
            return new SubscriptionForSNSModify(this);
        } 

    } 

}
