// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link ListConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListConfigsRequest</p>
 */
public class ListConfigsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryName")
    private String categoryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigKeys")
    private String configKeys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Labels")
    private String labels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Verbose")
    private String verbose;

    private ListConfigsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.categoryName = builder.categoryName;
        this.configKeys = builder.configKeys;
        this.labels = builder.labels;
        this.verbose = builder.verbose;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return categoryName
     */
    public String getCategoryName() {
        return this.categoryName;
    }

    /**
     * @return configKeys
     */
    public String getConfigKeys() {
        return this.configKeys;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return verbose
     */
    public String getVerbose() {
        return this.verbose;
    }

    public static final class Builder extends Request.Builder<ListConfigsRequest, Builder> {
        private String workspaceId; 
        private String categoryName; 
        private String configKeys; 
        private String labels; 
        private String verbose; 

        private Builder() {
            super();
        } 

        private Builder(ListConfigsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.categoryName = request.categoryName;
            this.configKeys = request.configKeys;
            this.labels = request.labels;
            this.verbose = request.verbose;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>87***</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The category of the configuration item. The following categories are supported:</p>
         * <ul>
         * <li>CommonResourceConfig: common resource configuration.</li>
         * <li>DLCAutoRecycle: DLC automatic recycling.</li>
         * <li>DLCPriorityConfig: DLC priority settings.</li>
         * <li>DSWPriorityConfig: DSW priority settings.</li>
         * <li>QuotaMaximumDuration: maximum runtime duration configuration for DLC jobs in a quota.</li>
         * <li>CommonTagConfig: tag settings.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CommonResourceConfig</p>
         */
        public Builder categoryName(String categoryName) {
            this.putQueryParameter("CategoryName", categoryName);
            this.categoryName = categoryName;
            return this;
        }

        /**
         * <p>The keys of the configuration items. The following keys are supported:</p>
         * <ul>
         * <li>tempStoragePath: the temporary storage path. This ConfigKey can be used only when CategoryName is set to CommonResourceConfig.</li>
         * <li>isAutoRecycle: the automatic recycling configuration. This ConfigKey can be used only when CategoryName is set to DLCAutoRecycle.</li>
         * <li>priorityConfig: the priority configuration. This ConfigKey can be used only when CategoryName is set to DLCPriorityConfig or DSWPriorityConfig.</li>
         * <li>quotaMaximumDuration: the maximum runtime duration configuration for DLC jobs in a quota. This ConfigKey can be used only when CategoryName is set to QuotaMaximumDuration.</li>
         * <li>predefinedTags: the preset tags for the workspace. Resources that are created must include these tags.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tempStoragePath</p>
         */
        public Builder configKeys(String configKeys) {
            this.putQueryParameter("ConfigKeys", configKeys);
            this.configKeys = configKeys;
            return this;
        }

        /**
         * <p>The labels used as filter conditions. Separate multiple conditions with commas. These conditions are evaluated using a logical AND.</p>
         * 
         * <strong>example:</strong>
         * <p>key1=value1,key2=value2</p>
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>Specifies whether to display label information. Valid values:</p>
         * <ul>
         * <li>true: Display label information.</li>
         * <li>false: Do not display label information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder verbose(String verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        @Override
        public ListConfigsRequest build() {
            return new ListConfigsRequest(this);
        } 

    } 

}
