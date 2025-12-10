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
 * {@link MigrateExperimentFoldersRequest} extends {@link RequestModel}
 *
 * <p>MigrateExperimentFoldersRequest</p>
 */
public class MigrateExperimentFoldersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsOwner")
    private Boolean isOwner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private MigrateExperimentFoldersRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.isOwner = builder.isOwner;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateExperimentFoldersRequest create() {
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
     * @return isOwner
     */
    public Boolean getIsOwner() {
        return this.isOwner;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<MigrateExperimentFoldersRequest, Builder> {
        private String accessibility; 
        private Boolean isOwner; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(MigrateExperimentFoldersRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.isOwner = request.isOwner;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.putQueryParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * IsOwner.
         */
        public Builder isOwner(Boolean isOwner) {
            this.putQueryParameter("IsOwner", isOwner);
            this.isOwner = isOwner;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public MigrateExperimentFoldersRequest build() {
            return new MigrateExperimentFoldersRequest(this);
        } 

    } 

}
