// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link SecurityContextCapabilities} extends {@link TeaModel}
 *
 * <p>SecurityContextCapabilities</p>
 */
public class SecurityContextCapabilities extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Add")
    private java.util.List<String> add;

    @com.aliyun.core.annotation.NameInMap("Drop")
    private java.util.List<String> drop;

    private SecurityContextCapabilities(Builder builder) {
        this.add = builder.add;
        this.drop = builder.drop;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SecurityContextCapabilities create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return add
     */
    public java.util.List<String> getAdd() {
        return this.add;
    }

    /**
     * @return drop
     */
    public java.util.List<String> getDrop() {
        return this.drop;
    }

    public static final class Builder {
        private java.util.List<String> add; 
        private java.util.List<String> drop; 

        private Builder() {
        } 

        private Builder(SecurityContextCapabilities model) {
            this.add = model.add;
            this.drop = model.drop;
        } 

        /**
         * Add.
         */
        public Builder add(java.util.List<String> add) {
            this.add = add;
            return this;
        }

        /**
         * Drop.
         */
        public Builder drop(java.util.List<String> drop) {
            this.drop = drop;
            return this;
        }

        public SecurityContextCapabilities build() {
            return new SecurityContextCapabilities(this);
        } 

    } 

}
