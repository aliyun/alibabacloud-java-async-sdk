// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFolderRequest} extends {@link RequestModel}
 *
 * <p>DeleteFolderRequest</p>
 */
public class DeleteFolderRequest extends Request {
    @Query
    @NameInMap("FolderId")
    @Validation(required = true)
    private String folderId;

    private DeleteFolderRequest(Builder builder) {
        super(builder);
        this.folderId = builder.folderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFolderRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteFolderRequest, Builder> {
        private String folderId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFolderRequest request) {
            super(request);
            this.folderId = request.folderId;
        } 

        /**
         * The ID of the folder.
         */
        public Builder folderId(String folderId) {
            this.putQueryParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        @Override
        public DeleteFolderRequest build() {
            return new DeleteFolderRequest(this);
        } 

    } 

}
