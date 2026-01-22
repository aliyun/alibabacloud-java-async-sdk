// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link ChangeResourceGroupOutput} extends {@link TeaModel}
 *
 * <p>ChangeResourceGroupOutput</p>
 */
public class ChangeResourceGroupOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("newResourceGroupId")
    private String newResourceGroupId;

    @com.aliyun.core.annotation.NameInMap("oldResourceGroupId")
    private String oldResourceGroupId;

    @com.aliyun.core.annotation.NameInMap("resourceId")
    private String resourceId;

    private ChangeResourceGroupOutput(Builder builder) {
        this.newResourceGroupId = builder.newResourceGroupId;
        this.oldResourceGroupId = builder.oldResourceGroupId;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeResourceGroupOutput create() {
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
     * @return oldResourceGroupId
     */
    public String getOldResourceGroupId() {
        return this.oldResourceGroupId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    public static final class Builder {
        private String newResourceGroupId; 
        private String oldResourceGroupId; 
        private String resourceId; 

        private Builder() {
        } 

        private Builder(ChangeResourceGroupOutput model) {
            this.newResourceGroupId = model.newResourceGroupId;
            this.oldResourceGroupId = model.oldResourceGroupId;
            this.resourceId = model.resourceId;
        } 

        /**
         * newResourceGroupId.
         */
        public Builder newResourceGroupId(String newResourceGroupId) {
            this.newResourceGroupId = newResourceGroupId;
            return this;
        }

        /**
         * oldResourceGroupId.
         */
        public Builder oldResourceGroupId(String oldResourceGroupId) {
            this.oldResourceGroupId = oldResourceGroupId;
            return this;
        }

        /**
         * resourceId.
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public ChangeResourceGroupOutput build() {
            return new ChangeResourceGroupOutput(this);
        } 

    } 

}
