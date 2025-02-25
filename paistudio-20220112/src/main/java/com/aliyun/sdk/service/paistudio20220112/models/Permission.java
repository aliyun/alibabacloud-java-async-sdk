// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link Permission} extends {@link TeaModel}
 *
 * <p>Permission</p>
 */
public class Permission extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsEnabled")
    private Boolean isEnabled;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private Permission(Builder builder) {
        this.isEnabled = builder.isEnabled;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Permission create() {
        return builder().build();
    }

    /**
     * @return isEnabled
     */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder {
        private Boolean isEnabled; 
        private String resourceType; 

        /**
         * IsEnabled.
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Permission build() {
            return new Permission(this);
        } 

    } 

}
