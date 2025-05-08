// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link UnifiedCostCredits} extends {@link TeaModel}
 *
 * <p>UnifiedCostCredits</p>
 */
public class UnifiedCostCredits extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("search")
    private SearchCredits search;

    @com.aliyun.core.annotation.NameInMap("valueAdded")
    private ValueAddedCredits valueAdded;

    private UnifiedCostCredits(Builder builder) {
        this.search = builder.search;
        this.valueAdded = builder.valueAdded;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnifiedCostCredits create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return search
     */
    public SearchCredits getSearch() {
        return this.search;
    }

    /**
     * @return valueAdded
     */
    public ValueAddedCredits getValueAdded() {
        return this.valueAdded;
    }

    public static final class Builder {
        private SearchCredits search; 
        private ValueAddedCredits valueAdded; 

        private Builder() {
        } 

        private Builder(UnifiedCostCredits model) {
            this.search = model.search;
            this.valueAdded = model.valueAdded;
        } 

        /**
         * search.
         */
        public Builder search(SearchCredits search) {
            this.search = search;
            return this;
        }

        /**
         * valueAdded.
         */
        public Builder valueAdded(ValueAddedCredits valueAdded) {
            this.valueAdded = valueAdded;
            return this;
        }

        public UnifiedCostCredits build() {
            return new UnifiedCostCredits(this);
        } 

    } 

}
