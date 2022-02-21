// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFolderRequest} extends {@link RequestModel}
 *
 * <p>CreateFolderRequest</p>
 */
public class CreateFolderRequest extends Request {
    @Query
    @NameInMap("FolderName")
    @Validation(required = true)
    private String folderName;

    @Query
    @NameInMap("ParentFolderId")
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

        private Builder(CreateFolderRequest response) {
            super(response);
            this.folderName = response.folderName;
            this.parentFolderId = response.parentFolderId;
        } 

        /**
         * FolderName.
         */
        public Builder folderName(String folderName) {
            this.putQueryParameter("FolderName", folderName);
            this.folderName = folderName;
            return this;
        }

        /**
         * ParentFolderId.
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
