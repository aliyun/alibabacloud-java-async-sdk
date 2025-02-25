// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link AuthorizationResourceInfo} extends {@link TeaModel}
 *
 * <p>AuthorizationResourceInfo</p>
 */
public class AuthorizationResourceInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("environmentId")
    private String environmentId;

    @com.aliyun.core.annotation.NameInMap("parentResourceId")
    private String parentResourceId;

    @com.aliyun.core.annotation.NameInMap("resourceId")
    private String resourceId;

    private AuthorizationResourceInfo(Builder builder) {
        this.environmentId = builder.environmentId;
        this.parentResourceId = builder.parentResourceId;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizationResourceInfo create() {
        return builder().build();
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return parentResourceId
     */
    public String getParentResourceId() {
        return this.parentResourceId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    public static final class Builder {
        private String environmentId; 
        private String parentResourceId; 
        private String resourceId; 

        /**
         * environmentId.
         */
        public Builder environmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        /**
         * parentResourceId.
         */
        public Builder parentResourceId(String parentResourceId) {
            this.parentResourceId = parentResourceId;
            return this;
        }

        /**
         * resourceId.
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public AuthorizationResourceInfo build() {
            return new AuthorizationResourceInfo(this);
        } 

    } 

}
