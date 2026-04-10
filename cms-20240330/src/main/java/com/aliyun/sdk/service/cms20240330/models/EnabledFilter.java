// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link EnabledFilter} extends {@link TeaModel}
 *
 * <p>EnabledFilter</p>
 */
public class EnabledFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("eq")
    private Boolean eq;

    private EnabledFilter(Builder builder) {
        this.eq = builder.eq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnabledFilter create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eq
     */
    public Boolean getEq() {
        return this.eq;
    }

    public static final class Builder {
        private Boolean eq; 

        private Builder() {
        } 

        private Builder(EnabledFilter model) {
            this.eq = model.eq;
        } 

        /**
         * <p>精确匹配</p>
         */
        public Builder eq(Boolean eq) {
            this.eq = eq;
            return this;
        }

        public EnabledFilter build() {
            return new EnabledFilter(this);
        } 

    } 

}
