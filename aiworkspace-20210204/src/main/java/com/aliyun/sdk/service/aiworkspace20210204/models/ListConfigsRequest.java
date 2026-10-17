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
    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Verbose")
    private String verbose;

    private ListConfigsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.categoryName = builder.categoryName;
        this.configKeys = builder.configKeys;
        this.labels = builder.labels;
        this.options = builder.options;
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
     * @return options
     */
    public String getOptions() {
        return this.options;
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
        private String options; 
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
            this.options = request.options;
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
         * <p>The categorization of the configuration item. Valid values:</p>
         * <ul>
         * <li>CommonResourceConfig: general resource configuration</li>
         * <li>DLCAutoRecycle: automatic DLC revoke</li>
         * <li>DLCPriorityConfig: DLC priority settings</li>
         * <li>DSWPriorityConfig: DSW priority settings</li>
         * <li>QuotaMaximumDuration: maximum runtime configuration of DLC nodes for a quota</li>
         * <li>CommonTagConfig: label settings</li>
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
         * <p>The keys of the configuration items. Valid values:</p>
         * <ul>
         * <li>tempStoragePath: Temporary storage path. This key is allowed only when CategoryName is set to CommonResourceConfig.</li>
         * <li>isAutoRecycle: Automatic revoke configuration. This key is allowed only when CategoryName is set to DLCAutoRecycle.</li>
         * <li>priorityConfig: Priority configuration. This key is allowed only when CategoryName is set to DLCPriorityConfig or DSWPriorityConfig.</li>
         * <li>quotaMaximumDuration: Maximum runtime configuration of DLC nodes for a quota. This key is allowed only when CategoryName is set to QuotaMaximumDuration.</li>
         * <li>predefinedTags: Preset labels for the workspace. Resources created must have these labels.</li>
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
         * <p>The labels used as filter conditions. Separate multiple conditions with commas. These conditions are combined by using the AND operator.</p>
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
         * <p>The additional options. Currently, only ThrowExceptionOnError is supported, which indicates that an error is thrown when an exception occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>ThrowExceptionOnError</p>
         */
        public Builder options(String options) {
            this.putQueryParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * <p>Specifies whether to display label information. Valid values:</p>
         * <ul>
         * <li>true: Displays label information.</li>
         * <li>false: Does not display label information.</li>
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
