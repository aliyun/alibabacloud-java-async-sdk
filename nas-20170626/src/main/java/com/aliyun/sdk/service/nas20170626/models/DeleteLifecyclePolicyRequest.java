// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DeleteLifecyclePolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteLifecyclePolicyRequest</p>
 */
public class DeleteLifecyclePolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecyclePolicyName")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(DeleteLifecyclePolicyRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.lifecyclePolicyName = request.lifecyclePolicyName;
        } 

        /**
         * <p>The ID of the file system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>31a8e4****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The name of the lifecycle policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lifecyclepolicy1</p>
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
