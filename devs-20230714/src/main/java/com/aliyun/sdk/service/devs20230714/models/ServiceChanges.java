// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link ServiceChanges} extends {@link TeaModel}
 *
 * <p>ServiceChanges</p>
 */
public class ServiceChanges extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("merge")
    private java.util.Map<String, ?> merge;

    private ServiceChanges(Builder builder) {
        this.merge = builder.merge;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceChanges create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return merge
     */
    public java.util.Map<String, ?> getMerge() {
        return this.merge;
    }

    public static final class Builder {
        private java.util.Map<String, ?> merge; 

        private Builder() {
        } 

        private Builder(ServiceChanges model) {
            this.merge = model.merge;
        } 

        /**
         * merge.
         */
        public Builder merge(java.util.Map<String, ?> merge) {
            this.merge = merge;
            return this;
        }

        public ServiceChanges build() {
            return new ServiceChanges(this);
        } 

    } 

}
