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
    @com.aliyun.core.annotation.NameInMap("LifecyclePolicyId")
    private String lifecyclePolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecyclePolicyName")
    private String lifecyclePolicyName;

    private DeleteLifecyclePolicyRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.lifecyclePolicyId = builder.lifecyclePolicyId;
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
     * @return lifecyclePolicyId
     */
    public String getLifecyclePolicyId() {
        return this.lifecyclePolicyId;
    }

    /**
     * @return lifecyclePolicyName
     */
    public String getLifecyclePolicyName() {
        return this.lifecyclePolicyName;
    }

    public static final class Builder extends Request.Builder<DeleteLifecyclePolicyRequest, Builder> {
        private String fileSystemId; 
        private String lifecyclePolicyId; 
        private String lifecyclePolicyName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLifecyclePolicyRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.lifecyclePolicyId = request.lifecyclePolicyId;
            this.lifecyclePolicyName = request.lifecyclePolicyName;
        } 

        /**
         * <p>The file system ID.</p>
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
         * <p>The ID of the lifecycle policy.
         * This parameter is required for CPFS for Lingjun file systems.</p>
         * 
         * <strong>example:</strong>
         * <p>lc-xxx</p>
         */
        public Builder lifecyclePolicyId(String lifecyclePolicyId) {
            this.putQueryParameter("LifecyclePolicyId", lifecyclePolicyId);
            this.lifecyclePolicyId = lifecyclePolicyId;
            return this;
        }

        /**
         * <p>The Policy Name of the lifecycle management policy. The name must be 3 to 64 characters in epoch, must start with an uppercase letter or lowercase letter, and can contain letters, digits, underscores (_), or hyphens (-).</p>
         * <blockquote>
         * <p>This parameter is optional for General-purpose NAS file systems. If this parameter is specified, the value of this parameter is used. If this parameter is not specified, the value of LifecyclePolicyId is used.</p>
         * </blockquote>
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
