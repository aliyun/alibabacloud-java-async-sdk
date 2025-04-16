// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

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
 * {@link ExportAnalysisTagDetailByTaskIdRequest} extends {@link RequestModel}
 *
 * <p>ExportAnalysisTagDetailByTaskIdRequest</p>
 */
public class ExportAnalysisTagDetailByTaskIdRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("categories")
    private java.util.List<String> categories;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private ExportAnalysisTagDetailByTaskIdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.categories = builder.categories;
        this.category = builder.category;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportAnalysisTagDetailByTaskIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return categories
     */
    public java.util.List<String> getCategories() {
        return this.categories;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<ExportAnalysisTagDetailByTaskIdRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private java.util.List<String> categories; 
        private String category; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(ExportAnalysisTagDetailByTaskIdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.categories = request.categories;
            this.category = request.category;
            this.taskId = request.taskId;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * categories.
         */
        public Builder categories(java.util.List<String> categories) {
            String categoriesShrink = shrink(categories, "categories", "json");
            this.putBodyParameter("categories", categoriesShrink);
            this.categories = categories;
            return this;
        }

        /**
         * category.
         */
        public Builder category(String category) {
            this.putBodyParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a3d1c2ac-f086-4a21-9069-f5631542f5a2</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ExportAnalysisTagDetailByTaskIdRequest build() {
            return new ExportAnalysisTagDetailByTaskIdRequest(this);
        } 

    } 

}
