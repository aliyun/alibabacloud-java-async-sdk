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
 * {@link DeleteConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteConfigRequest</p>
 */
public class DeleteConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ConfigKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryName")
    private String categoryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Labels")
    private String labels;

    private DeleteConfigRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.configKey = builder.configKey;
        this.categoryName = builder.categoryName;
        this.labels = builder.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConfigRequest create() {
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
     * @return configKey
     */
    public String getConfigKey() {
        return this.configKey;
    }

    /**
     * @return categoryName
     */
    public String getCategoryName() {
        return this.categoryName;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    public static final class Builder extends Request.Builder<DeleteConfigRequest, Builder> {
        private String workspaceId; 
        private String configKey; 
        private String categoryName; 
        private String labels; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConfigRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.configKey = request.configKey;
            this.categoryName = request.categoryName;
            this.labels = request.labels;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>98***</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The key of the configuration item. Valid values:</p>
         * <ul>
         * <li>tempStoragePath: Temporary storage path. This key can be used only when CategoryName is set to CommonResourceConfig.</li>
         * <li>isAutoRecycle: Automatic recycle configuration. This key can be used only when CategoryName is set to DLCAutoRecycle.</li>
         * <li>priorityConfig: Priority configuration. This key can be used only when CategoryName is set to DLCPriorityConfig or DSWPriorityConfig.</li>
         * <li>quotaMaximumDuration: Maximum run time of DLC jobs for a quota. This key can be used only when CategoryName is set to QuotaMaximumDuration.</li>
         * <li>predefinedTags: Predefined tags of the workspace. Created resources must include tags.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tempStoragePath</p>
         */
        public Builder configKey(String configKey) {
            this.putPathParameter("ConfigKey", configKey);
            this.configKey = configKey;
            return this;
        }

        /**
         * <p>The category of the configuration item. Valid values:</p>
         * <ul>
         * <li>CommonResourceConfig</li>
         * <li>DLCAutoRecycle - DLCPriorityConfig</li>
         * <li>DSWPriorityConfig</li>
         * <li>QuotaMaximumDuration</li>
         * <li>CommonTagConfig</li>
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
         * <p>The filter conditions. Separate multiple conditions with commas (,). The conditions have an AND relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>key1=value;key2=value2</p>
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        @Override
        public DeleteConfigRequest build() {
            return new DeleteConfigRequest(this);
        } 

    } 

}
