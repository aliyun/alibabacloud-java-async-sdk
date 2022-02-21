// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUserCustomLogConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserCustomLogConfigRequest</p>
 */
public class ModifyUserCustomLogConfigRequest extends Request {
    @Query
    @NameInMap("ConfigId")
    @Validation(required = true)
    private String configId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Tag")
    @Validation(required = true)
    private String tag;

    private ModifyUserCustomLogConfigRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
        this.ownerId = builder.ownerId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserCustomLogConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ModifyUserCustomLogConfigRequest, Builder> {
        private String configId; 
        private Long ownerId; 
        private String tag; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserCustomLogConfigRequest response) {
            super(response);
            this.configId = response.configId;
            this.ownerId = response.ownerId;
            this.tag = response.tag;
        } 

        /**
         * ConfigId.
         */
        public Builder configId(String configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
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
         * Tag.
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ModifyUserCustomLogConfigRequest build() {
            return new ModifyUserCustomLogConfigRequest(this);
        } 

    } 

}
