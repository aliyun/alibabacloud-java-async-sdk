// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFolderRequest} extends {@link RequestModel}
 *
 * <p>UpdateFolderRequest</p>
 */
public class UpdateFolderRequest extends Request {
    @Query
    @NameInMap("FolderId")
    @Validation(required = true)
    private String folderId;

    @Query
    @NameInMap("NewFolderName")
    @Validation(required = true)
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

        private Builder(UpdateFolderRequest response) {
            super(response);
            this.folderId = response.folderId;
            this.newFolderName = response.newFolderName;
        } 

        /**
         * FolderId.
         */
        public Builder folderId(String folderId) {
            this.putQueryParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * NewFolderName.
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
