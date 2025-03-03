// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link CreateFolderRequest} extends {@link RequestModel}
 *
 * <p>CreateFolderRequest</p>
 */
public class CreateFolderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FolderName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String folderName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentFolderId")
    private String parentFolderId;

    private CreateFolderRequest(Builder builder) {
        super(builder);
        this.folderName = builder.folderName;
        this.parentFolderId = builder.parentFolderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFolderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return folderName
     */
    public String getFolderName() {
        return this.folderName;
    }

    /**
     * @return parentFolderId
     */
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    public static final class Builder extends Request.Builder<CreateFolderRequest, Builder> {
        private String folderName; 
        private String parentFolderId; 

        private Builder() {
            super();
        } 

        private Builder(CreateFolderRequest request) {
            super(request);
            this.folderName = request.folderName;
            this.parentFolderId = request.parentFolderId;
        } 

        /**
         * <p>The name of the folder.</p>
         * <p>The name must be 1 to 24 characters in length and can contain letters, digits, underscores (_), periods (.),and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rdFolder</p>
         */
        public Builder folderName(String folderName) {
            this.putQueryParameter("FolderName", folderName);
            this.folderName = folderName;
            return this;
        }

        /**
         * <p>The ID of the parent folder.</p>
         * 
         * <strong>example:</strong>
         * <p>r-b1****</p>
         */
        public Builder parentFolderId(String parentFolderId) {
            this.putQueryParameter("ParentFolderId", parentFolderId);
            this.parentFolderId = parentFolderId;
            return this;
        }

        @Override
        public CreateFolderRequest build() {
            return new CreateFolderRequest(this);
        } 

    } 

}
