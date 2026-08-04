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
 * {@link ModelRouterBatchDisableMemberApiKeysRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterBatchDisableMemberApiKeysRequest</p>
 */
public class ModelRouterBatchDisableMemberApiKeysRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userIds")
    private java.util.List<Long> userIds;

    private ModelRouterBatchDisableMemberApiKeysRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.userIds = builder.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterBatchDisableMemberApiKeysRequest create() {
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
     * @return userIds
     */
    public java.util.List<Long> getUserIds() {
        return this.userIds;
    }

    public static final class Builder extends Request.Builder<ModelRouterBatchDisableMemberApiKeysRequest, Builder> {
        private Long id; 
        private java.util.List<Long> userIds; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterBatchDisableMemberApiKeysRequest request) {
            super(request);
            this.id = request.id;
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
         * userIds.
         */
        public Builder userIds(java.util.List<Long> userIds) {
            this.putBodyParameter("userIds", userIds);
            this.userIds = userIds;
            return this;
        }

        @Override
        public ModelRouterBatchDisableMemberApiKeysRequest build() {
            return new ModelRouterBatchDisableMemberApiKeysRequest(this);
        } 

    } 

}
