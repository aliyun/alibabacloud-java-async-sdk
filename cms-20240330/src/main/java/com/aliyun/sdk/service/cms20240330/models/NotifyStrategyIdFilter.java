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
 * {@link NotifyStrategyIdFilter} extends {@link TeaModel}
 *
 * <p>NotifyStrategyIdFilter</p>
 */
public class NotifyStrategyIdFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("eq")
    private String eq;

    private NotifyStrategyIdFilter(Builder builder) {
        this.eq = builder.eq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NotifyStrategyIdFilter create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eq
     */
    public String getEq() {
        return this.eq;
    }

    public static final class Builder {
        private String eq; 

        private Builder() {
        } 

        private Builder(NotifyStrategyIdFilter model) {
            this.eq = model.eq;
        } 

        /**
         * eq.
         */
        public Builder eq(String eq) {
            this.eq = eq;
            return this;
        }

        public NotifyStrategyIdFilter build() {
            return new NotifyStrategyIdFilter(this);
        } 

    } 

}
