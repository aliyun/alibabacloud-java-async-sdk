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
 * {@link ObserveResourceListFilter} extends {@link TeaModel}
 *
 * <p>ObserveResourceListFilter</p>
 */
public class ObserveResourceListFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contains")
    private java.util.List<String> contains;

    private ObserveResourceListFilter(Builder builder) {
        this.contains = builder.contains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObserveResourceListFilter create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contains
     */
    public java.util.List<String> getContains() {
        return this.contains;
    }

    public static final class Builder {
        private java.util.List<String> contains; 

        private Builder() {
        } 

        private Builder(ObserveResourceListFilter model) {
            this.contains = model.contains;
        } 

        /**
         * <p>The match condition that requires the observeResourceList of a rule to contain at least one instance ID from the array (OR semantics).</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;i-bp1a2b3c4d5e6f7g8h9i&quot;]</p>
         */
        public Builder contains(java.util.List<String> contains) {
            this.contains = contains;
            return this;
        }

        public ObserveResourceListFilter build() {
            return new ObserveResourceListFilter(this);
        } 

    } 

}
