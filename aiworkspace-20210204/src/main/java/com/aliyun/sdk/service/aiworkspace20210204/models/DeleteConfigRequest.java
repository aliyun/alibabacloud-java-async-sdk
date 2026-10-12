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
         * <p>The key of the configuration item. The following keys are supported:</p>
         * <ul>
         * <li><p>tempStoragePath: The temporary storage path. This key is valid only when CategoryName is CommonResourceConfig.</p>
         * </li>
         * <li><p>isAutoRecycle: The automatic release configuration. This key is valid only when CategoryName is DLCAutoRecycle.</p>
         * </li>
         * <li><p>priorityConfig: The priority configuration. This key is valid only when CategoryName is DLCPriorityConfig or DSWPriorityConfig.</p>
         * </li>
         * <li><p>quotaMaximumDuration: The maximum runtime configuration of a DLC task for a quota. This key is valid only when CategoryName is QuotaMaximumDuration.</p>
         * </li>
         * <li><p>predefinedTags: The predefined tags for the workspace. Resources that you create must have these tags.</p>
         * </li>
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
         * <p>The classification of the configuration item. The following classifications are supported:</p>
         * <ul>
         * <li><p>DLCAutoRecycle: The DLC automatic release configuration.</p>
         * </li>
         * <li><p>DLCPriorityConfig: The DLC priority settings.</p>
         * </li>
         * <li><p>DSWPriorityConfig: The DSW priority settings.</p>
         * </li>
         * <li><p>QuotaMaximumDuration: The maximum runtime configuration of a DLC task for a quota.</p>
         * </li>
         * <li><p>CommonTagConfig: The tag settings.</p>
         * </li>
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
         * <p>The filter conditions. Separate multiple conditions with commas. The conditions are combined with a logical AND.</p>
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
