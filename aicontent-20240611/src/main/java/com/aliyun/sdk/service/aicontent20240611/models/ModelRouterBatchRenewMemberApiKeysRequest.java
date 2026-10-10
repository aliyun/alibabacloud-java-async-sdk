// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterBatchRenewMemberApiKeysRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterBatchRenewMemberApiKeysRequest</p>
 */
public class ModelRouterBatchRenewMemberApiKeysRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expireAt")
    private String expireAt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> userIds;

    private ModelRouterBatchRenewMemberApiKeysRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.expireAt = builder.expireAt;
        this.userIds = builder.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterBatchRenewMemberApiKeysRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return expireAt
     */
    public String getExpireAt() {
        return this.expireAt;
    }

    /**
     * @return userIds
     */
    public java.util.List<Long> getUserIds() {
        return this.userIds;
    }

    public static final class Builder extends Request.Builder<ModelRouterBatchRenewMemberApiKeysRequest, Builder> {
        private Long id; 
        private String expireAt; 
        private java.util.List<Long> userIds; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterBatchRenewMemberApiKeysRequest request) {
            super(request);
            this.id = request.id;
            this.expireAt = request.expireAt;
            this.userIds = request.userIds;
        } 

        /**
         * <p>The department ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The new expiration time in RFC 3339 format. The time must be later than the current time. If this parameter is not provided or is set to null, the API keys remain permanently valid. This parameter only modifies the validity period and does not change the enabled or disabled status.</p>
         * 
         * <strong>example:</strong>
         * <p>2027-01-01T00:00:00+08:00</p>
         */
        public Builder expireAt(String expireAt) {
            this.putBodyParameter("expireAt", expireAt);
            this.expireAt = expireAt;
            return this;
        }

        /**
         * <p>The list of member user IDs. This operation renews all undeleted API keys of these members in the specified department.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder userIds(java.util.List<Long> userIds) {
            this.putBodyParameter("userIds", userIds);
            this.userIds = userIds;
            return this;
        }

        @Override
        public ModelRouterBatchRenewMemberApiKeysRequest build() {
            return new ModelRouterBatchRenewMemberApiKeysRequest(this);
        } 

    } 

}
