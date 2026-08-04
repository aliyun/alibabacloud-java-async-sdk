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
 * {@link ModelRouterBatchCreateMemberApiKeysRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterBatchCreateMemberApiKeysRequest</p>
 */
public class ModelRouterBatchCreateMemberApiKeysRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expireAt")
    private String expireAt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userIds")
    private java.util.List<Long> userIds;

    private ModelRouterBatchCreateMemberApiKeysRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.expireAt = builder.expireAt;
        this.name = builder.name;
        this.userIds = builder.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterBatchCreateMemberApiKeysRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return userIds
     */
    public java.util.List<Long> getUserIds() {
        return this.userIds;
    }

    public static final class Builder extends Request.Builder<ModelRouterBatchCreateMemberApiKeysRequest, Builder> {
        private Long id; 
        private String expireAt; 
        private String name; 
        private java.util.List<Long> userIds; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterBatchCreateMemberApiKeysRequest request) {
            super(request);
            this.id = request.id;
            this.expireAt = request.expireAt;
            this.name = request.name;
            this.userIds = request.userIds;
        } 

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * expireAt.
         */
        public Builder expireAt(String expireAt) {
            this.putBodyParameter("expireAt", expireAt);
            this.expireAt = expireAt;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * userIds.
         */
        public Builder userIds(java.util.List<Long> userIds) {
            this.putBodyParameter("userIds", userIds);
            this.userIds = userIds;
            return this;
        }

        @Override
        public ModelRouterBatchCreateMemberApiKeysRequest build() {
            return new ModelRouterBatchCreateMemberApiKeysRequest(this);
        } 

    } 

}
