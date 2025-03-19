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
 * {@link CheckServiceLinkedRoleResult} extends {@link TeaModel}
 *
 * <p>CheckServiceLinkedRoleResult</p>
 */
public class CheckServiceLinkedRoleResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("existed")
    private Boolean existed;

    private CheckServiceLinkedRoleResult(Builder builder) {
        this.existed = builder.existed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckServiceLinkedRoleResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return existed
     */
    public Boolean getExisted() {
        return this.existed;
    }

    public static final class Builder {
        private Boolean existed; 

        private Builder() {
        } 

        private Builder(CheckServiceLinkedRoleResult model) {
            this.existed = model.existed;
        } 

        /**
         * existed.
         */
        public Builder existed(Boolean existed) {
            this.existed = existed;
            return this;
        }

        public CheckServiceLinkedRoleResult build() {
            return new CheckServiceLinkedRoleResult(this);
        } 

    } 

}
