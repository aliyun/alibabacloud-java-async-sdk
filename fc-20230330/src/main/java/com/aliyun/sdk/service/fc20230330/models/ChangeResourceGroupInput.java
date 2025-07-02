// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link ChangeResourceGroupInput} extends {@link TeaModel}
 *
 * <p>ChangeResourceGroupInput</p>
 */
public class ChangeResourceGroupInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("newResourceGroupId")
    private String newResourceGroupId;

    @com.aliyun.core.annotation.NameInMap("resourceId")
    private String resourceId;

    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    private ChangeResourceGroupInput(Builder builder) {
        this.newResourceGroupId = builder.newResourceGroupId;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeResourceGroupInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newResourceGroupId
     */
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder {
        private String newResourceGroupId; 
        private String resourceId; 
        private String resourceType; 

        private Builder() {
        } 

        private Builder(ChangeResourceGroupInput model) {
            this.newResourceGroupId = model.newResourceGroupId;
            this.resourceId = model.resourceId;
            this.resourceType = model.resourceType;
        } 

        /**
         * newResourceGroupId.
         */
        public Builder newResourceGroupId(String newResourceGroupId) {
            this.newResourceGroupId = newResourceGroupId;
            return this;
        }

        /**
         * resourceId.
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public ChangeResourceGroupInput build() {
            return new ChangeResourceGroupInput(this);
        } 

    } 

}
