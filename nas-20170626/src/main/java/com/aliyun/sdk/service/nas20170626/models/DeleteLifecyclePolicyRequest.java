// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLifecyclePolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteLifecyclePolicyRequest</p>
 */
public class DeleteLifecyclePolicyRequest extends Request {
    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("LifecyclePolicyName")
    @Validation(required = true)
    private String lifecyclePolicyName;

    private DeleteLifecyclePolicyRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.lifecyclePolicyName = builder.lifecyclePolicyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLifecyclePolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return lifecyclePolicyName
     */
    public String getLifecyclePolicyName() {
        return this.lifecyclePolicyName;
    }

    public static final class Builder extends Request.Builder<DeleteLifecyclePolicyRequest, Builder> {
        private String fileSystemId; 
        private String lifecyclePolicyName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLifecyclePolicyRequest response) {
            super(response);
            this.fileSystemId = response.fileSystemId;
            this.lifecyclePolicyName = response.lifecyclePolicyName;
        } 

        /**
         * FileSystemId.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * LifecyclePolicyName.
         */
        public Builder lifecyclePolicyName(String lifecyclePolicyName) {
            this.putQueryParameter("LifecyclePolicyName", lifecyclePolicyName);
            this.lifecyclePolicyName = lifecyclePolicyName;
            return this;
        }

        @Override
        public DeleteLifecyclePolicyRequest build() {
            return new DeleteLifecyclePolicyRequest(this);
        } 

    } 

}
