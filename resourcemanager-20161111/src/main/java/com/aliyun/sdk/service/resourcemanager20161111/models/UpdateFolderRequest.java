// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

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
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private UpdateFolderRequest(Builder builder) {
        super(builder);
        this.folderId = builder.folderId;
        this.name = builder.name;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateFolderRequest, Builder> {
        private String folderId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFolderRequest request) {
            super(request);
            this.folderId = request.folderId;
            this.name = request.name;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateFolderRequest build() {
            return new UpdateFolderRequest(this);
        } 

    } 

}
