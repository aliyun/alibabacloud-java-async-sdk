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
 * {@link UpdateExperimentFolderRequest} extends {@link RequestModel}
 *
 * <p>UpdateExperimentFolderRequest</p>
 */
public class UpdateExperimentFolderRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("FolderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String folderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParentFolderId")
    private String parentFolderId;

    private UpdateExperimentFolderRequest(Builder builder) {
        super(builder);
        this.folderId = builder.folderId;
        this.name = builder.name;
        this.parentFolderId = builder.parentFolderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExperimentFolderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
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

    public static final class Builder extends Request.Builder<UpdateExperimentFolderRequest, Builder> {
        private String folderId; 
        private String name; 
        private String parentFolderId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateExperimentFolderRequest request) {
            super(request);
            this.folderId = request.folderId;
            this.name = request.name;
            this.parentFolderId = request.parentFolderId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>folder-xzf7t785nka4ch7qce</p>
         */
        public Builder folderId(String folderId) {
            this.putPathParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * Name.
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

        @Override
        public UpdateExperimentFolderRequest build() {
            return new UpdateExperimentFolderRequest(this);
        } 

    } 

}
