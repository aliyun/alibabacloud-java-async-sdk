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
 * {@link BranchFilter} extends {@link TeaModel}
 *
 * <p>BranchFilter</p>
 */
public class BranchFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private BranchFilter(Builder builder) {
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BranchFilter create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String name; 

        private Builder() {
        } 

        private Builder(BranchFilter model) {
            this.name = model.name;
        } 

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public BranchFilter build() {
            return new BranchFilter(this);
        } 

    } 

}
