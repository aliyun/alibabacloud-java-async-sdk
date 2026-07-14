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
 * {@link SubscriptionConfig} extends {@link TeaModel}
 *
 * <p>SubscriptionConfig</p>
 */
public class SubscriptionConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("filterSetting")
    private FilterSetting filterSetting;

    @com.aliyun.core.annotation.NameInMap("subscribeLegacyEvent")
    private Boolean subscribeLegacyEvent;

    @com.aliyun.core.annotation.NameInMap("workspaceFilterSetting")
    private WorkspaceFilterSetting workspaceFilterSetting;

    private SubscriptionConfig(Builder builder) {
        this.filterSetting = builder.filterSetting;
        this.subscribeLegacyEvent = builder.subscribeLegacyEvent;
        this.workspaceFilterSetting = builder.workspaceFilterSetting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscriptionConfig create() {
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

        private Builder(SubscriptionConfig model) {
            this.filterSetting = model.filterSetting;
            this.subscribeLegacyEvent = model.subscribeLegacyEvent;
            this.workspaceFilterSetting = model.workspaceFilterSetting;
        } 

        /**
         * filterSetting.
         */
        public Builder filterSetting(FilterSetting filterSetting) {
            this.filterSetting = filterSetting;
            return this;
        }

        /**
         * subscribeLegacyEvent.
         */
        public Builder subscribeLegacyEvent(Boolean subscribeLegacyEvent) {
            this.subscribeLegacyEvent = subscribeLegacyEvent;
            return this;
        }

        /**
         * workspaceFilterSetting.
         */
        public Builder workspaceFilterSetting(WorkspaceFilterSetting workspaceFilterSetting) {
            this.workspaceFilterSetting = workspaceFilterSetting;
            return this;
        }

        public SubscriptionConfig build() {
            return new SubscriptionConfig(this);
        } 

    } 

}
