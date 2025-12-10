// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link CreateExperimentFolderRequest} extends {@link RequestModel}
 *
 * <p>CreateExperimentFolderRequest</p>
 */
public class CreateExperimentFolderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParentFolderId")
    private String parentFolderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateExperimentFolderRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.name = builder.name;
        this.parentFolderId = builder.parentFolderId;
        this.source = builder.source;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExperimentFolderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentFolderId
     */
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateExperimentFolderRequest, Builder> {
        private String accessibility; 
        private String name; 
        private String parentFolderId; 
        private String source; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateExperimentFolderRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.name = request.name;
            this.parentFolderId = request.parentFolderId;
            this.source = request.source;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Pipeline draft name</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ParentFolderId.
         */
        public Builder parentFolderId(String parentFolderId) {
            this.putBodyParameter("ParentFolderId", parentFolderId);
            this.parentFolderId = parentFolderId;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putBodyParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>45699</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateExperimentFolderRequest build() {
            return new CreateExperimentFolderRequest(this);
        } 

    } 

}
