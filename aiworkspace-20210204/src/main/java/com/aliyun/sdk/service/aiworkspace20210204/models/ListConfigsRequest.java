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
         * CategoryName.
         */
        public Builder categoryName(String categoryName) {
            this.putQueryParameter("CategoryName", categoryName);
            this.categoryName = categoryName;
            return this;
        }

        /**
         * ConfigKeys.
         */
        public Builder configKeys(String configKeys) {
            this.putQueryParameter("ConfigKeys", configKeys);
            this.configKeys = configKeys;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * Verbose.
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
