// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

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
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ParentFolderId")
    private String parentFolderId;

    private CreateFolderRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
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

    public static final class Builder extends Request.Builder<CreateFolderRequest, Builder> {
        private String name; 
        private String parentFolderId; 

        private Builder() {
            super();
        } 

        private Builder(CreateFolderRequest request) {
            super(request);
            this.name = request.name;
            this.parentFolderId = request.parentFolderId;
        } 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
