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
 * {@link UpdateFolderRequest} extends {@link RequestModel}
 *
 * <p>UpdateFolderRequest</p>
 */
public class UpdateFolderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FolderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String folderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewFolderName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newFolderName;

    private UpdateFolderRequest(Builder builder) {
        super(builder);
        this.folderId = builder.folderId;
        this.newFolderName = builder.newFolderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFolderRequest create() {
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
     * @return newFolderName
     */
    public String getNewFolderName() {
        return this.newFolderName;
    }

    public static final class Builder extends Request.Builder<UpdateFolderRequest, Builder> {
        private String folderId; 
        private String newFolderName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFolderRequest request) {
            super(request);
            this.folderId = request.folderId;
            this.newFolderName = request.newFolderName;
        } 

        /**
         * <p>The ID of the folder.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-u8B321****</p>
         */
        public Builder folderId(String folderId) {
            this.putQueryParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * <p>The new name of the folder.</p>
         * <p>The name must be 1 to 24 characters in length and can contain letters, digits, underscores (_), periods (.), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rdFolder</p>
         */
        public Builder newFolderName(String newFolderName) {
            this.putQueryParameter("NewFolderName", newFolderName);
            this.newFolderName = newFolderName;
            return this;
        }

        @Override
        public UpdateFolderRequest build() {
            return new UpdateFolderRequest(this);
        } 

    } 

}
