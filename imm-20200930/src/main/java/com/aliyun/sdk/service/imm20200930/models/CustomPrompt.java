// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link CustomPrompt} extends {@link TeaModel}
 *
 * <p>CustomPrompt</p>
 */
public class CustomPrompt extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RoleDefinition")
    private String roleDefinition;

    private CustomPrompt(Builder builder) {
        this.roleDefinition = builder.roleDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomPrompt create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return roleDefinition
     */
    public String getRoleDefinition() {
        return this.roleDefinition;
    }

    public static final class Builder {
        private String roleDefinition; 

        private Builder() {
        } 

        private Builder(CustomPrompt model) {
            this.roleDefinition = model.roleDefinition;
        } 

        /**
         * RoleDefinition.
         */
        public Builder roleDefinition(String roleDefinition) {
            this.roleDefinition = roleDefinition;
            return this;
        }

        public CustomPrompt build() {
            return new CustomPrompt(this);
        } 

    } 

}
