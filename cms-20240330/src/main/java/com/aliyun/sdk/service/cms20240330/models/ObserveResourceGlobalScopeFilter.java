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
 * {@link ObserveResourceGlobalScopeFilter} extends {@link TeaModel}
 *
 * <p>ObserveResourceGlobalScopeFilter</p>
 */
public class ObserveResourceGlobalScopeFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("eq")
    private Boolean eq;

    private ObserveResourceGlobalScopeFilter(Builder builder) {
        this.eq = builder.eq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObserveResourceGlobalScopeFilter create() {
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

        private Builder(ObserveResourceGlobalScopeFilter model) {
            this.eq = model.eq;
        } 

        /**
         * eq.
         */
        public Builder eq(Boolean eq) {
            this.eq = eq;
            return this;
        }

        public ObserveResourceGlobalScopeFilter build() {
            return new ObserveResourceGlobalScopeFilter(this);
        } 

    } 

}
