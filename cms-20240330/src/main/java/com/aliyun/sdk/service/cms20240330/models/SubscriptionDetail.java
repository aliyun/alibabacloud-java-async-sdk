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
 * {@link SubscriptionDetail} extends {@link TeaModel}
 *
 * <p>SubscriptionDetail</p>
 */
public class SubscriptionDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("filterSetting")
    private FilterSetting filterSetting;

    @com.aliyun.core.annotation.NameInMap("subscribeLegacyEvent")
    private Boolean subscribeLegacyEvent;

    @com.aliyun.core.annotation.NameInMap("workspaceFilterSetting")
    private WorkspaceFilterSetting workspaceFilterSetting;

    private SubscriptionDetail(Builder builder) {
        this.filterSetting = builder.filterSetting;
        this.subscribeLegacyEvent = builder.subscribeLegacyEvent;
        this.workspaceFilterSetting = builder.workspaceFilterSetting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscriptionDetail create() {
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

        private Builder(SubscriptionDetail model) {
            this.filterSetting = model.filterSetting;
            this.subscribeLegacyEvent = model.subscribeLegacyEvent;
            this.workspaceFilterSetting = model.workspaceFilterSetting;
        } 

        /**
         * <p>The filter conditions for event content.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder filterSetting(FilterSetting filterSetting) {
            this.filterSetting = filterSetting;
            return this;
        }

        /**
         * <p>Specifies whether to subscribe to legacy product events (events with an empty workspace from CMS 1.0, ARMS, or SLS).</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder subscribeLegacyEvent(Boolean subscribeLegacyEvent) {
            this.subscribeLegacyEvent = subscribeLegacyEvent;
            return this;
        }

        /**
         * <p>The cross-workspace event routing (global subscription) settings.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder workspaceFilterSetting(WorkspaceFilterSetting workspaceFilterSetting) {
            this.workspaceFilterSetting = workspaceFilterSetting;
            return this;
        }

        public SubscriptionDetail build() {
            return new SubscriptionDetail(this);
        } 

    } 

}
