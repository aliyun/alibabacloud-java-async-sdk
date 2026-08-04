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
 * {@link ModelGroupUserDTO} extends {@link TeaModel}
 *
 * <p>ModelGroupUserDTO</p>
 */
public class ModelGroupUserDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKeys")
    private java.util.List<ModelGroupClientKeyItemDTO> apiKeys;

    @com.aliyun.core.annotation.NameInMap("userId")
    private Long userId;

    @com.aliyun.core.annotation.NameInMap("userName")
    private String userName;

    private ModelGroupUserDTO(Builder builder) {
        this.apiKeys = builder.apiKeys;
        this.userId = builder.userId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelGroupUserDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeys
     */
    public java.util.List<ModelGroupClientKeyItemDTO> getApiKeys() {
        return this.apiKeys;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder {
        private java.util.List<ModelGroupClientKeyItemDTO> apiKeys; 
        private Long userId; 
        private String userName; 

        private Builder() {
        } 

        private Builder(ModelGroupUserDTO model) {
            this.apiKeys = model.apiKeys;
            this.userId = model.userId;
            this.userName = model.userName;
        } 

        /**
         * apiKeys.
         */
        public Builder apiKeys(java.util.List<ModelGroupClientKeyItemDTO> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        /**
         * userName.
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public ModelGroupUserDTO build() {
            return new ModelGroupUserDTO(this);
        } 

    } 

}
