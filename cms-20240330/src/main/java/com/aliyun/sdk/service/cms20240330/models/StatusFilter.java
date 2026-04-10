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
 * {@link StatusFilter} extends {@link TeaModel}
 *
 * <p>StatusFilter</p>
 */
public class StatusFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("eq")
    private String eq;

    private StatusFilter(Builder builder) {
        this.eq = builder.eq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StatusFilter create() {
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

        private Builder(StatusFilter model) {
            this.eq = model.eq;
        } 

        /**
         * eq.
         */
        public Builder eq(String eq) {
            this.eq = eq;
            return this;
        }

        public StatusFilter build() {
            return new StatusFilter(this);
        } 

    } 

}
