// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

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
 * {@link UntagResourcesRequest} extends {@link RequestModel}
 *
 * <p>UntagResourcesRequest</p>
 */
public class UntagResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("All")
    private Boolean all;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagKey")
    private java.util.List<String> tagKey;

    private UntagResourcesRequest(Builder builder) {
        super(builder);
        this.all = builder.all;
        this.ownerId = builder.ownerId;
        this.resourceId = builder.resourceId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceType = builder.resourceType;
        this.tagKey = builder.tagKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UntagResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return all
     */
    public Boolean getAll() {
        return this.all;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceId
     */
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tagKey
     */
    public java.util.List<String> getTagKey() {
        return this.tagKey;
    }

    public static final class Builder extends Request.Builder<UntagResourcesRequest, Builder> {
        private Boolean all; 
        private Long ownerId; 
        private java.util.List<String> resourceId; 
        private String resourceOwnerAccount; 
        private String resourceType; 
        private java.util.List<String> tagKey; 

        private Builder() {
            super();
        } 

        private Builder(UntagResourcesRequest request) {
            super(request);
            this.all = request.all;
            this.ownerId = request.ownerId;
            this.resourceId = request.resourceId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceType = request.resourceType;
            this.tagKey = request.tagKey;
        } 

        /**
         * <p>Specifies whether to remove all tags that are added to the specified SMC resource. This parameter is valid only if you do not set <code>TagKey.N</code>. Valid values:</p>
         * <ul>
         * <li>true: removes all tags that are added to the specified SMC resource. If no tags are added to the specified SMC resource, no operation is performed.</li>
         * <li>false: does not remove tags that are added to the specified SMC resource.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder all(Boolean all) {
            this.putQueryParameter("All", all);
            this.all = all;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The IDs of N SMC resources. SMC resources include migration sources and jobs. Valid values of N: 1 to 50.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bw526m1vi6x20c6g****</p>
         */
        public Builder resourceId(java.util.List<String> resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * <p>The type of the SMC resource. Valid values:</p>
         * <ul>
         * <li>sourceserver: migration source.</li>
         * <li>replicationjob: migration job.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sourceserver</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The key of tag N that is added to the SMC resource. Tag keys are case-sensitive. Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        public Builder tagKey(java.util.List<String> tagKey) {
            this.putQueryParameter("TagKey", tagKey);
            this.tagKey = tagKey;
            return this;
        }

        @Override
        public UntagResourcesRequest build() {
            return new UntagResourcesRequest(this);
        } 

    } 

}
