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

    @com.aliyun.core.annotation.NameInMap("workspaceFilterSetting")
    private WorkspaceFilterSetting workspaceFilterSetting;

    private SubscriptionForSNSModify(Builder builder) {
        this.filterSetting = builder.filterSetting;
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
     * @return workspaceFilterSetting
     */
    public WorkspaceFilterSetting getWorkspaceFilterSetting() {
        return this.workspaceFilterSetting;
    }

    public static final class Builder {
        private FilterSetting filterSetting; 
        private WorkspaceFilterSetting workspaceFilterSetting; 

        private Builder() {
        } 

        private Builder(SubscriptionForSNSModify model) {
            this.filterSetting = model.filterSetting;
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
         * workspaceFilterSetting.
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
