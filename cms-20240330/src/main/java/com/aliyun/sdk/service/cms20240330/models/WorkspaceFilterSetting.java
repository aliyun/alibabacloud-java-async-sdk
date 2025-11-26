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
 * {@link WorkspaceFilterSetting} extends {@link TeaModel}
 *
 * <p>WorkspaceFilterSetting</p>
 */
public class WorkspaceFilterSetting extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("tagSelector")
    private FilterSetting tagSelector;

    @com.aliyun.core.annotation.NameInMap("workspaceUuids")
    private java.util.List<String> workspaceUuids;

    private WorkspaceFilterSetting(Builder builder) {
        this.tagSelector = builder.tagSelector;
        this.workspaceUuids = builder.workspaceUuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WorkspaceFilterSetting create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tagSelector
     */
    public FilterSetting getTagSelector() {
        return this.tagSelector;
    }

    /**
     * @return workspaceUuids
     */
    public java.util.List<String> getWorkspaceUuids() {
        return this.workspaceUuids;
    }

    public static final class Builder {
        private FilterSetting tagSelector; 
        private java.util.List<String> workspaceUuids; 

        private Builder() {
        } 

        private Builder(WorkspaceFilterSetting model) {
            this.tagSelector = model.tagSelector;
            this.workspaceUuids = model.workspaceUuids;
        } 

        /**
         * tagSelector.
         */
        public Builder tagSelector(FilterSetting tagSelector) {
            this.tagSelector = tagSelector;
            return this;
        }

        /**
         * workspaceUuids.
         */
        public Builder workspaceUuids(java.util.List<String> workspaceUuids) {
            this.workspaceUuids = workspaceUuids;
            return this;
        }

        public WorkspaceFilterSetting build() {
            return new WorkspaceFilterSetting(this);
        } 

    } 

}
